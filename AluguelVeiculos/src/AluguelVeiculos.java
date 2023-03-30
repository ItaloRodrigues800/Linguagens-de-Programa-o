import java.awt.GridLayout;
import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

public class AluguelVeiculos {
    public static void main(String[] args) {
        // Criação das máscaras para os campos
        MaskFormatter mascaraCpf = null;
        MaskFormatter mascaraTelefone = null;
        MaskFormatter mascaraPlaca = null;
        MaskFormatter mascaraAno = null;
        MaskFormatter mascaraData = null;
        try {
            mascaraCpf = new MaskFormatter("###.###.###-##");
            mascaraTelefone = new MaskFormatter("(##) #####-####");
            mascaraPlaca = new MaskFormatter("UUU-####");
            mascaraAno = new MaskFormatter("####");
            mascaraData = new MaskFormatter("##/##/####");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Criação dos campos de entrada com as máscaras aplicadas
        JFormattedTextField campoCpf = new JFormattedTextField(mascaraCpf);
        JFormattedTextField campoTelefone = new JFormattedTextField(mascaraTelefone);
        JFormattedTextField campoPlaca = new JFormattedTextField(mascaraPlaca);
        JFormattedTextField campoAno = new JFormattedTextField(mascaraAno);
        JFormattedTextField campoDataLocacao = new JFormattedTextField(mascaraData);
        JFormattedTextField campoDataEntrega = new JFormattedTextField(mascaraData);

        // Criação dos rótulos para os campos
        JLabel rotuloCpf = new JLabel("CPF:");
        JLabel rotuloTelefone = new JLabel("Telefone:");
        JLabel rotuloPlaca = new JLabel("Placa do veículo:");
        JLabel rotuloAno = new JLabel("Ano do veículo:");
        JLabel rotuloDataLocacao = new JLabel("Data de locação:");
        JLabel rotuloDataEntrega = new JLabel("Data de entrega:");

        // Criação do painel de entrada com os campos e rótulos
        JPanel painelEntrada = new JPanel(new GridLayout(6, 2));
        painelEntrada.add(rotuloCpf);
        painelEntrada.add(campoCpf);
        painelEntrada.add(rotuloTelefone);
        painelEntrada.add(campoTelefone);
        painelEntrada.add(rotuloPlaca);
        painelEntrada.add(campoPlaca);
        painelEntrada.add(rotuloAno);
        painelEntrada.add(campoAno);
        painelEntrada.add(rotuloDataLocacao);
        painelEntrada.add(campoDataLocacao);
        painelEntrada.add(rotuloDataEntrega);
        painelEntrada.add(campoDataEntrega);

        // Exibe a janela para preenchimento dos dados do aluguel
        int opcao = JOptionPane.showConfirmDialog(null, painelEntrada, "Aluguel de veículos", JOptionPane.OK_CANCEL_OPTION);
        if (opcao == JOptionPane.OK_OPTION) {
            // Exibe os dados do aluguel em uma mensagem do JOptionPane
            JOptionPane.showMessageDialog(null,
                    "Dados do aluguel:"
                            + "\nCPF: " + campoCpf.getText()
                            + "\nTelefone: " + campoTelefone.getText()
                            + "\nPlaca do veículo: " + campoPlaca.getText()
                            + "\
                "Ano do veículo: " + campoAno.getText()
                    + "\nData de locação: " + campoDataLocacao.getText()
                    + "\nData de entrega: " + campoDataEntrega.getText(),
                    "Aluguel de veículos",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }