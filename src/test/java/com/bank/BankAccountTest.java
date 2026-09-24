
package com.bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    void testDeposit() {
        BankAccount account = new BankAccount(100);
        assertEquals(150, account.deposit(50));
    }

    @Test
    void testWithdraw() {
        BankAccount account = new BankAccount(200);
        assertEquals(120, account.withdraw(80));
    }

    @Test
    void testBalance() {
        BankAccount account = new BankAccount(300);
        assertEquals(300, account.getBalance());
    }
}