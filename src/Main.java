public class Main {
    public static void main(String[] args) {

        //Crear un objeto con la clase persona, usar get y set, imprimir por pantalla.
        Persona persona = new Persona();

        persona.setNombre("Charlotte");
        persona.setEdad("26");
        persona.setTelefono("300000001");

        System.out.println("Nombre" +": "+ persona.getNombre());
        System.out.println("Edad" +": "+ persona.getEdad());
        System.out.println("Teléfono" +": "+ persona.getTelefono());
    }


}
//Crear clase Persona con variables y sus set y get
class Persona
{
    private String nombre;
    private String edad;
    private String telefono;

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public String getNombre()
    {
       return this.nombre;
    }

    public void setEdad(String edad)
    {
        this.edad = edad;
    }
    public String getEdad()
    {
      return this.edad;
    }

    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }
    public String getTelefono()
    {
        return this.telefono;
    }

}