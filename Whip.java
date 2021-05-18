public class Whip extends CondimentDecorator{
  
  public Whip (Beverage beverage){
    super (beverage);
  }
  @Override
  public double cost() {
    return 1.49 + beverage.cost();
  }
}
