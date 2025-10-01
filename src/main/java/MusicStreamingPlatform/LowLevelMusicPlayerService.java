package MusicStreamingPlatform;


// THis class is a low level class that is basically being used, I am just defining how the audio player class might look like. there are implementation details that I am skipping, but that is something that I assume has been implemented.
public class LowLevelMusicPlayerService {
  MusicPlayer subscriber;
  Song currentSong;
  public LowLevelMusicPlayerService(Song song){
    this.currentSong = song;
  }
  public void play(Song song){
    this.currentSong = song;
    this.play();
  }
  public void play(){
    // Something happens implementation not done by me.
  }
  public void pause(){
    // Implementation provided by someone.
  }
  public void seek(int minutes, int seconds){
    // Implementation provided by someone
  }
  public void sendSignal(){
  this.subscriber.notifySub();
  }
}
