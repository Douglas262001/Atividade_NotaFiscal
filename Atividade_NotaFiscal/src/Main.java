import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        NotaFiscal cliente = new NotaFiscal();

        cliente.nome = JOptionPane.showInputDialog("Digite seu nome");
        cliente.cpf = JOptionPane.showInputDialog("Digite seu CPF");
        cliente.endereço_entrega = JOptionPane.showInputDialog("Digite seu endereço");
        cliente.data_cadastro = Integer.parseInt(JOptionPane.showInputDialog("Digite a data de cadastro"));
        cliente.quantidade_total = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade total"));
        cliente.valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));
        cliente.peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
        cliente.status_faturando = false;
        cliente.cancelar = false;
        cliente.Faturar();
        cliente.Fabricar();
        JOptionPane.showMessageDialog(null,"Nome: " + cliente.nome + "\n" +
                "CPF: " + cliente.cpf + "\n" +
                "Endereço: " + cliente.endereço_entrega + "\n" +
                "Data: " + cliente.data_cadastro + "\n" +
                "Quantidade total: " + cliente.quantidade_total + "\n" +
                "Valor: " + cliente.valor + "\n" +
                "Peso: " + cliente.peso + "\n" +
                "Status Faturando: " + cliente.status_faturando);
        cliente.Cancelar();
    }
}
