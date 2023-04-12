import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Cantina {
    public static void main(String[] args) {


        String nomeCliente = JOptionPane.showInputDialog("Informe o nome do cliente:");
        Cliente cliente = new Cliente(nomeCliente);


        String tipoMassa = JOptionPane.showInputDialog("Informe o nome da massa:");
        double valorMassa = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da massa:"));
        Massa massa = new Massa(tipoMassa, valorMassa);


        ArrayList<Ingrediente> ingredientes = new ArrayList<>();
        int opcao = 0;
        while (opcao != 5) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe os ingredientes escolhidos:\n"
                    + "1-Bacon\n"
                    + "2-Mussarela\n"
                    + "3-Tomate\n"
                    + "4-Queijo\n"
                    + "5-Sair"));
            switch (opcao) {
                case 1:
                    ingredientes.add(new Ingrediente("Bacon", 2.0));
                    break;
                case 2:
                    ingredientes.add(new Ingrediente("Mussarela", 2.0));
                    break;
                case 3:
                    ingredientes.add(new Ingrediente("Tomate", 2.0));
                    break;
                case 4:
                    ingredientes.add(new Ingrediente("Queijo", 2.0));
                    break;
            }
        }

        Pedido pedido = new Pedido(massa, cliente, ingredientes);

        JOptionPane.showMessageDialog(null, "Pedido feito para " + pedido.getCliente().getNome() + "\n"
                + pedido.getMassa().getTipo() + " com " + pedido.getIngredientes() + "\n"
                + "Valor: " + pedido.calcularValor());
    }
}