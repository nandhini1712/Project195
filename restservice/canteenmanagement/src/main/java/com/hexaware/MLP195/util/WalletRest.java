package com.hexaware.MLP195.util;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.hexaware.MLP195.model.Wallet;
import com.hexaware.MLP195.factory.WalletFactory;

/**
 * This class provides a REST interface for the employee entity.
 */
@Path("/wallet")
public class WalletRest {
  /**
   * Returns Wallet details.
   * @return the Wallet details
   */
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public final Wallet[] listWallet() {
    final Wallet[] menu = WalletFactory.showWallet();
    return menu;
  }
}