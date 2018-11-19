package decorator;

public class Cookie extends Cake {

    public Cookie(){
        description = "cookie";
    }

    public int getCategory() { return 2; }
    public int cost(){ return 10; }
}
