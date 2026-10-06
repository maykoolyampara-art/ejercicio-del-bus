//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner maykool=new Scanner(System.in);
        boolean[] asientos=new boolean[10];
        int opcion;
        do {
            System.out.println("---SISTEMA DE VENTA DE BOLETOS CIVA-----");
            System.out.println("1.Mostrar los asientos del bus");
            System.out.println("2.Comprar boleto");
            System.out.println("3.Mostrar resumen de asientos comprados y vendidos");
            System.out.println("4.Salir");
            System.out.println("Seleciona una opcion a realizar:");
            opcion=maykool.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("---LISTA DE ASIENTOS----");
                    for (int i=0;i<asientos.length;i++){
                        if (asientos[i]==false){//SI ES TRUE INTERNAMENTE
                            System.out.println(" ------------------------------------");
                            System.out.println("Asiento"+(i+1)+":DISPONIBLE :)");
                            System.out.println(" -------------------------------------");
                        }else {//SI ES FALSO INTERNMENTE
                            System.out.println(" ------------------------------------");
                            System.out.println("Asiento"+(i+1)+":OCUPADO :(");
                            System.out.println(" -------------------------------------");

                        }
                    }
                    break;
                case 2:
                    System.out.println("---COMPRRA BOLETOS DE CIVA-----");
                    System.out.println("----------------------------------");
                    System.out.println("---LISTA DE ASIENTOS----");
                    for (int i=0;i<asientos.length;i++){
                        if (asientos[i]==false){//SI ES TRUE INTERNAMENTE
                            System.out.println("Asiento"+(i+1)+":DISPONIBLE :)");
                        }else {//SI ES FALSO INTERNMENTE
                            System.out.println("Asiento"+(i+1)+":OCUPADO :(");

                        }
                    }
                    //iniciando la compra
                    System.out.println("Ingresa el asiento que comprara:");
                    int asiento= maykool.nextInt();
                    //validando numero de asiento
                    if (asiento<1||asiento>10){
                        System.out.println("El bus no cuenta con ese numero de asiento");
                    }else {
                        int posicion=asiento-1;//convirtiendo el asiento a posicicon del arreglo 0,1,2,3,41
                        if (asientos[posicion]==false){//mostrar los asientos libres
                            asientos[posicion]=true;//se cambia de estado a ocupado
                            System.out.println("Asiento comprado correctamente!!");
                            System.out.println("asiento asignado es el siguiente:"+asiento);
                        }else {
                            System.out.println("asiento ya ocupado");
                        }
                    }
                    break;
                case 3:
                    System.out.println("resumen de asientos:");
                    int disponible = 0;
                    int ocupados = 0;
                    for (boolean asientoestado : asientos) {
                        if (asientoestado) {
                            ocupados++;
                        } else {
                            disponible++;
                        }
                    }
                    System.out.println("asientos disponibles:"+disponible);
                    System.out.println("asientos ocupados:"+ocupados);
                    break;
                case 4:
                    System.out.println("gracias por utilizar el sistema:");
                    break;
                default:
                    System.out.println("opcion invalida:");
            }
        }while (opcion!=4);
        maykool.close();
    }
}