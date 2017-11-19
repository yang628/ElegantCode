/*
 * Copyright (C) 2009-2016 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package io;

import java.io.IOException;

/**
 * Son
 *
 * @author cheqianzi.ygj
 * @email: cheqianzi@2dfire.com
 * @desc:
 * @since 2017-11-12
 */
public class Son extends Father {

	int m =5;


	@Override
	public void add()throws IOException {

	}

	public static void main(String[] args) {
		Son son = new Son();
		System.out.println(son.m);

		Thread thread = new Thread();
		thread.start();

	}

}