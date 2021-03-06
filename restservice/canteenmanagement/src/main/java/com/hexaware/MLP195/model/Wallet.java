package com.hexaware.MLP195.model;
import java.util.Objects;

/**
 * WALLET class used to display WALLET information.
 * @author Uthraa-hexware
 */
public class Wallet {
/**
 * w to store customer ID.
 * WalwaymentMode to store payment methods.
 * wAL_BALANCE to store customer balance.
 */
  private int walCusId;
  private String walPaymentMode;
  private int walBalance;
  /**
   * Default Constructor.
   */
  public Wallet() {

  }
  /**
 * @param argWalCusId to initialize CUSTOMER ID.
 * @param argWalPaymentMode to initialize PAYMENT METHODS.
 * @param argWalBalance to initialize CUSTOMER'S BALANCE.
 * used to get details through constructor.
 */
  public Wallet(final int argWalCusId, final String argWalPaymentMode, final int argWalBalance) {
    this.walCusId = argWalCusId;
    this.walPaymentMode = argWalPaymentMode;
    this.walBalance = argWalBalance;
  }
  @Override
    public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Wallet wallet = (Wallet) obj;
    if (Objects.equals(walCusId, wallet.walCusId)
        || Objects.equals(walPaymentMode, wallet.walPaymentMode)
        || Objects.equals(walBalance, wallet.walBalance)) {
      return true;
    }
    return false;
  }
  @Override
    public final int hashCode() {
    return Objects.hash(walCusId, walPaymentMode, walBalance);
  }
    /**
     * @return this customer ID.
     */
  public final int getwalCusId() {
    return walCusId;
  }
    /**
     * @return this food Name.
     */

  public final String getwalPaymentMode() {
    return walPaymentMode;
  }
/**
     * @return this WalPaymentMode.
     */
  public final int getwalBalance() {
    return walBalance;
  }
    /**
     * @param argWalCusId gets the customer id.
     * @param argWalPaymentMode gets the PAYMENT METHODS.
     * @param argWalBalance gets the customer BALANCE.
     */
  public final void setwalCusId(final int argWalCusId, final String argWalPaymentMode, final int argWalBalance) {
    this.walCusId = argWalCusId;
    this.walPaymentMode = argWalPaymentMode;
    this.walBalance = argWalBalance;
  }
}

