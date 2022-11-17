public class Cat extends Animal{


    private int viewLevel;
    private int hearingLevel;


    public void purrs(){
        System.out.println("The cat purrs");
    }

    public void climbs(){
        System.out.println("Climbs");
    }
    public void meows(){
        System.out.println("Meows meows");
    }


    public int getViewLevel() {
        return viewLevel;
    }

    public void setViewLevel(int viewLevel) {
        this.viewLevel = viewLevel;
    }

    public int getHearingLevel() {
        return hearingLevel;
    }

    public void setHearingLevel(int hearingLevel) {
        this.hearingLevel = hearingLevel;
    }


}
