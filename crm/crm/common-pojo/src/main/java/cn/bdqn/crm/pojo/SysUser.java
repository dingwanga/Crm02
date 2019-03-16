package cn.bdqn.crm.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   系统用户表
*/
public class SysUser implements Serializable {
    //系统用户编号
    private Integer userId;
    //用户登录名
    private String userName;
    //用户登录密码
    private String userPassword;
    //角色编号
    private Integer userRoleId;
    //用户状态
    private Integer userFlag;
    //get set 方法
    public void setUserId (Integer  userId){
        this.userId=userId;
    }
    public  Integer getUserId(){
        return this.userId;
    }
    public void setUserName (String  userName){
        this.userName=userName;
    }
    public  String getUserName(){
        return this.userName;
    }
    public void setUserPassword (String  userPassword){
        this.userPassword=userPassword;
    }
    public  String getUserPassword(){
        return this.userPassword;
    }
    public void setUserRoleId (Integer  userRoleId){
        this.userRoleId=userRoleId;
    }
    public  Integer getUserRoleId(){
        return this.userRoleId;
    }
    public void setUserFlag (Integer  userFlag){
        this.userFlag=userFlag;
    }
    public  Integer getUserFlag(){
        return this.userFlag;
    }
}
