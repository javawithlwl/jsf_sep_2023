package com.careerit.cj.day12.txn;

public class TransactionManager {

    public static void main(String[] args) {

            TransactionService service = new TransactionService();
            service.showTransactions("9949494949");
            service.showSuccessTransactions();
            service.showFailedTransactions();
            service.showTransactionStats();
    }
}
