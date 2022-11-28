public abstract class Dog extends Animal
{


    public void tailWagging(){
    System.out.println(" Wagging the tail ... ");
    }

    public void bite(){
        System.out.println("The dog bites");
    }

    public abstract void barks();

    @Override
    public abstract void eat();

    @Override
    public abstract void speak();

    @Override
    public abstract  void run();


}
