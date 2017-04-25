package com.uestc.serviceImpl;



import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uestc.mapper.UserinfoMapper;
import com.uestc.model.Userinfo;
import com.uestc.newmapper.UserRoleAssociationMapper;
import com.uestc.service.UserBaseInfoService;
import com.uestc.util.MD5Encrypt;
import com.uestc.util.Mail;

@Service
public class UserBaseInfoServiceImpl implements UserBaseInfoService {

	
	@Autowired
	private UserinfoMapper userinfoMapper;
	
	@Autowired
	private UserRoleAssociationMapper userRoleAssociationMapper;
	
	
	@Override
	public String setUserInfo(Userinfo userinfo) throws Exception {
		String msg = "";
		userinfoMapper.updateByPrimaryKeySelective(userinfo);//用户信息		
		msg = "1";
		return msg;
	}

	@Override
	public List<Userinfo> findAllUser() throws Exception {
		
		return userRoleAssociationMapper.selectAllUser();
	}
	
	@Override
	public String findUserPwdByEmail(Userinfo userinfo,String basePath) throws Exception {
		    String msg = "";
	try{	
			String secretKey = UUID.randomUUID().toString();//密钥
			Timestamp outDate = new Timestamp(System.currentTimeMillis() + 30 * 60 * 1000);// 30分钟后过期
			long date = outDate.getTime()/ 1000 * 1000; //忽略毫秒数  mySql 取出时间是忽略毫秒数的
			userinfo.setOutDate(outDate);
			userinfo.setValidataCode(secretKey);
			
		    userinfoMapper.updateByPrimaryKeySelective(userinfo);//更新密钥与过期时间
		    
			System.out.println("UserName: "+userinfo.getUserName());
			
			String key = userinfo.getUserId() + "$" + date + "$" + secretKey;
			System.out.println("找回密码时生成的随机KEY"+key);

	        String salt = userinfo.getUserId()+"护士学校";
			/*System.out.println("key: "+key);
			String digitalSignature = Md5.md5(key);	*/
			String digitalSignature = new MD5Encrypt().encrypt(key,salt);
			
			System.out.println(digitalSignature);
			
            String resetPassHref = basePath + "index.html#/resetForgetPassword?sid="
                    + digitalSignature +"&userId="+userinfo.getUserId();
            String emailContent = "请勿回复本邮件.点击下面的链接,重设密码<br/><a href="
                    + resetPassHref + " target='_BLANK'>" + resetPassHref
                    + "</a>";
            
		    userinfo.getEmailAddress();
			
			Mail m = new Mail(); 
			m.mail(userinfo.getEmailAddress(),emailContent); //发送邮件
			return "1";
			
	    }catch (Exception e) {
	    	e.printStackTrace();
	    	msg = "邮箱发送失败，请稍后再试";
	   }
	   return msg;
	}


	@Override
	public Boolean verifyUserEmail(String userId, String emailAddress, String inputEmail) throws Exception {
		
		boolean bool = false;
		if(emailAddress.equals(inputEmail)){
        	bool = true;
        }
        else{
        	bool = false;
        }
		return bool;
	}


	@Override
	public String checkResetLink(String sid, Userinfo userinfo) throws Exception {
		// TODO Auto-generated method stub
		if (sid.equals("")  || userinfo.equals("")) {
            System.out.println(">>>>> null");
            return "链接不完整,请重新生成";
        }
		else{
			
			Date outDate =  userinfo.getOutDate();
            System.out.println("outDate>>>"+outDate);
            if(outDate.getTime() <= System.currentTimeMillis()){ //表示已经过期
                 System.out.println("时间 超时");
                 return "链接已经过期,请重新申请找回密码.";
            }
            
            String key = userinfo.getUserId()+"$"+outDate.getTime()/1000*1000+"$"+userinfo.getValidataCode();//数字签名
            System.out.println("key link》》"+key);
            
            String salt = userinfo.getUserId()+"护士学校";
		    String digitalSignature = new MD5Encrypt().encrypt(key,salt);// 数字签名
		    
			System.out.println(digitalSignature);
			
            //String digitalSignature = Md5.md5(key);// 数字签名
        
            System.out.println("digitalSignature>>>>"+digitalSignature);
            
            if(!digitalSignature.equals(sid)) {
                     System.out.println("标示不正确");
                   return "链接不正确,是否已经过期了?重新申请吧.";
            }else {
               //链接验证通过 转到修改密码页面
               System.out.println("验证成功");
               return "success";
            }
            
		}
		
	}




}