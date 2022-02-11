package com.edu.test;

import javax.servlet.*;


public class TestRequestListener implements ServletRequestListener{
	public TestRequestListener() {
		System.out.println("TestRequestLisener 객체 생성!");
	}
	
	public void requestIntialized(ServletRequestEvent e) {
		System.out.println("TestRequestLisener 객체 초기화!");
	}
	
	public void requestDestroyed(ServletRequestEvent e) {
		System.out.println("TestRequestLisener 객체 해제!");
	}

}
