public class CatFood extends Food{

    private String wetFood;

    private String dryFood;


    public void chickenWetFood(){
        System.out.println("Chicken wet food");
    }

    public void chickenDryFood(){
        System.out.println("Chicken dry food");

    }

    public String getWetFood() {
        return wetFood;
    }

    public void setWetFood(String wetFood) {
        this.wetFood = wetFood;
    }

    public String getDryFood() {
        return dryFood;
    }

    public void setDryFood(String dryFood) {
        this.dryFood = dryFood;
    }

}
