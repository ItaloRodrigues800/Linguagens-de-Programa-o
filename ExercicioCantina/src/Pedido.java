import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Massa massa;
    private Cliente cliente;
    private List<Ingrediente> ingredientes;

    public Pedido(Massa massa, Cliente cliente) {
        this.massa = massa;
        this.cliente = cliente;
        this.ingredientes = new ArrayList<>();
    }

    public void adicionarIngrediente(Ingrediente ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public double calcularValor() {
        double valor = massa.getValor();
        valor += ingredientes.size() * 2;
        return valor;
    }

    public String imprimirPedido() {
        String pedido = "Pedido feito para " + cliente.getNome() + "\n";
        pedido += massa.getTipo() + " com ";
        for (int i = 0; i < ingredientes.size(); i++) {
            Ingrediente ingrediente = ingredientes.get(i);
            pedido += ingrediente.getNome();
            if (i != ingredientes.size() - 1) {
                pedido += " e ";
            }
        }
        pedido += "\nValor: " + calcularValor();
        return pedido;
    }
}