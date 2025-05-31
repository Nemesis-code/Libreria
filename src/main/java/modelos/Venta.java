/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mynor
 */
public class Venta implements Serializable {
   private static final long serialVersionUID = 1L;

    public int id;
    public String comprador;
    public String nit;
    public String direccion;
    public double total;
    public double totalSinIVA;
    public Usuario usuarioVendedor;
    public Date fecha;
    public ArrayList<LibroVenta> librosVendidos = new ArrayList<>();//pueden venderse múltiples libros al mismo cliente, no solo uno. Por eso se agrega este atributo:
    public Cupon cuponAplicado;

    public void calcularTotales() {
        double suma = 0;

        //Suma los subtotales de todos los libros vendidos
        for (LibroVenta lv : librosVendidos) {
            suma += lv.getSubtotal();
        }

        // Aplica el cupón de descuento si existe
        if (cuponAplicado != null) {
            if (cuponAplicado.tipo.equalsIgnoreCase("porcentaje")) {
                suma -= (suma * (cuponAplicado.monto / 100));
            } else if (cuponAplicado.tipo.equalsIgnoreCase("monto")) {
                suma -= cuponAplicado.monto;
            }
        }

        //Total ya con descuento aplicado
        total = suma;

        //IVA se calcula como el 12% del total
        double iva = total * 0.12;

        //Total sin IVA = total - IVA
        totalSinIVA = total - iva;

    }
}
