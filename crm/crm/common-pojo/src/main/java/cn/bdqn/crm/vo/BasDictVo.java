package cn.bdqn.crm.vo;

public class BasDictVo {
    //数据字典编号
    private Integer dictId;
    //类别
    private String dictType;
    //条目
    private String dictItem;
    //值
    private String dictValue;
    //是否可编辑:0-不可 1-可编辑
    private String IsEditable;

    public Integer getDictId() {
        return dictId;
    }

    public void setDictId(Integer dictId) {
        this.dictId = dictId;
    }

    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType;
    }

    public String getDictItem() {
        return dictItem;
    }

    public void setDictItem(String dictItem) {
        this.dictItem = dictItem;
    }

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }

    public String getIsEditable() {
        return IsEditable;
    }

    public void setIsEditable(String isEditable) {
        IsEditable = isEditable;
    }
}
