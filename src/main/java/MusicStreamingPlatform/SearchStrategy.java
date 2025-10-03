package MusicStreamingPlatform;

public interface SearchStrategy<T, R> {
  public T search(R Id);
}
