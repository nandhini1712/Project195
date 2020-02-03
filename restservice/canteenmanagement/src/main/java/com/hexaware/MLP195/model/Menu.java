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
  private String foodType;
  private float foodPrice;
  /**
   * Default Constructor.
   */
  public Menu() {

  }
/**
 * @param argFoodId to initialize food id.
 * @param argFoodName to initialize food Name.
 * @param argFoodType to initialize.food.Type.
 * @param argFoodPrice to initialize.food.Price.
 * used to get details through constructor.
 */
  public Menu(final int argFoodId, final String argFoodName, final String argFoodType, final float argFoodPrice) {
    this.foodId = argFoodId;
    this.foodName = argFoodName;
    this.foodType = argFoodType;
    this.foodPrice = argFoodPrice;
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
    if (Objects.equals(foodId, menu.foodId) || Objects.equals(foodName, menu.foodName) || Objects.equals(foodType, menu.foodName) || (Objects.equals(foodPrice, menu.foodPrice))) {
      return true;
    }
    return false;
  }
  @Override
    public final int hashCode() {
    return Objects.hash(foodId, foodName, foodType, foodPrice);
  }
    /**
     * @return this food ID.
     */
  public final int getFoodId() {
    return foodId;
  }

  public void setFoodId(int foodId) {
    this.foodId = foodId;
  }

  public String getFoodName() {
    return foodName;
  }
    /**
     * @return this food Type.
     */
  public final String getFoodType() {
    return foodType;
  }
      /**
     * @return this food Price.
     */
  public final float getFoodPrice() {
    return foodPrice;
  }
  /**
     * @param argFoodId
     * @param argFoodName
     * @param argFoodType
     * @param argFoodPrice
     */
    /**
     * @param argFoodId gets the food id.
     * @param argFoodName gets the food Name.
     * @param argFoodType gets the food Type.
     * @param argFoodPrice gets the food Price.
     */
  public final void setFoodId(final int argFoodId, final String argFoodName, final String argFoodType, final float argFoodPrice) {
    this.foodId = argFoodId;
    this.foodName = argFoodName;
    this.foodType = argFoodType;
    this.foodPrice = argFoodPrice;
  }
 }
