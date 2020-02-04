package com.hexaware.MLP195.persistence;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;
import com.hexaware.MLP195.model.Menu;
/**
 * MenuDAO class used to fetch data from data base.
 * @author hexware
 */
public interface MenuDAO {
    /**
     * @return the all the Menu record.
     */
  @SqlQuery("Select * from Menu")
    @Mapper(MenuMapper.class)
    List<Menu> show();
  /**
   * @param foodId food id
   * @param foodName foodName
   * @param foodType foodType
   * @param foodPrice foodPrice
   * @return returs
  */
  @SqlUpdate("INSERT INTO Menu(FOOD_ID, FOOD_NAME, FOOD_TYPE, FOOD_PRICE)" + "VALUES (:foodId, :foodName, :foodType, :foodPrice)")
    int insert(@Bind("foodId") int foodId, @Bind("foodName") String foodName, @Bind("foodType") String foodType, @Bind("foodPrice") Float foodPrice);
  /**
   * @param foodId food id
   * @return returns
   */
  @SqlUpdate("DELETE from Menu where FOOD_ID = :foodId")
   int deleteById(@Bind("foodId") int foodId);
  /**
   * @param foodPrice food price
   * @param foodId food id
   * @return returns
   */
  @SqlUpdate("UPDATE Menu set FOOD_PRICE = :foodPrice WHERE FOOD_ID = :foodId")
   int update(@Bind("foodPrice") float foodPrice, @Bind("foodId") int foodId);


}


