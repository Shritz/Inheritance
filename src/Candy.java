public class Candy extends DessertItem {

    private double weight;
    private int pricePerPound;

    public Candy (String name, double weight, int pricePerPound) {
        super(name);
        this.weight = weight;
        this.pricePerPound = pricePerPound;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public double getCost() {
        return Math.round(this.pricePerPound * this.weight);
    }

    public double getWeight() {
        return weight;
    }

    public int getPricePerPound() {
        return pricePerPound;
    }

    public void setPricePerPound(int pricePerPound) {
        this.pricePerPound = pricePerPound;
    }

    public String toString(){
        String name = this.getName();
        if(!this.getName().equals("")){
            name += "(Candy)";
        }
        String output = this.getWeight() + " lbs. @ " + (this.getPricePerPound() / 100.0) + " /lb.\n";
        String line = String.format("%-30s %-15.2f\n", name, (this.getCost() / 100.0));
        output += line;
        if(this.getCalories() != 0){
            output += "\n" + name + " calories:" + this.getCalories() + "\n";
        }
        return output;
    }

}