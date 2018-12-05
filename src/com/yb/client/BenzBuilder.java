package com.yb.client;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {
    private BenzModel benzModel=new BenzModel();

    @Override
    public CarModel getCarModel(){
        return  this.benzModel;
    }

    @Override
    public void setSequence(ArrayList<String> sequence){
        this.benzModel.setSequence(sequence);
    }
}
