/* Matt Nguyen
   Chinemerem Anunkor
     February 20, 2020
     Purpose: This purpose of this java class is to serve as the Cookie class
     Inputs: Different cookies
     Output: Returns different cookies price and name, or different objects
*/
public class Cookie extends DessertItem {

    private int numberOfCookies;
    private int pricePerDozen;

    public Cookie (String name, int numberOfCookies, int pricePerDozen) {
        super(name);
        this.numberOfCookies = numberOfCookies;
        this.pricePerDozen = pricePerDozen;
    }

    public double getCost() {
        double cost = Math.round(numberOfCookies * pricePerDozen / 12);
        return cost;
    }


    public int getNumberOfCookies() {
        return numberOfCookies;
    }


    public int getPricePerDozen() {
        return pricePerDozen;
    }

    public String toString(){
        String name = this.getName();
        if(!this.getName().equals("")){
            name += "(Cookie)";
        }
        String output = this.getNumberOfCookies() + " @ " + (this.getPricePerDozen() / 100.0) + " /dz.\n";
        String line = String.format("%-30s %-15.2f\n", name, (this.getCost() / 100.0));
        output += line;
        if(this.getCalories() != 0){
            output += "\n" + name + " calories:" + this.getCalories() + "\n";
        }
        return output;
    }
}