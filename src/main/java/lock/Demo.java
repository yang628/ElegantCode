/*
 * Copyright (C) 2009-2016 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package lock;

/**
 * Demo
 *
 * @author cheqianzi.ygj
 * @email: cheqianzi@2dfire.com
 * @desc:
 * @since 2017-11-18
 */
public class Demo {
	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println(2);
			int k = 1/0;
			System.out.println(22);
			System.out.println(3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(4);
	}


}