public class Main {
    public static void main(String[] args) {
        IceCream basicIceCream=new BasicIceCream();
        System.out.println("Basic Icecream cost is $"+basicIceCream.cost());

        //Adding Vanilla 
        IceCream vanilla=new VanillaIceCream(basicIceCream);
        System.out.println("Adding Vanilla - cost is $"+vanilla.cost());

        IceCream chocolate=new ChocolateIcecream(basicIceCream);
        System.out.println("Adding chocolate - cost is $"+chocolate.cost());
    }
}
