package com.company;

import com.company.TheBox.IAdvanvedMediaPlayer;
import com.company.TheBox.Mp4Player;
import com.company.TheBox.VlcPlayer;

public class MediaAdapter implements ImediaPlayer {
    private IAdvanvedMediaPlayer advanvedMediaPlayer;



    public void MediaAdapter(String playerType){
      if (playerType.equals("Vlc")){
          new VlcPlayer().playVlc();
      }else if (playerType.equals("MP4")){
          new Mp4Player().playMp4();
      }
    }

    @Override
    public void play(String playerType) {
        MediaAdapter(playerType);
        if (playerType.equals("Vlc")){
            new VlcPlayer().playVlc();
        }else if (playerType.equals("MP4")){
            new Mp4Player().playMp4();
        }
    }
}
