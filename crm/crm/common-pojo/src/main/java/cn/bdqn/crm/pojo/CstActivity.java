package cn.bdqn.crm.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   客户开发
*/
public class CstActivity implements Serializable {
    //客户开发编号
    private Integer atvId;
    //对应客户编号
    private String atvCustNo;
    //客户名称
    private String atvCustName;
    //开发日期
    private Date atvDate;
    //开发地点
    private String atvPlace;
    //开发主题
    private String atvTitle;
    //开发详情
    private String atvDesc;
    //get set 方法
    public void setAtvId (Integer  atvId){
        this.atvId=atvId;
    }
    public  Integer getAtvId(){
        return this.atvId;
    }
    public void setAtvCustNo (String  atvCustNo){
        this.atvCustNo=atvCustNo;
    }
    public  String getAtvCustNo(){
        return this.atvCustNo;
    }
    public void setAtvCustName (String  atvCustName){
        this.atvCustName=atvCustName;
    }
    public  String getAtvCustName(){
        return this.atvCustName;
    }
    public void setAtvDate (Date  atvDate){
        this.atvDate=atvDate;
    }
    public  Date getAtvDate(){
        return this.atvDate;
    }
    public void setAtvPlace (String  atvPlace){
        this.atvPlace=atvPlace;
    }
    public  String getAtvPlace(){
        return this.atvPlace;
    }
    public void setAtvTitle (String  atvTitle){
        this.atvTitle=atvTitle;
    }
    public  String getAtvTitle(){
        return this.atvTitle;
    }
    public void setAtvDesc (String  atvDesc){
        this.atvDesc=atvDesc;
    }
    public  String getAtvDesc(){
        return this.atvDesc;
    }
}
