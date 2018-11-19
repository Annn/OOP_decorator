package decorator;

public abstract class Cake {
    String description = "cake";

    public String getDescription() {
        return description;
    }
    public int getCategory() { return 0; }
    public void setCategory() {}

    public abstract int cost();
}
