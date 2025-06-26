package org.lessons.java.snack;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Students andrea = new Students("Andrea", "Catapano", 28);

        System.out.println(andrea.getFullName());

        BankAccount andreBankAccount = new BankAccount(123455);

        System.out.println(andreBankAccount.getBalance());

        andreBankAccount.deposit(new BigDecimal("1000"));

        System.out.println(andreBankAccount.getBalance());

        andreBankAccount.withdraw(new BigDecimal("500"));

        System.out.println(andreBankAccount.getBalance());

        andreBankAccount.withdraw(new BigDecimal("750"));

    }
}
