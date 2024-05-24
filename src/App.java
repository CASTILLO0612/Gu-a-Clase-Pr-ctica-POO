public class App {
    public static void main(String[] args) throws Exception {
        
        //Creamos instancia de cada tipo de vehiculo
        Auto auto = new Auto("Toyota","Corolla", 2020, 1505, 5, "Gasolina");
        Camion camion = new Camion("Volvo", "FH", 2019, 75000, 20000, 4);

        //Mostrar la informacion de cada vehiculo
        System.out.println("Informacion del Auto:");
        auto.mostrarInfo();
        auto.realizarMantenimiento();
        auto.costoMantenimiento(12, 4);

        System.out.println("\nInformacion del camion:");
        camion.mostrarInfo();
        camion.realizarMantenimiento();
       
    }
}