
package Computador;


public class Computador {
    private Hd hd;
    private MemoriaRam memoriaram;
    private PlacadeVideo placadevideo;
    private Processador processador;
        
    public Computador (){
        hd = new Hd();
        memoriaram = new MemoriaRam();
        placadevideo = new PlacadeVideo();
        processador = new Processador();
    }
    
    public Computador (int tamanho, int quantidade,String modelo, int nucleos){
        hd = new Hd(tamanho);
        memoriaram = new MemoriaRam(quantidade);
        placadevideo = new PlacadeVideo(modelo);
        processador = new Processador(nucleos);
        
    }
    
   void ImprimirDadosPc1(){
       System.out.println("---Pc1---");
       System.out.println("Memoria Ram: "+memoriaram.getQuantidade()+"GB");
       System.out.println("Hd: "+hd.getTamanho()+"GB");
       System.out.println("Processador: "+processador.getNucleos());
       System.out.println("placa de Video: "+placadevideo.getModelo());
   }
   
   void ImprimirDadosPc2(){
       System.out.println("---Pc2---");
       System.out.println("Memoria Ram: "+memoriaram.getQuantidade()+"GB");
       System.out.println("Hd: "+hd.getTamanho()+"GB");
       System.out.println("Processador: "+processador.getNucleos());
       System.out.println("placa de Video: "+placadevideo.getModelo());
   }

    public Hd getHd() {
        return hd;
    }

    public void setHd(Hd hd) {
        this.hd = hd;
    }

    public MemoriaRam getMemoriaram() {
        return memoriaram;
    }

    public void setMemoriaram(MemoriaRam memoriaram) {
        this.memoriaram = memoriaram;
    }

    public PlacadeVideo getPlacadevideo() {
        return placadevideo;
    }

    public void setPlacadevideo(PlacadeVideo placadevideo) {
        this.placadevideo = placadevideo;
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }
    
    }

