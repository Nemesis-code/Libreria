
package modelos;

import java.io.Serializable;
import java.util.Date;


public class Cupon implements Serializable{
    private static final long serialVersionUID = 1L;
    public String codigo;
    public double monto;
    public String tipo;
    public Date fechaVencimiento;
}
