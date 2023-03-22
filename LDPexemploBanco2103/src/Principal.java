import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        int numero;
        double saldo,limite,rendimento;
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Banco:\n<1>Conta Corrente\n<2>Conta Poupança<3>Sair"));

        switch (opcao){
            case 1:
                numero=Integer.parseInt(JOptionPane.showInputDialog("Número da conta: "));
                saldo=Double.parseDouble(JOptionPane.showInputDialog("Saldo: "));
                limite=Double.parseDouble(JOptionPane.showInputDialog("Limite: "));
                ContaCorrente cc1 = new ContaCorrente(numero,saldo,limite);
                JOptionPane.showMessageDialog(null,"Saldo:"+cc1.getSaldo()+"\nSaldo com o limite: " +cc1.consultaSaldoTotal(),"Conta Corrente",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                numero=Integer.parseInt(JOptionPane.showInputDialog("Número da conta: "));
                saldo=Double.parseDouble(JOptionPane.showInputDialog("Saldo: "));
                rendimento=Double.parseDouble(JOptionPane.showInputDialog("Rendimento: "));
                ContaPoupanca cp1 = new ContaPoupanca(numero,saldo,rendimento);
                cp1.atualizaRendimento();
                JOptionPane.showMessageDialog(null,"Saldo:"+cp1.getSaldo(),"Conta Poupança",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                break;
            default:
                JOptionPane.showMessageDialog(null,"Escolha Inválida","Erro",JOptionPane.ERROR_MESSAGE);
        }
    }
}
