public class Usuario {
    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV();

        System.out.println("Canal Atual ?" + smartTV.canal);
        System.out.println("Volume Atual ? " + smartTV.volume);

        smartTV.ligar ();
        System.out.println(" Novo Status - TV Ligada ? " + smartTV.ligada);
//se eu quiser deligar, chamar metodo desligar

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();
        System.out.println("Novo Volume" + smartTV.volume);

        smartTV.mudarCanal(14);
        System.out.println("Novo Canal " + smartTV.canal);
        smartTV.aumentarCanal();
        System.out.println("New Cana " + smartTV.canal);

    }
}
