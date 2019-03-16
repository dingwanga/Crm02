package cn.bdqn.crm.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   客户表
*/
public class CstCustomer implements Serializable {
    //客户编号
    private String custNo;
    //客户名称
    private String custName;
    //客户区域
    private String custRegion;
    //客户经理编号
    private Integer custManagerId;
    //客户经理名称
    private String custManagerName;
    //客户级别
    private Integer custLevel;
    //客户级别说明
    private String custLevelLabel;
    //客户满意度
    private Integer custSatisfy;
    //客户信任度
    private Integer custCredit;
    //客户地址
    private String custAddr;
    //客户邮编
    private String custZip;
    //客户电话
    private String custTel;
    //客户传真
    private String custFax;
    //客户网址
    private String custWebsite;
    //客户许可证号
    private String custLicenceNo;
    //客户老板
    private String custChieftain;
    //资金
    private Integer custBankroll;
    //成交量
    private Integer custTurnover;
    //客户银行
    private String custBank;
    //客户银行账号
    private String custBankAccount;
    //客户税号
    private String custLocalTaxNo;
    //客户国内税号
    private String custNationalTaxNo;
    //客户状态
    private String custStatus;
    //get set 方法
    public void setCustNo (String  custNo){
        this.custNo=custNo;
    }
    public  String getCustNo(){
        return this.custNo;
    }
    public void setCustName (String  custName){
        this.custName=custName;
    }
    public  String getCustName(){
        return this.custName;
    }
    public void setCustRegion (String  custRegion){
        this.custRegion=custRegion;
    }
    public  String getCustRegion(){
        return this.custRegion;
    }
    public void setCustManagerId (Integer  custManagerId){
        this.custManagerId=custManagerId;
    }
    public  Integer getCustManagerId(){
        return this.custManagerId;
    }
    public void setCustManagerName (String  custManagerName){
        this.custManagerName=custManagerName;
    }
    public  String getCustManagerName(){
        return this.custManagerName;
    }
    public void setCustLevel (Integer  custLevel){
        this.custLevel=custLevel;
    }
    public  Integer getCustLevel(){
        return this.custLevel;
    }
    public void setCustLevelLabel (String  custLevelLabel){
        this.custLevelLabel=custLevelLabel;
    }
    public  String getCustLevelLabel(){
        return this.custLevelLabel;
    }
    public void setCustSatisfy (Integer  custSatisfy){
        this.custSatisfy=custSatisfy;
    }
    public  Integer getCustSatisfy(){
        return this.custSatisfy;
    }
    public void setCustCredit (Integer  custCredit){
        this.custCredit=custCredit;
    }
    public  Integer getCustCredit(){
        return this.custCredit;
    }
    public void setCustAddr (String  custAddr){
        this.custAddr=custAddr;
    }
    public  String getCustAddr(){
        return this.custAddr;
    }
    public void setCustZip (String  custZip){
        this.custZip=custZip;
    }
    public  String getCustZip(){
        return this.custZip;
    }
    public void setCustTel (String  custTel){
        this.custTel=custTel;
    }
    public  String getCustTel(){
        return this.custTel;
    }
    public void setCustFax (String  custFax){
        this.custFax=custFax;
    }
    public  String getCustFax(){
        return this.custFax;
    }
    public void setCustWebsite (String  custWebsite){
        this.custWebsite=custWebsite;
    }
    public  String getCustWebsite(){
        return this.custWebsite;
    }
    public void setCustLicenceNo (String  custLicenceNo){
        this.custLicenceNo=custLicenceNo;
    }
    public  String getCustLicenceNo(){
        return this.custLicenceNo;
    }
    public void setCustChieftain (String  custChieftain){
        this.custChieftain=custChieftain;
    }
    public  String getCustChieftain(){
        return this.custChieftain;
    }
    public void setCustBankroll (Integer  custBankroll){
        this.custBankroll=custBankroll;
    }
    public  Integer getCustBankroll(){
        return this.custBankroll;
    }
    public void setCustTurnover (Integer  custTurnover){
        this.custTurnover=custTurnover;
    }
    public  Integer getCustTurnover(){
        return this.custTurnover;
    }
    public void setCustBank (String  custBank){
        this.custBank=custBank;
    }
    public  String getCustBank(){
        return this.custBank;
    }
    public void setCustBankAccount (String  custBankAccount){
        this.custBankAccount=custBankAccount;
    }
    public  String getCustBankAccount(){
        return this.custBankAccount;
    }
    public void setCustLocalTaxNo (String  custLocalTaxNo){
        this.custLocalTaxNo=custLocalTaxNo;
    }
    public  String getCustLocalTaxNo(){
        return this.custLocalTaxNo;
    }
    public void setCustNationalTaxNo (String  custNationalTaxNo){
        this.custNationalTaxNo=custNationalTaxNo;
    }
    public  String getCustNationalTaxNo(){
        return this.custNationalTaxNo;
    }
    public void setCustStatus (String  custStatus){
        this.custStatus=custStatus;
    }
    public  String getCustStatus(){
        return this.custStatus;
    }
}
