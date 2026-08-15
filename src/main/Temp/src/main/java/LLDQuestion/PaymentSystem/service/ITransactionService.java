package LLDQuestion.PaymentSystem.service;

import java.util.Currency;

import LLDQuestion.PaymentSystem.model.IGateway;
import LLDQuestion.PaymentSystem.model.ITransaction;
import LLDQuestion.PaymentSystem.model.TransactionStatus;

public interface ITransactionService {
  public ITransaction processPayment(String transactionId, Currency currency, IGateway gateway, int amount);
  public boolean refundTransaction(String transactionId);
  public TransactionStatus getTransactionStatus(String transactionId);
}
