package LLDQuestion.PaymentSystem.model;

public interface ITransaction {
  public String getTransactionId();
  public String getCardName();
  public String getDateTime();
  public String getAmount();
  public TransactionStatus getStatus();
  public void setStatus(TransactionStatus status);
}
