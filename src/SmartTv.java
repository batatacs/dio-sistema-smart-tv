public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }
    
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume: " + volume);
        //volume = volume + 1;
        
    }

    public void diminuirVolume(){
        //volume = volume - 1;
        volume--;
        System.out.println("Diminuindo o volume: " + volume);
    }
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
}