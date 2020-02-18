public class IceCream extends DessertItem {

    private double cost;

    public IceCream(String name, double cost) {
        super(name);
        this.cost = cost;
    }

    @Override
    public double getCost() {
        return cost*100;
    }

    public String toString(){
        String name = this.getName();
        if(!this.getName().equals("")){
            name += "(IceCream)";
        }
        String output = "";
        String line = String.format("%-30s %-15.2f\n", name, this.getCost()/100);
        output += line;
        if(this.getCalories() != 0){
            output += "\n" + name + " calories:" + this.getCalories() + "\n";
        }
        return output;
    }

}