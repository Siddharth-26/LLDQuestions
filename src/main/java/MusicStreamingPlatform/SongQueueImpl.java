package MusicStreamingPlatform;

import java.util.List;

public class SongQueueImpl implements SongQueue{
  List<Song> songList;
  int index = 0;
  public SongQueueImpl(List<Song> songList){
    this.songList = songList;
  }
  @Override
  public Song getCurrentSong() {
    return this.songList.get(index);
  }

  @Override
  public Song getNextSong() {
    if(this.index+1<this.songList.size()){
      this.index+=1;
      return this.songList.get(this.index);
    }
    else{
      return null;
    }
  }

  @Override
  public Song getPreviousSong() {
    if(this.index-1>0){
      this.index-=1;
      return this.songList.get(this.index);
    }
    else{
      return null;
    }
  }
}
