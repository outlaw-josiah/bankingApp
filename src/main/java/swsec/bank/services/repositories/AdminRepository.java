package swsec.bank.services.repositories;

import swsec.bank.models.Admin;

/**
 * This class reads from and writes to the admin.txt file which stores all the
 * admins in the system.
 */

private static final String adminsFile = "admins.txt";

public class AdminRepository {
  
  public AdminRepository() {  //constructor really doesn't do anything
  
  }

  
  public Admin save(Admin inObj) {
    // write all inObj's instance variables to the text file
  }

  public String getPassword (String userName) {
    //look up userName in text file and return associate password
  }
}
