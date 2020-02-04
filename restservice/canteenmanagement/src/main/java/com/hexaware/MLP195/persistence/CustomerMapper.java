package com.hexaware.MLP195.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.hexaware.MLP195.model.Customer;

import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.skife.jdbi.v2.ConcreteStatementContext;
import java.sql.Date;
/**
 * WalletMapper class used to fetch menu data from database.
 * @author hexware
 */
public class CustomerMapper implements ResultSetMapper<Customer> {
    /**
     * @param idx the index
     * @param rs the resultset
     * @param ctx the context
     * @return the mapped customer object
     * @throws SQLException in case there is an error in fetching data from the resultset
     */
  public final Customer map(final int idx, final ResultSet rs, final StatementContext ctx) throws SQLException {
      /**
       * @return Wallet
       */
    return new Customer(rs.getInt("CUS_ID"), rs.getString("CUS_NAME"),
     rs.getString("CUS_ADDRESS"),rs.getInt("CUS_PHNO"),
      rs.getString("CUS_EMAIL"), rs.getDate("CUS_DOB"));
  }
}

