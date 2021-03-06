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
   * @param argDelStatus toinitalize delStatus.
   * @param argOrdCost to initalize ordCost.
   * @param argOrdTokenNumber to initalize ordTokenNumber.
   * used to get
   *                 details through constructor.
   */

  public Vendor(final int argVenId, final String argVenName, final double argVenPhno,
       final String argOrdStatus, final String argDelStatus, final float argOrdCost,
      final int argOrdTokenNumber) {
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
  public final int getVenId() {
    return venId;
  }
/**
 * @param argvenId set venid
 */
  public final void setVenId(final int argvenId) {
    this.venId = argvenId;
  }

  /**
   * @return this vendor Name.
   */
  public final String getVenName() {
    return venName;
  }
  /**
   * @param argvenName set venname
   * @param venName
   */



  public final void setVenName(final String argvenName) {
    this.venName = argvenName;
  }

  /**
   * @return this vendor Phno .
   */
  public final double getVenPhno() {
    return venPhno;
  }
  /**
   * @param argvenPhno set venphno
   */

  public final void setVenPhno(final double argvenPhno) {
    this.venPhno = argvenPhno;
  }


  /**
   * @return this ordStatus .
   */
  public final String getOrdStatus() {
    return ordStatus;
  }
  /**
   * @param argordStatus set orderstatus
   */

  public final void setOrdStatus(final String argordStatus) {
    this.ordStatus = argordStatus;
  }

  /**
   * @return this delStatus .
   */
  public final String getDelStatus() {
    return delStatus;
  }
  /**
   * @param argdelStatus set delivery status
   */

  public final void setDelStatus(final String argdelStatus) {
    this.delStatus = argdelStatus;
  }

  /**
   * @return this ordCost .
   */
  public final float getOrdCost() {
    return ordCost;
  }
  /**
   * @param argordCost set order cost
   */

  public final void setOrdCost(final float argordCost) {
    this.ordCost = argordCost;
  }

  /**
   * @return this ordTokenNumber.
   */
  public final int getOrdTokenNumber() {
    return ordTokenNumber;
  }
  /**
   * @param argordTokenNumber set order token number
   */

  public final void setOrdTokenNumber(final int argordTokenNumber) {
    this.ordTokenNumber = argordTokenNumber;
  }
  /**
   * @param argVenId gets the vendor ID
   * @param argVenName gets the vendor Name
   * @param argVenPhno gets the vendor phone Number
   * @param argOrdStatus gets the order of the status
   * @param argDelStatus gets the delivery status
   * @param argOrdCost gets the order cost
   * @param argOrdTokenNumber gets the token number
   */
  public final void setVendorId(final int argVenId, final String argVenName,
      final double argVenPhno, final String argOrdStatus,
      final String argDelStatus, final float argOrdCost,
      final int argOrdTokenNumber) {
    this.venId = argVenId;
    this.venName = argVenName;
    this.venPhno = argVenPhno;
    this.ordStatus = argOrdStatus;
    this.delStatus = argDelStatus;
    this.ordCost = argOrdCost;
    this.ordTokenNumber = argOrdTokenNumber;
  }
}
