public class Food {

  private String foodName;
  private int foodPrice;
  private int foodQuantity;
  private boolean foodAvailability;

  public void setFoodName(String foodName){
    this.foodName = foodName;
  }
  public String getFoodName(){
    return foodName;
  }

  public void setFoodPrice (int foodPrice){
    this.foodPrice = foodPrice;
  }

  public int getFoodPrice (){
    return foodPrice;
  }


  public void setFoodQuantity(int foodQuantity){
    this.foodQuantity = foodQuantity;
  }

  public int getFoodQuantity(){
    return foodQuantity;
  }



  public void setFoodAvailability(boolean foodAvailability) {
    this.foodAvailability = foodAvailability;
  }

  public boolean isFoodAvailability() {
    return foodAvailability;
  }

  public void foodChicken (){
        System.out.println(" Today Rudolph eat chicken" );
    }

    public void foodBones(){
      System.out.println(" Tomorrow Rudolph will eat bones");
    }


}
