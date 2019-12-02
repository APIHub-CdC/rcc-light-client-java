package io.apihub.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.apihub.client.model.CatalogoMoneda;
import io.apihub.client.model.CatalogoTipoResponsabilidad;

@ApiModel(description = "Datos de consultas.")

public class Consulta {
	@SerializedName("fechaConsulta")
	private String fechaConsulta = null;
	@SerializedName("claveOtorgante")
	private String claveOtorgante = null;
	@SerializedName("nombreOtorgante")
	private String nombreOtorgante = null;
	@SerializedName("direccionOtorgante")
	private String direccionOtorgante = null;
	@SerializedName("telefonoOtorgante")
	private String telefonoOtorgante = null;
	@SerializedName("tipoCredito")
	private String tipoCredito = null;
	@SerializedName("importeCredito")
	private String importeCredito = null;
	@SerializedName("tipoResponsabilidad")
	private CatalogoTipoResponsabilidad tipoResponsabilidad = null;
	@SerializedName("claveUnidadMonetaria")
	private CatalogoMoneda claveUnidadMonetaria = null;
	@SerializedName("idDomicilio")
	private String idDomicilio = null;
	@SerializedName("servicios")
	private String servicios = null;

	public Consulta fechaConsulta(String fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
		return this;
	}

	@ApiModelProperty(value = "Fecha de la consulta.")
	public String getFechaConsulta() {
		return fechaConsulta;
	}

	public void setFechaConsulta(String fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}

	public Consulta claveOtorgante(String claveOtorgante) {
		this.claveOtorgante = claveOtorgante;
		return this;
	}

	@ApiModelProperty(value = "Clave del otorgante.")
	public String getClaveOtorgante() {
		return claveOtorgante;
	}

	public void setClaveOtorgante(String claveOtorgante) {
		this.claveOtorgante = claveOtorgante;
	}

	public Consulta nombreOtorgante(String nombreOtorgante) {
		this.nombreOtorgante = nombreOtorgante;
		return this;
	}

	@ApiModelProperty(value = "Nombre del Otorgante.")
	public String getNombreOtorgante() {
		return nombreOtorgante;
	}

	public void setNombreOtorgante(String nombreOtorgante) {
		this.nombreOtorgante = nombreOtorgante;
	}

	public Consulta direccionOtorgante(String direccionOtorgante) {
		this.direccionOtorgante = direccionOtorgante;
		return this;
	}

	@ApiModelProperty(value = "Dirección del otorgante.")
	public String getDireccionOtorgante() {
		return direccionOtorgante;
	}

	public void setDireccionOtorgante(String direccionOtorgante) {
		this.direccionOtorgante = direccionOtorgante;
	}

	public Consulta telefonoOtorgante(String telefonoOtorgante) {
		this.telefonoOtorgante = telefonoOtorgante;
		return this;
	}

	@ApiModelProperty(value = "Número telefónico del otorgante.")
	public String getTelefonoOtorgante() {
		return telefonoOtorgante;
	}

	public void setTelefonoOtorgante(String telefonoOtorgante) {
		this.telefonoOtorgante = telefonoOtorgante;
	}

	public Consulta tipoCredito(String tipoCredito) {
		this.tipoCredito = tipoCredito;
		return this;
	}

	@ApiModelProperty(value = "Tipo de crédito que se solicitó.")
	public String getTipoCredito() {
		return tipoCredito;
	}

	public void setTipoCredito(String tipoCredito) {
		this.tipoCredito = tipoCredito;
	}

	public Consulta importeCredito(String importeCredito) {
		this.importeCredito = importeCredito;
		return this;
	}

	@ApiModelProperty(value = "Monto solicitado.")
	public String getImporteCredito() {
		return importeCredito;
	}

	public void setImporteCredito(String importeCredito) {
		this.importeCredito = importeCredito;
	}

	public Consulta tipoResponsabilidad(CatalogoTipoResponsabilidad tipoResponsabilidad) {
		this.tipoResponsabilidad = tipoResponsabilidad;
		return this;
	}

	@ApiModelProperty(value = "")
	public CatalogoTipoResponsabilidad getTipoResponsabilidad() {
		return tipoResponsabilidad;
	}

	public void setTipoResponsabilidad(CatalogoTipoResponsabilidad tipoResponsabilidad) {
		this.tipoResponsabilidad = tipoResponsabilidad;
	}

	public Consulta claveUnidadMonetaria(CatalogoMoneda claveUnidadMonetaria) {
		this.claveUnidadMonetaria = claveUnidadMonetaria;
		return this;
	}

	@ApiModelProperty(value = "")
	public CatalogoMoneda getClaveUnidadMonetaria() {
		return claveUnidadMonetaria;
	}

	public void setClaveUnidadMonetaria(CatalogoMoneda claveUnidadMonetaria) {
		this.claveUnidadMonetaria = claveUnidadMonetaria;
	}

	public Consulta idDomicilio(String idDomicilio) {
		this.idDomicilio = idDomicilio;
		return this;
	}

	@ApiModelProperty(value = "Identificador de domicilio asociado al elemento Domicilio. Esta etiqueta solo se presenta para los productos que incluyen detalle de Domicilios.")
	public String getIdDomicilio() {
		return idDomicilio;
	}

	public void setIdDomicilio(String idDomicilio) {
		this.idDomicilio = idDomicilio;
	}

	public Consulta servicios(String servicios) {
		this.servicios = servicios;
		return this;
	}

	@ApiModelProperty(value = "Los valores posibles son 0 = Sin servicios ó 1 = Servicios al hogar")
	public String getServicios() {
		return servicios;
	}

	public void setServicios(String servicios) {
		this.servicios = servicios;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Consulta consulta = (Consulta) o;
		return Objects.equals(this.fechaConsulta, consulta.fechaConsulta)
				&& Objects.equals(this.claveOtorgante, consulta.claveOtorgante)
				&& Objects.equals(this.nombreOtorgante, consulta.nombreOtorgante)
				&& Objects.equals(this.direccionOtorgante, consulta.direccionOtorgante)
				&& Objects.equals(this.telefonoOtorgante, consulta.telefonoOtorgante)
				&& Objects.equals(this.tipoCredito, consulta.tipoCredito)
				&& Objects.equals(this.importeCredito, consulta.importeCredito)
				&& Objects.equals(this.tipoResponsabilidad, consulta.tipoResponsabilidad)
				&& Objects.equals(this.claveUnidadMonetaria, consulta.claveUnidadMonetaria)
				&& Objects.equals(this.idDomicilio, consulta.idDomicilio)
				&& Objects.equals(this.servicios, consulta.servicios);
	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaConsulta, claveOtorgante, nombreOtorgante, direccionOtorgante, telefonoOtorgante,
				tipoCredito, importeCredito, tipoResponsabilidad, claveUnidadMonetaria, idDomicilio, servicios);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Consulta {\n");

		sb.append("    fechaConsulta: ").append(toIndentedString(fechaConsulta)).append("\n");
		sb.append("    claveOtorgante: ").append(toIndentedString(claveOtorgante)).append("\n");
		sb.append("    nombreOtorgante: ").append(toIndentedString(nombreOtorgante)).append("\n");
		sb.append("    direccionOtorgante: ").append(toIndentedString(direccionOtorgante)).append("\n");
		sb.append("    telefonoOtorgante: ").append(toIndentedString(telefonoOtorgante)).append("\n");
		sb.append("    tipoCredito: ").append(toIndentedString(tipoCredito)).append("\n");
		sb.append("    importeCredito: ").append(toIndentedString(importeCredito)).append("\n");
		sb.append("    tipoResponsabilidad: ").append(toIndentedString(tipoResponsabilidad)).append("\n");
		sb.append("    claveUnidadMonetaria: ").append(toIndentedString(claveUnidadMonetaria)).append("\n");
		sb.append("    idDomicilio: ").append(toIndentedString(idDomicilio)).append("\n");
		sb.append("    servicios: ").append(toIndentedString(servicios)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
