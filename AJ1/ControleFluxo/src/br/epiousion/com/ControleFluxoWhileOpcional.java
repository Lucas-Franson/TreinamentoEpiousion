/**
 * Classe com o objetivo de praticar a utilização de controladores de fluxo.
 * 
 * @author Globalcode
 */
package br.epiousion.com;

class ControleFluxoWhileOpcional {
  /**
   * Método para que esta classe possa ser executada com o utilitário java.
   * 
   * @param args
   *          - argumentos para o método main
   */
  public static void main(String[] args) {
	int limiteInferior = 14;
	int limiteSuperior = 1578;
	int numerosDiv6 = 0;

	int index = limiteInferior;

	while(index <= limiteSuperior) {
		if((index % 6) == 0) {
			numerosDiv6++;
		}
		index++;
	}

	String texto = "Quantidade de numeros divisiveis por 6 entre ";
	System.out.println(texto + limiteInferior + " e " + limiteSuperior
	    + " é : " + numerosDiv6);
  }
}
