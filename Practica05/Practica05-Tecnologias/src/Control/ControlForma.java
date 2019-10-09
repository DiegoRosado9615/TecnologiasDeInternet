package Control;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import Formas.Contacto;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
@Controller

public class ControlForma {

	@RequestMapping( value = "/addContact", method = RequestMethod.POST )
	
	public String addContact( @ModelAttribute( "contacto") Contacto contacto, BindingResult result) {
		System.out.println("Datos del usuario");
		System.out.println( "Nombre: " + contacto.getNombre() );
		System.out.println( "Apellido: " + contacto.getApellido() );	
		System.out.println( "correo electronico : " + contacto.getCorreoElectronico() );	
		System.out.println( "Celular: " + contacto.getCelular() );	
		System.out.println(	"Sexo: " + contacto.getSexo());
		System.out.println( "País: " +  contacto.getPais());
		System.out.println("Tipo sangre " + contacto.getTipoSangre());
		System.out.println("Tu estatura es " + contacto.getEstatura());
		
		String nombre = contacto.getNombre();	
		String paterno = contacto.getApellido();
		String email = contacto.getCorreoElectronico();
		String celular =  contacto.getCelular();
		char  genero =  contacto.getSexo();
		String pais =  contacto.getPais();
		String TipoSangre=contacto.getTipoSangre();
		double estatura=contacto.getEstatura();
		if(verificaCorreo(email)) 
			System.out.println("El correo es válido");
		
		else
			System.out.println("El correo es inválido");
		
		
		return "redirect:contactos.html";		
	}
	private boolean verificaCorreo(String x) {
		 Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
	                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		 Matcher mather = pattern.matcher(x);
		 if (mather.find() == true) {
	            return true;
	        } else {
	            return false;
	        }
	}
	@RequestMapping( "/contactos" )
	public ModelAndView showContacts() {
				
		return new ModelAndView( "contacto", "command", new Contacto() );
		
	}
}
