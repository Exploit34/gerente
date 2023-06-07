public class Gerenteejemplo {
    private String nombre;
    private int edad;
    private int posicion;
    private String decision;

    public Gerenteejemplo(String nombre, int edad, int posicion,String decision) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
        this.decision = decision;
    }

    public void asignarTarea(Empleado empleado, String tarea) {
        empleado.setTarea(tarea);
    }

    public String Decision(String decision) {
        String pull = Decision("reunion de proyecto");
        System.out.println("Se ha tomado la siguiente decisión: " + decision);
        return pull;

    }

    public void Desempeno(Empleado empleado) {
        double desempeno = empleado.getDesempeno();
        if (desempeno >= 100) {
            System.out.println("El empleado " + empleado.getNombre(nombre) + " tiene un buen desempeño.");
        } else if (desempeno >= 50) {
            System.out.println("El empleado " + empleado.getNombre(nombre) + " tiene un desempeño promedio.");
        } else {
            System.out.println("El empleado " + empleado.getNombre(nombre) + " necesita mejorar su desempeño.");
        }
    }
}

