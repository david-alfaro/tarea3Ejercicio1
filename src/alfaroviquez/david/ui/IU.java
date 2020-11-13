package alfaroviquez.david.ui;

import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IU {
    private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void imprimirMenu(){
        output.println("-*-*-*-*-SISTEMA DE BIBLIOTECAS-*-*-*-*-");
        output.println("1. Registrar estudiante");
        output.println("2. Registrar profesor");
        output.println("3. Registrar administrativo");
        output.println("4. Listar estudiantes");
        output.println("5. Listar profesores");
        output.println("6. Listar administrativos");
        output.println("7. Crear préstamo");
        output.println("8. Listar préstamos");
        output.println("9. Salir");
    }

    public int leerNumero(){
        int i=0;
        boolean noHayError=true;
        do{
            try{
                i=input.nextInt();
            }catch (InputMismatchException e){
                output.println("Ingrese una opcion del menu");
                noHayError=false;
                input.next();
            }
        }while (noHayError);
        return i;
    }

    public void imprimirMensaje(String msg){
        output.println(msg);
    }

    public String leerMensaje(){
        return input.next();
    }
}
