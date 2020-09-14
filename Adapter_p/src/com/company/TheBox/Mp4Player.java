package com.company.TheBox;

import com.company.TheBox.IAdvanvedMediaPlayer;

public class Mp4Player implements IAdvanvedMediaPlayer {
    @Override
    public void playVlc() {

    }

    @Override
    public void playMp4() {
        System.out.println("Hi i am  Mp4");
    }
}
