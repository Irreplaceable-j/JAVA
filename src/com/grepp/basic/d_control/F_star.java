package com.grepp.basic.d_control;

import java.util.Scanner;

public class F_star {

    public static void main(String[] args) {
        //q1();
        //q2();
        //q3();
        //q4();
        //q5();
        q6();

    }

    private static void q6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("num = ");
        int num = sc.nextInt();
        for (int i = 0; i < num * 2 - 1; i++) {
            for (int j = 0; j < num * 2; j++) {
                if(i >= num){
                    if(j < num - ((i + 1) % num) || j > num + (i % num)){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                    continue;
                }

                if(j <= i || j >= num * 2 - (i + 1)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    private static void q5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("num = ");
        int num = sc.nextInt();

        int count = 1;
        for (int i = 0; i < num * 2 - 1; i++) {
            if(i >= num) {

                for (int j = 0; j < count; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (num - count) * 2 - 1; j++) {
                    System.out.print("*");
                }
                count++;
                System.out.println();
                continue;
            }
            for (int j = 0; j < num - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i + 1) * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    private static void q4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("num = ");
        int num = sc.nextInt();
        int count = num - 1;
        for (int k = 0; k < num; k++) {
            for (int i = 0; i < num; i++) {
                if (i == count) {
                    for (int j = 0; j < (k + 1) * 2 - 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    count--;
                    break;
                }
                System.out.print(" ");

            }
        }

    }

    private static void q3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("num = ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j == i) {
                    System.out.print(j + 1);
                    continue;
                }
                System.out.print("*");
            }
            System.out.println();

        }
    }

    private static void q2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("num = ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void q1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("row: ");
        int row = sc.nextInt();

        System.out.print("col: ");
        int col = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

}
