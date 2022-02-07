import java.util.ArrayList;
import java.util.Arrays;

public class otherRunner {
    public static void main(String[] args) {

        Car[] carList = {new Car("Bugatti", 0), new Car("Mercedes", 250), new Car("Rolls Royce", 1500)};
        ArrayList<Car> carArrayList = new ArrayList<Car>(Arrays.asList(carList));
        System.out.println(carArrayList);
    }
}
