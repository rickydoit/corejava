package com.example.basictype;

/**
 * 1.boolean 类型的取值范围
 * boolean的取值范围为 true 或  false，在存入mysql数据库中时分别用 1和0来表示
 *
 * 2.boolean 中的true和1、 false和0的关系
 * 无关系，只是在存入数据库中时true习惯用1来表示，false习惯用0来表示
 */
public class BooleanType {
    public static void main(String[] args){
       System.out.println(isTureEqualsOne());

    }

    static boolean isTureEqualsOne(){
        boolean b1 = new Boolean(true).booleanValue();
        boolean b2 = new Boolean("true");// 只有String 的“true”能解析为true,其它的全为false
        boolean b3 =  new Boolean("false");
        boolean b4 = new Boolean("0");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        return b3&&b4 ==true? true : false;
    }
}
