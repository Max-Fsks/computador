
package Computador;


public class Hd {
    private int tamanho;

    public Hd (){
        tamanho = 1024;
    }
    
    public Hd (int tamanho){
        this.tamanho = tamanho;
    }
    
    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    
}
