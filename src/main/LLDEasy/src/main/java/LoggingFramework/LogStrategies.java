package LoggingFramework;

public interface LogStrategies {
  public void log(String message);
  public void addWriter(Writers writer);
  public void removeWriter(Writers writer);
}
