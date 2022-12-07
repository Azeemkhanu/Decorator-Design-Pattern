public class MintIceCream extends IceCreamDecorator{

    public MintIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding Mint Icecream...");
        return 10+super.cost();
    }
}
