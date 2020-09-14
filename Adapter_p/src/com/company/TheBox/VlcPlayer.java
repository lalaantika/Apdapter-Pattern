package com.company.TheBox;

import com.company.TheBox.IAdvanvedMediaPlayer;

public class VlcPlayer implements IAdvanvedMediaPlayer {
    @Override
    public void playVlc() {
        System.out.println("Hi I am Vlc");
    }

    @Override
    public void playMp4() {

    }
}
