package com.hexaware.MLP195.factory;

import com.hexaware.MLP195.persistence.VendorDAO;
import com.hexaware.MLP195.persistence.DbConnection;
import java.util.List;

import com.hexaware.MLP195.model.Vendor;
/**
 * VendorFactory class used to fetch vendor data from database.
 * @author Aparna-hexware
 */
public class VendorFactory {
  /**
   *  Protected constructor.
   */
  protected VendorFactory() {

  }
  /**
   * Call the data base connection.
   * @return the connection object.
   */
  private static VendorDAO dao() {
    final DbConnection db = new DbConnection();
    return db.getConnect().onDemand(VendorDAO.class);
  }
  /**
   * Call the data base connection.
   * @return the array of vendor object.
   */
  public static Vendor[] showVendor() {
    final List<Vendor> vendor = dao().show();
    return vendor.toArray(new Vendor[vendor.size()]);
  }
}
