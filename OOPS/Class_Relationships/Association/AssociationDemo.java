public class AssociationDemo {
    public static void main(String[] args){
        Car car = new Car("Model S");

        Person person = new Person ("Troy", car);
        person.driveCar();
    }
}