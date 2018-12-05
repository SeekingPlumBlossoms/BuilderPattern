package com.yb.client;

public class BMWModel extends CarModel {
    @Override
    public  void start(){
        System.out.println("宝马车跑起来是这个样子的...!");
    }
    @Override
    public  void stop(){
        System.out.println("宝马车应该这样停车...!");
    }
    @Override
    public  void alarm(){
        System.out.println("宝马车的喇叭声音应该是这样的...!");
    }
    @Override
    public  void engineBoom(){
        System.out.println("宝马车引擎声音是这样的...!");

    }
}
