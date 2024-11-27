package Facade.facade2;

public class Cliente {
    public static void main(String[] args) {
        Facade facade = new Facade();
<<<<<<< HEAD

        String resultadoModoCinema = facade.modoCinema();
        String resultadoModoNormal = facade.modoNormal();


    }
=======
        System.out.println("Modo Cinema");
        facade.modoCinema();

        System.out.println("Modo Normal");
        facade.modoNormal();
    }

>>>>>>> fc9cec0c05ea089bed935a52937062d2a0f233fc
}
