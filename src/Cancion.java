public class Cancion {
    //Atributos
    String nombre;
    String song;
    String album;
    String genero;
    int duracion;
    //Metodos
    //El metodo [constructor] debe de tener todas las clases
    public Cancion(String nombre, String song, String album, String genero, int duracion) {
        this.nombre = nombre;
        this.song = song;
        this.album = album;
        this.genero = genero;
        this.duracion = duracion;
    }
    //getters
    public String getNombre() {return nombre;}
    public String getSong() {return song;}
    public String getAlbum() {return album;}
    public String getGenero() {return genero;}
    public int getDuracion() {return duracion;}
    }

