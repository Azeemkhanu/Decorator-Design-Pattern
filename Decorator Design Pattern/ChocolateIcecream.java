public class ChocolateIcecream extends IceCreamDecorator{

    public ChocolateIcecream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding chocolate Icecream...");
        return 4+super.cost();
    }
}
