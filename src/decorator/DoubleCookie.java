package decorator;

public class DoubleCookie extends Cake {

    public DoubleCookie(){
        description = "double cookie";
    }
    public int getCategory(){ return 1; }
    public int cost(){ return 15; }
}
