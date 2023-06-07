
public class Empleado {

    private String name;
    private double nota;
    private String programar;

    public String setTarea(String tarea) {
        this.programar = "crear diseño";
        return tarea;
    }

    public double getDesempeno() {
        this.nota = 100;
        return nota;
    }

    public String getNombre(String name) {
        this.name = "juan";
        return name;
    }

    public String getNombre() {
        return null;
    }

}
