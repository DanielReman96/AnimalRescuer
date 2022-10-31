public class Main {

    public static void main(String[] args) {

        Owner owner = new Owner();
        System.out.println(owner.ownerName);

        Animal animal = new Animal();
        System.out.println(animal.animalFavoriteActivity);

        RecreationalActivity recreationalActivity = new RecreationalActivity();
        System.out.println(recreationalActivity.recreationalActivityName);

        Veterinarian veterinarian = new Veterinarian();
        System.out.println(veterinarian.veterinarianSpecialization);

        Food food = new Food();
        System.out.println(food.foodName);


        food.foodChicken();
        owner.ownerActivity();
        animal.animalIsVeryHungry();
        recreationalActivity.sleep();
        veterinarian.vetBusy();











    }
}