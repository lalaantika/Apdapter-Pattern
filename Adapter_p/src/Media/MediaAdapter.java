package Media;

import Media.TheBox.IAdvanvedMediaPlayer;
import Media.TheBox.Mp4Player;
import Media.TheBox.VlcPlayer;

public class MediaAdapter implements ImediaPlayer {
    private IAdvanvedMediaPlayer advanvedMediaPlayer;



    public void MediaAdapter(String player){
      if (player.equals("Vlc")){
          new VlcPlayer().playVlc();
      }else if (player.equals("MP4")){
          new Mp4Player().playMp4();
      }
    }

    @Override
    public void play(String player) {
//        MediaAdapter(player);
        if (player.equals("Vlc")){
            new VlcPlayer().playVlc();
        }else if (player.equals("MP4")){
            new Mp4Player().playMp4();
        }
    }
}
