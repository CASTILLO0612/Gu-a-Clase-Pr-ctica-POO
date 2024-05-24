public class VehiculoPasajeros extends Vehiculo {

    private int numPasajeros;

    //Constructor
    public VehiculoPasajeros(String marca, String modelo, int año, int kilometraje,int numPasajeros) {
        super(marca, modelo, año, kilometraje);
        this.numPasajeros=numPasajeros;
    }

    //Getter y setter para numPasajeros
    public int getNumpasajeros(){
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros){
        this.numPasajeros=numPasajeros;
    }

    //Sobreescribir el metodo y mostrarlo
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Numero de pasajeros: "+numPasajeros);
    }
}