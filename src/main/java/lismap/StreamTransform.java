/*
 * Copyright (C) 2009-2016 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package lismap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * StreamTransform
 *
 * @author cheqianzi.ygj
 * @email: cheqianzi@2dfire.com
 * @desc:  参考： http://ifeve.com/stream/
 * @since 2017-10-20
 */
public class StreamTransform {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(null);
        nums.add(1);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(null);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);
        long sum = nums.stream().filter(a -> a !=null).distinct().mapToInt(a -> a)
                .peek(a -> {
                   a = a*100;
                    System.out.println(a);
                })
                .skip(2)
                .limit(4)
                .sum();
        System.out.println(sum);


        /**
         * 可变汇聚
         */
        /**
         *  （vison1）
         * 第一个函数生成一个新的ArrayList实例；
         * 第二个函数接受两个参数，第一个是前面生成的ArrayList对象，二个是stream中包含的元素，函数体就是把stream中的元素加入ArrayList对象中。
             第二个函数被反复调用直到原stream的元素被消费完毕；
          第三个函数也是接受两个参数，这两个都是ArrayList类型的，函数体就是把第二个ArrayList全部加入到第一个中；

         */
        List<Integer> numList = nums.stream().filter(a -> a !=null)
                .collect(() -> new ArrayList<Integer>(), //Supplier supplier是一个工厂函数，用来生成一个新的容器；
                        (list,item) -> list.add(item),   //BiConsumer accumulator也是一个函数，用来把Stream中的元素添加到结果容器中
                        (list, list2) -> list.addAll(list2));//BiConsumer combiner还是一个函数，用来把中间状态的多个结果容器合并成为一个（并发的时候会用到）

        /**
         * (version 2)
         * Java8还给我们提供了Collector的工具类–[Collectors](http://docs.oracle.com/javase/8/docs/api/java/util/stream/Collectors.html)，
         * 其中已经定义了一些静态工厂方法，比如：Collectors.toCollection()收集到Collection中, Collectors.toList()收集到List中和Collectors.toSet()收集到Set中。
         */
        List<Integer> numsWithoutNull = nums.stream().filter(num -> num != null).collect(Collectors.toList());




        /**
         * 其他汇聚
         * 可以看到reduce方法接受一个函数，这个函数有两个参数，第一个参数是上次函数执行的返回值（也称为中间结果），
         * 第二个参数是stream中的元素，这个函数把这两个值相加，得到的和会被赋值给下次执行这个函数的第一个参数。
         * 要注意的是：**第一次执行的时候第一个参数的值是Stream的第一个元素，第二个参数是Stream的第二个元素**。
         */
        System.out.println("ints sum is:" + nums.stream().reduce((sum2, item) -> sum2+item).get());

      /*  这个定义上上面已经介绍过的基本一致，不同的是：它允许用户提供一个循环计算的初始值，如果Stream为空，就直接返回该值。
          而且这个方法不会返回Optional，因为其不会出现null值。*/

        System.out.println("ints sum is:" + nums.stream().reduce(0, (sum2, item) -> sum2 + item));







    }
}
