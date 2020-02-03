package com.hexaware.MLP195.factory;

import com.hexaware.MLP195.persistence.OrderHistoryDAO;
import com.hexaware.MLP195.persistence.DbConnection;
import java.util.List;

import com.hexaware.MLP195.model.OrderHistory;;
/**
 * MenuFactory class used to fetch menu data from database.
 * @author hexware
 */
public class OrderHistoryFactory {
  /**
   *  Protected constructor.
   */
  protected OrderHistoryFactory() {

  }
  /**
   * Call the data base connection.
   * @return the connection object.
   */
  private static OrderHistoryDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(OrderHistoryDAO.class);
  }
  /**
   * Call the data base connection.
   * @return the array of menu object.
   */
  public static OrderHistory[] showOrderHistory() {
    List<OrderHistory> orderhistory = dao().show();
    return orderhistory.toArray(new OrderHistory[orderhistory.size()]);
  }
}
