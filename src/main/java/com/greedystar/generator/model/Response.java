package com.greedystar.generator.model;

import com.greedystar.generator.common.ResultEnum;
import com.greedystar.generator.utils.TraceUtils;

public class Response<T> {

	private String lid;

	private Integer code;

	private String message;

	private String errorMsg;

	private T result;
	private T data;
	public Response(T result) {
		if (result == null) {
			this.code = ResultEnum.NOT_FOUND.getCode();
			this.message = ResultEnum.NOT_FOUND.getMsg();
		} else {
			this.code = ResultEnum.SUCCESS.getCode();
			this.message = ResultEnum.SUCCESS.getMsg();
			this.result = result;
		}
	}
	public Response(T result, T data) {
		if (result == null) {
			this.code = ResultEnum.NOT_FOUND.getCode();
			this.message = ResultEnum.NOT_FOUND.getMsg();
		} else {
			this.code = ResultEnum.SUCCESS.getCode();
			this.message = ResultEnum.SUCCESS.getMsg();
			this.result = result;
			this.data = data;
		}
	}

	public Response(ResultEnum resultEnum) {
		TraceUtils traceContext = (TraceUtils) TraceUtils.ctx.get();
		this.lid = traceContext.getTraceId();
		this.code = resultEnum.getCode();
		this.message = resultEnum.getMsg();
	}

	public Response(ResultEnum resultEnum, String errorMsg) {
		this.code = resultEnum.getCode();
		this.message = resultEnum.getMsg();
		this.errorMsg = errorMsg;
	}

	public Response(ResultEnum resultEnum, String lid, String e) {
		this.code = resultEnum.getCode();
		this.message = resultEnum.getMsg();
		this.lid = lid;
		this.errorMsg = e;
	}
	public Response(Integer code, String message, String errorMsg) {
		this.code = code;
		this.message = message;
		this.errorMsg = errorMsg;
	}

	public Response(Integer code, String message, String errorMsg, Long lid) {
		this.code = code;
		this.message = message;
		this.errorMsg = errorMsg;
		this.lid = lid.toString();
	}
	public Response(Integer code, String message) {
		TraceUtils traceContext = (TraceUtils) TraceUtils.ctx.get();
		this.lid = traceContext.getTraceId();
		this.code = code;
		this.message = message;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getLid() {
		return lid;
	}

	public void setLid(String lid) {
		this.lid = lid;
	}

}
