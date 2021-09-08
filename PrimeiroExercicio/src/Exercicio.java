import javax.swing.JOptionPane;

public class Exercicio {
    public static void main(String[] args) throws Exception {

        String nome;
        String modelo;
        float tamanho;
        Double preco;
        Integer quantidade;

        nome = JOptionPane.showInputDialog(null, "Informe o nome do produto: ", "Nome", JOptionPane.QUESTION_MESSAGE);
        modelo = JOptionPane.showInputDialog(null, "Informe o modelo do produto: ", "Modelo",
                JOptionPane.QUESTION_MESSAGE);
        String temp = JOptionPane.showInputDialog(null, "Informe oo tamanho do produto: ", "Tamanho",
                JOptionPane.QUESTION_MESSAGE);
        tamanho = Float.parseFloat(temp);
        temp = JOptionPane.showInputDialog(null, "Informe o o preço do produto: ", "Preço", JOptionPane.QUESTION_MESSAGE);
        preco = Double.parseDouble(temp);
        temp = JOptionPane.showInputDialog(null, "Informe o a quantidade do produto: ", "Quantidade",
                JOptionPane.QUESTION_MESSAGE);
        quantidade = Integer.parseInt(temp);

        // Imprimir dados
        JOptionPane.showMessageDialog(null, "Nome do produto: " + nome, "Nome", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Modelo do produto: " + modelo, "Modelo do Produto", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Tamanho do produto: " + tamanho, "Tamanho do Produto",
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Preço do produto: " + preco, "Preço", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Quantidade do produto: " + quantidade, "Quantidade",
                JOptionPane.INFORMATION_MESSAGE);

        
              

    }
}
