import java.util.Scanner;

public class Main {

    public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);

    String eleccion = "";
    int a;

    System.out.println("¿Que objeto quieres crear?\n 1. Esfera\n 2. Rectangulo\n 3. Cilindro");
    eleccion = sc.next();
    while(!eleccion.matches("^[1-3]")){
        System.out.println("Error!\n¿Que objeto quieres crear?\n 1. Esfera\n 2. Rectangulo\n 3. Cilindro");
        eleccion = sc.next();
    }

    a = Integer.parseInt(eleccion);

    switch (a) {
        case 1:
            System.out.println("Introduce el radio de la esfera.");
            esfera esfera = new esfera(sc.nextDouble());
            System.out.println("Introduce la cobertura de la pintura");
            pintura pint = new pintura(sc.nextDouble());
            System.out.println(pint.getCantidadPintura(esfera));
            break;
        case 2:
            System.out.println("Introduce la longitud y la anchura del rectangulo");
            rectangulo rectangulo = new rectangulo(sc.nextDouble(), sc.nextDouble());
            System.out.println("Introduce la cobertura de la pintura");
            pintura pint2 = new pintura(sc.nextDouble());
            System.out.println(pint2.getCantidadPintura(rectangulo));
            break;
        case 3:
            System.out.println("Introduce el radio y la altura del cilindro.");
            cilindro cilindro = new cilindro(sc.nextDouble(), sc.nextDouble());
            System.out.println("Introduce la cobertura de la pintura");
            pintura pint3 = new pintura(sc.nextDouble());
            System.out.println(pint3.getCantidadPintura(cilindro));
            break;
         }

     }
}