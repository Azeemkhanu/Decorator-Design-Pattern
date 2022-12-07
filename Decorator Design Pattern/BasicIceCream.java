public class BasicIceCream implements IceCream{

    public BasicIceCream() {
        System.out.println("Creating Basic Icecream...");
    }

    @Override
    public double cost() {
        return 5;
    }
}
