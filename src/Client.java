public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("Factory Pattern Demo");
        Animal animal1 = AnimalFactory.getAnimalType("Tiger");
        animal1.walk();

        Animal animal2 = AnimalFactory.getAnimalType("Duck");
        animal2.walk();

        Animal animal3 = AnimalFactory.getAnimalType("Lion");
        animal3.walk();
    }
}
