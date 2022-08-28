package EdSoftwareServicios.appMisionTIC;

public class Empresa {
    private String nombre;
    private String direccion;
    private long telefono;
    private int nit;

    public Empresa(String nombre, String direccion, long telefono, int nit){
        this.setNombre(nombre);
        this.setDireccion(direccion);
        this.setTelefono(telefono);
        this.setNit(nit);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }
}
