package swsec.bank.services.repositories;

import swsec.bank.models.Account;

/**
 * This class reads from and writes to the accounts.txt file which stores all the
 * accounts in the system.
 */

private static final String accountsFile = "accounts.txt";

public class AccountRepository {
  
  public AccountRepository() {  //constructor really doesn't do anything
   
  }

   public void save(Account inObj) {
    // write all inObj's instance variables to the text file
  }

  public void modifyBalance (Account inObj, float newBalance) {
    // look up inObj in the text file and change the associated balance to newBalance
  }

  public float getBalance (Account inObj) {
    // look up inObj in the text file and return the associated balance
    return (1);
  }
}
