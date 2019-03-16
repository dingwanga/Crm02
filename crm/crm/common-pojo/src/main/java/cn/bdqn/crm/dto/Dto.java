package cn.bdqn.crm.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 数据传输对象（后端输出对象）
 * @param <T>
 */
@ApiModel(value = "数据传输对象（后端输出对象）",description = "后端输出对象")
public class Dto<T> implements Serializable{
	@ApiModelProperty(value ="success" ,required = true,dataType = "String",
			notes="判断系统是否出错做出相应的true或者false的返回，与业务无关，出现的各种异常")
	private String success; //判断系统是否出错做出相应的true或者false的返回，与业务无关，出现的各种异常
	@ApiModelProperty(value ="errorCode" ,required = true,dataType = "String",
			notes="该错误码为自定义，一般0表示无错")
	private String errorCode;//该错误码为自定义，一般0表示无错
	@ApiModelProperty(value ="msg" ,required = false,dataType = "String",
			notes="对应的提示信息")
	private String msg;//对应的提示信息
	@ApiModelProperty(value ="data" ,required = false,dataType = "自定义VO",
			notes="具体返回数据内容")
	private T data;//具体返回数据内容(pojo、自定义VO、其他)
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}