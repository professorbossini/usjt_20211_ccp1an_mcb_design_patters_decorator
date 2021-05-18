import javax.swing.JOptionPane;

public class Cafeteria {
  public static void main(String[] args) {
    int opBebida;
    opBebida = Integer.parseInt(JOptionPane.showInputDialog("1-HouseBlend\n2-Espresso\n"));

    Beverage bebida;
    if (opBebida == 1)
      bebida = new HouseBlend();
    else
      bebida = new Espresso();

    int opAdicional;
    do{
      opAdicional = Integer.parseInt(JOptionPane.showInputDialog("1-Whip\n2-Milk\n0-Sair"));
      if (opAdicional == 1)
        bebida = new Whip(bebida);
      else if (opAdicional == 2)
        bebida = new Milk (bebida);

    } while (opAdicional != 0);
    JOptionPane.showMessageDialog(null, (bebida.cost()));
  }
}
