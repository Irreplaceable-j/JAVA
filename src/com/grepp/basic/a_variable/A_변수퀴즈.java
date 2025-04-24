package com.grepp.basic.a_variable;

public class A_변수퀴즈 {
    public static void main(String[] args) {
        char a = '기';
        char b = '자';

        char c = a;
        a = b;
        b = c;

        System.out.println(a);
        System.out.println(b);

    }

}
