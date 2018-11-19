package decorator;

public class Cream extends CakeDecorator {
    Cake cake;

    public Cream(Cake cake){
        this.cake = cake;
        name = "cream";
    }

    public int getCategory() {
        return cake.getCategory();
    }

    @Override
    public String getDescription(){
        return cake.getDescription() + " decorated with " + name;
    }

    @Override
    public int cost() {
        int cost = cake.cost();
        if (getCategory() == 1)
            cost += 12;
        else  if (getCategory() == 2)
            cost += 6;
        else cost += 20;
        return cost;
    }
}
