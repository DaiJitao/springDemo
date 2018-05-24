package com.springinaction.springidol;

import com.springinaction.common.PerformException.PerformException;

/**
 * Created by daijitao on 2018/4/13.
 * 杂技师
 */
public class Juggler implements Perfomer {
    private int beaBags = 3;
    public Juggler(){}
    public Juggler(int beaBags){
        this.beaBags = beaBags;
    }
    @Override
    public void perform() throws Exception {
        System.out.println("Juggler " + beaBags + " beabags");
    }
}
