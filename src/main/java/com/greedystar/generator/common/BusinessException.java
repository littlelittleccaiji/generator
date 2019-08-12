package com.greedystar.generator.common;

/**
 * 自定义异常类
 * 
 * @author snakelu
 * @since 2018.11.5
 */
public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private Integer code;

	public BusinessException() {
	}

	public BusinessException(String errorMsg) {
		super(errorMsg);
	}

	public BusinessException(ResultEnum resultEnum) {
		super(resultEnum.getMsg());
		this.code = resultEnum.getCode();
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
}
