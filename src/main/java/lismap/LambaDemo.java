/*
 * Copyright (C) 2009-2016 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package lismap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * LambaDemo
 *
 * @author cheqianzi.ygj
 * @email: cheqianzi@2dfire.com
 * @desc:
 * @since 2017-10-20
 */
public class LambaDemo {
    public static void main(String[] args) {
        /**
         *   方法引用：
         *
         * （1） objectName::instanceMethod
           （2） ClassName::staticMethod    等同于把lambda表达式的参数直接当成instanceMethod|staticMethod的参数来调用
                                            比如System.out::println等同于x->System.out.println(x)；Math::max等同于(x, y)->Math.max(x,y)。
           （3） ClassName::instanceMethod
            等同于把lambda表达式的第一个参数当成instanceMethod的目标对象，其他剩余参数当成该方法的参数。比如String::toLowerCase等同于x->x.toLowerCase()。
         */
        List<String> names = new ArrayList<>();
        names.add("TaoBao");
        names.add("ZhiFuBao");
        names.stream().map(name -> name.charAt(0)).collect(Collectors.toList()).forEach(System.out::print);

        /**
         * 构造器引用
         *
         * ClassName::new，把lambda表达式的参数当成ClassName构造器的参数 。例如BigDecimal::new等同于x->new BigDecimal(x)。
         */








    }
}
