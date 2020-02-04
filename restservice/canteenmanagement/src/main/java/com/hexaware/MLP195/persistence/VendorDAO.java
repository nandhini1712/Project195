package com.hexaware.MLP195.persistence;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;
import com.hexaware.MLP195.model.Vendor;
/**
 * VendorDAO class used to fetch data from data base.
 * @author Aparna-hexware
 */
public interface VendorDAO {
    /**
     * @return the all the vendor record.
     */
  @SqlQuery("Select * from Vendor")
  @Mapper(VendorMapper.class)
  List<Vendor> show();

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
  @SqlUpdate("insert into Vendor(VEN_ID, VEN_NAME, VEN_PHNO, ORD_STATUS, DEL_STATUS, ORD_COST, ORD_TOKEN_NUMBER)"
        + " values (:vid, :vname, :vphno, :ordstatus, :delstatus, :ordcost, :ordtokennumber)")
  int insertVendor(@Bind("vid") int vid, @Bind("vname") String vname,
      @Bind("vphno") double vphno, @Bind("ordstatus") String ordstatus,
      @Bind("delstatus") String delstatus, @Bind("ordcost") float ordcost,
      @Bind("ordtokennumber") int ordtokennumber);

    /**
    * @param vid VEN_ID
    * @return returns the id
    */

  @SqlUpdate("delete from vendor where VEN_ID = :vid")
    int deleteById(@Bind("vid") int vid);

    /**
    * @param ordstatus TO CHANGE ORD_STATUS
    * @param delstatus TO CHANGE DEL_STATUS
    * @param vid vendor id
    * @return updated values
    */
  @SqlUpdate("UPDATE vendor set ORD_STATUS = :ordstatus, DEL_STATUS = :delstatus WHERE VEN_ID = :vid")
  int update(@Bind("ordstatus") String ordstatus, @Bind("delstatus") String delstatus, @Bind("vid") int vid);
}
