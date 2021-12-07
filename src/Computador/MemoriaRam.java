package Computador;

public class MemoriaRam {

    private int quantidade;

    public MemoriaRam (){
        quantidade = 8;
    }
    
    public MemoriaRam(int quantidade){
       this.quantidade = quantidade;
    }
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
