package com.hexaware.MLP195.model;
import java.util.Objects;

/**
 * Menu class used to display menu information.
 * @author hexware
 */
public class Menu {
/**
 * foodId to store foodId.
 */
  private int foodId;
  private String foodName;
  /**
   * Default Constructor.
   */
  public Menu() {

  }
/**
 * @param argFoodId to initialize food id.
 * used to get details through constructor.
 */
  public Menu(final int argFoodId,final String argFoodName) {
    this.foodId = argFoodId;
    this.foodName = argFoodName;
  }
  @Override
    public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Menu menu = (Menu) obj;
    if (Objects.equals(foodId, menu.foodId)||Objects.equals(foodName, menu.foodName)) {
      return true;
    }
    return false;
  }
  @Override
    public final int hashCode() {
    return Objects.hash(foodId,foodName);
  }
    /**
     * @return this food ID.
     */
  public final int getFoodId() {
    return foodId;
  }
  public final String getFoodName() {
    return foodName;
  }
    /**
     * @param argFoodId gets the food id.
     */
  public final void setFoodId(final int argFoodId,final String argFoodName) {
    this.foodId = argFoodId;
    this.foodName = argFoodName;
  }
}
