public class Car{

    String name;
    String manufacturer;
    int year;

    public Car(String name, String manufacturer, int year){
        this.name = name;
        this.manufacturer = manufacturer;
        this.year = year
    }

    public void startEngine(){
        System.out.println("The "+ name + manufacturer + " of " + year +"'s is starting");
    }

    public void displayInfo(){
        System.out.println("Car info: " + name + " " + manufacturer + "(" + year + ")");
    }

}

