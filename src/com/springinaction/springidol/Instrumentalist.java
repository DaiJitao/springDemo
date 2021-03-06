package com.springinaction.springidol;


import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by daijitao on 2018/4/17.
 */
public class Instrumentalist implements Perfomer {
    public Instrumentalist(){

    }
    private String song;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void perform() throws Exception {
        System.out.println("表演天赋的音乐家。。。在唱" + song);
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    public String screamSong() {
        return song;
    }

    @Autowired
    private Instrument instrument;

    @Autowired
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public Instrument getInstrument() {
        return instrument;
    }
}
