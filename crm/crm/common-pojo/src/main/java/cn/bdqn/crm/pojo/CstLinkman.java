package cn.bdqn.crm.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   联系人表
*/
public class CstLinkman implements Serializable {
    //联系人编号
    private Integer lkmId;
    //联系人对应客户编号
    private String lkmCustNo;
    //联系人客户姓名
    private String lkmCustName;
    //联系人姓名
    private String lkmName;
    //联系人性别
    private String lkmSex;
    //联系人职位
    private String lkmPostion;
    //联系人座机
    private String lkmTel;
    //联系人手机号
    private String lkmMobile;
    //联系人说明
    private String lkmMemo;
    //get set 方法
    public void setLkmId (Integer  lkmId){
        this.lkmId=lkmId;
    }
    public  Integer getLkmId(){
        return this.lkmId;
    }
    public void setLkmCustNo (String  lkmCustNo){
        this.lkmCustNo=lkmCustNo;
    }
    public  String getLkmCustNo(){
        return this.lkmCustNo;
    }
    public void setLkmCustName (String  lkmCustName){
        this.lkmCustName=lkmCustName;
    }
    public  String getLkmCustName(){
        return this.lkmCustName;
    }
    public void setLkmName (String  lkmName){
        this.lkmName=lkmName;
    }
    public  String getLkmName(){
        return this.lkmName;
    }
    public void setLkmSex (String  lkmSex){
        this.lkmSex=lkmSex;
    }
    public  String getLkmSex(){
        return this.lkmSex;
    }
    public void setLkmPostion (String  lkmPostion){
        this.lkmPostion=lkmPostion;
    }
    public  String getLkmPostion(){
        return this.lkmPostion;
    }
    public void setLkmTel (String  lkmTel){
        this.lkmTel=lkmTel;
    }
    public  String getLkmTel(){
        return this.lkmTel;
    }
    public void setLkmMobile (String  lkmMobile){
        this.lkmMobile=lkmMobile;
    }
    public  String getLkmMobile(){
        return this.lkmMobile;
    }
    public void setLkmMemo (String  lkmMemo){
        this.lkmMemo=lkmMemo;
    }
    public  String getLkmMemo(){
        return this.lkmMemo;
    }
}
