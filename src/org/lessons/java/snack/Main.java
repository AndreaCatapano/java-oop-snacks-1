package org.lessons.java.snack;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Students andrea = new Students("Andrea", "Catapano", 28);
        Students mauro = new Students("Mauro", "Riccardo", 28);
        Students vito = new Students("Vito", "Sasso", 27);

        System.out.println(andrea.getFullName());

        BankAccount andreBankAccount = new BankAccount(123455);

        System.out.println(andreBankAccount.getBalance());

        andreBankAccount.deposit(new BigDecimal("1000"));

        System.out.println(andreBankAccount.getBalance());

        andreBankAccount.withdraw(new BigDecimal("500"));

        System.out.println(andreBankAccount.getBalance());

        andreBankAccount.withdraw(new BigDecimal("750"));

        Register newRegister = new Register();

        newRegister.addStudent(andrea);
        newRegister.addStudent(vito);
        newRegister.addStudent(mauro);

        newRegister.showStudents();

        newRegister.getStudents();

    }
}
