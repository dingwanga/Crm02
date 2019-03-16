package cn.bdqn.crm.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   服务表
*/
public class CstService implements Serializable {
    //服务编号
    private Integer svrId;
    //服务类型
    private String svrType;
    //服务标题
    private String svrTitle;
    //服务对应客户编号
    private String svrCustNo;
    //服务客户姓名
    private String svrCustName;
    //服务状态
    private String svrStatus;
    //服务需求
    private String svrRequest;
    //服务创建者
    private Integer svrCreateId;
    //服务创建人姓名
    private String svrCreateBy;
    //服务创建时间
    private Date svrCreateDate;
    //服务指派者
    private Integer svrDueId;
    //服务指派人姓名
    private String svrDueTo;
    //服务指派时间
    private Date svrDueDate;
    //服务处理
    private String svrDeal;
    //服务处理者
    private Integer svrDealId;
    //服务处理人姓名
    private String svrDealBy;
    //服务处理时间
    private Date svrDealDate;
    //服务处理结果
    private String svrResult;
    //服务满意度
    private Integer svrSatisfy;
    //get set 方法
    public void setSvrId (Integer  svrId){
        this.svrId=svrId;
    }
    public  Integer getSvrId(){
        return this.svrId;
    }
    public void setSvrType (String  svrType){
        this.svrType=svrType;
    }
    public  String getSvrType(){
        return this.svrType;
    }
    public void setSvrTitle (String  svrTitle){
        this.svrTitle=svrTitle;
    }
    public  String getSvrTitle(){
        return this.svrTitle;
    }
    public void setSvrCustNo (String  svrCustNo){
        this.svrCustNo=svrCustNo;
    }
    public  String getSvrCustNo(){
        return this.svrCustNo;
    }
    public void setSvrCustName (String  svrCustName){
        this.svrCustName=svrCustName;
    }
    public  String getSvrCustName(){
        return this.svrCustName;
    }
    public void setSvrStatus (String  svrStatus){
        this.svrStatus=svrStatus;
    }
    public  String getSvrStatus(){
        return this.svrStatus;
    }
    public void setSvrRequest (String  svrRequest){
        this.svrRequest=svrRequest;
    }
    public  String getSvrRequest(){
        return this.svrRequest;
    }
    public void setSvrCreateId (Integer  svrCreateId){
        this.svrCreateId=svrCreateId;
    }
    public  Integer getSvrCreateId(){
        return this.svrCreateId;
    }
    public void setSvrCreateBy (String  svrCreateBy){
        this.svrCreateBy=svrCreateBy;
    }
    public  String getSvrCreateBy(){
        return this.svrCreateBy;
    }
    public void setSvrCreateDate (Date  svrCreateDate){
        this.svrCreateDate=svrCreateDate;
    }
    public  Date getSvrCreateDate(){
        return this.svrCreateDate;
    }
    public void setSvrDueId (Integer  svrDueId){
        this.svrDueId=svrDueId;
    }
    public  Integer getSvrDueId(){
        return this.svrDueId;
    }
    public void setSvrDueTo (String  svrDueTo){
        this.svrDueTo=svrDueTo;
    }
    public  String getSvrDueTo(){
        return this.svrDueTo;
    }
    public void setSvrDueDate (Date  svrDueDate){
        this.svrDueDate=svrDueDate;
    }
    public  Date getSvrDueDate(){
        return this.svrDueDate;
    }
    public void setSvrDeal (String  svrDeal){
        this.svrDeal=svrDeal;
    }
    public  String getSvrDeal(){
        return this.svrDeal;
    }
    public void setSvrDealId (Integer  svrDealId){
        this.svrDealId=svrDealId;
    }
    public  Integer getSvrDealId(){
        return this.svrDealId;
    }
    public void setSvrDealBy (String  svrDealBy){
        this.svrDealBy=svrDealBy;
    }
    public  String getSvrDealBy(){
        return this.svrDealBy;
    }
    public void setSvrDealDate (Date  svrDealDate){
        this.svrDealDate=svrDealDate;
    }
    public  Date getSvrDealDate(){
        return this.svrDealDate;
    }
    public void setSvrResult (String  svrResult){
        this.svrResult=svrResult;
    }
    public  String getSvrResult(){
        return this.svrResult;
    }
    public void setSvrSatisfy (Integer  svrSatisfy){
        this.svrSatisfy=svrSatisfy;
    }
    public  Integer getSvrSatisfy(){
        return this.svrSatisfy;
    }
}
