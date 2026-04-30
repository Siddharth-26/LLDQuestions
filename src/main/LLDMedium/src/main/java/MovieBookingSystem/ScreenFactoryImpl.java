package MovieBookingSystem;

import java.util.ArrayList;
import java.util.List;

public class ScreenFactoryImpl implements ScreenFactory {

  @Override
  public Screen getScreen(String screentype) {
    if(screentype=="Simple"){
      List<Seat> seatList = new ArrayList<>(100);
      return new SimpleScreen(seatList);
    }
    return null;
  }
}
