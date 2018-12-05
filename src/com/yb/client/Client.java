package com.yb.client;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args ){
        BenzModel benz=new BenzModel();
        ArrayList<String> sequence=new ArrayList<>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");
        benz.setSequence(sequence);
        benz.run();
    }
}
