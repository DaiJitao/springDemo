package com.springinaction.springidol;

import com.springinaction.common.PerformException.PerformException;

/**
 * Created by daijitao on 2018/4/13.
 * 朗诵诗歌的杂技师
 */
public class PoeticJuggler extends Juggler {
    private Poem poem;
    public PoeticJuggler(Poem poem){
        this.poem = poem;
    }
    public PoeticJuggler(Poem poem, int beanBags){
        super(beanBags);
        this.poem = poem;
    }

    public void perform() throws Exception {
        super.perform();
        System.out.println("正在吟诵。。。");
        poem.recit();
    }
}
