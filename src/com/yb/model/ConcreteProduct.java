package com.yb.model;

public class ConcreteProduct extends Builder {
    private Product product=new Product();

    @Override
    public void setPart(){
        /**
         * 产品内部处理逻辑
         */
    }
    @Override
    public  Product buildProduct(){
        return  product;
    }
}
