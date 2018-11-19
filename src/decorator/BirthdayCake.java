package decorator;

public class BirthdayCake extends Cake {

    public BirthdayCake(){
        description = "birthday cake";
    }

    public int getCategory() { return 3; }
    public int cost() { return 50; }
}
