package com.hexaware.MLP195.util;

import java.util.Scanner;
import com.hexaware.MLP195.factory.MenuFactory;
import com.hexaware.MLP195.factory.WalletFactory;
import com.hexaware.MLP195.model.Menu;
import com.hexaware.MLP195.model.Wallet;
/**
 * CliMain used as Client interface for java coading.
 * @author hexware
 */
class Main {
  private Scanner option = new Scanner(System.in, "UTF-8");
/**
 * mainMenu method  used to display the option we had in the application.
 */
  private void mainMenu() {
    System.out.println("Canteen Management System");
    System.out.println("-----------------------");
    //System.out.println("1. Customer");
    System.out.println("2. Menu");
    System.out.println("3. Wallet");
    //System.out.println("4. Vendor");
    System.out.println("5. Exit");
    System.out.println("Enter your choice");
    int menuOption = option.nextInt();
    switch (menuOption) {
      case 2:
        System.out.println("CUSTOMER");
        System.out.println("--------");
        System.out.println("1. Display Customer Details");
        System.out.println("2. Add Customer");
        System.out.println("3. Update Customer");
        int cusOption = option.nextInt();
        switch (cusOption) {
          case 1:
          showFullMenu();
        }
        
        mainMenu();
        break;
      case 3:
        showFullWallet();
        mainMenu();
        break;
      case 4:
          //showFullVendor();
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
      System.out.println(m.getFoodId() + "\t" + m.getFoodName() + "\t" + m.getFoodType() + "\t" + m.getFoodPrice());
    }
  }

/**
 * showFullWallet method  display the Wallet item stored in database.
 */
  private void showFullWallet() {
    Wallet[] wallet = WalletFactory.showWallet();
    System.out.println("Wallet_ID" + "\t" + "Payment_Mode" + "\t" + "Wallet_Balance");
    for (Wallet w : wallet) {
      System.out.println(w.getwalCusId() + "\t" + w.getwalPaymentMode() + "\t" + w.getwalBalance());
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
