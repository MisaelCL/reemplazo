package P120_Vehiculo;

public class Suv extends Maquina implements TodoTerreno {
    public Suv(String nombre) {
        super(nombre);
    }

    @Override
    public void sistemaElectrico() {
        System.out.println("Es un automovil con sistema eléctrico es una Suv");        
    }
    
    @Override
    public void combustionInterna() {
        System.out.println("Es un automovil de combustión interna es una Suv");                
    }

        @Override
        public void traccion4x4() {
            System.out.println("Es un automovil con tracción 4 x 4 es una Suv");            
        }
        
        @Override
        public void chasisIndependiente() {
        System.out.println("Es automovil con chasis independiente es una Suv");                    
    }


    
}
