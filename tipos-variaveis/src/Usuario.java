public class Usuario {
    public static void main(String[] args) throws Exception{
        SmartTv smartTv = new SmartTv();
        System.out.println("TV Esta ligada " + smartTv.ligada);
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println("Canal atua: " + smartTv.canal);

        smartTv.ligar();
         System.out.println("Novo status - TV Esta ligada " + smartTv.ligada);

         smartTv.desligar();
         System.out.println("Novo status - TV Esta ligada " + smartTv.ligada);

         smartTv.aumentarVolume ();
         System.out.println("Volume atual: " + smartTv.volume);
        
         smartTv.diminuirVolume();
         System.out.println("Volume atual: " + smartTv.volume);
         
         smartTv.aumentarCanal();
         System.out.println("Canal atual: " + smartTv.canal);
         
         smartTv.aumentarCanal();
         System.out.println("Canal atual: " + smartTv.canal);

         smartTv.diminuirCanal();
         System.out.println("Canal atual: " + smartTv.canal);

         



        
    }
}
