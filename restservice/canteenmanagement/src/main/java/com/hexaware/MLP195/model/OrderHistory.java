package com.hexaware.MLP195.model;
//import java.util.Objects;

/**
 * OrderHistory class used to display orderhistory information.
 * @author akash.hexware
 */
public class OrderHistory {
/**
 * ordcusID to store the details about the order of the cusID.
 */
  private int ordcusID;
  private int ordordID;
  private String ordDetails;
  private String ordPayment;
  private String OrdStatus;
  private float totCost;

    public OrderHistory() {
    }

    public OrderHistory(int ordCusID, int ordordID, String ordDetails, String ordPayment, String ordStatus,
            float totCost) {
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
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OrderHistory other = (OrderHistory) obj;
        if (OrdStatus == null) {
            if (other.OrdStatus != null)
                return false;
        } else if (!OrdStatus.equals(other.OrdStatus))
            return false;
        if (ordDetails == null) {
            if (other.ordDetails != null)
                return false;
        } else if (!ordDetails.equals(other.ordDetails))
            return false;
        if (ordPayment == null) {
            if (other.ordPayment != null)
                return false;
        } else if (!ordPayment.equals(other.ordPayment))
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
    }
   }
