package pkg.basic.statics;

public class WhatDoesItDo {
	
	static int resut = 0;
	
	static int count(int number) {
		return resut += number;
	}
}
