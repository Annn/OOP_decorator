package decorator;

public class Chocolate extends CakeDecorator {
    Cake cake;

    public Chocolate(Cake cake){
        this.cake = cake;
        name = "chocolate";
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
            cost += 10;
        else if (getCategory() == 2)
            cost += 5;
        else cost += 15;
        return cost;
    }
}
