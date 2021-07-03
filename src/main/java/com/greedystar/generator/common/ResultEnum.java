package com.greedystar.generator.common;

/**
 * @author  统一错误码
 */

public enum ResultEnum {
	UNKONW_ERROR	(-1, "未知错误"),
	SUCCESS(0, "成功"),
	NOT_FOUND(2, "未找到结果"),
	ERROR(1, "失败"),
	NO_DATA(2, "无数据"),
	BUSY(3, "操作频繁"),
	PARAM_ERROR(101, "参数错误"),
	FILE_FORMAT_ERROR(102,"文件格式错误"),
	NO_SUPPORT(103,"暂不支持"),
	SMS_MINUTE(104,"操作频繁，请一分钟后再试"),
	SMS_DAY(105,"验证发送次数已达单日上限(5条),请明日再试"),
	INSERT_ERROR(106,"数据插入失败"),
	LACK_PARAM_ERROR(107,"缺少参数"),
	QUERY_NUM_ERROR(108,"查询数量太大"),
	QUERY_OUTOFNUM_ERROR(109,"超出查询范围"),
	NO_LOGIN(801, "没有登录"),
	NO_SIGN(802, "没有签约"),
	LOGIN_FORBID(803, "禁止登录"),
	VERIFICATION_CODE_ERROR(102, "验证码错误"),
	USER_NOT_EXIST(501, "用户不存在"),
	USER_LEVEL_ERROR(502,"无权限登录系统"),
	FANS_NO_KAWEI(503,"非会员无法卡位"),
	LEVEL_NO_KAWEI(504,"卡位等级不符"),
	IS_KAWEIING(505,"已经在卡位中"),
	NO_KAWEI(506,"非卡位人员"),
	NEW_USER_NEED_MOBILE(601, "新用户缺少手机号"),
	AFFICHE_NEED_UID_OR_CID(602, "公告未指定用户或渠道公司"),
	AFFICHE_NEED_ID(603, "缺少公告数据信息"),
	NO_COMMISSION(701, "缺少佣金信息"),
	BUY_GIFT_REPEAT(702, "重复购买会员礼包"),
	NO_RECOMMEND_USER(703, "推荐人不存在"),
	NO_RECOMMEND_USER_RELATION(704, "推荐人关系信息不存在"),
	GIFT_NO_COMMISSION(705,"礼包佣金比例未同步"),
	ORDER_IS_EXIST(706, "订单信息已存在"),
	RECOMMEND_USER_NO_COMPANY(707, "推荐人没有加入公司"),
	FANS_CAN_NOT_SELL_GIFT(708, "粉丝无法推广礼包"),
	WXLOIN_NOT_EXIST_ID(1001,"该微信不存在对应手机号"),
	WXLOIN_CODE_ERROR(1002,"该微信code错误"),
	WXGET_USERINFO_ERROR(1003,"获取微信用户信息失败"),
	BIND_TAG_ERROR(1101,"绑定tag失败"),
	UNBIND_TAG_ERROR(1102,"解绑tag失败"),
	TAG_NOT_EXIST(1103,"tag不存在"),
	TAG_NAME_NOT_EXIST(1104,"tag名称未定义"),
	MSG_PUSH_ERROR(1105,"推送失败"),
	COMPANY_NEED_ERROR(1106,"请配置渠道公司"),
	PACKAGE_EXIST_ERROR(1107,"该版本包已存在"),
	HTTP_ERROR(2001, "http调用失败"),
	OSSUPLOAD_ERROR(3001, "OSS存储上传失败"),
	OSSUPLOAD_NULL(3002, "OSS存储上传对象不能为空"),
	PICUPLOAD_EMPTY(710, "上传图片数量为空"),
	FANS_NO_SIGN(709, "粉丝未签约，不记账");


	private int code;
	private String msg;

	ResultEnum(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public Integer getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}
}
