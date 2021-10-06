package dominio;

public class Contacto {

	private String nombreApellido;
	private Integer celular;
	private String email;
	private String direccion;
	private Integer cp;
	private String localidad;
	private Provincia provincia;
	private Boolean esCliente;
	private Boolean deseaSerLlamado;
	
	
	public Contacto(String nombreApellido, Integer celular, String email, String direccion, Integer cp,
			String localidad, Provincia provincia, Boolean esCliente, Boolean deseaSerLlamado) {
		this.nombreApellido = nombreApellido;
		this.celular = celular;
		this.email = email;
		this.direccion = direccion;
		this.cp = cp;
		this.localidad = localidad;
		this.provincia = provincia;
		this.esCliente= esCliente;
		this.deseaSerLlamado = deseaSerLlamado;
	
	}
	
	
	public Boolean esEmailValido(String email) {
		Boolean esValido= false;
		Boolean tieneArroba= false;
		Boolean tienePunto= false;
		for (int i = 0; i < email.length(); i++) {
			if(email.charAt(i) == 64) {
				tieneArroba=true;
			}
			if (email.charAt(i)== 46) {
				tienePunto = true;
			}
			
		}
		if(tieneArroba && tienePunto) {
			esValido= true;
		}
		
		return esValido;
	}


	public String getNombreApellido() {
		return nombreApellido;
	}


	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}


	public Integer getCelular() {
		return celular;
	}


	public void setCelular(Integer celular) {
		this.celular = celular;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public Integer getCp() {
		return cp;
	}


	public void setCp(Integer cp) {
		this.cp = cp;
	}


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	public Provincia getProvincia() {
		return provincia;
	}


	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}


	public Boolean getEsCliente() {
		return esCliente;
	}


	public void setEsCliente(Boolean esCliente) {
		this.esCliente = esCliente;
	}


	public Boolean getDeseaSerLlamado() {
		return deseaSerLlamado;
	}


	public void setDeseaSerLlamado(Boolean deseaSerLlamado) {
		this.deseaSerLlamado = deseaSerLlamado;
	}


	@Override
	public String toString() {
		return "Contacto [nombreApellido=" + nombreApellido + ", celular=" + celular + ", email=" + email
				+ ", direccion=" + direccion + ", cp=" + cp + ", localidad=" + localidad + ", provincia=" + provincia
				+ ", esCliente=" + esCliente + ", deseaSerLlamado=" + deseaSerLlamado + "]";
	}
	
	
	
}
