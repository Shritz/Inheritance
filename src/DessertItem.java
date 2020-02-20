/* Matt Nguyen
   Chinemerem Anunkor
     February 20, 2020
     Purpose: The purpose of this java class is to serve as the superclass for all the
     different items that we are comparing and using
     Inputs: DessertItems that we would be comparing
     Output: the DessertItems which are greater in calories
*/



public abstract class DessertItem implements Comparable<DessertItem>{

    protected String name;
    protected int calories;

    /**
     * Null constructor for DessertItem class
     */
    public DessertItem() {
        this("");
    }
    /**
     * Initializes DessertItem data
     */
    public DessertItem(String name) {
        this.name = name;
    }
    /**
     * Returns name of DessertItem
     * @return name of DessertItem
     */
    public final String getName() {
        return name;
    }

    public int getCalories() {
        return this.calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setName(String name) {
        this.name = name;
    }
    /**
     * Returns cost of DessertItem
     * @return cost of DessertItem
     */
    public abstract double getCost();

    /**
     *
     * @param item1
     * @param item2
     * @return -1, 1, or null depending on what item has more calories
     */
    public static DessertItem max(DessertItem item1, DessertItem item2){
        int compare = item1.compareTo(item2);
        if(compare == 1){
            return item1;
        }
        else if(compare == -1){
            return item2;
        }
        return null;
    }

    /**
     *
     * @param item
     * @return 0, 1, -1, depending on which item has more calories
     */
    public int compareTo(DessertItem item){
        if (calories == item.calories)
            return 0;
        else if(calories>item.calories)
            return 1;
        else
            return -1;
    }

}