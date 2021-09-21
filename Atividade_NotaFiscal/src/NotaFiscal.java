import javax.swing.*;

public class NotaFiscal {

    class NotaFiscal {
        String nome;
        String cpf;
        String endereço_entrega;
        int data_cadastro;
        int quantidade_total;
        double valor;
        double peso;
        boolean status_faturando;
        boolean cancelar;


        void Faturar(){
            this.status_faturando = true;
            JOptionPane.showMessageDialog(null,"Voce esta faturando");
        }

        void Cancelar(){
            this.cancelar = true;
            JOptionPane.showMessageDialog(null,"Nota foi cancelada");
        }

        void Fabricar(){
            JOptionPane.showMessageDialog(null,"Nota Cadastrada");
        }
}
