public class Persona {
    private int id;
    private String nombre;
    private String tel;
    private String email;
    private static int numeroPersonas = 0;

    //Constructor vacío
    public Persona(){
        this.id = ++Persona.numeroPersonas;
    }

    //Constructor con argumentos
    public Persona(String nombre, String tel, String email){
        this(); //Se manda a llamar el constructor vacío
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;
    }

    // Getter y Setter

    //ID
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    //Telefono
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    //Email
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email=email;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan Perez", "8184592356", "Correo@gmail.com");
        System.out.println(persona1);
    }
}
