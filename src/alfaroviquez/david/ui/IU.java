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
        output.println("7. Registrar material de texto");
        output.println("8. Registrar material de audio");
        output.println("9. Registrar material de video");
        output.println("10. Registrar otro tipo de material");
        output.println("11. Listar material de texto");
        output.println("12. Listar material de audio");
        output.println("13. Listar material de video");
        output.println("14. Listar otro tipo de material");
        output.println("15. Crear préstamo");
        output.println("16. Asignar material a préstamo");
        output.println("17. Listar préstamos");
        output.println("18. Salir");
    }

    public int leerNumero(){
       return input.nextInt();
    }

    public void imprimirMensaje(String msg){
        output.println(msg);
    }

    public String leerMensaje(){
        return input.next();
    }
}
