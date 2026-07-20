public class main{

    public static void main(String[] args){
        Car car1 = new Car("Model S", "Tesla", 2020);
        car1.startEngine();
        car1.displayInfo();

        Car car2 = new Car("Mustang", "Ford", 2018);
        car2.startEngine();
        car2.displayInfo();
    }
}