package swsec.bank.thread;

import swsec.bank.services.UiService;

public class Start implements Runnable {
  
  /**
   * Default constructor, this should not be modified.
   */
  public Start() {
  }
  
  /**
   *  This method will be what you use to call UiService and handle exceptions.
   */
  public void run() {

    UiService uiService = new UiService ();
    uiService.runUI ();
  } 
}
