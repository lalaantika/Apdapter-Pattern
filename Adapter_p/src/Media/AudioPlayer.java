package Media;

public class AudioPlayer implements ImediaPlayer {
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String player) {
        if (player.equals("Vlc")){
            mediaAdapter = new MediaAdapter();
            mediaAdapter.play(player);
        }else if (player.equals("MP4")){
            mediaAdapter=  new MediaAdapter();
            mediaAdapter.play(player);
        }
        else {
            System.out.println("choose");
        }
    }
}
