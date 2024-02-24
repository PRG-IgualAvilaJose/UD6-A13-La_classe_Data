package prog.cipfpbatoi;

import java.util.Scanner;

public class TestData {
    public static void main(String[] args){
        mostrarText();
    }

    public static void mostrarText(){
        System.out.println("=== START - Prova de Constructors - START === ");

    }

    public static int demanarDia(){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            if (sc.nextInt() < 32){
                return sc.nextInt();
            }
        }else{
            System.out.println("Error format incorrecte");
        }
        return -1;
    }
    public static int demanarMes(){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            if (sc.nextInt() < 13){
                return sc.nextInt();
            }
        }else{
            System.out.println("Error format incorrecte");
        }
        return -1;
    }
    public static int demanarAny(){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            if (sc.nextInt() < 1111){
                return sc.nextInt();
            }
        }else{
            System.out.println("Error format incorrecte");
        }
        return -1;
    }

}
