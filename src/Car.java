public class Car extends Vehicle{

    private String brand;
    private String modelName;
    private int releaseYear;
    private int wheelCount;

    public Car(String brand, String modelName, int releaseYear, int wheelCount) {
        super(brand, modelName, releaseYear);
        this.wheelCount = wheelCount;
    }

    /*@Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }*/

    @Override
    public String toString() {
        return
                "brand='" + super.getBrand() + '\'' +
                        ", modelName='" + super.getModelName() + '\'' +
                        ", releaseYear=" + super.getReleaseYear() +
                        ", wheelCount=" + wheelCount ;
    }
}
