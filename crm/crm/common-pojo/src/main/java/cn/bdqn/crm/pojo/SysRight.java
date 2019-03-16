package cn.bdqn.crm.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   权限表
*/
public class SysRight implements Serializable {
    //权限编号
    private String rightCode;
    //权限上级编号
    private String rightParentCode;
    //权限类型
    private String rightType;
    //权限文本
    private String rightText;
    //权限链接
    private String rightUrl;
    //权限注意点
    private String rightTip;
    //get set 方法
    public void setRightCode (String  rightCode){
        this.rightCode=rightCode;
    }
    public  String getRightCode(){
        return this.rightCode;
    }
    public void setRightParentCode (String  rightParentCode){
        this.rightParentCode=rightParentCode;
    }
    public  String getRightParentCode(){
        return this.rightParentCode;
    }
    public void setRightType (String  rightType){
        this.rightType=rightType;
    }
    public  String getRightType(){
        return this.rightType;
    }
    public void setRightText (String  rightText){
        this.rightText=rightText;
    }
    public  String getRightText(){
        return this.rightText;
    }
    public void setRightUrl (String  rightUrl){
        this.rightUrl=rightUrl;
    }
    public  String getRightUrl(){
        return this.rightUrl;
    }
    public void setRightTip (String  rightTip){
        this.rightTip=rightTip;
    }
    public  String getRightTip(){
        return this.rightTip;
    }
}
