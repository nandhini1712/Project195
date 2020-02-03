package com.hexaware.MLP195.persistence;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;
import com.hexaware.MLP195.model.OrderHistory;
/**
 * OrderHistoryDAO class used to fetch data from data base.
 * @author akash.hexware
 */
public interface OrderHistoryDAO {
    /**
     * @return the all the OrderHistory record.
     */
  @SqlQuery("Select * from OrderHistory")
    @Mapper(OrderHistoryMapper.class)
    List<OrderHistory> show();
}
