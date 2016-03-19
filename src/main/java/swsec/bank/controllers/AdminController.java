package swsec.bank.controllers;

import swsec.bank.models.Admin;
import swsec.bank.models.Customer;
import swsec.bank.services.repositories.AdminRepository;
import swsec.bank.services.repositories.CustomerRepository;

public class AdminController {

  AdminRepository thisRep;
  Admin thisAdmin;

  public AdminController() {
    // every instance of a Controller needs a corresponding Repository and Model object
    thisRep = new AdminRepository();
    thisAdmin = new Admin();
  }


  public boolean authenticate() {
    // needs parameters for username and password
    // needs to look up the username to find the correct password in thisRep object
    // needs to compare the password passed in with the one from thisRep
    // marks thisAdmin authenticated
    // needs to return employeeId if everything is hunky dory, 0 otherwise
    return(1);
  }

  public void requestAccount () {
    // called by CustomerController
    // needs to create an instance of UiService, which authenticates the Admin
    // then needs to create an instance of an AccountController, which it uses to create the new account
  }

  public void modifyBalance (int acccountNum, float newBalance) {
    // checks to make sure this Admin object is authenticated
    // creates an instance of AccountController and uses it to modify the balance
  }
}
