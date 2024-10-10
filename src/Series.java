public class Series {
    String nombre;
    String genero;
    int anio;

    public Series(String nombre, String genero, int anio) {
        this.nombre = nombre;
        this.genero = genero;
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Series() {
    }

}


