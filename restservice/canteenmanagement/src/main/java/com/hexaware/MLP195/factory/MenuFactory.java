package com.hexaware.MLP195.factory;

import com.hexaware.MLP195.persistence.MenuDAO;
import com.hexaware.MLP195.persistence.DbConnection;
import java.util.List;

import com.hexaware.MLP195.model.Menu;
/**
 * MenuFactory class used to fetch menu data from database.
 * @author hexware
 */
public class MenuFactory {
  /**
   *  Protected constructor.
   */
  protected MenuFactory() {

  }
  /**
   * Call the data base connection.
   * @return the connection object.
   */
  private static MenuDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(MenuDAO.class);
  }
  /**
   * Call the data base connection.
   * @return the array of menu object.
   */
  public static Menu[] showMenu() {
    List<Menu> menu = dao().show();
    return menu.toArray(new Menu[menu.size()]);
  }
  /**
   * @param foodId food id
   * @param foodName foodName
   * @param foodType foodType
   * @param foodPrice foodPrice
   * @return returs
   */
  public static int insertingMenu(final int foodId, final String foodName, final String foodType, final float foodPrice) {
    int i = dao().insert(foodId, foodName, foodType, foodPrice);
    return i;
  }
  /**
   * @param foodPrice food price
   * @param foodId food id
   * @return returns
   */
  public static int editMenu(final float foodPrice, final int foodId) {
    int check = dao().update(foodPrice, foodId);
    return check;
  }
  /**
   * @param foodId food id
   * @return returns
   */
  public static int deleteMenu(final int foodId) {
    int check = dao().deleteById(foodId);
    return check;

  }
}


