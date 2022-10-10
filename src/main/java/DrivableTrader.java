
import java.util.List;

public class DrivableTrader extends Trader<Drivable> {

    /**
     * Construct a Drivable Trader, giving them the given inventory,
     * wishlist, and money.
     *
     * @param inventory Objects in this Trader's inventory
     * @param wishlist  Objects in this Trader's wishlist
     * @param money     The Trader's money
     */
    public DrivableTrader(List<Drivable> inventory,
                          List<Drivable> wishlist,
                          int money) {
        super(inventory, wishlist, money);
    }

    /**
     * Construct a Drivable Trader, giving them strictly money.
     *
     * @param money     The Trader's money
     */
    public DrivableTrader(int money) {
        super(money);
    }

    /**
     * Adds an item to Trader's wishlist.
     *
     * @param item     An item of type Drivable that the selling price will be retrieved if it is tradable.
     * @return an int representing the selling price if tradable, otherwise return Tradable.MISSING_PRICE;
     */
    @Override
    public int getSellingPrice(Drivable item) {
        if (item instanceof Tradable) {
            return ((Tradable) item).getPrice() + item.getMaxSpeed();
        } else {
            return Tradable.MISSING_PRICE;
        }
    }

}
