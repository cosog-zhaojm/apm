package com.cosog.utils;

import java.util.Scanner;

public class enumDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * outter: for (int i = 0; i < 3; i++) { System.out.println("iiii===>" +
		 * i); inner: for (int j = 0; j < 5; j++) { if (j == 1) continue inner;
		 * System.out.println("j===>" + j); } }
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("请输入当前的星期 英文?\r \n");
		String day = s.next();// 输入的字符串
		Day index=Day.toDay(day.toUpperCase());
		switch (index) {
		case SUNDAY:
			System.out.println("星期天");
			break;
		case MONDAY:
			System.out.println("星期一");
			break;
		case TUESDAY:
			System.out.println("星期二");
			break;

		}

	}

	public enum Day
	{
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, NOVALUE;
		public static Day toDay(String str)
		{
			try {
				return valueOf(str);
			} catch (Exception ex) {
				return NOVALUE;
			}
		}
	}
}
