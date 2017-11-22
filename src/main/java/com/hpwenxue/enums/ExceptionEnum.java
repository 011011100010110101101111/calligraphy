package com.hpwenxue.enums;

public enum ExceptionEnum {
	A(0),
	B(2),
	C(3);
	private int value;
	ExceptionEnum(int value){
		this.value = value;
	}
	public int value() {
		return this.value;
	}
}
