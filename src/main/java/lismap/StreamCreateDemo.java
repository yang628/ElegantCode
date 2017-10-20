/*
 * Copyright (C) 2009-2016 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package lismap;


import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * StreamCreateDemo
 *
 * @author cheqianzi.ygj
 * @email: cheqianzi@2dfire.com
 * @desc:
 * @since 2017-10-20
 */
public class StreamCreateDemo {
    public static void main(String[] args) {
        /**
         * 创建Stream
         */
        /**
         * 使用Stream静态方法来创建Stream
         */
        // 1-1 of
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 5);
        Stream<String> stringStream = Stream.of("taobao");

        /*
            1-2 generator方法：生成一个无限长度的Stream，其元素的生成是通过给定的Supplier（这个接口可以看成一个对象的工厂，每次调用返回一个给定类型的对象）
        */
        Stream.generate(
                new Supplier<Double>() {
                    @Override
                    public Double get() {
                         return Math.random();
                    }
                });

        Stream.generate(() -> Math.random());
        Stream.generate(Math::random).limit(10).forEach(System.out::println);

         /*
            1-3 iterate方法：也是生成无限长度的Stream，和generator不同的是，其元素的生成是重复对给定的种子值(seed)调用用户指定函数来生成的。
            其中包含的元素可以认为是：seed，f(seed),f(f(seed))无限循环
            这段代码就是先获取一个无限长度的正整数集合的Stream，然后取出前10个打印。千万记住使用limit方法，不然会无限打印下去。
            */
          Stream.iterate(10111, item -> item ).limit(10).forEach(System.out::println);

        /**
         * 通过Collection子类获取Stream
         */
         /*
            查看Java doc就可以发现Collection接口有一个stream方法，所以其所有子类都都可以获取对应的Stream对象。
         *
         * */


    }
}
