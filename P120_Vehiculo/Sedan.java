package P120_Vehiculo;

public class Sedan extends Maquina implements Familiar{
    public Sedan(String nombre) {
        super(nombre);
    }

    @Override
    public void sistemaElectrico() {
        System.out.println("Es un automovil con sistema eléctrico es un Sedan");        
    }
    
    @Override
    public void combustionInterna() {
        System.out.println("Es un automovil de combustión interna es un Sedan");        
        
    }

    @Override
    public void carroceriaTres() {
        System.out.println("Es de tipo familiar con carroceria en tres partes es un Sedan");        
    }
    
    @Override
    public void chasisMonocasco() {
        System.out.println("Es de tipo familiar con chasis monocasco es un Sedan");                
    }


    

    
}
