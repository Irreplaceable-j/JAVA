package com.grepp.thread.e_solution.transport;

public class Bus {

    private static Bus instance;
    public static Bus getInstance(){
        if(instance == null){
            instance = new Bus();
        }
        return instance;
    }

    private Bus() {

    }

    public void drive(String name) {
        System.out.println(name + " 버스에 올라탑니다.");

    }

}
