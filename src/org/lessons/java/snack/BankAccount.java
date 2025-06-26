package org.lessons.java.snack;

import java.math.BigDecimal;

public class BankAccount {
    private int numberAccount;
    private BigDecimal balance;

    public BankAccount(int numberAccount) {
        this.numberAccount = numberAccount;
        this.balance = new BigDecimal("0");
    }

    // GETTER

    public int getNumberAccount() {
        return numberAccount;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    // SETTER

    private void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    // UTILITY

    public void deposit(BigDecimal money) {
        BigDecimal newCredit = balance.add(money);
        setBalance((newCredit));
    }

    public void withdraw(BigDecimal money) {
        if (this.balance.compareTo(money) < 0) {
            System.out.println("Operazione Impossibile. Credito Insufficente");
            return;
        }

        BigDecimal newCredit = balance.subtract(money);
        setBalance((newCredit));
    }

}
