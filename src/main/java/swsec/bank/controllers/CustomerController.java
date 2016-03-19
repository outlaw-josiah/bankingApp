package swsec.bank.controllers;

import swsec.bank.models.Customer;
import swsec.bank.services.repositories.CustomerRepository;

public class CustomerController {

  CustomerRepository thisRep;
  Customer thisCust;

  public CustomerController() {
    // every instance of a Controller needs a corresponding Repository and Model object
    thisRep = new CustomerRepository();
    thisCust = new Customer();

  }



  public int authenticate() {
    // needs parameters for username and password
    // needs to look up the username to find the correct password in thisRep object
    // needs to compare the password passed in with the one from thisRep
    // marks thisCust authenticated
    // needs to return account# if everything is hunky dory, 0 otherwise
  return (1);

  }
  public int requestAccount() {
    // needs parameters for the customer's name and address, login and password
    // You can assume all users will choose unique usernames and passwords
    // adds name and address and login credentials to thisCust object
    // creates AdminController object and uses it to create a new account, returning an account number
    // adds account number to thisCust object
    // mark thisCust authenticated
    // uses thisRep object to store info in thisCust to the repository file
    // return the account number
    return (1);
  }

  public boolean makeDeposit (float amount) {

    // checks to make sure thisCust is authenticated
    // checks verification system to verify amount
    // creates an AccountController object and uses it to make the deposit
    // returns true if everything goes ok; false otherwise
    return (true);
  }

  public boolean makeWithdrawal (float amount) {

    // checks to make sure thisCust is authenticated
    // checks verification system to verify amount
    // creates an AccountController object and uses it to make the withdrawal
    // returns true if everything goes ok; false otherwise
    return (true);
  }

  public float getBalance () {
    // checks to make sure thisCust is authenticated
    // creates an AccountController object and uses it to return balance
    return (1);
  }

  public void logout () {
    // mark thisCust as not authenticated
  }
} 
