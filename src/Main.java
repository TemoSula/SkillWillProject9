public class Main {
    public static void main(String[] args) {

        //Converted from string to int
        convertString("777");



        Car car = new Car("Mercedes","E-class",1990,4);

        System.out.println(car);





    }


    public static void convertString (String Number) {

        int realNumber = Integer.parseInt(Number);
        System.out.println(Number);
    }
}
