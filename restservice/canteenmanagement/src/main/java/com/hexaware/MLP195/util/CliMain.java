package com.hexaware.MLP195.util;

import java.util.Scanner;

import com.hexaware.MLP195.factory.MenuFactory;
import com.hexaware.MLP195.factory.OrderHistoryFactory;
import com.hexaware.MLP195.factory.VendorFactory;
import com.hexaware.MLP195.factory.WalletFactory;
import com.hexaware.MLP195.factory.CustomerFactory;
import com.hexaware.MLP195.model.Customer;
import com.hexaware.MLP195.model.Menu;
import com.hexaware.MLP195.model.OrderHistory;
import com.hexaware.MLP195.model.Vendor;
import com.hexaware.MLP195.model.Wallet;

/**
 * CliMain used as Client interface for java coading.
 * @author hexware
 */
class CliMain {
  private Scanner option = new Scanner(System.in, "UTF-8");

    /**
     * mainMenu method used to display the option we had in the application.
     */
  private void mainMenu() {
    System.out.println("Canteen Management System");
    System.out.println("-----------------------");
    System.out.println("1. Customer.");
    System.out.println("2. Menu.");
    System.out.println("3. Wallet.");
    System.out.println("4. Vendor.");
    System.out.println("5. Order History.");
    System.out.println("6. Exit.");
    System.out.println("Enter your choice");
    int menuOption = option.nextInt();
    switch (menuOption) {
      case 1:
        cmsCustomer();
        break;
      case 2:
        cmsMenu();
        break;
      case 3:
        showFullWallet();
        break;
      case 4:
        cmsVendor();
        break;
      case 5:
        showFullOrderHistory();
        break;
      case 6:
        Runtime.getRuntime().halt(0);
        break;
      default:
        System.out.println(menuOption + " is not a valid choice\nEnter a valid choice");
        option.nextLine();
        mainMenu();
    }
  }
  private void cmsCustomer() {
    System.out.println("Customer");
    System.out.println("---------");
    System.out.println("1. Show Customer.");
    System.out.println("2. Add Customer.");
    System.out.println("3. Edit Customer.");
    System.out.println("4. Delete Customer.");
    System.out.println("5. Go Back.");
    System.out.println("Enter your choice");
    int opt = option.nextInt();
    switch (opt) {
      case 1:
        showFullCustomer();
        cmsCustomer();
        break;
      case 2:
        addCmsCustomer();
        cmsCustomer();
        break;
      case 3:
        editCmsCustomer();
        cmsCustomer();
        break;
      case 4:
        deleteCmsCustomer();
        cmsCustomer();
        break;
      case 5:
        mainMenu();
        break;
      default:
        System.out.println(opt + " is not a valid choice\nEnter a valid choice");
        option.nextLine();
        cmsCustomer();
    }
  }

  private void addCmsCustomer() {
    System.out.println("1. Enter the customer id.");
    int cusId = option.nextInt();
    System.out.println("2. Enter the customer name.");
    String cusName = option.next();
    System.out.println("3. Enter the customer address.");
    String cusAddress = option.next();
    System.out.println("4. Enter the Phone number");
    int cusPhno = option.nextInt();
    System.out.println("5. Enter the Email");
    String cusEmail = option.next();
    int i = CustomerFactory.insertingCustomer(cusId, cusName, cusAddress, cusPhno, cusEmail);
    if (i > 0) {
      System.out.println("Inserted Successfully");
    } else {
      System.out.println("Data could not be Inserted");
    }
  }
  private void editCmsCustomer() {
    System.out.println("1. Enter the customer id.");
    int cusId = option.nextInt();
    System.out.println("2. Enter the customer address.");
    String cusAddress = option.next();
    System.out.println("3. Enter the Phone number");
    int cusPhno = option.nextInt();
    System.out.println("4. Enter the Email");
    String cusEmail = option.next();
    int check = CustomerFactory.editCustomer(cusAddress, cusPhno, cusEmail, cusId);
    if (check > 0) {
      System.out.println("Updated Successfully");
    } else {
      System.out.println("Updation failed");
    }
  }

  private void deleteCmsCustomer() {
    System.out.println("1.Enter the customer Id.");
    int cusId = option.nextInt();
    int check = CustomerFactory.deleteCustomer(cusId);
    if (check > 0) {
      System.out.println("Deleted Successfully");
    } else {
      System.out.println("Deletion failed");
    }
  }

  private void cmsMenu() {
    System.out.println("MENU");
    System.out.println("---------");
    System.out.println("1. Show Menu.");
    System.out.println("2. Add Menu.");
    System.out.println("3. Edit Menu.");
    System.out.println("4. Delete Menu.");
    System.out.println("5. Go Back.");
    System.out.println("Enter your choice");
    int opt = option.nextInt();
    switch (opt) {
      case 1:
        showFullMenu();
        cmsMenu();
        break;
      case 2:
        addCmsMenu();
        cmsMenu();
        break;
      case 3:
        editCmsMenu();
        cmsMenu();
        break;
      case 4:
        deleteCmsMenu();
        cmsMenu();
        break;
      case 5:
        mainMenu();
        break;
      default:
        System.out.println(opt + " is not a valid choice\nEnter a valid choice");
        option.nextLine();
        cmsMenu();
    }
  }
  private void addCmsMenu() {
    System.out.println("1. Enter the food id.");
    int foodId = option.nextInt();
    System.out.println("2. Enter the food name.");
    String foodName = option.next();
    System.out.println("3. Enter the foood type.");
    String foodType = option.next();
    System.out.println("4. Enter the food price");
    float foodPrice = option.nextFloat();
    int check = MenuFactory.insertingMenu(foodId, foodName, foodType, foodPrice);
    if (check > 0) {
      System.out.println("Inserted Successfully");
    } else {
      System.out.println("Data could not be Inserted");
    }
  }

  private void editCmsMenu() {
    System.out.println("Enter the food id.");
    int foodId = option.nextInt();
    System.out.println("Enter the food price");
    float foodPrice = option.nextFloat();
    int check = MenuFactory.editMenu(foodPrice, foodId);
    if (check > 0) {
      System.out.println("Updated Successfully");
    } else {
      System.out.println("Updation failed");
    }
  }

  private void deleteCmsMenu() {
    System.out.println("Enter the food id.");
    int foodId = option.nextInt();
    int check = MenuFactory.deleteMenu(foodId);
    if (check > 0) {
      System.out.println("Deleted Successfully");
    } else {
      System.out.println("Deletion failed");
    }
  }
  private void cmsVendor() {
    System.out.println("Vendor");
    System.out.println("---------");
    System.out.println("1. Show Vendor .");
    System.out.println("2. Add Vendor.");
    System.out.println("3. Edit Vendor .");
    System.out.println("4. Delete Vendor .");
    System.out.println("5. Go Back.");
    System.out.println("Enter your choice");
    int opt = option.nextInt();
    switch (opt) {
      case 1:
        showFullVendor();
        cmsVendor();
        break;
      case 2:
        addCmsVendor();
        cmsVendor();
        break;
      case 3:
        editCmsVendor();
        cmsVendor();
        break;
      case 4:
        deleteCmsVendor();
        cmsVendor();
        break;
      case 5:
        mainMenu();
        break;
      default:
        System.out.println(opt + " is not a valid choice\nEnter a valid choice");
        option.nextLine();
        cmsVendor();
    }
  }
  private void addCmsVendor() {
    System.out.println(" Enter the Vendor id.");
    int vid = option.nextInt();
    System.out.println("2. Enter the Vendor name.");
    String vname = option.next();
    System.out.println("3. Enter the Phone number");
    double vPhno = option.nextInt();
    System.out.println("4. Enter the order status");
    String ordstatus = option.next();
    System.out.println("5. Enter the delivery status");
    String delstatus = option.next();
    System.out.println("6. Enter the order cost");
    float ordcost = option.nextFloat();
    System.out.println("7. Enter the order token number");
    int ordtokennumber = option.nextInt();
    int check = VendorFactory.insertingVendor(vid, vname, vPhno, ordstatus, delstatus, ordcost, ordtokennumber);
    if (check > 0) {
      System.out.println("Inserted Successfully");
    } else {
      System.out.println("Data could not be Inserted");
    }
  }


  private void editCmsVendor() {
    System.out.println("Enter the vendor id");
    int vid = option.nextInt();
    System.out.println("Enter the order status.");
    String ordstatus = option.next();
    System.out.println("Enter the delivery status");
    String delstatus = option.next();
    int check = VendorFactory.editVendor(ordstatus, delstatus, vid);
    if (check > 0) {
      System.out.println("Updated Successfully");
    } else {
      System.out.println("Updation failed");
    }
  }
  private void deleteCmsVendor() {
    System.out.println("1.Enter the vendor id.");
    int vid = option.nextInt();
    int check = VendorFactory.deleteVendor(vid);
    if (check > 0) {
      System.out.println("Deleted Successfully");
    } else {
      System.out.println("Deletion failed");
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
     * showFullWallet method display the Wallet item stored in database.
     */
  private void showFullWallet() {
    Wallet[] wallet = WalletFactory.showWallet();
    System.out.println("Wallet_ID" + "\t" + "Payment_Mode" + "\t" + "Wallet_Balance");
    for (Wallet w : wallet) {
      System.out.println(w.getwalCusId() + "\t" + w.getwalPaymentMode() + "\t" + w.getwalBalance());
    }
  }
  private void showFullCustomer() {
    Customer[] customer = CustomerFactory.showCustomer();
    System.out.println("CUS_ID" + "\t" + "CUS_NAME" + "\t" + "CUS_ADDRESS" + "\t" + "CUS_PHNO" + "\t" + "CUS_EMAIL" + "\t" + "CUS_DOB");
    for (Customer c : customer) {
      System.out.println(c.getCusId() + "\t" + c.getCusName()
          + "\t" + c.getCusAddress() + "\t" + c.getCusPhno() + "\t"
          + c.getCusEmail() + "\t" + c.getCusDob());
    }
  }

  /**
     * showFullVendor method display the Wallet item stored in database.
     */
  private void showFullVendor() {
    Vendor[] vendor = VendorFactory.showVendor();
    System.out.println("VEN_ID" + "\t" + "VEN_NAME" + "\t" + "VEN_PHNO" + "\t" + "ORD_STATUS" + "\t" + "DEL_STATUS"
                  + "\t" + "ORD_COST" + "\t" + "ORD_TOKENNUMBER");
    for (Vendor v : vendor) {
      System.out.println(v.getVenId() + "\t" + v.getVenName() + "\t" + v.getVenPhno() + "\t" + v.getOrdStatus()
                      + "\t" + v.getDelStatus() + "\t" + v.getOrdCost() + "\t" + v.getOrdTokenNumber());
    }
  }
  private void showFullOrderHistory() {
    OrderHistory[] orderhistory = OrderHistoryFactory.showOrderHistory();
    System.out.println("ORD_CUS_ID" + "\t" + "ORD_ORD_ID" + "\t" + "ORD_DETAILS" + "\t" + "ORD_PAYMENT" + "\t" + "ORDER_STATUS"
                + "\t" + "TOTAL_COST" + "\t");
    for (OrderHistory o : orderhistory) {
      System.out.println(o.getOrdCusId() + "\t" + o.getOrdOrdId() + "\t" + o.getOrdDetails() + "\t" + o.getOrdPayment()
                    + "\t" + o.getOrdStatus() + "\t" + o.getTotCost());
    }
  }


/**
 * main method  is the basic entry point for the application.
 * @param args used to get the user input.
 */
  public static void main(final String[] args) {
    final CliMain mainObj = new CliMain();
    mainObj.mainMenu();
  }
}


