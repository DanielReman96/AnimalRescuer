public class Animal {

    private String animalName;
    private int animalAge;
    private int animalHealthLevel;
    private int animalFeelingHungry;
    private int stateOfMind;
    private String animalFavoriteFood;
    private String animalFavoriteActivity;

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public int getAnimalHealthLevel() {
        return animalHealthLevel;
    }

    public void setAnimalHealthLevel(int animalHealthLevel) {
        this.animalHealthLevel = animalHealthLevel;
    }

    public int getAnimalFeelingHungry() {
        return animalFeelingHungry;
    }

    public void setAnimalFeelingHungry(int animalFeelingHungry) {
        this.animalFeelingHungry = animalFeelingHungry;
    }

    public int getStateOfMind() {
        return stateOfMind;
    }

    public void setStateOfMind(int stateOfMind) {
        this.stateOfMind = stateOfMind;
    }

    public String getAnimalFavoriteFood() {
        return animalFavoriteFood;
    }

    public void setAnimalFavoriteFood(String animalFavoriteFood) {
        this.animalFavoriteFood = animalFavoriteFood;
    }

    public String getAnimalFavoriteActivity() {
        return animalFavoriteActivity;
    }

    public void setAnimalFavoriteActivity(String animalFavoriteActivity) {
        this.animalFavoriteActivity = animalFavoriteActivity;
    }

    public void animalDog (){
        System.out.println(" The dog is happy today");

    }

    public void animalIsVeryHungry(){
        System.out.println(" The dog is very hungry ");
    }



}
