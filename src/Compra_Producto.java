import java.util.Scanner;

public class Compra_Producto {
    public static void main (String[] args){
        Scanner scanner =  new Scanner(System.in);
        int Precio_Producto;
        int Productos_Comprados;
        int Subtotal;
        int Envio = 80;
        double Descuento = 0.10;

        System.out.println("Hola, bienvenido.");
        System.out.println("Ingrese el precio: ");
        Precio_Producto = scanner.nextInt();
        System.out.println("Ingrese la cantidad de productos comprados: ");
        Productos_Comprados = scanner.nextInt();

        Subtotal = Precio_Producto * Productos_Comprados;
        double descuentoAplicado = 0;
        int CostoEnvio = 80;

        if (Subtotal >= 1500) {
            descuentoAplicado = Subtotal * Descuento;
            CostoEnvio = 0;
        } else if (Subtotal >= 1000) {
            descuentoAplicado = Subtotal * Descuento;
            CostoEnvio = 80;
        } else {
            descuentoAplicado = 0;
            CostoEnvio = 80;
        }

        double totalConDescuento = Subtotal - descuentoAplicado;
        double totalFinal = totalConDescuento + CostoEnvio;

        System.out.println("Precio del producto: $" + Precio_Producto);
        System.out.println("Cantidad: " + Productos_Comprados);
        System.out.println("Subtotal: $" + Subtotal);
        System.out.println("Descuento: $" + descuentoAplicado);
        System.out.println("Costo de envío: $" + CostoEnvio);
        System.out.println("Total Final: $" + totalFinal);
    }
}


