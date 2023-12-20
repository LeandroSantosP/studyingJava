package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {


    @Test
    void shouldBeAbleCreateANewAccount() {
        Account account = new Account(12344, "Alex green", 1000);
        assertEquals(account.getBalance(), 1000);
        assertEquals(account.getAccountHolder(), "Alex green");
        assertNotEquals(account.getAccountNumber(), 122343);
        assertEquals(account.toString(), "Account: Alex green, Holder: Alex green, Balance: 1000.00");
    }

    @Test
    void shouldBeAbleMakeADepositOf100IntoTheAccount() {
        Account account = new Account(12344, "Alex green", 0);
        assertEquals(account.toString(), "Account: Alex green, Holder: Alex green, Balance: 0.00");
        account.deposit(100);
        assertEquals(account.toString(), "Account: Alex green, Holder: Alex green, Balance: 100.00");
    }


    @Test()
    void shouldBeAbleMakeAWithDrawnOf100IntoTheAccount() {
        Account account = new Account(12344, "Alex green", 100);
        assertEquals(account.toString(), "Account: Alex green, Holder: Alex green, Balance: 100.00");
        account.withDrawn(100);
        assertEquals(account.toString(), "Account: Alex green, Holder: Alex green, Balance: 0.00");
    }

    @Test()
    void shouldNotBeAbleWithDrawnAnAmountThatYouDoNotHaveAvailable() {
        Account account = new Account(12344, "Alex green", 0);
        assertEquals(account.toString(), "Account: Alex green, Holder: Alex green, Balance: 0.00");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withDrawn(100);
        });
        assertEquals("The Client doesn't have the amount available", exception.getMessage());
    }
}