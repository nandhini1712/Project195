package com.hexaware.MLP195.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.hexaware.MLP195.model.OrderHistory;

import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.skife.jdbi.v2.StatementContext;
/**
 * OrderHistoryMapper class used to fetch menu data from database.
 * @author hexware
 */
public class OrderHistoryMapper implements ResultSetMapper<OrderHistory> {
    /**
     * @param idx the index
     * @param rs the resultset
     * @param ctx the context
     * @return the mapped customer object
     * @throws SQLException in case there is an error in fetching data from the resultset
     */
  public final OrderHistory map(final int idx, final ResultSet rs, final StatementContext ctx) throws SQLException {
      /**
       * @return OrderHistory
       */
    return new OrderHistory(rs.getInt("ORD_CUS_ID"), rs.getInt("ORD_ORD_ID"), rs.getString("ORD_DETAILS"), rs.getString("ORD_STATMENTS"), rs.getString("ORD_STATUS"),rs.getFloat("ORD_TOT_COST"));
}
}