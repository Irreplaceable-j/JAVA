package com.grepp.oop.g_inner;

public class A_OuterClass {
    private String desc;

    public A_OuterClass(String desc) {
        this.desc = desc;
    }

    // NOTE GA04 익명클래스
    //
    public void anonymous(){
        AnonymousAbstractClass anonymous = new AnonymousAbstractClass() {
            @Override
            public void print() {
                System.out.println("anonymous");
            }
        };

        anonymous.print();
    }

    

    // NOTE GA03 Local class
    // 클래스를 선언한 메서드 안에서만 사용가능
    public void localClass(){
        class LocalClass{
            public void print(){
                System.out.println("================");
                System.out.println("LocalClass");
                System.out.println(this);
            }
        }

        LocalClass local = new LocalClass();
        local.print();
    }


    // NOTE GA01 Static Inner Class
    public static class StaticInner{
        public void print(){
            System.out.println("Static Inner Class 입니다.");
        }
    }

    // NOTE GA02 Instance Inner Class
    public class InstanceInner{
        public void print(){
            System.out.println("============================");
            System.out.println(A_OuterClass.this);
            System.out.println(this);
            System.out.println(desc);
        }
    }

}
