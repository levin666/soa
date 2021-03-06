package co.edu.ucentral.app.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Detalles")
public class Detalle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String autor;
	private Date fechaFilmacion;
	private String resumen;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Date getFechaFilmacion() {
		return fechaFilmacion;
	}

	public void setFechaFilmacion(Date fechaFilmacion) {
		this.fechaFilmacion = fechaFilmacion;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	@Override
	public String toString() {
		return "Detalle [id=" + id + ", autor=" + autor + ", fechaFilmacion=" + fechaFilmacion + ", resumen=" + resumen
				+ "]";
	}

}
