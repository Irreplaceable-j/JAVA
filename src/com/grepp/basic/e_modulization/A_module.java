package com.grepp.basic.e_modulization;

import java.util.Scanner;

public class A_module {

    public static void main(String[] args) {

//        int a = 111, b = 1111, c = 11111;
//        int min = min(a, b, c);
//        int max = max(a, b, c);
//        int d = 222, e = 2222, f = 22222;
//        min(d, e, f);
//        max(d, e, f);
        quiz();


    }

    // q.
    // 1P 유저로부터 가위/바위/보 중 하나를 입력받으세요
    // 2P 유저로부터 가위/바위/보 중 하나를 입력받으세요.
    // 1P 유저기준에서 승/패/비김 여부를 출력해주세요.
    public static void quiz() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1P : ");
        String p1 = sc.next();
        System.out.print("2P : ");
        String p2 = sc.next();
        if (p1.equals("가위") && p2.equals("보") || p1.equals("바위") && p2.equals("가위")
            || p1.equals("보") && p2.equals("바위")) {
            System.out.println("이겼습니다.");
        } else if (p1.equals("가위") && p2.equals("바위") || p1.equals("바위") && p2.equals("보")
            || p1.equals("보") && p2.equals("가위")) {
            System.out.println("졌습니다.");
        } else if (p1.equals(p2)) {
            System.out.println("비겼습니다.");
        }
    }

    public static int min(int a, int b, int c) {
        if (a < b && a < c) {
            System.out.println("최솟값: " + a);
        } else if (b < a && b < c) {
            System.out.println("최솟값: " + b);
        } else if (c < a && c < b) {
            System.out.println("최솟값: " + c);
        }
        return a;
    }

    public static int max(int d, int e, int f) {

        if (d > e && d > f) {
            System.out.println("최댓값: " + d);
        } else if (e > d && e > f) {
            System.out.println("최댓값: " + e);
        } else if (f > d && f > e) {
            System.out.println("최댓값: " + f);
        }
        return d;
    }

    public static void median() {
        int g = 333, h = 3333, i = 33333;
        if (g >= h) {
            if (i <= h) {
                System.out.println("최솟값: " + h);
            } else if (i >= g) {
                System.out.println("최솟값: " + g);
            } else {
                System.out.println("최솟값: " + i);
            }
        } else {
            if (i >= h) {
                System.out.println("최솟값: " + h);
            } else if (i <= g) {
                System.out.println("최솟값: " + g);
            } else {
                System.out.println("최솟값: " + i);
            }
        }

    }

}
