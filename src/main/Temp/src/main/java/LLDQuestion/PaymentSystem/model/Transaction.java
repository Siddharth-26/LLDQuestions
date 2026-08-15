package LLDQuestion.PaymentSystem.model;

import java.time.Instant;

public class Transaction implements ITransaction{
  private String transactionId;
  private String cardNumber;
  private int amount;
  private Instant date;
  private TransactionStatus status;
  private Currencies currencies;
  public Transaction(String transactionId, String cardNumber, int amount, Currencies currencies) {
    this.transactionId = transactionId;
    this.cardNumber = cardNumber;
    this.amount = amount;
    this.date = Instant.now();
    this.status = TransactionStatus.INPROGRESS;
    this.currencies = currencies;
  }
  @Override
  public String getTransactionId() {
    return "";
  }

  @Override
  public String getCardName() {
    return "";
  }

  @Override
  public String getDateTime() {
    return "";
  }

  @Override
  public String getAmount() {
    return "";
  }

  @Override
  public TransactionStatus getStatus() {
    return null;
  }
  public synchronized void setStatus(TransactionStatus status) {
    this.status = status;
  }
}
