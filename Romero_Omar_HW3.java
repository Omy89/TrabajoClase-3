package romero_omar_hw3;

import java.util.Scanner;

public class Romero_Omar_HW3 {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        double base = 0;
        double altura = 0;
        double area;

        int numtriangulo = 0;
        double areamax = 0;

        int numero1;
        int numero2;
        
        
        
        int numeroperfecto=0;
        
        String eleccion;
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Determinar entre 8 triangulos el que tenga mas area");
            System.out.println("2. Determinar el MCM Y MCD");
            System.out.println("3. Determinar si un numero es perfecto");
            System.out.println("4. Salir");
            eleccion = lea.next();
            if (eleccion.equalsIgnoreCase("1")) {
                System.out.println("!!Recuerde la formula de un triangulo es: (base)(altura)(1/2)!!");
                for (int i = 1; 8 >= i; i++) {
                    while (true) {
                        try {
                            System.out.println("Ingrese la base del triangulo #" + i);
                            base = lea.nextDouble();
                            if (base > 0) {
                                break;
                            } else if (base <= 0) {
                                System.out.println("Ingrese un numero mayor que 0");
                            }
                        } catch (Exception e) {
                            lea.nextLine();
                            System.out.println("Ingrese un valor numerico");
                        }
                    }
                    while (true) {
                        try {
                            System.out.println("Ingrese la altura del triangulo #" + i);
                            altura = lea.nextDouble();
                            if (altura > 0) {
                                break;
                            } else if (altura <= 0) {
                                System.out.println("Ingrese un numero mayor que 0");
                            }
                        } catch (Exception e) {
                            lea.nextLine();
                            System.out.println("Ingrese un valor numerico");
                        }
                    }
                    area = base * altura * 0.5;
                    System.out.println("El area del triangulo #" + i + " tiene un area de:" + area + " Unidades cuadradas");
                    if (area > areamax) {
                        numtriangulo = i;
                        areamax = area;
                    }
                }
                System.out.println("********************************************************************");
                System.out.println("El triangulo #" + numtriangulo + " fue el de mayor area, esta era " + areamax + " unidades cuadradas");
            } else if (eleccion.equalsIgnoreCase("2")) {
                while (true) {
                    try{
                    System.out.println("Ingrese el primer numero");
                    numero1=lea.nextInt();
                    if(numero1>0){
                        break;
                    } else if(numero1<=0){
                        System.out.println("I");
                    }
                    } catch(Exception e){
                        lea.nextLine();
                        System.out.println("Ingrese un numero entero");
                    }
                }
                while (true) {
                    try{
                    System.out.println("Ingrese otro numero entero");
                    numero2=lea.nextInt();
                    if(numero2>0){
                        break;
                    } else if(numero2<=0){
                        System.out.println("I");
                    }
                    } catch(Exception e){
                        lea.nextLine();
                        System.out.println("Ingrese un numero entero");
                    }
                }
            } else if (eleccion.equalsIgnoreCase("3")) {
                while (true) {
                    try{
                    System.out.println("Ingrese un numero para ver si es perfecto");
                    numeroperfecto=lea.nextInt();
                    if(numeroperfecto>0){
                        break;
                    } else if(numeroperfecto<=0){
                        System.out.println("I");
                    }
                    } catch(Exception e){
                        lea.nextLine();
                        System.out.println("Ingrese un numero entero");
                    }
                }
                
            } else if (eleccion.equalsIgnoreCase("4")) {
                System.out.println("Saliendo del sistema");
                break;
            } else {
                System.out.println("AVISO ingrese una opcion valida");
            }
        }

    }
}
