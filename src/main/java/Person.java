/*
 * Copyright (C) 2009-2016 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */

import java.util.HashMap;

/**
 * Person
 *
 * @author cheqianzi.ygj
 * @email: cheqianzi@2dfire.com
 * @desc:
 * @since 2017-11-18
 */
public class Person {
	private String name;
	private int aga;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAga() {
		return aga;
	}

	public void setAga(int aga) {
		this.aga = aga;
	}

	public static void main(String[] args) {
		Person p = new Person();
		p.setAga(12);
		p.setName("yanggaoji");
		Person  pp = p;

		p.setAga(22);
		System.out.println(pp.aga);
	}

}