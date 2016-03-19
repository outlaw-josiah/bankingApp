package swsec.bank.controllers;

import swsec.bank.models.Account;
import swsec.bank.models.Admin;
import swsec.bank.services.repositories.AccountRepository;
import swsec.bank.services.repositories.AdminRepository;

public class AccountController {

  public AccountRepository thisRep;
  public Account thisAccount;

  public AccountController() {
    // every instance of a Controller needs a corresponding Repository and Model object
    thisRep = new AccountRepository();
    thisAccount = new Account();
  }


  public void changeBalance(float newBalance) {
    this.thisAccount.currentBalance = newBalance; //put the new balance in the model object
    this.thisRep.modifyBalance (newBalance);  // put the new balance in the repository
  }

  public int newAccount() {
    // pass in values for all instance variables
    // and set thisAccount's instance variables to those values
    // create new account number and add it to thisAccount
    // use thisRep to write new account to the file
    // return account #
    return (1);
  
  }

  public float getBalance (int accountNum) {
    // set thisRep's account number to accountNum
    // return thisRep.getBalance
    return (1);
  }
}
