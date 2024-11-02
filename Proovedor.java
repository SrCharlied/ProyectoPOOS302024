public class Proovedor {
    private String nombre;
    private String dpi;
    private String categoria;
    private String servicio;
    private String ubicacion;


    public Proovedor(String nombre, String dpi, String categoria, String servicio, String ubicacion) {
        this.nombre = nombre;
        this.dpi = dpi;
        this.categoria = categoria;
        this.servicio = servicio;
        this.ubicacion = ubicacion;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDpi() {
        return dpi;
    }
    public void setDpi(String dpi) {
        this.dpi = dpi;
    }
    public String getServicio() {
        return servicio;
    }
    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }


    public String getCategoria() {
        return categoria;
    }


    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
}