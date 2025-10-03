public class Alumno {
    int id;
    String nombre;
    String apellido;

    public Alumno() {
    } //constructor vacio

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    } //constructor con parametros

    public int getId() {
        return id;
    } //getters

    public void setId(int id) {
        this.id = id;
    } //setters

    public String getNombre() {
        return nombre;
    } //getters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    } //setters

    public String getApellido() {
        return apellido;
    } //getters

    public void setApellido(String apellido) {
        this.apellido = apellido;
    } //setters

    public void mostrarNombre(){
        System.out.println("Hola, mi nombre es");
    } //metodo mostrarNombre

    public void saberAprobado(double nota){
        if(nota >= 6){
            System.out.println("Aprobé la materia");
        } else {
            System.out.println("Uyy no aprobé");
        } //metodo saberAprobado
    }

}