/*
 * Copyright (C) 2009-2016 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package lismap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * ListMap
 *
 * @author cheqianzi.ygj
 * @email: cheqianzi@2dfire.com
 * @desc:
 * @since 2017-10-20
 */
public class ListMap {
    public static void main(String[] args) {
        Person people0 = new Person("aaa",0);
        Person people1= new Person("bbb",1);
        Person people2= new Person("bbb",2);
        Person people3= new Person("ccc",3);
        Person people4= new Person("ddd",4);

        //必须是加泛型
        List<Person> peopleList = new ArrayList();
        peopleList.add(people0);
        peopleList.add(people1);
        peopleList.add(people2);
        peopleList.add(people3);
        peopleList.add(people4);

        List<String> aa = peopleList.stream().map(Person::getName).collect(Collectors.toList());
        peopleList.stream().forEach(System.out::println);

    }
}
