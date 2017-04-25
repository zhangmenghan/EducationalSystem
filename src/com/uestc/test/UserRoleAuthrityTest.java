package com.uestc.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import com.uestc.model.Userinfo;
import com.uestc.service.UserBaseInfoService;
import com.uestc.serviceImpl.UserBaseInfoServiceImpl;
import com.uestc.util.AESEnDecrypt;
import com.uestc.util.MD5Encrypt;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext*.xml"})


public class UserRoleAuthrityTest {
	

	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	private UserBaseInfoService userBaseInfoService;
	
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext*.xml");
	}
	
	
	@Test
	public void test() {
		String m  = "15";
		short i = 1;
		int j = 1;
		byte k = 10;
		j = Integer.parseInt(m);
		k = Byte.parseByte(m);
		System.out.println(k);
		System.out.println("爱是一道光");
	}
	
	@Test
	public void Encoded() throws Exception{
		System.out.println("1");
		
        System.out.println("loginPwd"+"123456");
        
        String loginPwd = "123456";
		AESEnDecrypt aesEnDecrypt = new AESEnDecrypt();
        // 调用md5加密
        String salt = "0402"+"护士学校";
		String MD5pwd = new MD5Encrypt().encrypt(loginPwd,salt);
		System.out.println(MD5pwd);
		
		System.out.println("");
		// 调用AES加密进行测试
		
		String aesEncryptResult = aesEnDecrypt.encrypt(MD5pwd, "uestc2017nurse01");
		System.out.println("加密后：" + aesEncryptResult);  

		
		String loginstring = "b923bcfa0ab64585500957ac3dbf3242bc2164ef2bbe13642a6bc45abfeb32f8d5a8752e5d2672681ef2405303fb1336";
		//String loginstring = "473C346272017C7D9BB01BBD24237CD4D3F1D3476C99BB4FACDEAEE3D0A77CD13EF2A0D75F0EA1113DEFFDF025EDA946";
        
		
		String loginString = loginstring.toUpperCase();
        System.out.println("前密码："+loginString);
		String aesNEWDecryptPwd = aesEnDecrypt.decrypt(loginString,"uestc2017nurse01");  
		
        System.out.println("前端解密后：" + aesNEWDecryptPwd);  
		
        // 调用AES工具进行密码解密
        String aesDecryptPwd = aesEnDecrypt.decrypt(aesEncryptResult,"uestc2017nurse01");  
        System.out.println("解密后：" + aesDecryptPwd);  
	}
	
	
	@Test
	public void test1() {
		
		List<Userinfo> userinfos;
		try {
			userinfos = userBaseInfoService.findAllUser();
		    System.out.println(userinfos);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println("123");
	}


}
