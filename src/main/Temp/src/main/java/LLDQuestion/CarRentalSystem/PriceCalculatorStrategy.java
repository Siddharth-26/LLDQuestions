package LLDQuestion.CarRentalSystem;

import java.util.Date;

public interface PriceCalculatorStrategy {
  public int calculateAmount(Vehicle vehicle, Date startDate, Date endDate);
}
