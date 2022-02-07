
import java.util.ArrayList;
/** This class represents a Used Car Lot object
 *
 * @author Roy Wu
 */
public class UsedCarLot {
    /** A list containing the UsedCarLot's inventory
     *
     */
    private ArrayList<Car> inventory;

    /** Instantiates a usedCarLot Object
     *
     */
    public UsedCarLot(){
        inventory = new ArrayList<>();
    }

    /** Returns the current Inventory of the UsedCarLot
     *
     * @return the inventory of the UsedCarLot
     */
    public ArrayList<Car> getInventory(){
        return inventory;
    }

    /** Adds a Car object to inventory list
     *
     * @param newCar Car object to add
     */
    public void addCar(Car newCar){
        inventory.add(newCar);
    }

    /** Swap cars in inventory list given two indexes
     *
     * @param num1 index of first car to swap
     * @param num2 index of second car to swap
     * @return whether the car swap is successful
     */
    public boolean swap(int num1, int num2){
        if((num1 >= 0 && num1 < inventory.size()) && (num2 >= 0 && num2 < inventory.size())){
            Car tempCar = inventory.get(num1);
            inventory.set(num1, inventory.get(num2));
            inventory.set(num2, tempCar);
            return true;
        }else{
            return false;
        }
    }

    /** add Car to inventory list at specified index
     *<p>
     * PRECONDITION: indexToAdd &lt;= 0 and inventory.length &lt; indexToAdd
     *
     * @param indexToAdd index to inset
     * @param carToAdd car object to be added
     */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        inventory.add(indexToAdd, carToAdd);
    }

    /** removes a car in inventory and shifts the list left
     *
     * @param indexOfCarToSell index of car to be removed
     * @return car object that was removed
     */
    public Car sellCarShift(int indexOfCarToSell)
    {
        Car removedCar = inventory.get(indexOfCarToSell);
        inventory.remove(indexOfCarToSell);
        return removedCar;
    }

    /** removes a car in inventory without shifting the inventory list
     *<p>
     * PRECONDITION: indexOfCarToSell &lt;= 0 and inventory.length &lt; indexOfCarToSell
     *
     * @param indexOfCarToSell index of car to be removed
     * @return car object that was removed
     */
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        Car carToSell = inventory.get(indexOfCarToSell);
        inventory.set(indexOfCarToSell, null);
        return carToSell;
    }

    /** moves car to new position in inventory
     *<p>
     * PRECONDITION: indexOfCarToMove and destinationIndex &lt;= 0, inventory.length &lt; indexOfCarToMove and destinationIndex
     *
     * @param indexOfCarToMove index of the car
     * @param destinationIndex index of where the car will be moved to
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        Car carToMove = inventory.get(indexOfCarToMove);
        inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, carToMove);
    }



}
