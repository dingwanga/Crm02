package cn.bdqn.crm.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   产品表
*/
public class Product implements Serializable {
    //产品编号
    private Integer prodId;
    //产品名称
    private String prodName;
    //产品类型
    private String prodType;
    //产品批次
    private String prodBatch;
    //产品单位
    private String prodUnit;
    //对应产品价格
    private Double prodPrice;
    //产品内容
    private String prodMemo;
    //get set 方法
    public void setProdId (Integer  prodId){
        this.prodId=prodId;
    }
    public  Integer getProdId(){
        return this.prodId;
    }
    public void setProdName (String  prodName){
        this.prodName=prodName;
    }
    public  String getProdName(){
        return this.prodName;
    }
    public void setProdType (String  prodType){
        this.prodType=prodType;
    }
    public  String getProdType(){
        return this.prodType;
    }
    public void setProdBatch (String  prodBatch){
        this.prodBatch=prodBatch;
    }
    public  String getProdBatch(){
        return this.prodBatch;
    }
    public void setProdUnit (String  prodUnit){
        this.prodUnit=prodUnit;
    }
    public  String getProdUnit(){
        return this.prodUnit;
    }
    public void setProdPrice (Double  prodPrice){
        this.prodPrice=prodPrice;
    }
    public  Double getProdPrice(){
        return this.prodPrice;
    }
    public void setProdMemo (String  prodMemo){
        this.prodMemo=prodMemo;
    }
    public  String getProdMemo(){
        return this.prodMemo;
    }
}
