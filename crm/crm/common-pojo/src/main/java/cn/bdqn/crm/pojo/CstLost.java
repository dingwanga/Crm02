package cn.bdqn.crm.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   丢失表
*/
public class CstLost implements Serializable {
    //丢失编号
    private Integer lstId;
    //丢失对应客户编号
    private String lstCustNo;
    //丢失客户姓名
    private String lstCustName;
    //客户经理编号
    private Integer lstCustManagerId;
    //客户经理名称
    private String lstCustManagerName;
    //最后一次联系时间
    private Date lstLastOrderDate;
    //丢失时间
    private Date lstLostDate;
    //丢失延期
    private String lstDelay;
    //丢失原因
    private String lstReason;
    //丢失状态
    private String lstStatus;
    //get set 方法
    public void setLstId (Integer  lstId){
        this.lstId=lstId;
    }
    public  Integer getLstId(){
        return this.lstId;
    }
    public void setLstCustNo (String  lstCustNo){
        this.lstCustNo=lstCustNo;
    }
    public  String getLstCustNo(){
        return this.lstCustNo;
    }
    public void setLstCustName (String  lstCustName){
        this.lstCustName=lstCustName;
    }
    public  String getLstCustName(){
        return this.lstCustName;
    }
    public void setLstCustManagerId (Integer  lstCustManagerId){
        this.lstCustManagerId=lstCustManagerId;
    }
    public  Integer getLstCustManagerId(){
        return this.lstCustManagerId;
    }
    public void setLstCustManagerName (String  lstCustManagerName){
        this.lstCustManagerName=lstCustManagerName;
    }
    public  String getLstCustManagerName(){
        return this.lstCustManagerName;
    }
    public void setLstLastOrderDate (Date  lstLastOrderDate){
        this.lstLastOrderDate=lstLastOrderDate;
    }
    public  Date getLstLastOrderDate(){
        return this.lstLastOrderDate;
    }
    public void setLstLostDate (Date  lstLostDate){
        this.lstLostDate=lstLostDate;
    }
    public  Date getLstLostDate(){
        return this.lstLostDate;
    }
    public void setLstDelay (String  lstDelay){
        this.lstDelay=lstDelay;
    }
    public  String getLstDelay(){
        return this.lstDelay;
    }
    public void setLstReason (String  lstReason){
        this.lstReason=lstReason;
    }
    public  String getLstReason(){
        return this.lstReason;
    }
    public void setLstStatus (String  lstStatus){
        this.lstStatus=lstStatus;
    }
    public  String getLstStatus(){
        return this.lstStatus;
    }
}
