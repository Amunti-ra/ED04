package cuentas;

/**
 * /**
 * La clase CCuenta representa una cuenta bancaria básica.
 * 
 * Permite realizar operaciones de ingreso y retirada de dinero,
 * así como consultar el estado actual del saldo.
 * 
 * Cada cuenta dispone de un titular, un número de cuenta,
 * un saldo disponible y un tipo de interés asociado.
 * 
 * @author Mati
 */
public class CCuenta {


    /** Nombre del titular de la cuenta. */
    private String nombre;

    /** Número identificador de la cuenta bancaria. */
    private String cuenta;

    /** Saldo actual disponible en la cuenta. */
    private double saldo;

    /** Tipo de interés aplicado a la cuenta. */
    private double tipoInterés;
    
    
    /**
    * Constructor por defecto de la clase CCuenta.
    * 
    * Inicializa una cuenta sin valores definidos.
    */
    public CCuenta()
    {
    }
    
    
    /**
    * Constructor que crea una cuenta con los datos especificados.
    * 
    * @param nom   Nombre del titular de la cuenta.
    * @param cue   Número de cuenta.
    * @param sal   Saldo inicial de la cuenta.
    * @param tipo  Tipo de interés aplicado a la cuenta.
    */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    
    /**
    * Obtiene el saldo actual de la cuenta.
    * 
    * @return El saldo disponible en la cuenta.
    */
    public double estado()
    {
        return saldo;
    }
    
    
    /**
    * Realiza un ingreso en la cuenta.
    * 
    * @param cantidad Cantidad de dinero a ingresar.
    * @throws Exception Si la cantidad es negativa.
    */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    
    /**
    * Realiza una retirada de dinero de la cuenta.
    * 
    * @param cantidad Cantidad de dinero a retirar.
    * @throws Exception Si la cantidad es menor o igual a cero
    *                   o si no hay saldo suficiente en la cuenta.
    */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    
    /**
     * Devuelve el nombre del titular
     */
    public String getNombre() {
        return nombre;
    }    
    /**
     * Establece el nombre del titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    /**
     * Devuelve el identificador de la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }    
    /**
     * Establece el identificador de la cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    
    
    /**
     * Devuelve el tipo de interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }    
    /**
     * Establece el tipo de interés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    
    
}
