public class Owner {

    private String ownerName;
    private float ownerMoney;

    public void setOwnerName (String ownerName){
        this.ownerName = ownerName;
    }
    public String getOwnerName(){
        return ownerName;
    }

    public void setOwnerMoney(float ownerMoney){
        this.ownerMoney = ownerMoney;
    }

    public float getOwnerMoney(){
        return ownerMoney;
    }



    public void ownerActivity(){
        System.out.println("Today Martin bought 10 kg food");
    }

    public void ownerCareful(){
        System.out.println(" The owner is careful with animal");
    }



}
