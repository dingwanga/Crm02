package cn.bdqn.crm.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   机会计划表
*/
public class SalPlan implements Serializable {
    //计划编号
    private Integer plaId;
    //对应机会编号
    private Integer plaChcId;
    //机会计划时间
    private Date plaDate;
    //计划事项
    private String plaTodo;
    //计划结果
    private String plaResult;
    //get set 方法
    public void setPlaId (Integer  plaId){
        this.plaId=plaId;
    }
    public  Integer getPlaId(){
        return this.plaId;
    }
    public void setPlaChcId (Integer  plaChcId){
        this.plaChcId=plaChcId;
    }
    public  Integer getPlaChcId(){
        return this.plaChcId;
    }
    public void setPlaDate (Date  plaDate){
        this.plaDate=plaDate;
    }
    public  Date getPlaDate(){
        return this.plaDate;
    }
    public void setPlaTodo (String  plaTodo){
        this.plaTodo=plaTodo;
    }
    public  String getPlaTodo(){
        return this.plaTodo;
    }
    public void setPlaResult (String  plaResult){
        this.plaResult=plaResult;
    }
    public  String getPlaResult(){
        return this.plaResult;
    }
}
