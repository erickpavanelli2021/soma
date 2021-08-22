package controller;

public class Controller {

	public Controller() {
		super();
		}
		
		public int result(int soma) {
			//Condicao de parada =  0 se o result for 0, devera retornar 0
		 if (soma == 0) {
	      return 0;	
	      //Caso seja diferente de 0, devera somar soma + (soma - 1)
		 }else {
			 
			 return soma + result(soma - 1);
		 }
		 
	}
	}