package view;
import javax.swing.JOptionPane;

//Importando a classe de controle do Fatorial
import controller.Controller;

public class Principal {

	public static void main(String[] args) {
		//M�todo construtor
		Controller ft = new Controller();
		//Definindo um valor para a soma
		int soma = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero desejado: "));
		//variavel que recebe o resultado
		int resultado = ft.result(soma);
		System.out.println("Resultado: "+resultado);

	}

}
