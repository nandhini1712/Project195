package com.hexaware.MLP195.factory;

import com.hexaware.MLP195.persistence.CustomerDAO;
import com.hexaware.MLP195.persistence.DbConnection;
import java.util.List;

import com.hexaware.MLP195.model.Customer;
/**
 * CustomerFactory class used to fetch Customer data from database.
 * @author Ganesh
 */
public class CustomerFactory {
  /**
   *  Protected constructor.
   */
  protected CustomerFactory() {

  }
  /**
   * call the data base connection.
   * @return the connection object.
   */
  private static CustomerDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(CustomerDAO.class);
  }
  /**
   * call the data base connection.
   * @return the array of Customer object.
   */
  public static Customer[] showCustomer() {
    List<Customer> customer = dao().show();
    return customer.toArray(new Customer[customer.size()]);
  }
  /**
   * @param argCusId gets the customer id
   * @param argCusName gets the customer name
   * @param argCusAddress gets the customer address
   * @param argCusPhno gets the customer phno
   * @param argCusEmail gets the customer Email
   * @return the array of customer object
   */
  public static int insertingCustomer(final int argCusId, final String argCusName,
      final String argCusAddress, final int argCusPhno, final String argCusEmail) {
    int i = dao().insert(argCusId, argCusName, argCusAddress, argCusPhno, argCusEmail);
    return i;
  }
  /**
   * @param argCusId gets the id
   * @param argCusAddress gets the customer address
   * @param argCusPhno gets the customer phno
   * @param argCusEmail gets the customer Email
   * @return the array of customer object
   */
  public static int editCustomer(final String argCusAddress, final int argCusPhno,
      final String argCusEmail, final int argCusId) {
    int check = dao().update(argCusAddress, argCusPhno, argCusEmail, argCusId);
    return check;
  }
  /**
   * @param argCusId gets the id
   * @return returns
   */
  public static int deleteCustomer(final int argCusId) {
    int check = dao().deleteById(argCusId);
    return check;
  }
}
