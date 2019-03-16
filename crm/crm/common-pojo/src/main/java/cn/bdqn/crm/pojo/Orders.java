package cn.bdqn.crm.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   订单表
*/
public class Orders implements Serializable {
    //订单编号
    private Integer odrId;
    //订单用户名
    private String odrCustomer;
    //订单时间
    private Date odrDate;
    //订单用户地址
    private String odrAddr;
    //订单状态
    private String odrStatus;
    //get set 方法
    public void setOdrId (Integer  odrId){
        this.odrId=odrId;
    }
    public  Integer getOdrId(){
        return this.odrId;
    }
    public void setOdrCustomer (String  odrCustomer){
        this.odrCustomer=odrCustomer;
    }
    public  String getOdrCustomer(){
        return this.odrCustomer;
    }
    public void setOdrDate (Date  odrDate){
        this.odrDate=odrDate;
    }
    public  Date getOdrDate(){
        return this.odrDate;
    }
    public void setOdrAddr (String  odrAddr){
        this.odrAddr=odrAddr;
    }
    public  String getOdrAddr(){
        return this.odrAddr;
    }
    public void setOdrStatus (String  odrStatus){
        this.odrStatus=odrStatus;
    }
    public  String getOdrStatus(){
        return this.odrStatus;
    }
}
