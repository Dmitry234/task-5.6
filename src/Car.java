public class Car {
    public String model, color;
    public int year;
    public Car(String model, String color,int year){
        this.model = model;
        this.color = color;
        this.year = year;
    }
    public String toString(){
        return "I own a car, a" + year + color + model;
    }
}
