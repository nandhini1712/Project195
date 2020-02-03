package com.hexaware.MLP195.model;
//import java.util.*;

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
}
