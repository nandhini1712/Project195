package com.hexaware.MLP195.util;

import java.util.Scanner;
import com.hexaware.MLP195.factory.MenuFactory;
import com.hexaware.MLP195.factory.VendorFactory;
import com.hexaware.MLP195.factory.WalletFactory;
import com.hexaware.MLP195.model.Customer;
import com.hexaware.MLP195.model.Menu;
import com.hexaware.MLP195.model.Wallet;
import com.hexaware.MLP195.model.Vendor;

/**
 * CliMain used as Client interface for java coading.
 * 
 * @author hexware
 */
class Main {
    private Scanner option = new Scanner(System.in, "UTF-8");

    /**
     * mainMenu method used to display the option we had in the application.
     */
    private void mainMenu() {
        System.out.println("Canteen Management System");
        System.out.println("-----------------------");
        System.out.println("1. Show Customer Details.");
        System.out.println("2. Show Menu Details.");
        System.out.println("3. Show Wallet Details.");
        System.out.println("4. Show Vendor Details.");
        System.out.println("4. Show  Order History.");
        System.out.println("5. Exit.");
        System.out.println("Enter your choice");
        int menuOption = option.nextInt();
        switch (menuOption) {
        case 1:
            showFullCustomer();
            mainMenu();
            break;
        case 2:
            showFullMenu();
            mainMenu();
            break;
        case 3:
            showFullWallet();
            mainMenu();
            break;
        case 4:
            showFullVendor();
            mainMenu();
            break;
        case 5:
            Runtime.getRuntime().halt(0);
            break;
        default:
            System.out.println(menuOption + " is not a valid choice");
            option.nextLine();
            mainMenu();
        }
    }

    private void showFullMenu() {
        Menu[] menu = MenuFactory.showMenu();
        System.out.println("Food_Id" + "\t" + "Food_Name" + "\t" + "Food_Type" + "\t" + "Food_Price");
        for (Menu m : menu) {
            System.out
                    .println(m.getFoodId() + "\t" + m.getFoodName() + "\t" + m.getFoodType() + "\t" + m.getFoodPrice());
        }
    }

    /**
     * showFullWallet method display the Wallet item stored in database.
     */
    private void showFullWallet() {
        Wallet[] wallet = WalletFactory.showWallet();
        System.out.println("Wallet_ID" + "\t" + "Payment_Mode" + "\t" + "Wallet_Balance");
        for (Wallet w : wallet) {
            System.out.println(w.getwalCusId() + "\t" + w.getwalPaymentMode() + "\t" + w.getwalBalance());
        }
    }

    private void showFullVendor() {
        Vendor[] vendor = VendorFactory.showVendor();
        System.out.println("VEN_ID" + "\t" + "VEN_NAME" + "\t" + "VEN_PHNE" + "\t" + "ORD_STATUS" + "\t" + "DEL_STATUS"
                + "\t" + "ORD_COST" + "\t" + "ORD_TOKENNUMBER");
        for (Vendor v : vendor) {
            System.out.println(v.getVenId() + "\t" + v.getVenName() + "\t" + v.getVenPhno() + "\t" + v.getOrdStatus()
                    + "\t" + v.getDelStatus() + "\t" + v.getOrdCost() + "\t" + v.getOrdTokenNumber());
        }
    }

    private void showFullCustomer() {
        Customer[] customer = Customer.showCustomer();
    System.out.println("CUS_ID" + "\t" + "CUS_NAME" + "\t" + "CUS_ADDRESS" + "\t" + "CUS_PHNO" + "\t" + "CUS_EMAIL" + "\t" + "CUS_DOB");
    for (Customer c : customer) {
      System.out.println(c.getCusId() + "\t" + c.getCusName() + "\t" + c.getCusAddress() + "\t" + c.getCusPhno() + "\t" + c.getCusEmail() + "\t" + c.getCusDob());
    }
  }

/**
 * main method  is the basic entry point for the application.
 * @param args used to get the user input.
 */
  public static void main(final String[] args) {
    final Main mainObj = new Main();
    mainObj.mainMenu();
  }
}
