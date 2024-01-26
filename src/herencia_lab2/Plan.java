package herencia_lab2;
/**
 *
 * @author jomel
 */
public abstract class Plan {
    private int telefono;
    private String cliente;
    
    public Plan(int telefono, String cliente){
        this.telefono = telefono;
        this.cliente = cliente;
    }
    
    public String imprimir() {
        return "Número teléfono: " + telefono + "\nNombre de Cliente: " + cliente;
    }
    
    public abstract double pagoMensual(int mins, int mssgs);

    public int getTelefono() {
        return telefono;
    }

    public String getCliente() {
        return cliente;
    }
    
    
}
