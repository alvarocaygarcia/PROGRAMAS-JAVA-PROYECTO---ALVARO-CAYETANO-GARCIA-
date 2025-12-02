import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.

        //PUNTO NÚMERO 1
        Scanner teclado=new Scanner(System.in);
        int numero=0;
        System.out.println("Introduzca un número:");
        numero=teclado.nextInt();
        if(numero==1){
            System.out.println("El número es 1");
        }
        else {
            if(numero==2){
            System.out.println("El número es 2");
            }
            else {
                System.out.println("El número es distinto de 1 y de 2");
            }
        }

        //PUNTO NÚMERO 2
        int miEdad=0;
        System.out.println("Introduzca su edad:");
        miEdad=teclado.nextInt();

        int edadCompañero=0;
        System.out.println("Introduzca la edad de su compañero:");
        edadCompañero=teclado.nextInt();

        if(miEdad < edadCompañero) {
            System.out.println("Es usted más joven que su compañero.");
        }
        else {
            if(miEdad == edadCompañero) {
            System.out.println("Su compañero y usted tienen la misma edad.");
            }
            else {
                System.out.println("Su compañero es más joven que usted.");
            }
        }

        //PUNTO NÚMERO 3

        String nombre="";
        System.out.println("Introduzca su nombre:");
        nombre=teclado.next();

        float presion=0F;
        System.out.println("Introduzca la presión de su caldera de calefacción:");
        presion=teclado.nextFloat();

        if(presion>2F){
            System.out.println("Abrir la válvula de seguridad");
            presion=presion-1;
        }
        else {
            System.out.println("Todo está bien: " +nombre);
        }

        //PUNTO NÚMERO 4

        float temperaturaAyer=0F;
        System.out.println("Introduzca la temperatura de ayer:");
        temperaturaAyer=teclado.nextFloat();

        float temperaturaHoy=0F;
        System.out.println("Introduzca la temperatura de hoy:");
        temperaturaHoy=teclado.nextFloat();

        String tiempoHoy="";
        System.out.println("¿Qué tiempo hace hoy? ¿Soleado o lluvioso?:");
        tiempoHoy=teclado.nextLine();









        }
    }
