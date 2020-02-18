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

    public void setNumberOfCookies(int numberOfCookies) {
        this.numberOfCookies = numberOfCookies;
    }

    public int getNumberOfCookies() {
        return numberOfCookies;
    }

    public void setPricePerDozen(int pricePerDozen) {
        this.pricePerDozen = pricePerDozen;
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