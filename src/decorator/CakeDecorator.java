package decorator;

public abstract class CakeDecorator extends Cake {
    public String name;
    public abstract String getDescription();
    public abstract int cost();
}
