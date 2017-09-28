public class Client {
    String name;
    Pet aPet;

    public Client(String name, Pet aPet) {
        this.name = name;
        this.aPet = aPet;
    }

    public String print() {
        return name + " " + aPet.name + "(" + aPet.animalType + ")";
    }
}
