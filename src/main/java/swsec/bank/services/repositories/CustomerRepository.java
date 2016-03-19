package swsec.bank.services.repositories;

import swsec.bank.models.Customer;
/**
 * This class reads from and writes to the admins.txt file which stores all the
 * admins in the system.
 */
public class CustomerRepository {
  
  private static final String customersFile = "customers.txt";   
  
  public CustomerRepository() {
  
  }
  
  public String getPassword (String username) {
    // look up the username in the customers.txt file and return the associated password
    // Hint: use a strategy similar to OuiLookup
    // Another hint: decide ahead of time the structure of your text file and write it down
  }
  
  public void save(Customer inObj) {
    // write the customer's instance variables to the text file
  }

}
