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
    /**
    * @param vid VEN_ID
    * @param vname VEN_NAME
    * @param vphno VEN_PHNO
    * @param ordstatus ORD_STATUS
    * @param delstatus DEL_STATUS
    * @param ordcost ORD_COST
    * @param ordtokennumber ORD_TOKEN_NUMBER
    * @return inserted values
    */
  public static int insertingVendor(final int vid, final String vname,
      final double vphno, final String ordstatus, final String delstatus,
      final float ordcost, final int ordtokennumber) {
    int i = dao().insertVendor(vid, vname, vphno, ordstatus, delstatus, ordcost, ordtokennumber);
    return i;
  }
  /**
   * @param ordstatus ORD_STATUS
   * @param delstatus DEL_STATUS
   * @param vid vendor id
   * @return values
   */
  public static int editVendor(final String ordstatus, final String delstatus, final int vid) {
    int check = dao().update(ordstatus, delstatus, vid);
    return check;
  }
/**
 * @param vid to delete based on vid
 * @return returns the id
 */
  public static int deleteVendor(final int vid) {
    int check = dao().deleteById(vid);
    return check;
  }
}

