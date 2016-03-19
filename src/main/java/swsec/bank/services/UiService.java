package swsec.bank.services;

import swsec.bank.controllers.AccountController;
import swsec.bank.controllers.AdminController;
import swsec.bank.controllers.CustomerController;

import java.io.IOException;
import java.util.Scanner;

public class UiService {
  
  public UiService() {  //constructor doesn't really do anything
  
  }

  public void runUI () {
    Scanner scanner = null;
    boolean quit = false;
    CustomerController thisCust = new CustomerController ();  //this is the object representing the current user
    while (!quit){

      /* Iterate over a menu that allows the user to log in or create a new account
       * Then iterate over a menu that allows the user to make a deposit, make a withdrawal, get their balance,
       * or log out.
       * The value of "quit" needs to be updated in this loop.
       * If the user wants to log in
       *    get login credentials from user
       *    call CustomerController.authenticate to check credentials and return account#
       * If the user wants to create a new account
       *    get name and address and new login credentials from user
       *    call CustomerController.requestAccount, which returns an account number
       * If the user wants to make a deposit or a withdrawal
       *    get amount from customer
       *    call appropriate method in CustomerController
       * If the user wants to get their balance or log out
       *    call appropriate method in CustomerController
       */


    }

    public void runAdmin () {

    /* This method gets called, for example, during the creation of a new account, to allow an Admin
     * to be created, log in, and confirm the identity of a customer creating a new account.
     */
    }
  }

