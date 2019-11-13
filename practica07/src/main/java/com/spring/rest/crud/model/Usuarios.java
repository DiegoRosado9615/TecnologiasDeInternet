package com.spring.rest.crud.model;
// Generated Feb 18, 2019 3:40:54 PM by Hibernate Tools 5.3.0.Beta2

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.JoinColumn;

/**
 * Usuarios generated by hbm2java
 */
@Entity
@Table(name="usuarios")
public class Usuarios implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8928451151316109515L;
	
	@Id
	@GeneratedValue
	private Integer id_usuario;
	
	private Integer no_expediente;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yy")
	private Date fecha_ultima_consulta;
	private String tipo_sangre;
    @ManyToMany(
    		fetch = FetchType.EAGER,
    		cascade = { CascadeType.ALL }
    		)
    
    @JoinTable(
 
    	name = "usuarios_recetas",
        joinColumns = { @JoinColumn(name = "usuarios_id_usuario") }, 
        inverseJoinColumns = { @JoinColumn(name = "recetas_id_receta") }
    )

    private Set<Recetas> recetas = new HashSet(0);
    


	public Usuarios() {
	}

	public Usuarios(Integer noExpediente, Date fechaUltimaConsulta, String tipoSangre, Set<Recetas> recetas) {
		this.no_expediente = noExpediente;
		this.fecha_ultima_consulta = fechaUltimaConsulta;
		this.tipo_sangre = tipoSangre;
		this.recetas = recetas;
	}

	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public Integer getNo_expediente() {
		return no_expediente;
	}

	public void setNo_expediente(Integer no_expediente) {
		this.no_expediente = no_expediente;
	}

	public Date getFecha_ultima_consulta() {
		return fecha_ultima_consulta;
	}

	public void setFecha_ultima_consulta(Date fecha_ultima_consulta) {
		this.fecha_ultima_consulta = fecha_ultima_consulta;
	}

	public String getTipo_sangre() {
		return tipo_sangre;
	}

	public void setTipo_sangre(String tipo_sangre) {
		this.tipo_sangre = tipo_sangre;
	}

	
	public Set<Recetas> getRecetas(){
		return recetas;
	}
	
	public void setRecetas(Set<Recetas> recetas) {
		this.recetas = recetas;
	}
}