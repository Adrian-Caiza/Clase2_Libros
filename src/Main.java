
/**
 * Hello World Application
 * Our first example
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Libro libro1= new Libro("El resplandor",  "Stephen King", "De bolsillo", 600);
        Libro libro2=new Libro("Polvo y ceniza","Eliecer Cardenas","Antares", 232);
        Libro libro3=new Libro("El cuaderno de Maya","Isabel Allende","Casa Libro", 448);
        Libro libro4= new Libro("El Lobo Estepario","Hermann Hesse", "Lejandria",269);
        Libro libro5= new Libro("El amor en los tiempos del cólera","Gabriel García Márquez","Vintage",368);

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

    }
}
