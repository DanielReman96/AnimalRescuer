public class CoonMaine extends Cat{


    private int dimension;
    private String furColor;





    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public void run() {
        System.out.println(" RunCoonMaine RUNCoonMaine RunCoonMaine ");
    }

    @Override
    public void speak() {
        System.out.println(" I am CoonMaine");
    }

    @Override
    public void eat() {
        System.out.println(" Eat CoonMaine Eat ");
    }
}
