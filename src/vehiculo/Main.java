
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoGiacoiaTrombottiAndrea2223 miVehiculoGiacoiaTrombottiAndrea2223;
        int stockActual;
        
        miVehiculoGiacoiaTrombottiAndrea2223 = new VehiculoGiacoiaTrombottiAndrea2223("Seat",18000,100);
        
        operativaVehiculosGiacoiaTrombottiAndrea2223(miVehiculoGiacoiaTrombottiAndrea2223, 50); 
        stockActual = miVehiculoGiacoiaTrombottiAndrea2223.obtenerStock();
        
        System.out.println("El stock actual es"+ stockActual );
    }

    private static void operativaVehiculosGiacoiaTrombottiAndrea2223(VehiculoGiacoiaTrombottiAndrea2223 miVehiculoGiacoiaTrombottiAndrea2223, int cantidad) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoGiacoiaTrombottiAndrea2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoGiacoiaTrombottiAndrea2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    
