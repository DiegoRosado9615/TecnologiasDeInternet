package Control;

import Formas.Usuario;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import BaseDeDatos.ConexionBase;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
@Controller

public class ControlForma {
	
	@RequestMapping( value = "/addUsuario", method = RequestMethod.POST )
	public String addContact( @ModelAttribute( "usuario") Usuario usuario, BindingResult result) {
		
		String nombre = usuario.getPrimerNombre();	
		
		String email = usuario.getEmail();
		String telefono =  usuario.getTelefono();
		String sexo  = usuario.getSexo();
		String serie =  usuario.getSerie();
		String musica =  usuario.getMusica();
		
		
		 
		
		String patronEmail ="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		String patronTelefono = "^[0-9]+";
		
		
		Pattern patternEmail = Pattern.compile(patronEmail);
		Matcher matcherEmail = patternEmail.matcher(email);
		Pattern patternTelefono = Pattern.compile(patronTelefono);
		Matcher telefonoMatcher = patternTelefono.matcher(telefono);
		ConexionBase conn =  new ConexionBase();
			
					
						if(matcherEmail.matches()) {
							if(telefonoMatcher.matches() && telefono.length() <= 10) {
								if(conn.addContact(usuario)) {
									System.out.println("Usuario registrado con éxito");
								}else{
									System.out.println("Ocurrió un fallo al registrar el contacto" );
								}
								
							}else {
								System.out.println("Teléfono inválido" );	
							}
							
							
						}else {
							System.out.println("Email inválido");
							
						}
					
						
				
		
		
		
		

		System.out.println("Datos del usuario");
		System.out.println( "Nombre: " + nombre );
		System.out.println( "Email: " + email );	
		System.out.println( "Telefono: " + telefono );	
		System.out.println( "Sexo: " + sexo );	
		System.out.println(	"Serie: " + serie);
		System.out.println( "Música: " +  musica);
		return "redirect:usuarios.html";		
	}	
	@RequestMapping( "/usuarios" )
	public ModelAndView showContacts() {
				
		return new ModelAndView( "usuario", "command", new Usuario() );
		
	}
}
