
package coche;

/**
 *
 * @author Fran
 */
public class Main {
    
      public static void main(String[] args) {
        Coche Coche1;
        int stockActual;
        
        Coche1 = new Coche("Opel",12000,500);
        operatoria_coches(Coche1); 
        stockActual = Coche1.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    public static void operatoria_coches(Coche Coche1) {
        try
        {
            System.out.println("Venta de Coches");
            Coche1.vender(300);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Coches");
            Coche1.comprar(500);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar");
        }
    }

}
    
