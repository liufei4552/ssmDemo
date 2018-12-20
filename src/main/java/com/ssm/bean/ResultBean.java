package com.ssm.bean;

public class ResultBean {
	private int code;//返回数字
	private Object obj;//返回值

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public ResultBean() {
		super();
	}

	public ResultBean(int code, Object obj) {
		this.code = code;
		this.obj = obj;
	}

	public ResultBean(int code) {
		this.code = code;
	}

	public ResultBean(Object obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "ResultBean{" +
				"code=" + code +
				", obj=" + obj +
				'}';
	}
}
