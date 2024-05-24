public class VehiculoCarga extends Vehiculo{

    private int capacidadCarga;

    //Constructor
    public VehiculoCarga(String marca, String modelo, int año, int kilometraje, int capacidadCarga) {
        super(marca, modelo, año, kilometraje);
        this.capacidadCarga=capacidadCarga;
    }

    //Getter y setter para capacidadCarga
    public int getcapacidadCarga(){
        return capacidadCarga;
    }

    public void setcapacidadCarga(int capacidadCarga){
        this.capacidadCarga=capacidadCarga;
    }

    //Sobreescribir el metodo mostrarInfo
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Capacidad de carga: "+capacidadCarga+"km");
    }
}