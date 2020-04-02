package com.wzh.rochang;

public class Example extends Thread implements Runnable{

    @Override
    public void run() {
        System.out.println("线程测试");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Example());
        thread.start();
    }
}