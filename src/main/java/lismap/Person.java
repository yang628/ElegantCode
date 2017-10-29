/*
 * Copyright (C) 2009-2016 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package lismap;

/**
 * Person
 *
 * @author cheqianzi.ygj
 * @email: cheqianzi@2dfire.com
 * @desc:
 * @since 2017-10-19
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 14;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("交换后：a="+a+", b="+b);

    }
}
