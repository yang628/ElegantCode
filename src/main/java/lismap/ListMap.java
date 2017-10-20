package lismap;/*
 * Copyright (C) 2009-2016 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */

import java.util.*;

/**
 * lismap.ListMap
 *
 * @author cheqianzi.ygj
 * @email: cheqianzi@2dfire.com
 * @desc: http://ifeve.com/stream/
 * @since 2017-10-19
 */
public class ListMap {
    public static void main(String[] args) {

        //list转map
        Person people0 = new Person("aaa", 0);
        Person people1 = new Person("bbb", 1);
        Person people2 = new Person("bbb", 2);
        Person people3 = new Person("ccc", 3);
        Person people4 = new Person("ddd", 4);

        //必须是加泛型
        List<Person> peopleList = new ArrayList();
        peopleList.add(people0);
        peopleList.add(people1);
        peopleList.add(people2);
        peopleList.add(people3);
        peopleList.add(people4);

        //过滤
        long num = peopleList.stream().filter(a -> a.getAge() > 2).count();
        System.out.println(num);


    }
}
