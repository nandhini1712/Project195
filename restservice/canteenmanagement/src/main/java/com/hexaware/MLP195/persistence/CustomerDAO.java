package com.hexaware.MLP195.persistence;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
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
}
