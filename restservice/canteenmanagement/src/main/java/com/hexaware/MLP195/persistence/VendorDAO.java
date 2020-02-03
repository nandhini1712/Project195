package com.hexaware.MLP195.persistence;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
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
}