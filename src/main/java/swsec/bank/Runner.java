package swsec.bank;

import swsec.bank.thread.Start;

/** 
 *  This class starts the program and should not be modified.
 */
public class Runner {

  public static void main(String[] args) {
    Runnable start = new Start();

    start.run();
  }
}
