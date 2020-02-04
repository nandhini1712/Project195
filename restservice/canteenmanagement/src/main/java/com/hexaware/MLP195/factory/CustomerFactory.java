package com.hexaware.MLP195.factory;

import com.hexaware.MLP195.persistence.FactoryDAO;
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
    List<Customer> Customer = dao().show();
    return Customer.toArray(new Customer[Customer.size()]);
  }
}


