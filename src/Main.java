
/**
 * Hello World Application
 * Our first example
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Clase 2");
        /*
        Libro libro1 = new Libro("El resplandor", "Stephen King", "De bolsillo", 600);
        Libro libro2 = new Libro("Polvo y ceniza", "Eliecer Cardenas", "Antares", 232);
        Libro libro3 = new Libro("El cuaderno de Maya", "Isabel Allende", "Casa Libro", 448);
        Libro libro4 = new Libro("El Lobo Estepario", "Hermann Hesse", "Lejandria", 269);
        Libro libro5 = new Libro("El amor en los tiempos del cólera", "Gabriel García Márquez", "Vintage", 368);

        libro1.imprimir();
        System.out.println(libro1.imprimircubierta());
        libro2.imprimir();
        System.out.println(libro2.imprimircubierta());
        libro3.imprimir();
        System.out.println(libro3.imprimircubierta());
        libro4.imprimir();
        System.out.println(libro4.imprimircubierta());
        libro5.imprimir();
        System.out.println(libro5.imprimircubierta());
         */
        Videojuegos juego1= new Videojuegos("Call of Duty: Black Ops 5","accion","Activision","PS5",2024);
        Videojuegos juego2= new Videojuegos("Clash Royale", "Estrategia","Spercel","Celular",2015);
        System.out.println(juego1.getNombre());
        System.out.println(juego1.getCategoria());

        System.out.println(juego1.getPlataforma());
        juego1.setPlataforma("ps4");
        System.out.println(juego1.getPlataforma());

        System.out.println(juego1.getDesarrolladores());
        System.out.println(juego1.getLanzamiento());




    }
}

