
package Computador;


public class Composicao {
    public static void main(String[] args) {
         Computador pc1 = new Computador();
         Computador pc2 = new Computador(500,4,"RTX 2080",4);
         
         pc1.ImprimirDadosPc1();
         pc2.ImprimirDadosPc2();
    }
    
}
