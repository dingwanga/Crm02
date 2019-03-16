package cn.bdqn.crm.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   数据字典管理
*/
public class BasDict implements Serializable {
    //数据字典编号
    private Integer dictId;
    //类别
    private String dictType;
    //条目
    private String dictItem;
    //值
    private String dictValue;
    //是否可编辑:0-不可 1-可编辑
    private Integer dictIsEditable;
    //get set 方法
    public void setDictId (Integer  dictId){
        this.dictId=dictId;
    }
    public  Integer getDictId(){
        return this.dictId;
    }
    public void setDictType (String  dictType){
        this.dictType=dictType;
    }
    public  String getDictType(){
        return this.dictType;
    }
    public void setDictItem (String  dictItem){
        this.dictItem=dictItem;
    }
    public  String getDictItem(){
        return this.dictItem;
    }
    public void setDictValue (String  dictValue){
        this.dictValue=dictValue;
    }
    public  String getDictValue(){
        return this.dictValue;
    }
    public void setDictIsEditable (Integer  dictIsEditable){
        this.dictIsEditable=dictIsEditable;
    }
    public  Integer getDictIsEditable(){
        return this.dictIsEditable;
    }
}
