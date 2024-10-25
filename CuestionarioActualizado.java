import java.util.Scanner;

public class CuestionarioActualizado {
    public static void main(String[] args) {

        // Declarar variables enteras

        int NumeroRegistro;

        int HermanoEnElCentro;
        int MismaPoblacion;
        int PadresTrabajanEnLaPoblacion;
        int Discapacidad;
        int FamiliaNumerosaOMonoparental;
        int FamiliarEscolarizadoEnLaEscuela;

        int Puntuacion = 0;


        // Declarar constantes de puntuación
        final int HermanoEnElCentroPuntuacion = 40;
        final int DiscapacidadPuntuacion = 10;
        final int FamiliaNumerosaOMonoparentalPuntuacion = 15;
        final int FamiliarEscolarizadoEnLaEscuelaPuntuacion = 5;
        final int MismaPoblacionPuntuacion = 30;
        final int PadresTrabajanEnLaPoblacionPuntuacion = 20;



        // Inicializar el objeto escaner

        Scanner sc = new Scanner(System.in); 


        // Comprobación del número de registro

        while (true) {
            System.out.println("Número de registro del niño: ");
            NumeroRegistro = sc.nextInt();

            if (NumeroRegistro <= 499 && NumeroRegistro >= 0 && NumeroRegistro%1 == 0) {
                break;
            }

            System.out.println("El número de registro ha de estar entre 0 y 499 y ha de ser un número entero\n");
        }

        


        // Creación del objeto Scanner e inicio del cuestionario
            // Aquí uso un while y un if para comprobar que los datos introducidos son correctos

        

        while (true) {

        System.out.println("Tiene algún herman@ en el centro (0: no / 1:si)?: ");
        HermanoEnElCentro = sc.nextInt();

        System.out.println("Vive en la misma población (0: no / 1:si)?: ");
        MismaPoblacion = sc.nextInt();

        System.out.println("El padre o la madre trabaja en la misma población (0: no / 1:si)?: ");
        PadresTrabajanEnLaPoblacion = sc.nextInt();

        System.out.println("Tiene alguna discapacidad igual o superior al 33% (0: no / 1:si)?: ");
        Discapacidad = sc.nextInt();

        System.out.println("Forma parte de una familia numerosa o monoparental (0: no / 1:si)?: ");
        FamiliaNumerosaOMonoparental = sc.nextInt();

        System.out.println("Ha estado el padre, madre, tutor legal o herman@ escolarizado en el mismo centro (0: no / 1:si)?: ");
        FamiliarEscolarizadoEnLaEscuela = sc.nextInt();

        if ((HermanoEnElCentro == 0 || HermanoEnElCentro == 1) &&
          (MismaPoblacion == 0 || MismaPoblacion == 1) &&
          (PadresTrabajanEnLaPoblacion == 0 || PadresTrabajanEnLaPoblacion == 1) &&
          (Discapacidad == 0 || Discapacidad == 1) &&
          (FamiliaNumerosaOMonoparental == 0 || FamiliaNumerosaOMonoparental == 1) &&
          (FamiliarEscolarizadoEnLaEscuela == 0 || FamiliarEscolarizadoEnLaEscuela == 1)) {
        System.out.println("Los datos introducidos son correctos.");
        break;
        } else {
        System.out.println("Alguna de las variables tiene un valor diferente de 0 o 1. Vuelve a introducir los valores. \n\n");
        }

        }


        sc.close();






        // Ahora calculo la puntuación multiplicando el valor 0 o 1 por la puntuación correspondiente.
            // Para cumplir con la instrucción de que si los padres trabajan en la misma población y el niño vive en la misma población se añadan solo 30 puntos he utilizado
            // un if que comprueba si los dos hechos se dan.

        if (PadresTrabajanEnLaPoblacion == 1 && MismaPoblacion == 1) {
            Puntuacion += MismaPoblacionPuntuacion;
        } else {
            Puntuacion += PadresTrabajanEnLaPoblacion*PadresTrabajanEnLaPoblacionPuntuacion + MismaPoblacion*MismaPoblacionPuntuacion;
        }

        Puntuacion += HermanoEnElCentro*HermanoEnElCentroPuntuacion + Discapacidad*DiscapacidadPuntuacion + FamiliaNumerosaOMonoparental*FamiliaNumerosaOMonoparentalPuntuacion + FamiliarEscolarizadoEnLaEscuela*FamiliarEscolarizadoEnLaEscuelaPuntuacion;



        // Imprimir puntuación

        System.out.println("Número de registro: " + NumeroRegistro);

        System.out.println("La puntuación obtenida es de: " + Puntuacion);

    }

}
