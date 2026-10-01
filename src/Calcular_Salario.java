import java.util.Scanner;

public class Calcular_Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int horasTrabajadas;
        int pagoHora = 100;
        final int HORAS_NORMALES = 40;
        int horasNormales;
        int horasExtra = 0;
        int salarioTotal = 0;
        String nombre;

        // Entradas
        System.out.println("Ingrese su nombre: ");
        nombre = scanner.nextLine();

        System.out.println("Ingrese sus horas trabajadas: ");
        horasTrabajadas = scanner.nextInt();

        // Lógica de cálculo
        if (horasTrabajadas <= HORAS_NORMALES) {
            horasNormales = horasTrabajadas;
            horasExtra = 0;
            salarioTotal = horasNormales * pagoHora;
        } else {
            horasNormales = HORAS_NORMALES;
            horasExtra = horasTrabajadas - HORAS_NORMALES;
            salarioTotal = (horasNormales * pagoHora) + (horasExtra * (pagoHora * 2));
        }

        System.out.println("Nombre: " + nombre);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Horas Normales: " + horasNormales);
        System.out.println("Pago por hora: $" + pagoHora);
        System.out.println("Horas Extra: " + horasExtra);
        System.out.println("Salario Total: $" + salarioTotal);

        scanner.close();
    }
}