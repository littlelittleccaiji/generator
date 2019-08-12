package com.greedystar.generator.common;

import lombok.Data;

@Data
public class Response<T> {

	private Integer code;

	private String message;

	private T result;

	public Response(T result) {
		this.code = ResultEnum.SUCCESS.getCode();
		this.message = ResultEnum.SUCCESS.getMsg();
		this.result = result;
	}

	public Response(ResultEnum resultEnum) {
		this.code = resultEnum.getCode();
		this.message = resultEnum.getMsg();
	}

	public Response(Integer code, String message) {
		this.code = code;
		this.message = message;
	}

	public Response(Integer code, String message, T result) {
		this.code = code;
		this.message = message;
		this.result = result;
	}
}
