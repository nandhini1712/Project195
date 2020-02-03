package com.hexaware.MLP195.model;
<<<<<<< HEAD
//import java.util.*;

=======
import java.util.Objects;
>>>>>>> 6658e22586ec10d8bbdf20b35aaf7b82b1ef8ccf
/**
 * Customer class used to display Customer information.
 * @author hexware
 */
public class Customer {
/**
 * cusId to store cusId.
 */
  private int cusId;
  private String cusName;
  private String cusAddress;
  private int cusPhno;
  private String cusEmail;
  private int cusDob;
  /**
   * Default Constructor.
   */
  public Customer() {
  }
<<<<<<< HEAD
    /**
     * @param argCusId
     * @param argFoodName
     * @param argFoodType
     * @param argFoodPrice
     */
/**
 * @param argCusId to initialize customer id .
 * @param argCusName to initialize customer Name.
 * @param argCusAddress to initialize.customer.Address.
 * @param argCusPhno to initialize.customer.phoneno.
 * @param argCusEmail to initialize.customer.email.
 * @param argusCusDob to initialize.customer.dateofbirth.
 * used to get details through constructor.
 */
  public Customer(final int CusId, final String CusName, final String CusAddress, final int CusPhno, final String CusEmail, final int CusDob) {
    this.cusId = argCusId;
    this.cusName = argCusName;
    this.cusAddress = argCusAddress;
    this.cusPhno =  argCusPhno;
    this.cusEmail = argCusEmail;
    this.cusDob = argCusDob;
  }

    public int getCusId() {
        return cusId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusAddress() {
        return cusAddress;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress;
    }

    public int getCusPhno() {
        return cusPhno;
    }

    public void setCusPhno(int cusPhno) {
        this.cusPhno = cusPhno;
    }

    public String getCusEmail() {
        return cusEmail;
    }

    public void setCusEmail(String cusEmail) {
        this.cusEmail = cusEmail;
    }

    public int getCusDob() {
        return cusDob;
    }

    public void setCusDob(int cusDob) {
        this.cusDob = cusDob;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cusAddress == null) ? 0 : cusAddress.hashCode());
        result = prime * result + cusDob;
        result = prime * result + ((cusEmail == null) ? 0 : cusEmail.hashCode());
        result = prime * result + cusId;
        result = prime * result + ((cusName == null) ? 0 : cusName.hashCode());
        result = prime * result + cusPhno;
        return result;
    }

  @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Customer other = (Customer) obj;
        if (cusAddress == null) {
            if (other.cusAddress != null)
                return false;
        } else if (!cusAddress.equals(other.cusAddress))
            return false;
        if (cusDob != other.cusDob)
            return false;
        if (cusEmail == null) {
            if (other.cusEmail != null)
                return false;
        } else if (!cusEmail.equals(other.cusEmail))
            return false;
        if (cusId != other.cusId)
            return false;
        if (cusName == null) {
            if (other.cusName != null)
                return false;
        } else if (!cusName.equals(other.cusName))
            return false;
        if (cusPhno != other.cusPhno)
            return false;
        return true;
    }
=======
/**
 * @param argCusId to initialize customer id.
 * @param argCusName to initialize customer Name.
 * @param argCusAddress to initialize.customer.address.
 * @param argCusPhno to initialize.customer.phno.
 * @param argCusmail to initialize.customer.mail.
 * @param argCusDob to initialize.customer.dateofbirth.
 * used to get details through constructor.
 */
  public Customer(final int argCusId, final String argCusName,
      final String argCusAddress, final int argCusPhno,
      final String argCusmail, final int argCusDob) {
    this.cusId = argCusId;
    this.cusName = argCusName;
    this.cusAddress = argCusAddress;
    this.cusPhno = argCusPhno;
    this.cusEmail = argCusmail;
    this.cusDob = argCusDob;
  }
  @Override
    public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Customer cust = (Customer) obj;
    if (Objects.equals(cusId, cust.cusId) || Objects.equals(cusName, cust.cusName)
        || Objects.equals(cusAddress, cust.cusAddress) || Objects.equals(cusPhno, cust.cusPhno)
        || Objects.equals(cusEmail, cust.cusEmail) || Objects.equals(cusDob, cust.cusDob)) {
      return true;
    }
    return false;
  }
  @Override
    public final int hashCode() {
    return Objects.hash(cusId, cusName, cusAddress, cusPhno, cusEmail, cusDob);
  }
    /**
     * @return this customer ID.
    */
  public final int getCusId() {
    return cusId;
  }
    /**
     * @param  argCusId gets customer id.
     */
  public void setCusId(final int  argCusId) {
    this.cusId = argCusId;
  }
    /**
     * @return this customer Name.
    */
  public final String getCusName() {
    return cusName;
  }
    /**
     * @param  argCusName gets customer name.
     */
  public void setCusName(final String  argCusName) {
    this.cusName = argCusName;
  }
      /**
     * @return this customer address.
    */
  public final String getCusAddress() {
    return cusAddress;
  }
    /**
     * @param  argCusAddress gets customer Address.
     */
  public void setCusAddress(final String  argCusAddress) {
    this.cusAddress = argCusAddress;
  }
    /**
     * @return this customer Phonenumber.
    */
  public final int getCusPhno() {
    return cusPhno;
  }
    /**
    * @param  argCusPhno gets customer phonenumber.
     */
  public void setCusPhno(final int  argCusPhno) {
    this.cusPhno = argCusPhno;
  }
    /**
     * @return this customer email.
    */
  public final String getCusEmail() {
    return cusEmail;
  }
    /**
     * @param  argCusEmail gets customer Email.
     */
  public void setCusEmail(final String  argCusEmail) {
    this.cusEmail = argCusEmail;
  }
    /**
     * @return this customer Phonenumber.
    */
  public final int getCusDob() {
    return cusDob;
  }
    /**
    * @param  argCusDob gets customer date of birth.
    */
  public void setCusDob(final int  argCusDob) {
    this.cusPhno = argCusDob;
  }
    /**
     * @param argCusId gets the customer id
     * @param argCusName gets the customer name
     * @param argCusAddress gets the customer address
     * @param argCusPhno gets the customer phno
     * @param argCusEmail gets the customer Email
     * @param argCusDob gets the customer Date of birth
     */
  public final void setCustId(final int argCusId, final String argCusName,
      final String argCusAddress, final int argCusPhno,
      final String argCusEmail, final int argCusDob) {
    this.cusId = argCusId;
    this.cusName = argCusName;
    this.cusAddress = argCusAddress;
    this.cusPhno = argCusPhno;
    this.cusEmail = argCusEmail;
    this.cusDob = argCusDob;
  }
>>>>>>> 6658e22586ec10d8bbdf20b35aaf7b82b1ef8ccf
}
