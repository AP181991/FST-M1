package SeleniumActivity;

import org.testng.annotations.Test;

import SeleniumActivity.BankAccount.NotEnoughFundsException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class Activity2 {
	class ExpectedExceptionTest {

	    @Test
	    void notEnoughFunds() {
	       BankAccount account = new BankAccount(9);

	        
	        assertThrows(NotEnoughFundsException.class, () -> account.withdraw(10),
	                "Balance must be greater than withdrawal amount");
	    }

	    @Test
	    void enoughFunds() {
	       
	        BankAccount account = new BankAccount(100);
	   
	
	        assertDoesNotThrow(() -> account.withdraw(100));
	    }
	}
	}


