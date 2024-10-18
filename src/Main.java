import Movilidad.Auto;
import Movilidad.Transporte;
import Musica.Cancion;
import Musica.Instrumento_musical;
import Otros.Libro;
import Otros.Materia;
import Otros.Persona;
import Otros.Zapato;
import TV.Pelicula;
import TV.Series;
import TV.Videojuegos;

// Deber clases y objetos
public class Main {
    public static void main(String[] args) {
        System.out.println("  DEBER CLASES Y OBJETOS     ");

        Libro libro1 = new Libro("El resplandor", "Stephen King", "De bolsillo", 600);
        Libro libro2 = new Libro("Polvo y ceniza", "Eliecer Cardenas", "Antares", 232);
        Libro libro3 = new Libro("El cuaderno de Maya", "Isabel Allende", "Casa Otros.Libro", 448);
        Libro libro4 = new Libro("El Lobo Estepario", "Hermann Hesse", "Lejandria", 269);
        Libro libro5 = new Libro("El amor en los tiempos del cólera", "Gabriel García Márquez", "Vintage", 368);
        System.out.println("     LIBROS  ");
        libro1.imprimir();
        libro2.imprimir();
        libro3.imprimir();
        libro4.imprimir();
        libro5.imprimir();
        System.out.println();

        Auto auto1 = new Auto("Toyota","sedan","rojo",201.43f,true);
        Auto auto2 = new Auto("Chevrolet","sedan","negro",302.49f,false);
        System.out.println("    AUTOS    ");
        auto1.imprimir_auto();
        auto2.imprimir_auto();
        System.out.println();

        Videojuegos juego1= new Videojuegos("Call of Duty: Black Ops 5","accion","Activision","PS5",2024);
        Videojuegos juego2= new Videojuegos("Clash Royale", "Estrategia","Supercel","Celular",2015);
        System.out.println("    VIDEOJUEGOS   ");
        juego1.imprimir_videojuegos();
        juego2.imprimir_videojuegos();
        System.out.println();

        Cancion cancion1 = new Cancion("Michael Jackson","Thriller","Thriller","pop",5);
        Cancion cancion2 = new Cancion("Freddie Mercury","I was Born to love you","Mr. Bad guy","Rock",4);
        System.out.println("    CANCIONES   ");
        cancion1.imprimir_cancion();
        cancion2.imprimir_cancion();
        System.out.println();

        Instrumento_musical intrumento1 = new Instrumento_musical("guitarra","acustica",250,2017,1726382);
        Instrumento_musical intrumento2 = new Instrumento_musical("piano","electrico",2150,2022,927352);
        System.out.println("    INSTRUMENTOS   ");
        intrumento1.imprimir_instrumento();
        intrumento2.imprimir_instrumento();
        System.out.println();

        Materia materia1 = new Materia("Base de datos","TDS2782",5,28,true);
        Materia materia2 = new Materia("Programacion","TDS9728",3,12,false);
        System.out.println("    MATERIAS   ");
        materia1.imprimir_materia();
        materia2.imprimir_materia();
        System.out.println();

        Pelicula pelicula1 = new Pelicula("El Padrino","Drama, crimen","Coppola F.",1972,5);
        Pelicula pelicula2 = new Pelicula("Scarface","Drama, crimen","Brian De Palma",1983,4.8f);
        System.out.println("    PELICULAS   ");
        pelicula1.imprimir_pelicula();
        pelicula2.imprimir_pelicula();
        System.out.println();

        Persona persona1 = new Persona("Jhonny Villanueva","masculino","jhonny.villanueva@epn.edu.ec",28,1.68f);
        Persona persona2 = new Persona("Erick Nuñez","masculino","erick.nuñez@epn.edu.ec",20,1.68f);
        System.out.println("    PERSONAS   ");
        persona1.imprimir_persona();
        persona2.imprimir_persona();
        System.out.println();

        Series serie1 = new Series("Breaking Bad","Crimen,drama","Netflix",62,2008);
        Series serie2 = new Series("Peaky Blinders","Drama historico","BBC",36,2013);
        System.out.println("    SERIES   ");
        serie1.imprimir_serie();
        serie2.imprimir_serie();
        System.out.println();

        Transporte transporte1 = new Transporte("automovil","Toyota",5,13256,2);
        Transporte transporte2 = new Transporte("avion","Boeing",162,702352,300);
        System.out.println("    TRANSPORTES   ");
        transporte1.imprimir_transporte();
        transporte2.imprimir_transporte();
        System.out.println();

        Zapato zapato1 = new Zapato("Nike","blanco/rojo","running",40,150);
        Zapato zapato2 = new Zapato("Allen Edmonds","negro","formales",38,180);
        System.out.println("   CALZADO   ");
        zapato1.imprimir_zapato();
        zapato2.imprimir_zapato();
        System.out.println();

    }
}

