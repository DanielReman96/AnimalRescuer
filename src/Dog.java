public class Dog extends Animal
{


    public void tailWagging(){
    System.out.println(" Wagging the tail ... ");
    }

    public void bite(){
        System.out.println("The dog bites");
    }

    public void barks(){
        System.out.println("The dog barks");
    }

    @Override
    public void eat() {
        System.out.println(" Miammi miammi miammi ...");
    }

    @Override
    public void speak() {
        System.out.println(" Hau hau hau ");
    }

    @Override
    public void run() {
        System.out.println(" RRR RRR RRR ");
    }
}
