package cn.bdqn.crm.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   订单详情
*/
public class OrdersLine implements Serializable {
    //订单详情编号
    private Integer oddId;
    //对应外键订单编号
    private Integer oddOrderId;
    //对应外键产品编号
    private Integer oddProdId;
    //产品购买数量
    private Integer oddCount;
    //对应产品单位
    private String oddUnit;
    //对应产品价格
    private Double oddPrice;
    //get set 方法
    public void setOddId (Integer  oddId){
        this.oddId=oddId;
    }
    public  Integer getOddId(){
        return this.oddId;
    }
    public void setOddOrderId (Integer  oddOrderId){
        this.oddOrderId=oddOrderId;
    }
    public  Integer getOddOrderId(){
        return this.oddOrderId;
    }
    public void setOddProdId (Integer  oddProdId){
        this.oddProdId=oddProdId;
    }
    public  Integer getOddProdId(){
        return this.oddProdId;
    }
    public void setOddCount (Integer  oddCount){
        this.oddCount=oddCount;
    }
    public  Integer getOddCount(){
        return this.oddCount;
    }
    public void setOddUnit (String  oddUnit){
        this.oddUnit=oddUnit;
    }
    public  String getOddUnit(){
        return this.oddUnit;
    }
    public void setOddPrice (Double  oddPrice){
        this.oddPrice=oddPrice;
    }
    public  Double getOddPrice(){
        return this.oddPrice;
    }
}
