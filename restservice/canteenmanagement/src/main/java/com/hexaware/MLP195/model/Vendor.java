package com.hexaware.MLP195.model;
import java.util.Objects;

/**
 * vendor class used to display vendor information.
 * @author  aparna-hexware
 */
public class Vendor {
/**
 * venId to store venId.
 */
  private int venId;
  private String venName;
  private double venPhno;
  private String ordStatus;
  private String delStatus;
  private float ordCost;
  private int ordTokenNumber;
  /**
   * default constructor.
   */
  public Vendor() {

  }
/**
 * @param argVenId to initalize venId. 
 * @param argVenName to initalize venName.
 * @param argVenPhno to initalize venPhno.                
 * @param argOrdStatus to initalize ordStatus.
 * @param argDelStatus to initalize delStatus. 
 * @param argOrdCost to initalize ordCost.
 * @param argOrdTokenNumber to initalize ordTokenNumber. 
 * used to get details through constructor.
 */
  public Vendor(final int argVenId, final String argVenName, final double argVenPhno, final String argOrdStatus, final String argDelStatus,
       final float argOrdCost, final int argOrdTokenNumber) {
    this.venId = argVenId;
    this.venName = argVenName;
    this.venPhno = argVenPhno;
    this.ordStatus = argOrdStatus;
    this.delStatus = argDelStatus;
    this.ordCost = argOrdCost;
    this.ordTokenNumber = argOrdTokenNumber;
  }
  @Override
  public final boolean equals(final Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Vendor other = (Vendor) obj;
    if (delStatus == null) {
      if (other.delStatus != null) {
        return false;
      }
    } else if (!delStatus.equals(other.delStatus)) {
      return false;
    }
    if (Float.floatToIntBits(ordCost) != Float.floatToIntBits(other.ordCost)) {
      return false;
    }
    if (ordStatus == null) {
      if (other.ordStatus != null) {
        return false;
      }
    } else if (!ordStatus.equals(other.ordStatus)) {
      return false;
    }
    if (ordTokenNumber == 0) {
      if (other.ordTokenNumber != 0) {
        return false;
      }
    } else if (ordTokenNumber == (other.ordTokenNumber)) {
      return false;
    }
    if (venId != other.venId) {
      return false;
    }
    if (venName == null) {
      if (other.venName != null) {
        return false;
      }
    } else if (!venName.equals(other.venName)) {
      return false;
    }
    if (Double.doubleToLongBits(venPhno) != Double.doubleToLongBits(other.venPhno)) {
      return false;
    }
    return true;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(venId, venName, venPhno, ordStatus, delStatus, ordCost, ordTokenNumber);
  }

  /**
   * @return this vendor Id.
   */
  public int getVenId() {
    return venId;
  }

  public void setVenId(final int venId) {
    this.venId = venId;
  }

  /**
   * @return this vendor Name.
   */
  public String getVenName() {
    return venName;
  }

  public void setVenName(final String venName) {
    this.venName = venName;
  }

  /**
   * @return this vendor Phno .
   */
  public double getVenPhno() {
    return venPhno;
  }

  public void setVenPhno(final double venPhno) {
    this.venPhno = venPhno;
  }
  /**
   * @return this ordStatus .
   */
  public String getOrdStatus() {
    return ordStatus;
  }

  public void setOrdStatus(final String ordStatus) {
    this.ordStatus = ordStatus;
  }

  /**
   * @return this delStatus .
   */
  public String getDelStatus() {
    return delStatus;
  }

  public void setDelStatus(final String delStatus) {
    this.delStatus = delStatus;
  }

  /**
   * @return this ordCost .
   */
  public float getOrdCost() {
    return ordCost;
  }

  public void setOrdCost(final float ordCost) {
    this.ordCost = ordCost;
  }

  /**
   * @return this ordTokenNumber.
   */
  public int getOrdTokenNumber() {
    return ordTokenNumber;
  }

  public void setOrdTokenNumber(final int ordTokenNumber) {
    this.ordTokenNumber = ordTokenNumber;
  }

  /**
   * @param argVenId
   * @param argVenName
   * @param argvenPhno
   * @param argordStatus
   * @param argdelStatus
   * @param argordCost
   * @param argordTokenNumber
   */
  /**
   * @param argVenId          gets the food id.
   * @param argVenName        gets the food Name.
   * @param argVenPhno        gets the vendor phone.
   * @param argOrdStatus      gets the order status.
   * @param argDelStatus      gets the delivery status.
   * @param argOrdCost        gets the order cost.
   * @param argOrdTokenNumber gets the token number.
   */
  public final void setVendorId(final int argVenId, final String argVenName,
      final double argVenPhno, final String argVenStatus, final String argOrdStatus,
      final String argDelStatus, final float argOrdCost, final int argOrdTokenNumber) {
    this.venId = argVenId;
    this.venName = argVenName;
    this.ordStatus = argOrdStatus;
    this.delStatus= argDelStatus;
    this.ordCost= argOrdCost;   
    this.ordTokenNumber= argOrdTokenNumber;
  
}
}
