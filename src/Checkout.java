/* Matt Nguyen
   Chinemerem Anunkor
     February 20, 2020
     Purpose: This purpose of this java class is to serve as the checkout class,
     sets the tax rate, and bring out the receipts
     Inputs: DessertItems
     Output: the DessertItems in the form of a receipt with their cost and total amount.
*/

import java.util.ArrayList;

public class Checkout {

    protected ArrayList<DessertItem> dessertItems;
    protected double taxRate = 0.0775;

    public Checkout() {
        this.dessertItems = new ArrayList<DessertItem>();

    }

    /**
     *
     * @return tax rate for the purchase
     */
    public double getTaxRate() {
        return this.taxRate;
    }

    /**
     * change tax rate for this purchase
     */
    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    /**
     *
     * @return the number of DessertItem's in the item list
     */
    public int numberOfItems() {
        return this.dessertItems.size();

    }

    /**
     * A DessertItem is added to the end of the list of items
     * @param item
     */
    public void enterItem(DessertItem item) {
        this.dessertItems.add(item);

    }

    /**
     * clears the checkout to begin checking out a new set of items
     */
    public void clear() {
        this.dessertItems.clear();

    }

    /**
     *
     * @returns the total cost of items in cents (without tax)
     */
    public double totalCost() {
        double total = 0;
        for (int i = 0; i < this.dessertItems.size(); i++) {
            total = total + this.dessertItems.get(i).getCost();
        }
        return total;
    }

    /**
     *
     * @return total on items in cents
     */
    public int totalTax() {
        return (int)Math.round(this.taxRate * this.totalCost());
    }

    /**
     *
     * @return a String representing a receipt for the current list of
     * DessertItem's with the name of the Dessert store, the items
     * purchased, the tax, and the total cost, for example
     */
    public String toString() {
        String output = "";

        output += "\n\t\t\tA&S Dessert Shop\n\t\t\t--------------\n";

        for (int i = 0; i < this.dessertItems.size(); i++) {
            if(this.dessertItems.get(i) instanceof Candy){
                Candy temp = (Candy)this.dessertItems.get(i);
                String name = temp.getName();
                if(!temp.getName().equals("")){
                    name += "(Candy)";
                }
                output += temp.getWeight() + " lbs. @ " + (temp.getPricePerPound() / 100.0) + " /lb.\n";
                String line = String.format("%-30s %-15.2f\n", name, (temp.getCost() / 100.0));
                output += line;
            }
            else if(this.dessertItems.get(i) instanceof Cookie){ // showing polymorphism using instanceof for each dessert item
                Cookie temp = (Cookie)this.dessertItems.get(i);
                String name = temp.getName();
                if(!temp.getName().equals("")){
                    name += "(Cookie)";
                }
                output += temp.getNumberOfCookies() + " @ " + (temp.getPricePerDozen() / 100.0) + " /dz.\n";
                String line = String.format("%-30s %-15.2f\n", name, (temp.getCost() / 100.0));
                output += line;
            }
            else if(this.dessertItems.get(i) instanceof IceCream){ // showing polymorphism using instanceof for each dessert item
                IceCream temp = (IceCream)this.dessertItems.get(i);
                String name = temp.getName();
                if(!temp.getName().equals("")){
                    name += "(IceCream)";
                }
                String line = String.format("%-30s %-15.2f\n", name, temp.getCost()/100);
                output += line;
            }
            else if(this.dessertItems.get(i) instanceof Sundae){ // showing polymorphism using instanceof for each dessert item
                Sundae temp = (Sundae)this.dessertItems.get(i);
                String name = temp.getName();
                String topping = temp.getToppingName();
                if(!temp.getName().equals("")){
                    name += "(Sundae)";
                    if(!temp.getToppingName().equals("")){
                        topping = temp.getToppingName() + "(Topping)";
                    }
                }
                output += String.format("%-30s\n",name+" with");
                String line = String.format("%-30s %-15.2f\n", topping, temp.getCost());
                output += line;
            }
        }
        // formating the receipt
        double taxDollars = this.totalTax() / 100.0;
        String line = String.format("\n%-30s %-15.2f\n", "Tax:", taxDollars);
        output += line;
        double costDollars = (this.totalTax() + this.totalCost()) / 100.0;
        line = String.format("%-30s %-15.2f\n", "Total Cost:", costDollars);
        output += line;

        return output;
    }

}