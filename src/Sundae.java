/* Matt Nguyen
   Chinemerem Anunkor
     February 20, 2020
     Purpose: This purpose of this java class is to serve as Sundae class
     Inputs: IceCream and Sundae
     Output: Different items called for the Sundae
*/

public class Sundae extends IceCream {

    private String toppingName;
    private double toppingCost;

    public Sundae(String nameIceCream, double costIceCream, String toppingName, double toppingCost) {
        super(nameIceCream, costIceCream);
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;
    }

    public double getCost() {
        return super.getCost() + toppingCost;
    }

    public String getToppingName() {
        return toppingName;
    }


    public String toString(){
        String name = this.getName();
        String topping = this.getToppingName();
        if(!this.getName().equals("")){
            name += "(Sundae)";
            if(!this.getToppingName().equals("")){
                topping = this.getToppingName() + "(Topping)";
            }
        }
        String output = String.format("%-30s\n",name+" with");
        String line = String.format("%-30s %-15.2f\n", topping, this.getCost() / 100.0);
        output += line;
        if(this.getCalories() != 0){
            output += "\n" + name + " calories:" + this.getCalories() + "\n";
        }
        return output;
    }
}