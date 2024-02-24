package prog.cipfpbatoi;

import java.util.StringTokenizer;

public class Data {

    private int dia;

    private int mes;

    private int any;

    private static final String[] DIES_TEXT = new String[]{"diumenge", "dilluns", "dimarts", "dimecres", "dijous", "divendres",
        "dissabte"};

    private static final String[] MESOS_TEXT = new String[]{"gener", "febrer", "març", "abril", "maig", "juny",
        "juliol", "agost", "setembre", "octubre", "novembre", "desembre"};

    /**
     * Constructor por defecto Inicializa una fecha a dia 1-1-1970
     */
    public Data() {
        this.dia = 1;
        this.mes = 1;
        this.any = 1970;
    }

    /**
     * Inicializa la fecha
     *
     * @param dia de la semana
     * @param mes del año
     * @param anyo
     */
    public Data(int dia, int mes, int any) {
        this.dia = dia;
        this.mes = mes;
        this.any = any;
    }

    /**
     * Inicializa la fecha a partir de otra pasada en formato String dd/mm/yyyy
     *
     * Deberemos trocearlas de forma que asignemos el día més y año a cada uno
     * de los atributoe Tienes que utilizar las funciones de *String o consultar
     * la documentación oficial y hacerlo OBLIGATORIAMENTE con la clase
     * StringTokenizer. Si el formato recibido no es el correcto, creará la
     * fecha por defecto.
     *
     * @param fecha
     */
    public Data(String data) {
        StringTokenizer tokenizer = new StringTokenizer(data, "/");

        if (tokenizer.countTokens() == 3) {
            while (tokenizer.hasMoreTokens()) {
                this.dia = Integer.parseInt(tokenizer.nextToken());
                this.mes = Integer.parseInt(tokenizer.nextToken());
                this.any = Integer.parseInt(tokenizer.nextToken());
            }
        } else {
            this.dia = 1;
            this.mes = 1;
            this.any = 1970;
        }
    }

    /**
     * Modifica la fecha actual a partir de los datos pasados como argumento
     */
    public void set(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.any = anyo;
    }

    /**
     * Obtiene una fecha con los mismos atributos que la fecha actual
     *
     * @return
     */
    public Data clone() {
        Data data = new Data(dia, mes, any);
        return data;
    }

    /**
     * Devuelve el día de la semana que representa por la Fecha actual
     *
     * @return @dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * Devuelve el mes que representa la Fecha actual
     *
     * @return @mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * Devuelve el año que representa la Fecha actual
     *
     * @return @mes
     */
    public int getAny() {
        return any;
    }

    /**
     * Muestra por pantalla la fecha en formato español dd-mm-yyyy
     */
    public void mostrarEnFormatES() {
        System.out.printf("%02d%n-%02d%n-%04d%n",dia,mes,any);
    }

    /**
     * Muestra por pantalla la fecha en formato inglés yyyy-mm-dd
     */
    public void mostrarEnFormatGB() {
        System.out.println(any + "-" + mes + "-" + dia);
    }

    /**
     * Muestra por pantalla la fecha en formato texto dd-mmmm-yyyy Ej. 1 enero
     * de 1970
     */
    public void mostrarEnFormatText() {
        System.out.println(dia + "-" + getMesEnFormatText() + "-" + any);
    }

    /**
     * Retorna un booleano indicando si la fecha del objeto es igual a la fecha
     * pasada como argumento
     *
     * @return boolean
     */
    public boolean isIgual(Data otraFecha) {
        return otraFecha.isIgual(clone());
    }

    /**
     * Retorna un String que representa el dia de la setmana en format text
     * (dilluns, dimarts, dimecres, dijous, divendres, dissabte, diumenge).
     * L'algorisme de resolució d'aquest mètode es troba al enunciat.
     *
     * @return String
     */
    public String getDiaSetmana() {
       int diesOrigen = getDiesTranscorregutsOrigen();
       int diaActual = 0; 
       String text = "";
       
       diaActual = diesOrigen % 7;
       if(diaActual < 6 && diaActual > 0){
           text = DIES_TEXT[diaActual + 1];
       }else {
           text = DIES_TEXT[0];
       }

 
        return text;
    }

    /**
     * Retorna un booleà indicant si la data representada per l'objecte actual
     * és festiva. Es considerarà festiu si el dia de la setmana és dissabte o
     * diumenge
     *
     * @return boolean
     */
    public boolean isFestiu() {
        return getDiaSetmana().equals(DIES_TEXT[0]) || getDiaSetmana().equals(DIES_TEXT[6]);
    }

    /**
     * Retorna el número de la setmana dins de l'any actual. Es considera una
     * setmana l'interval de dates entre una data que siga dilluns i la següent
     * data en ordre cronològic que siga diumenge. També es comptabilitza com a
     * setmana tant la primera setmana de l'any com l'última (inclusivament en
     * aquells anys en què la primera i/o última setmana no conté set dies en
     * total).
     *
     * @return int dia semana
     */
    public int getNumeroSetmana() {
        int diesAny = getDiesTranscorregutsEnAny();
        int diaSemana = getDiesTranscorregutsEnAny() % 7;
        int diesDilluns = 1 - diaSemana;
        int diesDiumenge = 7 - diaSemana;

        if (diesDilluns == 1 || diesDiumenge == 7) {
            return 1; // Primer semana
        } else if (diesDilluns > 1) {
            return 1 + diesAny / 7; // Semanas completas + 1
        } else {
            return 1 + (diesAny + diesDiumenge) / 7; // Semanas completas + 1
        }
    }

    /**
     * Retorna un nou objecte de tipus data que representa la data resultant
     * d'afegir el nombre de dies passats com a argument a la data que
     * representa l'objecte actual. Haurem de tindre en compte els dies que té
     * el mes actual i si l'any és de traspàs (bisiesto) amb la finalitat de
     * construir el nou objecte amb la data correcta. El màxim nombre de dies
     * que podrem afegir serà 30 i no podrem afegir un nombre negatiu de dies.
     *
     * @return boolean
     */
    public Data afegir(int numDias) {
        return null;
    }

    /**
     * Retorna un nou objecte de tipus data que representa la data resultant de
     * restar el nombre de dies passats com a argument a la data que representa
     * l'objecte actual. Haurem de tindre en compte els dies que té el mes
     * actual i si l'any és de traspàs (bisiesto) amb la finalitat de construir
     * el nou objecte amb la data correcta. El màxim nombre de dies que podrem
     * restar serà 30 i no podrem restar un nombre negatiu de dies.
     *
     * @return boolean
     */
    public Data restar(int numDias) {
        return null;
    }

    /**
     * Retorna un booleà indicant si la data representada per l'objecte actual
     * és correcta. No oblides comprovar que el dia es trobe dins del rang dels
     * dies que té el mes tenint en compte si l'any és de traspàs(bisiesto) o
     * no.
     *
     * @return
     */
    public boolean isCorrecta() {
        return false;
    }

    /**
     * Retorna el mes del año en formato text (enero, febrero, marzo,...)
     *
     * @return char
     */
    private String getMesEnFormatText() {
        String mesTexto = "";

        switch (mes) {
            case 1:
                mesTexto = MESOS_TEXT[0];
                break;
            case 2:
                mesTexto = MESOS_TEXT[1];
                break;
            case 3:
                mesTexto = MESOS_TEXT[2];
                break;
            case 4:
                mesTexto = MESOS_TEXT[3];
                break;
            case 5:
                mesTexto = MESOS_TEXT[4];
                break;
            case 6:
                mesTexto = MESOS_TEXT[5];
                break;
            case 7:
                mesTexto = MESOS_TEXT[6];
                break;
            case 8:
                mesTexto = MESOS_TEXT[7];
                break;
            case 9:
                mesTexto = MESOS_TEXT[8];
                break;
            case 10:
                mesTexto = MESOS_TEXT[9];
                break;
            case 11:
                mesTexto = MESOS_TEXT[10];
                break;
            case 12:
                mesTexto = MESOS_TEXT[11];
                break;
            default:
        }
        return mesTexto;
    }

    /**
     * Devuelve el número de dias transcurridos desde el 1-1-1
     *
     * @return int
     */
    private int getDiesTranscorregutsOrigen() {
        int diasTranscurridos = 0;

        for (int i = 1; i < any; i++) {
            diasTranscurridos += isBisiesto(i) ? 366 : 365;
        }

        for (int i = 1; i < mes; i++) {
            diasTranscurridos += getDiesMes(i, any);
        }

        diasTranscurridos += dia - 1;
        
        return diasTranscurridos;
    }

    /**
     * Devuelve el número de dias transcurridos en el anyo que representa el
     * objeto
     *
     * @return int
     */
    private int getDiesTranscorregutsEnAny() {
        int diasTranscurridos = 0;

        for (int i = 1; i < mes; i++) {
            diasTranscurridos += getDiesMes(i, any);
        }

        diasTranscurridos += dia - 1;

        return diasTranscurridos;
    }

    /**
     * Indica si el año pasado como argumento es bisiesto. Un año es bisiesto si
     * es divisible por 4 pero no es divisible entre 100 o es divisible entre 4
     * entre 100 y entre 400
     *
     * @return boolean
     */
    public static boolean isBisiesto(int anyo) {
        return anyo % 4 == 0 && (anyo % 100 != 0 || anyo % 400 == 0);
    }

    /**
     * Calcula el número de días que tiene el @mes en el @año pasado como
     * argumento Deberás hacer uso del métodos isBisiesto
     *
     * @return int total dias mes en curso
     */
    public static int getDiesMes(int mes, int anyo) {
        int dias = 0;

        if (isBisiesto(anyo - 1)) {
            if (mes == 2) {
                dias = 29;
            }
        } else {
            dias = 28;
        }
        switch (mes) {
            case 1 ->
                dias = 31;
            case 3 ->
                dias = 31;
            case 4 ->
                dias = 30;
            case 5 ->
                dias = 31;
            case 6 ->
                dias = 30;
            case 7 ->
                dias = 31;
            case 8 ->
                dias = 31;
            case 9 ->
                dias = 30;
            case 10 ->
                dias = 31;
            case 11 ->
                dias = 30;
            case 12 ->
                dias = 31;
        }
        return dias;
    }

    /**
     * Calcula el número total de dias que tiene el año pasado como argumento
     *
     * @return int total dias anyo en pasado
     */
    public static int getDiesAny(int anyo) {
        if (isBisiesto(anyo - 1)) {
            return 366;
        }
        return 365;
    }
}
