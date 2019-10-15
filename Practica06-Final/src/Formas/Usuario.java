package Formas;

public class Usuario {
	
	private String primerNombre;
	private String email;
	private String telefono;
	private String sexo;
	private String serie;
	private String musica;
	
	public String getPrimerNombre() {
		return primerNombre;
	}
	public void setPrimerNombre(String nombre) {
		this.primerNombre = nombre;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getSexo() {
		return this.sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getSerie(){
		return this.serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public String getMusica(){
		return this.musica;
	}
	public void setMusica(String musica) {
		this.musica = musica;
	}
}
