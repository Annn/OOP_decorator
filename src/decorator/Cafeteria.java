package decorator;

public class Cafeteria {
    public static void main(String[] args) {
        Cake cake = new Cookie();
        System.out.println(cake.getDescription() + " costs " + cake.cost() + "$");

        cake = new Chocolate(cake);
        System.out.println(cake.getDescription() + " costs " + cake.cost() + "$");
        cake = new Cream(cake);
        System.out.println(cake.getDescription() + " costs " + cake.cost() + "$");
        System.out.println();

        Cake cake2 = new DoubleCookie();
        System.out.println(cake2.getDescription() + " costs " + cake2.cost() + "$");

        cake2 = new Chocolate(cake2);
        System.out.println(cake2.getDescription() + " costs " + cake2.cost() + "$");
        cake2 = new Cream(cake2);
        System.out.println(cake2.getDescription() + " costs " + cake2.cost() + "$");
        System.out.println();

        Cake cake3 = new BirthdayCake();
        System.out.println(cake3.getDescription() + " costs " + cake3.cost() + "$");
        cake3 = new Chocolate(cake3);
        System.out.println(cake3.getDescription() + " costs " + cake3.cost() + "$");
        cake3 = new Cream(cake3);
        System.out.println(cake3.getDescription() + " costs " + cake3.cost() + "$");
        System.out.println();

    }
}
