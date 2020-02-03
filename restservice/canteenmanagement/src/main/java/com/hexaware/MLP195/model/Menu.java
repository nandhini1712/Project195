package com.hexaware.MLP195.model;
//import java.util.Objects;

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
  private int foodPrice;
  /**
   * Default Constructor.
   */
  public Menu() {

  }
/**
 * @param argFoodId to initialize food id.
 * @param argFoodName to initialize food Name.
 * @param argFoodType to initialize food Type.
 * @param argFoodPrice to initialize food Price.
 * used to get details through constructor.
 */
  public Menu(final int argFoodId, final String argFoodName, final String argFoodType, final int argFoodPrice) {
    this.foodId = argFoodId;
    this.foodName = argFoodName;
    this.foodType = argFoodType;
    this.foodPrice = argFoodPrice;
  }

  public int getFoodId() {
    return foodId;
  }

  public void setFoodId(int foodId) {
    this.foodId = foodId;
  }

  public String getFoodName() {
    return foodName;
  }

  public void setFoodName(String foodName) {
    this.foodName = foodName;
  }

  public String getFoodType() {
    return foodType;
  }

  public void setFoodType(String foodType) {
    this.foodType = foodType;
  }

  public int getFoodPrice() {
    return foodPrice;
  }

  public void setFoodPrice(int foodPrice) {
    this.foodPrice = foodPrice;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + foodId;
    result = prime * result + ((foodName == null) ? 0 : foodName.hashCode());
    result = prime * result + foodPrice;
    result = prime * result + ((foodType == null) ? 0 : foodType.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Menu other = (Menu) obj;
    if (foodId != other.foodId)
      return false;
    if (foodName == null) {
      if (other.foodName != null)
        return false;
    } else if (!foodName.equals(other.foodName))
      return false;
    if (foodPrice != other.foodPrice)
      return false;
    if (foodType == null) {
      if (other.foodType != null)
        return false;
    } else if (!foodType.equals(other.foodType))
      return false;
    return true;
  }
 }
