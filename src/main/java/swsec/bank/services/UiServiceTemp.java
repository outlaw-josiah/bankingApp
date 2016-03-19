
package swsec.bank.services;

        import swsec.bank.controllers.AccountController;
        import swsec.bank.controllers.AdminController;
        import swsec.bank.controllers.CustomerController;

        import java.io.IOException;
        import java.util.Scanner;

public class UiService {

    public UiService() {  //constructor doesn't really do anything

    }

    protected void runUI () {
        Scanner scanner = null;
        private boolean quit = false;
        while (not quit){
            quit == outerMenu();
        }
    }

    protected boolean outerMenu() {
        try {
            // print outer menu options
            scanner = new Scanner(System.in, "UTF-8");
            System.out.println("1. Login");
            System.out.println("2. Create a new account");
            System.out.println("3. Quit");
            System.out.print("What would you like to do? ");

            // show outer menu and capture input and call methods to perform user function
            String token = scanner.next();
            if (token=='1') { //log user in and then show inner menu to see what the user wants to do
                CustomerController thisCust = new CustomerController();
                if (Authenticate(thisCust)) {
                    innerMenu(thisCust);
                } else [ return; }
        } else {
            if (token == '2') { // create a new customer and account
                CustomerController thisCust = new CustomerController();
                thisCust.RequestAccount;
            } else {
                if (token == '3') {  // return flag that user has elected to quit
                    return true;
                }
            }
        }

    } finally {
        if (scanner != null) {
            scanner.close();
        }
    }
}

    protected void Authenticate (CustomerController cust) {
        // stub
        System.out.println (" UiService.Authenticate - much get credentials from user and call CustomerController.Authenticate to compare them");
    }
    // repeat inner menu until user wants to log out
    protected void innerMenu (CustomerController cust) {

        private boolean wantsToLogout = false;

        // show inner menu, capter user's choice, and call methods to carry out user actions
        while (not wantsToLogout) {
            System.out.println("1. Make a deposit");
            System.out.println("2. Make a withdrawal");
            System.out.println("3. Get your balance");
            System.out.println("4. Log out");
            System.out.print("What would you like to do? ");

            String token = scanner.next();

            if (token == '1') {
                makeDeposit (cust);
            } else {
                if (token == '2') {
                    makeWithdrawal (cust);
                } else {
                    if (token == '3') {
                        getBalance(cust);
                    } else {
                        if (token == '4') {
                            wantsToLogout = true;
                            logout (cust);
                        }
                    }
                }
            }
        }
    }

    private void makeDeposit (CustomerController cust) {
        // stub
        private float depositAmount = 20;
        System.out.println ("get amount from customer, call cust.makeDeposit");
        if (cust.makeDeposit (depositAmount)) {
            System.out.println("Deposit successful. Thank you.");
        } else {
            System.out.println("Deposit not successful. Our apologies")
        }
    }

    private void makeWithdrawal (CustomerController cust) {
        // stub
        private float withdrawalAmount = 20;
        System.out.println ("get amount from customer, call cust.makeWithdrawal");
        if (cust.makeDeposit (withdrawalAmount)) {
            System.out.println("Withdrawal successful. Thank you.");
        } else {
            System.out.println("Withdrawal not successful. Our apologies")
        }
    }

    private void getBalance (CustomerController cust) {
        // stub
        System.out.println (cust.getBalance ());
    }

    private void logout (CustomerController cust) {
        // stub
        cust.logout;
        System.out.println ("Goodbye.")
    }
}
