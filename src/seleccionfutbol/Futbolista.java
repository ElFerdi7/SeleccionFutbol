/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleccionfutbol;

/**
 *
 * @author a022583952e
 */
public class Futbolista extends SeleccionFutbol {
    
    private int dorsal;
	private String demarcacion;

        public Futbolista(int id, String Nombre, String Apellidos, int Edad,int dorsal, String demarcacion) {
		super(id,Nombre,Apellidos,Edad);
                this.dorsal = dorsal;
                this.demarcacion = demarcacion;
                
	}
        
        

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

        
	// getter y setter

	public void jugarPartido() {
		
	}

	public void entrenar() {
		
	}
}
