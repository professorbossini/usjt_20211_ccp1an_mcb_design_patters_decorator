public class Milk extends CondimentDecorator{
  
  public Milk (Beverage beverage){
    super(beverage);
  }
  @Override
  public double cost() {
    return 2.49 + beverage.cost();
  }
}
