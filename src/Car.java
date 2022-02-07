public class Car {
    String carName;
    int mileage;

    public Car(String name, int miles){
        carName = name;
        mileage = miles;
    }

    public String toString(){
        return carName + " " + mileage + "mi";
    }
}
