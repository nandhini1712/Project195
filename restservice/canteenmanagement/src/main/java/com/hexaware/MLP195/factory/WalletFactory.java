package com.hexaware.MLP195.factory;

import com.hexaware.MLP195.persistence.WalletDAO;
import com.hexaware.MLP195.persistence.DbConnection;
import java.util.List;

import com.hexaware.MLP195.model.Wallet;
/**
 * WalletFactory class used to fetch Wallet data from database.
 * @author hexware
 */
public class WalletFactory {
  /**
   *  Protected constructor.
   */
  protected WalletFactory() {

  }
  /**
   * Call the data base connection.
   * @return the connection object.
   */
  private static WalletDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(WalletDAO.class);
  }
  /**
   * Call the data base connection.
   * @return the array of menu object.
   */
  public static Wallet[] showWallet() {
    List<Wallet> Wallet = dao().show();
    return Wallet.toArray(new Wallet[Wallet.size()]);
  }
}
