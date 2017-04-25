package com.uestc.newmapper;

import com.uestc.newmodel.Roleauthority;
import com.uestc.model.Authoritylist;
import com.uestc.model.RoleauthorityKey;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleAuthorityAssociationMapper {
    
	//----------角色权限相关------
    List<Roleauthority> selectAuthorityByUserId(String userId);
    
    List<Roleauthority> selectAuthorityByRoleId(int roleId);
    

    int deleteAuthorityByRoleId(int roleId);
    
    int insertRoleauthorityByChoose(List<RoleauthorityKey> roleauthorityKeys);
    

    //----------权限相关------
    List<Authoritylist> selectAllAuthority();
    
}