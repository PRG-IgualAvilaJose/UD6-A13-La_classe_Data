package prog.cipfpbatoi;

import java.util.Scanner;

public class TestData {

    public static void main(String[] args) {
        
        System.out.println("=== START - Prova de Constructors - START ===");
        
        testConstructorDefault();
        testConstructorWithParameters();
        testConstructorWithString();
        testSetMethod();
        testCloneMethod();
        testGetDia();
        testGetMes();
        testGetAny();
        testMostrarEnFormatES();
        testMostrarEnFormatGB();
        testMostrarEnFormatText();
        testIsIgual();
        testGetDiaSetmana();
        testIsFestiu();
        testGetNumeroSetmana();
        testAfegir();
        testRestar();
        testIsCorrecta();
    }
    
    public static int pedirNum() {
        Scanner sc = new Scanner(System.in);
        do {
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                System.out.print("Tipo de dato incorrecto. Introduce de nuevo: ");
                sc.next();
            }
        } while (true);
    }

    private static void testConstructorDefault() {
        System.out.println("Test Constructor ...");
        Data data = new Data();
        System.out.println(data.getDia() + "-" + data.getMes() + "-" + data.getAny());
        System.out.println();
    }

    private static void testConstructorWithParameters() {
        System.out.println("Test Constructor con Parametros...");
        Data data = new Data(2, 3, 2022);
        System.out.println(data.getDia() + "-" + data.getMes() + "-" + data.getAny());
        System.out.println();
    }

    private static void testConstructorWithString() {
        System.out.println("Test Constructor con String...");
        Data data = new Data("23/05/2023");
        System.out.println(data.getDia() + "-" + data.getMes() + "-" + data.getAny());
        System.out.println();
    }

    private static void testSetMethod() {
        System.out.println("Test set ...");
        Data data = new Data();
        data.set(5, 6, 2022);
        System.out.println(data.getDia() + "-" + data.getMes() + "-" + data.getAny());
        System.out.println();
    }

    private static void testCloneMethod() {
        System.out.println("Test clone ...");
        Data data1 = new Data(10, 8, 2023);
        Data data2 = data1.clone();
        System.out.println(data1.getDia() + "-" + data1.getMes() + "-" + data1.getAny());
        System.out.println(data2.getDia() + "-" + data2.getMes() + "-" + data2.getAny());
        System.out.println();
    }

    private static void testGetDia() {
        System.out.println("Test getDia ...");
        Data data = new Data(15, 4, 2022);
        System.out.println(data.getDia());
        System.out.println();
    }

    private static void testGetMes() {
        System.out.println("Test getMes ...");
        Data data = new Data(15, 4, 2022);
        System.out.println(data.getMes());
        System.out.println();
    }

    private static void testGetAny() {
        System.out.println("Test getAny ...");
        Data data = new Data(15, 4, 2022);
        System.out.println(data.getAny());
        System.out.println();
    }

    private static void testMostrarEnFormatES() {
        System.out.println("Test mostrarEnFormatES ...");
        Data data = new Data(15, 4, 2022);
        data.mostrarEnFormatES();
        System.out.println();
    }

    private static void testMostrarEnFormatGB() {
        System.out.println("Test mostrarEnFormatGB ...");
        Data data = new Data(15, 4, 2022);
        data.mostrarEnFormatGB();
        System.out.println();
    }

    private static void testMostrarEnFormatText() {
        System.out.println("Test mostrarEnFormatText ...");
        Data data = new Data(15, 4, 2022);
        data.mostrarEnFormatText();
        System.out.println();
    }

    private static void testIsIgual() {
        System.out.println("Test isIgual ...");
        Data data1 = new Data(10, 8, 2023);
        Data data2 = new Data(10, 8, 2023);
        System.out.println(data1.isIgual(data2));
        System.out.println();
    }

    private static void testGetDiaSetmana() {
        System.out.println("Test getDiaSetmana ...");
        Data data = new Data(26, 2, 2024);
        System.out.println(data.getDiaSetmana());
        System.out.println();
    }

    private static void testIsFestiu() {
        System.out.println("Test isFestiu ...");
        Data data1 = new Data(26, 2, 2024); 
        Data data2 = new Data(25, 2, 2024);
        System.out.println(data1.isFestiu());
        System.out.println(data2.isFestiu());
        System.out.println();
    }

    private static void testGetNumeroSetmana() {
        System.out.println("Test getNumeroSetmana ...");
        Data data = new Data(28, 2, 2024);
        System.out.println(data.getNumeroSetmana());
        System.out.println();
    }

    private static void testAfegir() {
        System.out.println("Test afegir ...");
        Data data = new Data(15, 4, 2022);
        data.afegir(10);
        System.out.println(data.getDia() + "-" + data.getMes() + "-" + data.getAny());
        System.out.println();
    }

    private static void testRestar() {
        System.out.println("Test restar ...");
        Data data = new Data(15, 4, 2022);
        data.restar(5);
        System.out.println(data.getDia() + "-" + data.getMes() + "-" + data.getAny());
        System.out.println();
    }

    private static void testIsCorrecta() {
        System.out.println("Test isCorrecta ...");
        Data data1 = new Data(15, 4, 2022); 
        Data data2 = new Data(32, 4, 2022); 
        System.out.println(data1.isCorrecta()); 
        System.out.println(data2.isCorrecta()); 
        System.out.println();
    }
}
