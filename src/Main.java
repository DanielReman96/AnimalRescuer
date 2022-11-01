public class Main {

    public static void main(String[] args) {

        Owner owner = new Owner();
        owner.setOwnerName("Mircea");
        System.out.println(owner.getOwnerName());

        Animal animal = new Animal();
        animal.setAnimalFavoriteActivity("Running");
        System.out.println(animal.getAnimalFavoriteActivity());

        RecreationalActivity recreationalActivity = new RecreationalActivity();
        recreationalActivity.setRecreationalActivityName("Sleeping");
        System.out.println(recreationalActivity.getRecreationalActivityName());

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.setVeterinarianName("Victor");
        System.out.println(veterinarian.getVeterinarianName());

        Food food = new Food();
        food.setFoodName("Chicken");
        System.out.println(food.getFoodName());


        food.foodChicken();
        owner.ownerActivity();
        animal.animalIsVeryHungry();
        recreationalActivity.sleep();
        veterinarian.vetBusy();











    }
}