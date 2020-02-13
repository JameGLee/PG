package com.pg.ljh.enums;

/**
 * 使用枚举表述常量数据字典
 */
public enum AppointStateEnum {

	SUCCESS(1, "预约成功"),
	NO_NUMBER(0, "库存不足"),
	REPEAT_APPOINT(-1, "重复预约"),
	USER_EXIST(101, "用户名已被注册"),
	USER_NOT_EXIST(100, "用户名不存在"),
	USER_PHONE_EXIST(102,"该号码已被注册，可直接登录"),
	USER_PHONE_NOT_EXIST(200,"该号码没有被注册"),
	PASSWORD_NOT_TRUE(103,"两次输入密码不一致"),
	PASSWORD_TRUE(300,"两次输入密码一致"),
	NOT_USERNAME(-100,"用户名未填写"),
	INNER_ERROR(-2, "系统异常");

	private int state;

	private String stateInfo;

	private AppointStateEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}

	public int getState() {
		return state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	public static AppointStateEnum stateOf(int index) {
		for (AppointStateEnum state : values()) {
			if (state.getState() == index) {
				return state;
			}
		}
		return null;
	}

}
