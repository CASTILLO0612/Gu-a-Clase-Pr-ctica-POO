public class Auto extends VehiculoPasajeros{

    private String tipoCombustible;

    //Constructor
    public Auto(String marca, String modelo, int año, int kilometraje,int numPasajeros, String tipoCombustible) {
        super(marca, modelo, año, kilometraje, numPasajeros);
        this.tipoCombustible=tipoCombustible;
    }

    //Getter y setter para tipoCombustible
    public String getTipoCombustible(){
        return tipoCombustible;
    }
    
    public void setTipoCombustible(String tipoCombustible){
        this.tipoCombustible=tipoCombustible;
    }

    //Sobreescribir el metodo mostrarInfo

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Tipo de Combustible: "+tipoCombustible);
    }
    @Override
    public void realizarMantenimiento(){
        super.realizarMantenimiento();
        System.out.println("-Cambio de Aceite y Filtro");
        System.out.println("-Rotacion de neumaticos");
        System.out.println("-Alineacion de ruedas");
        System.out.println("-Sustitucion del filtro de aire del motor de cabina");
    }
    public void costoMantenimiento(int costKm, int numKm){
        int costoTotal = costKm*numKm;
        System.out.println("El costo total del Mantenimiento es de: $"+costoTotal);
    }
}