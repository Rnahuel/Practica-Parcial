package interfaz;

import static org.junit.Assert.*;

import org.junit.Test;

import dominio.CallCenter;
import dominio.Contacto;
import dominio.Provincia;

public class test {

	@Test
	public void queDevuelvaUnContacto() {
		CallCenter oesteCableColor = new CallCenter();
		Contacto juan = new Contacto("juanchupapija", 1552152325, "asdasd", "adsdasd", 1745, "casanova", Provincia.BUENOS_AIRES, false, true);
		Contacto mari = new Contacto ("mari", 1512141412, "asdads", "asdada", 1754, "san justo", Provincia.BUENOS_AIRES, true, false);
				
		oesteCableColor.cargarContacto(juan);
		oesteCableColor.cargarContacto(mari);
		
		Contacto valorEsperado = juan;
		Contacto valorObtenido = oesteCableColor.buscarAlCandidato();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queCargueUnContacto() {
		CallCenter oesteCableColor = new CallCenter();
		Contacto juan = new Contacto("juanchupapija", 1552152325, "asdasd", "adsdasd", 1745, "casanova", Provincia.BUENOS_AIRES, false, true);
		Boolean seCargo= oesteCableColor.cargarContacto(juan);
		
		assertTrue(seCargo);
	}
	
	@Test
	public void queFuncioneElVerificadorDeEmail() {
		CallCenter oesteCableColor = new CallCenter();
		Contacto juan = new Contacto("juanchupapija", 1552152325, "asdasd@gmail.com", "adsdasd", 1745, "casanova", Provincia.BUENOS_AIRES, false, true);
		
		Boolean emailValido= juan.esEmailValido("asdasd@gmail.com");
		
		assertTrue(emailValido);
	}
	
}
