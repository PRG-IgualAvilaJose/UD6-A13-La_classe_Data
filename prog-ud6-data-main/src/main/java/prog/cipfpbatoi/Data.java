package prog.cipfpbatoi;

public class Data {
	
	private int dia;
	
	private int mes;
	
	private int any;

	private static final String[] DIES_TEXT = new String[] { "diumenge", "dilluns", "dimarts", "dimecres", "dijous", "divendres",
			"dissabte"};

	private static final String[] MESOS_TEXT = new String[] { "gener", "febrer", "març", "abril", "maig", "juny",
			"juliol", "agost", "setembre", "octubre", "novembre", "desembre" };

	/**
	 *  Constructor por defecto
	 *  Inicializa una fecha a dia 1-1-1970
	 */
	public Data() {
            this.dia = 1;
            this.mes = 1;
            this.any = 1970;
	}

	/**
	 *  Inicializa la fecha
	 *  @param dia de la semana
	 *  @param mes del año
	 *  @param anyo
	 */
	public Data(int dia, int mes, int any) {
		this.dia = dia;
                this.mes = mes;
                this.any = any;
	}

	/**
	 * Inicializa la fecha a partir de otra pasada en formato String dd/mm/yyyy
	 *
	 * Deberemos trocearlas de forma que asignemos el día més y año a cada uno de los atributoe
         * Tienes que utilizar las funciones de *String o consultar la documentación oficial y hacerlo OBLIGATORIAMENTE 
         * con la clase StringTokenizer. 
         * Si el formato recibido no es el correcto, creará la fecha por defecto.
	 * @param fecha
	 */
	public Data(String data) {
		
	}

	/**
	 * Modifica la fecha actual a partir de los datos pasados como argumento
	 */
	public void set(int dia, int mes, int anyo) {
		// Tu código aqu
	}

	/**
	 * Obtiene una fecha con los mismos atributos que la fecha actual
	 * @return
	 */
	public Data clone() {
		return null;
	}

	/**
	 * Devuelve el día de la semana que representa por la Fecha actual
	 * @return @dia
	 */
	public int getDia() {
		return 0;
	}

	/**
	 * Devuelve el mes que representa la Fecha actual
	 * @return @mes
	 */
	public int getMes(){
		return 0;
	}

	/**
	 * Devuelve el año que representa la Fecha actual
	 * @return @mes
	 */
	public int getAny(){
		return 0;
	}

	/**
	 * Muestra por pantalla la fecha en formato español dd-mm-yyyy
	 */
	public void mostrarEnFormatES()  {
		// Tu código aquí
	}

	/**
	 * Muestra por pantalla la fecha en formato inglés yyyy-mm-dd
	 */
	public void mostrarEnFormatGB() {
		// Tu código aquí
	}

	/**
	 * Muestra por pantalla la fecha en formato texto dd-mmmm-yyyy
	 * Ej. 1 enero de 1970
	 */
	public void mostrarEnFormatText() {
		// Tu código aquí
	}

	/**
	 * Retorna un booleano indicando si la fecha del objeto es igual a la fecha pasada como
	 * argumento
	 *
	 * @return boolean
	 */
	public boolean isIgual(Data otraFecha) {
		return false;
	}

	/**
	 * Retorna un String que representa el dia de la setmana en format text (dilluns, dimarts, dimecres, dijous, divendres, dissabte, diumenge).
         * L'algorisme de resolució d'aquest mètode es troba al enunciat.
	 * @return String
	 */
	public String getDiaSetmana() {
		return null;
	}

	/**
	 * Retorna un booleà indicant si la data representada per l'objecte actual és festiva. Es considerarà festiu si el dia de la setmana és dissabte o diumenge
	 * @return boolean
	 */
	public boolean isFestiu() {
		return false;
	}

	/**
	 * Retorna el número de la setmana dins de l'any actual. 
         * Es considera una setmana l'interval de dates entre una data que siga dilluns i la següent data en ordre cronològic que siga diumenge. 
         * També es comptabilitza com a setmana tant la primera setmana de l'any com l'última (inclusivament en aquells anys en què la primera i/o 
         * última setmana no conté set dies en total).
	 *
	 * @return int dia semana
	 */
	public int getNumeroSetmana() {
		return 0;
	}

	/**
	 * Retorna un nou objecte de tipus data que representa la data resultant d'afegir el nombre de dies passats com a argument a la data que representa l'objecte actual. 
         * Haurem de tindre en compte els dies que té el mes actual i si l'any és de traspàs (bisiesto) 
         * amb la finalitat de construir el nou objecte amb la data correcta. 
         * El màxim nombre de dies que podrem afegir serà 30 i no podrem afegir un nombre negatiu de dies. 
	 *
	 * @return boolean
	 */
	public Data afegir(int numDias){
		return null;
	}

	/**
	 * Retorna un nou objecte de tipus data que representa la data resultant de restar el nombre de dies passats com a argument a la data que representa l'objecte actual. 
         * Haurem de tindre en compte els dies que té el mes actual i si l'any és de traspàs (bisiesto) amb la finalitat de construir el nou objecte amb la data correcta.  
         * El màxim nombre de dies que podrem restar serà 30 i no podrem restar un nombre negatiu de dies. 
	 *
	 * @return boolean
	 */
	public Data restar(int numDias){
		return null;
	}

        /**
         * Retorna un booleà indicant si la data representada per l'objecte actual és correcta. 
         * No oblides comprovar que el dia es trobe dins del rang dels dies que té el mes tenint en compte si l'any és de traspàs(bisiesto) o no.
         * @return 
         */
	public boolean isCorrecta(){
		return false;
	}

	/**
	 * Retorna el mes del año en formato text (enero, febrero, marzo,...)
	 * @return char
	 */
	private String getMesEnFormatText() {
		return null;
	}

	/**
	 * Devuelve el número de dias transcurridos desde el 1-1-1
	 *
	 * @return int
	 */
	private int getDiesTranscorregutsOrigen() {
		return 0;
	}

	/**
	 * Devuelve el número de dias transcurridos en el anyo que representa el objeto
	 *
	 * @return int
	 */
	private int getDiesTranscorregutsEnAny() {
		return 0;
	}

	/**
	 * Indica si el año pasado como argumento es bisiesto. Un año es bisiesto si es divisible por 4
	 * pero no es divisible entre 100 o es divisible entre 4 entre 100 y entre 400
	 *
	 * @return boolean
	 */
	public static boolean isBisiesto(int anyo){
		return false;
	}

	/**
	 *  Calcula el número de días que tiene el @mes en el @año pasado como argumento
	 *  Deberás hacer uso del métodos isBisiesto
	 *
	 *  @return int total dias mes en curso
	 */
	public static int getDiesMes (int mes, int anyo) {
		return 0;
	}

	/**
	 * Calcula el número total de dias que tiene el año pasado como argumento
	 *
	 * @return int total dias anyo en curso
	 */
	public static int getDiesAny (int anyo){
		return 0;
	}
}
