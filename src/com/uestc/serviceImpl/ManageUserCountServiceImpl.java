package com.uestc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uestc.mapper.UserinfoMapper;
import com.uestc.model.Userinfo;
import com.uestc.newmapper.UserRoleAssociationMapper;

@Service
public class ManageUserCountServiceImpl implements com.uestc.service.ManageUserCountService {

	@Autowired
	private UserinfoMapper userinfoMapper;
	
	@Autowired
	private UserRoleAssociationMapper userRoleAssociationMapper;
	
	
	@Override
	public String addUserinfoByExcel(List<Userinfo> userinfos) throws Exception {
		// TODO Auto-generated method stub
		int i ;
		System.out.println(userinfos.get(0).getUserId());
	    i = userRoleAssociationMapper.insertByExcel(userinfos);
	    if(i==0){
	    	return "插入失败";
	    }
		return "插入成功";
	}

	@Override
	public String delete(String userId) throws Exception {
		// TODO Auto-generated method stub
		int i = userinfoMapper.deleteByPrimaryKey(userId);
		
		if(i==0){
	    	return "删除失败";
	    }
		return "删除成功";
	}


}
