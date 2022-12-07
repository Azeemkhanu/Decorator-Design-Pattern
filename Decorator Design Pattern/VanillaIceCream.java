public class VanillaIceCream extends IceCreamDecorator{

    public VanillaIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding Vanilla Icecream...");
        return 10+super.cost();
    }
}
