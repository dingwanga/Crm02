package cn.bdqn.crm.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   角色权限表
*/
public class SysRoleRight implements Serializable {
    //角色权限编号
    private Integer rfId;
    //角色编号
    private Integer rfRoleId;
    //角色权限代号
    private String rfRightCode;
    //get set 方法
    public void setRfId (Integer  rfId){
        this.rfId=rfId;
    }
    public  Integer getRfId(){
        return this.rfId;
    }
    public void setRfRoleId (Integer  rfRoleId){
        this.rfRoleId=rfRoleId;
    }
    public  Integer getRfRoleId(){
        return this.rfRoleId;
    }
    public void setRfRightCode (String  rfRightCode){
        this.rfRightCode=rfRightCode;
    }
    public  String getRfRightCode(){
        return this.rfRightCode;
    }
}
