package com.hexaware.MLP195.model;
import java.util.Objects;
<<<<<<< HEAD
=======

>>>>>>> 6658e22586ec10d8bbdf20b35aaf7b82b1ef8ccf
/**
 * OrderHistory class used to display orderhistory information.
 * @author akash.hexware
 */
public class OrderHistory {
/**
 * ordcusId to store the details about the order of the cusID.
 */
  private int ordcusId;
  private int ordordId;
  private String ordDetails;
  private String ordPayment;
  private String ordStatus;
  private float totCost;
<<<<<<< HEAD
  /**
   * Default Constructor.
   */
  public OrderHistory() {
  }
/**
 * @param argOrdCusId to initialize ordered customer id.
 * @param argOrdOrdId to initialize order of order id.
 * @param argOrdDetails to initialize.order details.
 * @param argOrdPayment to initialize.order payments.
 * @param argOrdStatus to initialize.order status.
 * @param argTotCost to initialize.total cost.
 * used to get details through constructor.
 */
  public OrderHistory(final int argOrdCusId, final int argOrdOrdId, final String argOrdDetails, final String argOrdPayment, final String argOrdStatus, final float argTotCost) {
    this.ordcusId = argOrdCusId;
    this.ordordId = argOrdOrdId;
    this.ordDetails = argOrdDetails;
    this.ordPayment = argOrdPayment;
    this.ordStatus = argOrdStatus;
    this.totCost = argTotCost;
  }
  @Override
  public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    OrderHistory ordh = (OrderHistory) obj;
    if (Objects.equals(ordcusId, ordh.ordcusId) || Objects.equals(ordordId, ordh.ordordId) || Objects.equals(ordDetails, ordh.ordDetails) || Objects.equals(ordPayment, ordh.ordPayment) || Objects.equals(ordStatus, ordh.ordStatus) || Objects.equals(totCost, ordh.totCost)) {
      return true;
    }
    return false;
  }
  @Override
    public final int hashCode() {
    return Objects.hash(ordcusId, ordordId, ordDetails, ordPayment, ordStatus);
  }
    /**
     * @return this orderedorder ID.
    */
  public final int getOrdCusId() {
    return ordcusId;
  }
    /**
    * @param  argOrdCusId gets order customer id.
    */
  public void setOrdCusId(final int  argOrdCusId) {
    this.ordcusId = argOrdCusId;
  }
    /**
     * @return this order customer Id.
    */
  public final int getOrdOrdId() {
    return ordordId;
  }
    /**
     * @param  argOrdOrdId gets orderedorderid.
     */
  public void setOrdOrdId(final int  argOrdOrdId) {
    this.ordordId = argOrdOrdId;
  }
    /**
     * @return this order details.
    */
  public final String getOrdDetails() {
    return ordDetails;
  }
    /**
     * @param  argOrdDetails gets orderedorderid.
     */
  public void setOrdDetails(final String  argOrdDetails) {
    this.ordDetails = argOrdDetails;
  }
    /**
     * @return this order payment.
    */
  public final String getOrdPayment() {
    return ordPayment;
  }
    /**
     * @param  argOrdPayment gets order payment.
     */
  public void setOrdPayment(final String  argOrdPayment) {
    this.ordPayment = argOrdPayment;
  }
    /**
     * @return this order details.
    */
  public final String getOrdStatus() {
    return ordStatus;
  }
    /**
     * @param  argOrdStatus gets order status.
     */
  public void setOrdStatus(final String  argOrdStatus) {
    this.ordStatus = argOrdStatus;
=======

  public OrderHistory() {
  }

  public OrderHistory(final int ordCusID, final int ordordID, final String ordDetails, final String ordPayment, final String ordStatus, float totCost) 
  {
    this.ordcusID = ordCusID;
    this.ordordID = ordordID;
    this.ordDetails = ordDetails;
    this.ordPayment = ordPayment;
    this.OrdStatus = ordStatus;
    this.totCost = totCost;
  }

  public int getOrdcusID() {
    return ordcusID;
  }
  public void setOrdcusID(int ordcusID) {
    this.ordcusID = ordcusID;
  }

  public int getOrdordID() {
    return ordordID;
  }

  public void setOrdordID(int ordordID) {
    this.ordordID = ordordID;
  }

  public String getOrdDetails() {
    return ordDetails;
    }

  public void setOrdDetails(String ordDetails) {
    this.ordDetails = ordDetails;
  }

  public String getOrdPayment() {
    return ordPayment;
  }

  public void setOrdPayment(String ordPayment) {
    this.ordPayment = ordPayment;
  }

  public String getOrdStatus() {
        return OrdStatus;
  }

  public void setOrdStatus(String ordStatus) {
    OrdStatus = ordStatus;
  }

  public float getTotCost() {
        return totCost;
    }

  public void setTotCost(float totCost) {
        this.totCost = totCost;
    }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((OrdStatus == null) ? 0 : OrdStatus.hashCode());
    result = prime * result + ((ordDetails == null) ? 0 : ordDetails.hashCode());
    result = prime * result + ((ordPayment == null) ? 0 : ordPayment.hashCode());
    result = prime * result + ordcusID;
    result = prime * result + ordordID;
    result = prime * result + Float.floatToIntBits(totCost);
        return result;
    }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
        OrderHistory other = (OrderHistory) obj;
    if (OrdStatus == null) {
      if (other.OrdStatus != null) {
        return false;
      }
     } else if (!OrdStatus.equals(other.OrdStatus)){
       return false;
     }
    if (ordDetails == null) {
    if (other.ordDetails != null){
        return false;
      }
    } else if (!ordDetails.equals(other.ordDetails))
            return false;
    if (ordPayment == null) {
      if (other.ordPayment != null)
                return false;
      }
    else if (!ordPayment.equals(other.ordPayment))
            return false;
    if (ordcusID != other.ordcusID)
            return false;
    if (ordordID != other.ordordID)
            return false;
    if (Float.floatToIntBits(totCost) != Float.floatToIntBits(other.totCost))
            return false;
    return true;
  }

  @Override
    public String toString() {
    return "OrderHistory [OrdStatus=" + OrdStatus + ", ordDetails=" + ordDetails + ", ordPayment=" + ordPayment
                + ", ordcusID=" + ordcusID + ", ordordID=" + ordordID + ", totCost=" + totCost + "]";
>>>>>>> 6658e22586ec10d8bbdf20b35aaf7b82b1ef8ccf
  }
}
