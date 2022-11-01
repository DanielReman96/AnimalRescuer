public class Veterinarian {

    private String veterinarianName;
    private String veterinarianSpecialization;

    public String getVeterinarianName() {
        return veterinarianName;
    }

    public void setVeterinarianName(String veterinarianName) {
        this.veterinarianName = veterinarianName;
    }

    public String getVeterinarianSpecialization() {
        return veterinarianSpecialization;
    }

    public void setVeterinarianSpecialization(String veterinarianSpecialization) {
        this.veterinarianSpecialization = veterinarianSpecialization;
    }

    public void vetBusy (){
        System.out.println(" The veterinarian is very busy");
    }

    public void vetProfessional(){
        System.out.println(" The veterinarian is professional");
    }

}
