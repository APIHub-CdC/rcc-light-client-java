package io.apihub.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.apihub.client.model.CatalogoEstados;
import io.apihub.client.model.CatalogoTipoAsentamiento;
import io.apihub.client.model.CatalogoTipoDomicilio;

@ApiModel(description = "Datos del domicilio de la persona a consultar")

public class Domicilio {
	@SerializedName("direccion")
	private String direccion = null;
	@SerializedName("colonia")
	private String colonia = null;
	@SerializedName("municipio")
	private String municipio = null;
	@SerializedName("ciudad")
	private String ciudad = null;
	@SerializedName("estado")
	private CatalogoEstados estado = null;
	@SerializedName("codigoPostal")
	private String codigoPostal = null;
	@SerializedName("fechaResidencia")
	private String fechaResidencia = null;
	@SerializedName("numeroTelefono")
	private String numeroTelefono = null;
	@SerializedName("tipoDomicilio")
	private CatalogoTipoDomicilio tipoDomicilio = null;
	@SerializedName("tipoAsentamiento")
	private CatalogoTipoAsentamiento tipoAsentamiento = null;

	public Domicilio direccion(String direccion) {
		this.direccion = direccion;
		return this;
	}

	@ApiModelProperty(example = "HIDALGO 32", required = true, value = "Reportar el nombre de la calle, número exterior, número interior. Deben considerarse avenida,cerrada, manzana, lote, edificio,departamento etc. Debe contener por lo menos dos cadenas de caracteres para que el registro sea válido, de lo contrario el registro será rechazado.")
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Domicilio colonia(String colonia) {
		this.colonia = colonia;
		return this;
	}

	@ApiModelProperty(example = "CENTRO", required = true, value = "Reportar la colonia a la cual pertenece la dirección contenida en el elemento dirección.")
	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public Domicilio municipio(String municipio) {
		this.municipio = municipio;
		return this;
	}

	@ApiModelProperty(example = "LA BARCA", required = true, value = "Reportar la delegación o municipio a la cual pertenece la dirección contenida en el elemento Dirección.")
	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public Domicilio ciudad(String ciudad) {
		this.ciudad = ciudad;
		return this;
	}

	@ApiModelProperty(example = "BENITO JUAREZ", required = true, value = "Reportar la ciudad a la cual pertenece la dirección contenida en el elemento Dirección.")
	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Domicilio estado(CatalogoEstados estado) {
		this.estado = estado;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	public CatalogoEstados getEstado() {
		return estado;
	}

	public void setEstado(CatalogoEstados estado) {
		this.estado = estado;
	}

	public Domicilio codigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
		return this;
	}

	@ApiModelProperty(example = "47917", required = true, value = "El código postal reportado debeestar compuesto por 5 dígitos. Para que el código postal sea válido deberá corresponder al estado reportado.")
	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public Domicilio fechaResidencia(String fechaResidencia) {
		this.fechaResidencia = fechaResidencia;
		return this;
	}

	@ApiModelProperty(value = "Debe de reportarse la fecha desde cuando el consumidor vive en la  dirección reportada.")
	public String getFechaResidencia() {
		return fechaResidencia;
	}

	public void setFechaResidencia(String fechaResidencia) {
		this.fechaResidencia = fechaResidencia;
	}

	public Domicilio numeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
		return this;
	}

	@ApiModelProperty(value = "Debe de contener una longitud mínima de 5 caracteres, cada caracter debe ser un número de 0-9, si se ingresa cualquier otro caracter el registro será rechazado.")
	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public Domicilio tipoDomicilio(CatalogoTipoDomicilio tipoDomicilio) {
		this.tipoDomicilio = tipoDomicilio;
		return this;
	}

	@ApiModelProperty(value = "")
	public CatalogoTipoDomicilio getTipoDomicilio() {
		return tipoDomicilio;
	}

	public void setTipoDomicilio(CatalogoTipoDomicilio tipoDomicilio) {
		this.tipoDomicilio = tipoDomicilio;
	}

	public Domicilio tipoAsentamiento(CatalogoTipoAsentamiento tipoAsentamiento) {
		this.tipoAsentamiento = tipoAsentamiento;
		return this;
	}

	@ApiModelProperty(value = "")
	public CatalogoTipoAsentamiento getTipoAsentamiento() {
		return tipoAsentamiento;
	}

	public void setTipoAsentamiento(CatalogoTipoAsentamiento tipoAsentamiento) {
		this.tipoAsentamiento = tipoAsentamiento;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Domicilio domicilio = (Domicilio) o;
		return Objects.equals(this.direccion, domicilio.direccion) && Objects.equals(this.colonia, domicilio.colonia)
				&& Objects.equals(this.municipio, domicilio.municipio) && Objects.equals(this.ciudad, domicilio.ciudad)
				&& Objects.equals(this.estado, domicilio.estado)
				&& Objects.equals(this.codigoPostal, domicilio.codigoPostal)
				&& Objects.equals(this.fechaResidencia, domicilio.fechaResidencia)
				&& Objects.equals(this.numeroTelefono, domicilio.numeroTelefono)
				&& Objects.equals(this.tipoDomicilio, domicilio.tipoDomicilio)
				&& Objects.equals(this.tipoAsentamiento, domicilio.tipoAsentamiento);
	}

	@Override
	public int hashCode() {
		return Objects.hash(direccion, colonia, municipio, ciudad, estado, codigoPostal, fechaResidencia,
				numeroTelefono, tipoDomicilio, tipoAsentamiento);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Domicilio {\n");

		sb.append("    direccion: ").append(toIndentedString(direccion)).append("\n");
		sb.append("    colonia: ").append(toIndentedString(colonia)).append("\n");
		sb.append("    municipio: ").append(toIndentedString(municipio)).append("\n");
		sb.append("    ciudad: ").append(toIndentedString(ciudad)).append("\n");
		sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
		sb.append("    codigoPostal: ").append(toIndentedString(codigoPostal)).append("\n");
		sb.append("    fechaResidencia: ").append(toIndentedString(fechaResidencia)).append("\n");
		sb.append("    numeroTelefono: ").append(toIndentedString(numeroTelefono)).append("\n");
		sb.append("    tipoDomicilio: ").append(toIndentedString(tipoDomicilio)).append("\n");
		sb.append("    tipoAsentamiento: ").append(toIndentedString(tipoAsentamiento)).append("\n");
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
