package com.hexaware.MLP195.persistence;

import org.skife.jdbi.v2.sqlobject.Bind;

import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;
import com.hexaware.MLP195.model.Customer;;
/**
 * CustomerDAO class used to fetch data from data base.
 * @author Ganesh
 */
public interface CustomerDAO {
    /**
     * @return the all the Customer record.
     */
  @SqlQuery("Select * from Customer")
    @Mapper(CustomerMapper.class)
    List<Customer> show();
    /**
     * @param argCusId gets the customer id
     * @param argCusName gets the customer name
     * @param argCusAddress gets the customer address
     * @param argCusPhno gets the customer phno
     * @param argCusEmail gets the customer Email
     * @return returns
     */
  @SqlUpdate("INSERT INTO Customer(CUS_ID, CUS_NAME, CUS_ADDRESS, CUS_PHNO, CUS_EMAIL)"
      + "VALUES (:cusId, :cusName, :cusAddress, :cusPhno, :cusEmail)")
  int insert(@Bind("cusId") int argCusId, @Bind("cusName") String argCusName,
      @Bind("cusAddress") String argCusAddress, @Bind("cusPhno") int argCusPhno, @Bind("cusEmail") String argCusEmail);
    /**
     * @param argCusId gets the customer id
     * @return returs the value
     */
  @SqlUpdate("DELETE FROM Customer WHERE CUS_ID = :cusId")
    int deleteById(@Bind("cusId") int argCusId);
    /**
     * @param argCusId gets the customer id
     * @param argCusPhno gets the customer phone number
     * @param argCusAddress gets the customer address
     * @param argCusEmail gets the customer Email
     * @return returns the value
     */

  @SqlUpdate("UPDATE Customer set CUS_ADDRESS = :cusAddress, CUS_PHNO = :cusPhno, CUS_EMAIL = :cusEmail WHERE CUS_ID = :cusId")
    int update(@Bind("cusAddress") String argCusAddress,
       @Bind("cusPhno") int argCusPhno, @Bind("cusEmail") String argCusEmail, @Bind("cusId") int argCusId);
}



