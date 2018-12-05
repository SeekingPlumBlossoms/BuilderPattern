package com.yb.model;

public class Director {
    private Builder builder=new ConcreteProduct();
    public Product getAProduct(){
        builder.setPart();
        return builder.buildProduct();
    }
}
