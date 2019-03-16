package cn.bdqn.crm.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   机会表
*/
public class SalChance implements Serializable {
    //机会编号
    private Integer chcId;
    //机会来源
    private String chcSource;
    //机会对应客户名
    private String chcCustName;
    //机会标题
    private String chcTitle;
    //机会成功率
    private Integer chcRate;
    //机会联系姓名
    private String chcLinkman;
    //机会联系电话
    private String chcTel;
    //机会详情
    private String chcDesc;
    //机会创建者
    private Integer chcCreateId;
    //机会创建者姓名
    private String chcCreateBy;
    //机会创建时间
    private Date chcCreateDate;
    //机会指派者
    private Integer chcDueId;
    //机会指派者姓名
    private String chcDueTo;
    //机会指派时间
    private Date chcDueDate;
    //get set 方法
    public void setChcId (Integer  chcId){
        this.chcId=chcId;
    }
    public  Integer getChcId(){
        return this.chcId;
    }
    public void setChcSource (String  chcSource){
        this.chcSource=chcSource;
    }
    public  String getChcSource(){
        return this.chcSource;
    }
    public void setChcCustName (String  chcCustName){
        this.chcCustName=chcCustName;
    }
    public  String getChcCustName(){
        return this.chcCustName;
    }
    public void setChcTitle (String  chcTitle){
        this.chcTitle=chcTitle;
    }
    public  String getChcTitle(){
        return this.chcTitle;
    }
    public void setChcRate (Integer  chcRate){
        this.chcRate=chcRate;
    }
    public  Integer getChcRate(){
        return this.chcRate;
    }
    public void setChcLinkman (String  chcLinkman){
        this.chcLinkman=chcLinkman;
    }
    public  String getChcLinkman(){
        return this.chcLinkman;
    }
    public void setChcTel (String  chcTel){
        this.chcTel=chcTel;
    }
    public  String getChcTel(){
        return this.chcTel;
    }
    public void setChcDesc (String  chcDesc){
        this.chcDesc=chcDesc;
    }
    public  String getChcDesc(){
        return this.chcDesc;
    }
    public void setChcCreateId (Integer  chcCreateId){
        this.chcCreateId=chcCreateId;
    }
    public  Integer getChcCreateId(){
        return this.chcCreateId;
    }
    public void setChcCreateBy (String  chcCreateBy){
        this.chcCreateBy=chcCreateBy;
    }
    public  String getChcCreateBy(){
        return this.chcCreateBy;
    }
    public void setChcCreateDate (Date  chcCreateDate){
        this.chcCreateDate=chcCreateDate;
    }
    public  Date getChcCreateDate(){
        return this.chcCreateDate;
    }
    public void setChcDueId (Integer  chcDueId){
        this.chcDueId=chcDueId;
    }
    public  Integer getChcDueId(){
        return this.chcDueId;
    }
    public void setChcDueTo (String  chcDueTo){
        this.chcDueTo=chcDueTo;
    }
    public  String getChcDueTo(){
        return this.chcDueTo;
    }
    public void setChcDueDate (Date  chcDueDate){
        this.chcDueDate=chcDueDate;
    }
    public  Date getChcDueDate(){
        return this.chcDueDate;
    }
}
