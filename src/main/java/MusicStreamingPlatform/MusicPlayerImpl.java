package MusicStreamingPlatform;

import java.util.List;

public class MusicPlayerImpl implements MusicPlayer{
  SongQueue songQueue;
  State state;
  LowLevelMusicPlayerService lowLevelMusicPlayerService;
  public MusicPlayerImpl(List<Song> songList) {
    this.songQueue = new SongQueueImpl(songList);
    this.lowLevelMusicPlayerService = new LowLevelMusicPlayerService(this.songQueue.getCurrentSong());
  }

  @Override
  public void play() {
    this.lowLevelMusicPlayerService.play();
  }

  @Override
  public void pause() {
    this.lowLevelMusicPlayerService.pause();
  }

  @Override
  public void seek(int minutes, int seconds) {
    this.lowLevelMusicPlayerService.seek(minutes, seconds);
  }

  @Override
  public void nextSong() {
  Song nextSong = this.songQueue.getNextSong();
  this.lowLevelMusicPlayerService.play(nextSong);
  }

  @Override
  public void previousSong() {
    Song previousSong = this.songQueue.getPreviousSong();
    this.lowLevelMusicPlayerService.play(previousSong);
  }

  @Override
  public void stop() {
    this.lowLevelMusicPlayerService.pause();
  }

  @Override
  public void notifySub() {
    Song nextSong = this.songQueue.getNextSong();
    this.lowLevelMusicPlayerService.play(nextSong);
  }
}
