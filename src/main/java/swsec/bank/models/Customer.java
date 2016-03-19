package swsec.bank.models;

public class Customer extends Person {
    
  // Instance variables
  public String username;
  public String password;
  public String name;
  public String address;
  boolean authenticated = false;
  int accountNum;

  
  public Customer() {

    // needs to pass in values for all instance variables and assign those values to the variables
  }


}
