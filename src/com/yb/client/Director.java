package com.yb.client;

import java.util.ArrayList;

/**
 * 导演类 顺序随便调整
 */
public class Director {
    private ArrayList<String> sequence=new ArrayList<>();
    private  BenzBuilder benzBuilder=new BenzBuilder();
    private  BMWBuilder bmwBuilder=new BMWBuilder();

    /**
     *先start  后stop
     * @return
     */
    public BenzModel getABenzModel(){
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(sequence);
        return  (BenzModel)this.benzBuilder.getCarModel();
    }

}
