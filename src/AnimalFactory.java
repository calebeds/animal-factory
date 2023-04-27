public class AnimalFactory {
    public static Animal getAnimalType(String animalType) throws Exception {
        String type = animalType.toLowerCase();
        switch (type) {
            case "duck":
                return new Duck();
            case "tiger":
                return new Tiger();
            default:
                throw new Exception("Animal" + type + "cannot be instantiated");
        }
    }
}

