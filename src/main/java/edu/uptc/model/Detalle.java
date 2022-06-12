package edu.uptc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
@JsonSerialize
@Entity
@Table(name = "detalle")
public class Detalle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "num_detalle")
	private int num_detalle;
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "num_factura", nullable = false)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Factura factura;
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "id_producto", nullable = false)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Producto producto;
	@Column(name = "cantidad" , nullable = false)
	private int cantidad;
	@Column(name = "precio" , nullable = false)
	private double precio;
	public int getNum_detalle() {
		return num_detalle;
	}
	public void setNum_detalle(int num_detalle) {
		this.num_detalle = num_detalle;
	}
	public Factura getFactura() {
		return factura;
	}
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
