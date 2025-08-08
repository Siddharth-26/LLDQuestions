package org.example;

import java.util.ArrayList;
import java.util.List;

public class NoRetry implements Retry{

  @Override
  public List<Request> retry() {
    return new ArrayList<>();
  }

  @Override
  public void addFailure(Request request, int time) {
    // Nothing since this is no retry;
  }
}
