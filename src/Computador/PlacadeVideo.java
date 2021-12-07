
package Computador;


public class PlacadeVideo {
    private String modelo;

    public PlacadeVideo(){
        modelo = "GTX 1650 Super";
    }
    
    public PlacadeVideo(String modelo){
        this.modelo = modelo;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
