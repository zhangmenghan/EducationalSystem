package com.uestc.newmapper;

import com.uestc.model.Roleinfo;
import com.uestc.model.Userinfo;
import com.uestc.model.UserroleKey;
import com.uestc.newmodel.Userrole;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleAssociationMapper {
  
    //------用户相关---------//
    List<Userinfo> selectAllUser();
    
    List<Userinfo> selectAllUserByIdOrName(String userIdOrName);

    int insertByExcel(List<Userinfo> userinfos);

    Userinfo selectByPrimaryKey(String userId);

    //------用户角色相关---------//
    List<Userrole> selectRoleByUserId(String userId);
    
    List<Userrole> selectUserByRoleId(int roleId);
    
    int deleteRoleByUserId(String userId);
    
    int insertUserroleByChoose(List<UserroleKey> userroleKeys);
    
    //------角色相关---------//
    int insertByRoleId(Roleinfo roleinfo);
    
    int insertUndefinedRole(String roleName);
    
    List<Roleinfo> selectAllRole();
    
}