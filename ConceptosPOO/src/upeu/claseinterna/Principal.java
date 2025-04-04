package upeu.claseinterna;

public class Principal {
    public static void main(String[] args) {
        Madre madre = new Madre();
        madre.nombre="Deissy";
        madre.edad=40;
        madre.peso=70;
        madre.apellido="Torres";

        Madre.Hijo hijo = madre.new Hijo();
        hijo.nombre="Raul";
        hijo.apellido=madre.apellido;
        hijo.peso=4;

        System.out.println("Madre Gestante");
        System.out.println("Nombre: " + madre.nombre+"\nApellido: " +
                madre.apellido+"\nPeso: " + madre.peso);
        
        System.out.println("Madre con hijo");
        System.out.println("Nombre: " + madre.nombre+"\nApellido: " +
                madre.apellido+"\nPeso: " + (madre.peso- hijo.peso));

        
        System.out.println("Datos del hijo");
        System.out.println("Nombre: " + hijo.nombre+"\nApellido: " +
                madre.apellido+"\nPeso: " +hijo.peso);
    }
}
