package Facade.facade2;

public class Cliente {
    public static void main(String[] args) {
        Facade facade = new Facade();

        String resultadoModoCinema = facade.modoCinema();
        String resultadoModoNormal = facade.modoNormal();


    }

}
