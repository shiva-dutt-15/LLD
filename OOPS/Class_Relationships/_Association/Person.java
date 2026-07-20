package Association;

class Person{
    String name;
    // Association: A Person "has a" Car.
    Car car;

    public Car(String name, Car car){
        this.name  = name;
        this.car = car;
    }

    public void driveCar(){
        System.out.println(name + " is driving the car:" + car.model);
        car.drive();
    }
}