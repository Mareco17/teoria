public class Main {
    public static void main(String[] args) {

        Alumno alu1 = new Alumno (); //llamada al constructor vacio
        Alumno alu2 = new Alumno (2, "Juan", "Perez"); //llamada al constructor con parametros

        System.out.println("El id del alumno 2 es: " + alu2.getId()); //getters
        System.out.println("El nombre del alumno 2 es: " + alu2.getNombre()); //getters
        System.out.println("El apellido del alumno 2 es: " + alu2.getApellido()); //getters


        alu1.setId(1); //llamada a los setters y le pasamos el parámetro id
        alu1.setNombre("Ana"); //llamada a los setters y le pasamos el parámetro nombre
        alu1.setApellido("Gomez"); //llamada a los setters y le pasamos el parámetro apellido

        System.out.println("------------------");
        System.out.println("El id del alumno 1 es: " + alu1.getId()); //getters
        System.out.println("El nombre del alumno 1 es: " + alu1.getNombre()); //getters
        System.out.println("El apellido del alumno 1 es: " + alu1.getApellido()); //getters

        alu2.setId(3); //modificamos el id del alumno 2 usando el setter

        System.out.println("------------------");
        System.out.println("El id del alumno 2 es: " + alu2.getId());
    }
}
