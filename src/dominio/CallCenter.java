package dominio;

public class CallCenter {

	public Contacto listaContactos[];
	
	public CallCenter() {
		this.listaContactos= new Contacto[100];
	}
	
	
	
	public Boolean cargarContacto(Contacto contacto) {
		Boolean seCargo= false;
		for (int i = 0; i < listaContactos.length; i++) {
			if(listaContactos[i]==null) {
				listaContactos[i]= contacto;
				seCargo= true;
				break;
	
			}
		}return seCargo;
	}
	
	
	
	
	public Contacto buscarAlCandidato() {
		Contacto contactoALlamar= null;
		for (int i = 0; i < listaContactos.length; i++) {
			if(listaContactos[i]!= null && listaContactos[i].getEsCliente()==false &&
					listaContactos[i].getDeseaSerLlamado()==true) {
				contactoALlamar= listaContactos[i];
				break;
			}
		}
		
		return contactoALlamar;
	}
	
	
	
	
}
