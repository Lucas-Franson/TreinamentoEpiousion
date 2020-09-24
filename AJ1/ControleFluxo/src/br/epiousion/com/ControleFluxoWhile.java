/**
 * Classe com o objetivo de praticar a utilização de controladores de fluxo.
 * 
 * @author Globalcode
 */
package br.epiousion.com;

class ControleFluxoWhile {
  /**
   * Método para que esta classe possa ser executada com o utilitário java.
   * 
   * @param args
   *          - argumentos para o método main
   */
  public static void main(String[] args) {
    char alfabeto[] = {'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    int i = 0;

    while(alfabeto.length > i) {
      System.out.println(alfabeto[i]);
      i++;
    }

  }
}
