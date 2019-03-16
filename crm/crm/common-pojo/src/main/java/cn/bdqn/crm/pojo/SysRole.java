package cn.bdqn.crm.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   角色表
*/
public class SysRole implements Serializable {
    //角色编号
    private Integer roleId;
    //角色名字
    private String roleName;
    //角色说明
    private String roleDesc;
    //角色状态
    private Integer roleFlag;
    //get set 方法
    public void setRoleId (Integer  roleId){
        this.roleId=roleId;
    }
    public  Integer getRoleId(){
        return this.roleId;
    }
    public void setRoleName (String  roleName){
        this.roleName=roleName;
    }
    public  String getRoleName(){
        return this.roleName;
    }
    public void setRoleDesc (String  roleDesc){
        this.roleDesc=roleDesc;
    }
    public  String getRoleDesc(){
        return this.roleDesc;
    }
    public void setRoleFlag (Integer  roleFlag){
        this.roleFlag=roleFlag;
    }
    public  Integer getRoleFlag(){
        return this.roleFlag;
    }
}
