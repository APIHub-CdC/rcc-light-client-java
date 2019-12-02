package io.apihub.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.apihub.client.model.CatalogoEstados;
import io.apihub.client.model.CatalogoMoneda;

@ApiModel(description = "Contiene la información sobre los empleos que ha tenido el consumidor.")

public class Empleo {
	@SerializedName("nombreEmpresa")
	private String nombreEmpresa = null;
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
	@SerializedName("numeroTelefono")
	private String numeroTelefono = null;
	@SerializedName("extension")
	private String extension = null;
	@SerializedName("fax")
	private String fax = null;
	@SerializedName("puesto")
	private String puesto = null;
	@SerializedName("fechaContratacion")
	private String fechaContratacion = null;
	@SerializedName("claveMoneda")
	private CatalogoMoneda claveMoneda = null;
	@SerializedName("salarioMensual")
	private String salarioMensual = null;
	@SerializedName("fechaUltimoDiaEmpleo")
	private String fechaUltimoDiaEmpleo = null;
	@SerializedName("fechaVerificacionEmpleo")
	private String fechaVerificacionEmpleo = null;

	public Empleo nombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
		return this;
	}

	@ApiModelProperty(value = "Nombre o Razón Social de la empresa que emplea al Cliente. Cuando el consumidor sea trabajador independiente, no está asociado a una empresa o no cuenta con un trabajo se reportará uno de los siguientes posibles valores: <ul><li>Trabajador Independiente</li><li>Estudiante</li><li>Labores de Hogar</li><li>Jubilado</li><li>Desempleado</li><li>Exempleado</li></ul>")
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public Empleo direccion(String direccion) {
		this.direccion = direccion;
		return this;
	}

	@ApiModelProperty(example = "HIDALGO 32", value = "Reportar el nombre de la calle, número exterior, número interior. Deben considerarse avenida,cerrada, manzana, lote, edificio,departamento etc. Debe contener por lo menos dos cadenas de caracteres para que el registro sea válido, de lo contrario el registro será rechazado.")
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Empleo colonia(String colonia) {
		this.colonia = colonia;
		return this;
	}

	@ApiModelProperty(example = "CENTRO", value = "Reportar la colonia a la cual pertenece la dirección contenida en el elemento dirección.")
	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public Empleo municipio(String municipio) {
		this.municipio = municipio;
		return this;
	}

	@ApiModelProperty(example = "LA BARCA", value = "Reportar la delegación o municipio a la cual pertenece la dirección contenida en el elemento Dirección.")
	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public Empleo ciudad(String ciudad) {
		this.ciudad = ciudad;
		return this;
	}

	@ApiModelProperty(example = "BENITO JUAREZ", value = "Reportar la ciudad a la cual pertenece la dirección contenida en el elemento Dirección.")
	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Empleo estado(CatalogoEstados estado) {
		this.estado = estado;
		return this;
	}

	@ApiModelProperty(value = "")
	public CatalogoEstados getEstado() {
		return estado;
	}

	public void setEstado(CatalogoEstados estado) {
		this.estado = estado;
	}

	public Empleo codigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
		return this;
	}

	@ApiModelProperty(example = "47917", value = "El código postal reportado debeestar compuesto por 5 dígitos. Para que el código postal sea válido deberá corresponder al estado reportado.")
	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public Empleo numeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
		return this;
	}

	@ApiModelProperty(value = "Número telefónico del empleo.")
	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public Empleo extension(String extension) {
		this.extension = extension;
		return this;
	}

	@ApiModelProperty(example = "", value = "Extensión telefónica.")
	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public Empleo fax(String fax) {
		this.fax = fax;
		return this;
	}

	@ApiModelProperty(value = "Fax.")
	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public Empleo puesto(String puesto) {
		this.puesto = puesto;
		return this;
	}

	@ApiModelProperty(value = "Título o posición de empleo.")
	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public Empleo fechaContratacion(String fechaContratacion) {
		this.fechaContratacion = fechaContratacion;
		return this;
	}

	@ApiModelProperty(value = "Fecha de contratación.")
	public String getFechaContratacion() {
		return fechaContratacion;
	}

	public void setFechaContratacion(String fechaContratacion) {
		this.fechaContratacion = fechaContratacion;
	}

	public Empleo claveMoneda(CatalogoMoneda claveMoneda) {
		this.claveMoneda = claveMoneda;
		return this;
	}

	@ApiModelProperty(value = "")
	public CatalogoMoneda getClaveMoneda() {
		return claveMoneda;
	}

	public void setClaveMoneda(CatalogoMoneda claveMoneda) {
		this.claveMoneda = claveMoneda;
	}

	public Empleo salarioMensual(String salarioMensual) {
		this.salarioMensual = salarioMensual;
		return this;
	}

	@ApiModelProperty(value = "Ingreso Mensual.")
	public String getSalarioMensual() {
		return salarioMensual;
	}

	public void setSalarioMensual(String salarioMensual) {
		this.salarioMensual = salarioMensual;
	}

	public Empleo fechaUltimoDiaEmpleo(String fechaUltimoDiaEmpleo) {
		this.fechaUltimoDiaEmpleo = fechaUltimoDiaEmpleo;
		return this;
	}

	@ApiModelProperty(value = "Fecha del último día que trabajo en esa empresa.")
	public String getFechaUltimoDiaEmpleo() {
		return fechaUltimoDiaEmpleo;
	}

	public void setFechaUltimoDiaEmpleo(String fechaUltimoDiaEmpleo) {
		this.fechaUltimoDiaEmpleo = fechaUltimoDiaEmpleo;
	}

	public Empleo fechaVerificacionEmpleo(String fechaVerificacionEmpleo) {
		this.fechaVerificacionEmpleo = fechaVerificacionEmpleo;
		return this;
	}

	@ApiModelProperty(value = "Fecha en que el otorgante verificó los datos proporcionados por el acreditado.")
	public String getFechaVerificacionEmpleo() {
		return fechaVerificacionEmpleo;
	}

	public void setFechaVerificacionEmpleo(String fechaVerificacionEmpleo) {
		this.fechaVerificacionEmpleo = fechaVerificacionEmpleo;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Empleo empleo = (Empleo) o;
		return Objects.equals(this.nombreEmpresa, empleo.nombreEmpresa)
				&& Objects.equals(this.direccion, empleo.direccion) && Objects.equals(this.colonia, empleo.colonia)
				&& Objects.equals(this.municipio, empleo.municipio) && Objects.equals(this.ciudad, empleo.ciudad)
				&& Objects.equals(this.estado, empleo.estado) && Objects.equals(this.codigoPostal, empleo.codigoPostal)
				&& Objects.equals(this.numeroTelefono, empleo.numeroTelefono)
				&& Objects.equals(this.extension, empleo.extension) && Objects.equals(this.fax, empleo.fax)
				&& Objects.equals(this.puesto, empleo.puesto)
				&& Objects.equals(this.fechaContratacion, empleo.fechaContratacion)
				&& Objects.equals(this.claveMoneda, empleo.claveMoneda)
				&& Objects.equals(this.salarioMensual, empleo.salarioMensual)
				&& Objects.equals(this.fechaUltimoDiaEmpleo, empleo.fechaUltimoDiaEmpleo)
				&& Objects.equals(this.fechaVerificacionEmpleo, empleo.fechaVerificacionEmpleo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombreEmpresa, direccion, colonia, municipio, ciudad, estado, codigoPostal, numeroTelefono,
				extension, fax, puesto, fechaContratacion, claveMoneda, salarioMensual, fechaUltimoDiaEmpleo,
				fechaVerificacionEmpleo);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Empleo {\n");

		sb.append("    nombreEmpresa: ").append(toIndentedString(nombreEmpresa)).append("\n");
		sb.append("    direccion: ").append(toIndentedString(direccion)).append("\n");
		sb.append("    colonia: ").append(toIndentedString(colonia)).append("\n");
		sb.append("    municipio: ").append(toIndentedString(municipio)).append("\n");
		sb.append("    ciudad: ").append(toIndentedString(ciudad)).append("\n");
		sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
		sb.append("    codigoPostal: ").append(toIndentedString(codigoPostal)).append("\n");
		sb.append("    numeroTelefono: ").append(toIndentedString(numeroTelefono)).append("\n");
		sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
		sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
		sb.append("    puesto: ").append(toIndentedString(puesto)).append("\n");
		sb.append("    fechaContratacion: ").append(toIndentedString(fechaContratacion)).append("\n");
		sb.append("    claveMoneda: ").append(toIndentedString(claveMoneda)).append("\n");
		sb.append("    salarioMensual: ").append(toIndentedString(salarioMensual)).append("\n");
		sb.append("    fechaUltimoDiaEmpleo: ").append(toIndentedString(fechaUltimoDiaEmpleo)).append("\n");
		sb.append("    fechaVerificacionEmpleo: ").append(toIndentedString(fechaVerificacionEmpleo)).append("\n");
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
