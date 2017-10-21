/*
 * Copyright (C) 2009-2016 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package lismap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
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
     //   Person people2= new Person("bbb",2);
        Person people3= new Person("ccc",3);
        Person people4= new Person("ddd",4);

        //必须是加泛型
        List<Person> peopleList = new ArrayList();
        peopleList.add(people0);
        peopleList.add(people1);
     //   peopleList.add(people2);
        peopleList.add(people3);
        peopleList.add(people4);
        peopleList.stream().forEach(System.out::println);

        /**
         * map 相当于映射
         */
        List<String> aa = peopleList.stream().map(a -> a.getName()+a.getAge()).collect(Collectors.toList());
        aa.stream().forEach(System.out::println);

        /**
         * map(a -> a.getName()+a.getAge()) 把之前的进行映射
         * Collectors.toMap(a -> a.substring(0,1), Function.identity())
         * 第一个参数： 都是从上一个传下来的
         * 第二个参数：Function.identity() 的意思： 传来是什么参数，什么参数
         *
         */
        Map<String, String>  mapDemo =  peopleList.stream().map(a -> a.getName()+a.getAge()).collect(Collectors.toMap(a -> a.substring(0,1), Function.identity()));



        /**
         *  第一种：通过Map.keySet遍历key和value：
         *  map.keySet()是返回所有的key值
         */
        System.out.println("第一种：通过Map.keySet遍历key和value：");
        for(String key :mapDemo.keySet()){
            String value = mapDemo.get(key);
            System.out.println("key: "+key+"   value: "+value);
        }

        /**
         * 第二种： Map.entrySet使用Iterator遍历
         */
        System.out.println("第二种：通过Map.entrySet使用iterator遍历key和value：");
        Iterator<Map.Entry<String,String>> iterator = mapDemo.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("key:  "+entry.getKey()+"   value:  "+entry.getValue());
        }

        /**
         *  第三种：推荐，尤其是容量大时   :最好
         */
        System.out.println("第三种：通过Map.entrySet遍历key和value");
        for (Map.Entry<String, String> entry : mapDemo.entrySet()){
            System.out.println("key:  "+entry.getKey()+" value:  "+entry.getValue());
        }


        System.out.println("---------------------");
        /**
         * List --转--Map
         * map(a -> a)  ：做了窄化映射
         * Collectors.toMap(person -> person.getAge(),person -> person.getName())    接受参数，进行处理key，value
         *
         */
       Map<Integer, String> listToMap = peopleList.stream().map(a -> a).collect(Collectors.toMap(person -> person.getAge(),person -> person.getName()));
       for (Map.Entry<Integer, String> entry : listToMap.entrySet()){
            System.out.println("key:  "+entry.getKey()+" value:  "+entry.getValue());
       }

    }
}
