package com.yb.client;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder {
    private BMWModel bmwModel=new BMWModel();

    @Override
    public CarModel getCarModel(){
        return  this.bmwModel;
    }

    @Override
    public void setSequence(ArrayList<String> sequence){
        this.bmwModel.setSequence(sequence);
    }
}
