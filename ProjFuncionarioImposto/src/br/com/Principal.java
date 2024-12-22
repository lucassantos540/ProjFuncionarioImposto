package br.com;

import br.com.models.Funcionario;

import javax.swing.JOptionPane;

public class Principal {

    public static void escreve(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public static String recebe(String mensagem) {
        return JOptionPane.showInputDialog(null, mensagem);
    }

    public static boolean confirmar(String mensagem) {
        int resposta = JOptionPane.showConfirmDialog(null, mensagem, "Sair", JOptionPane.YES_NO_OPTION);
        if (resposta == 0) {
            escreve("Obrigado!");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        
        double valorImposto = 0;
        
        boolean continuar = true;
        while (continuar) {
            String opcao = recebe("Digite a opcão desejada: \n"
                    + "1 - Cadastrar Funcionario\n"
                    + "2 - Exibir\n"
                    + "3 - Calcular Imposto\n"
                    + "4 - Calcular Desconto\n"
                    + "5 - Sair");
            switch (opcao) {
                case "1":
                    func.cadastrar();
                    break;
                case "2":
                    func.exibir();
                    break;
                case "3":
                    valorImposto = func.calcularImposto(0.10);
                    break;
                case "4":
                    func.calcularDesconto(valorImposto);
                    break;
                case "5":
                    continuar = confirmar("Deseja realmente sair?");
                    break;
                default:
                    escreve("Digite uma opcão válida!");
            }
        }

    }

}
