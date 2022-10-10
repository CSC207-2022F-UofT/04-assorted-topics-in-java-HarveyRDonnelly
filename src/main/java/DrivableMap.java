/* Below is the DrivableMap class, which is a map that contains a
 * HashMap mapping Strings to Drivable objects.
 * (Think of Python dictionaries as a comparison -- the concept is
 * similar!)
 *
 * Implement the requested methods as stated in the TODOs. We've
 * created the constructor for you already.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class DrivableMap {
    HashMap<String, Drivable> drivable_map;

    /**
     * A generic constructor that initializes car_map
     * as an empty HashMap.
     */
    public DrivableMap() {
        drivable_map = new HashMap<>();
    }

    /**
     * Takes an id and a Drivable Object and adds them to drivable_map if they
     * are not already added. Returns whether or not the id/dirvable object pair
     * has been added.
     *
     * @param id                String representing the ID of a drivable object.
     * @param drivableObject    A drivable object to be added to drivable_map.
     * @return whether the id/drivable object pair has been added to drivable_map.
     */
    public boolean addDrivable(String id, Drivable drivableObject) {
        if (!this.drivable_map.containsKey(id)) {
            this.drivable_map.put(id, drivableObject);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Takes a speed value and checks whther there exists any drivable objects in
     * drivable_map that has a max speed greater than or equal to the inputted speed.
     *
     * @param speed              An int representing a speed.
     * @return whether there exists at least one Drivable object in drivable_map that
     * has a max speed greater than or equal to speed.
     */
    public boolean hasFasterThan(int speed) {
        for (Drivable obj : drivable_map.values()) {
            if (obj.getMaxSpeed() >= speed) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns a List containing all the Tradable items in drivable_map.
     *
     * @return a List containing all the Tradable items in drivable_map.
     */
    public List<Tradable> getTradable() {
        List<Tradable> tradableObjects = new ArrayList<Tradable>();
        for (Drivable obj : drivable_map.values()) {
            if (obj instanceof Tradable) {
                tradableObjects.add((Tradable) obj);
            }
        }
        return tradableObjects;
    }



    
}