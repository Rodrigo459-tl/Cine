public class Usuarios {

    //ATRIBUTOS
    protected int id;
    protected static String nombreCompleto;
    protected String fechaNacimiento;
    protected String direccion;
    protected String Telefono;
    protected String email;

    //constructores
    public Usuarios(){

    }
    public Usuarios(int id, String nombreCompleto,String fechaNacimiento, String direccion, String Telefono, String email){
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.Telefono = Telefono;
        this.email = email;
    }

    //GETTERS AND SETTERS
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getTelefono() {
        return Telefono;
    }
    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    //to String
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}