package br.com.models;

import javax.swing.JOptionPane;

public class Funcionario {
    
    public void escreve(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    public String recebe(String mensagem){
        return JOptionPane.showInputDialog(null, mensagem);
    }
    
    private String nome;
    private int registro;
    private double salario;
    private int idade;
    
    public void cadastrar(){
        this.nome = recebe("Digite o nome do funcionario: ");
        this.registro = Integer.parseInt(recebe("Digite o registro do funcionario: "));
        this.salario = Double.parseDouble(recebe("Digite o salário do funcionario: "));
        this.idade = Integer.parseInt(recebe("Digite o idade do funcionario: "));
    }
    
    public void exibir(){
        escreve("\nNome: "+this.nome+""+"\nRegistro: "+this.registro+""+"\nSalário: "+this.salario+""+"\nIdade: "+this.idade);
    }
    
    public double calcularImposto(double percImp){
        escreve("Imposto Calculado!");
        return this.salario * percImp;
    }
    
    public void calcularDesconto(double valorImp){
        if(this.idade >= 60){
            escreve(
            "O funcionario tem desconto de 50%\n"
            + "Valor sem desconto: "+ valorImp + "\n"
            + "Valor com 50% de desconto: "+ valorImp*0.5);
        } else {
            escreve(
            "O funcionario não tem direito a desconto no imposto.\n"
            + "Valor sem desconto: " + valorImp);
        }
    }
    
}
