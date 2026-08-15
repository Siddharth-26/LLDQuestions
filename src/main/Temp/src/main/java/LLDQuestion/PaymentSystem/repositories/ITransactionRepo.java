package LLDQuestion.PaymentSystem.repositories;

import LLDQuestion.PaymentSystem.model.ITransaction;

public interface ITransactionRepo {
  public ITransaction getTransaction(String transactionId);
  public ITransaction setTransaction(ITransaction transaction);
}
