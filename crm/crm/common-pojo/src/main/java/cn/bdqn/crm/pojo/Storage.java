package cn.bdqn.crm.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   库存表
*/
public class Storage implements Serializable {
    //库存编号
    private Integer stkId;
    //对应产品编号
    private Integer stkProdId;
    //仓库
    private String stkWarehouse;
    //库位
    private String stkWare;
    //库存数量
    private Integer stkCount;
    //库存描述
    private String stkMemo;
    //get set 方法
    public void setStkId (Integer  stkId){
        this.stkId=stkId;
    }
    public  Integer getStkId(){
        return this.stkId;
    }
    public void setStkProdId (Integer  stkProdId){
        this.stkProdId=stkProdId;
    }
    public  Integer getStkProdId(){
        return this.stkProdId;
    }
    public void setStkWarehouse (String  stkWarehouse){
        this.stkWarehouse=stkWarehouse;
    }
    public  String getStkWarehouse(){
        return this.stkWarehouse;
    }
    public void setStkWare (String  stkWare){
        this.stkWare=stkWare;
    }
    public  String getStkWare(){
        return this.stkWare;
    }
    public void setStkCount (Integer  stkCount){
        this.stkCount=stkCount;
    }
    public  Integer getStkCount(){
        return this.stkCount;
    }
    public void setStkMemo (String  stkMemo){
        this.stkMemo=stkMemo;
    }
    public  String getStkMemo(){
        return this.stkMemo;
    }
}
