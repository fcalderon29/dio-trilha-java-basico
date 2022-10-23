public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTV = new SmartTV();
        smartTV.smartLigada();
        smartTV.mudarCanal(50);
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        
                System.out.println("TV Ligada? = " + smartTV.ligada);
                System.out.println("Canal atual? = " + smartTV.canal);
                System.out.println("Volume atual? = " + smartTV.volume);
                
                System.out.println("Novo status -> TV Ligada? = " + smartTV.ligada);

    }
}
