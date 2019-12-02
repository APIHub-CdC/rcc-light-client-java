package io.apihub.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.apihub.client.model.CatalogoEstadoCivil;
import io.apihub.client.model.CatalogoResidencia;
import io.apihub.client.model.CatalogoSexo;
import io.apihub.client.model.Domicilio;

@ApiModel(description = "Datos generales de la persona a consultar.")

public class PersonaPeticion {
	@SerializedName("primerNombre")
	private String primerNombre = null;
	@SerializedName("segundoNombre")
	private String segundoNombre = null;
	@SerializedName("apellidoPaterno")
	private String apellidoPaterno = null;
	@SerializedName("apellidoMaterno")
	private String apellidoMaterno = null;
	@SerializedName("apellidoAdicional")
	private String apellidoAdicional = null;
	@SerializedName("fechaNacimiento")
	private String fechaNacimiento = null;
	@SerializedName("rfc")
	private String rfc = null;
	@SerializedName("curp")
	private String curp = null;
	@SerializedName("numeroSeguridadSocial")
	private String numeroSeguridadSocial = null;
	@SerializedName("nacionalidad")
	private String nacionalidad = null;
	@SerializedName("residencia")
	private CatalogoResidencia residencia = null;
	@SerializedName("estadoCivil")
	private CatalogoEstadoCivil estadoCivil = null;
	@SerializedName("sexo")
	private CatalogoSexo sexo = null;
	@SerializedName("claveElector")
	private String claveElector = null;
	@SerializedName("numeroDependientes")
	private String numeroDependientes = null;
	@SerializedName("fechaDefuncion")
	private String fechaDefuncion = null;
	@SerializedName("domicilio")
	private Domicilio domicilio = null;

	public PersonaPeticion primerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
		return this;
	}

	@ApiModelProperty(example = "ROBERTO", required = true, value = "Primer nombre de la persona")
	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public PersonaPeticion segundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
		return this;
	}

	@ApiModelProperty(value = "Segundo nombre de la persona")
	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public PersonaPeticion apellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
		return this;
	}

	@ApiModelProperty(example = "SAHAGUN", required = true, value = "Apellido paterno de la persona")
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public PersonaPeticion apellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
		return this;
	}

	@ApiModelProperty(example = "ZARAGOZA", required = true, value = "Apellido materno de la persona")
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public PersonaPeticion apellidoAdicional(String apellidoAdicional) {
		this.apellidoAdicional = apellidoAdicional;
		return this;
	}

	@ApiModelProperty(value = "Apellido adicional de la persona, si tuviere")
	public String getApellidoAdicional() {
		return apellidoAdicional;
	}

	public void setApellidoAdicional(String apellidoAdicional) {
		this.apellidoAdicional = apellidoAdicional;
	}

	public PersonaPeticion fechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
		return this;
	}

	@ApiModelProperty(example = "2001-01-01", required = true, value = "Fecha de nacimiento de la persona, en el formato especificado (por defecto yyyy-MM-dd)")
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public PersonaPeticion rfc(String rfc) {
		this.rfc = rfc;
		return this;
	}

	@ApiModelProperty(example = "SAZR010101", required = true, value = "RFC con homoclave de la persona")
	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public PersonaPeticion curp(String curp) {
		this.curp = curp;
		return this;
	}

	@ApiModelProperty(example = "SAZR010101HCMLNS09", value = "CURP de la persona, emitida por RENAPO")
	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public PersonaPeticion numeroSeguridadSocial(String numeroSeguridadSocial) {
		this.numeroSeguridadSocial = numeroSeguridadSocial;
		return this;
	}

	@ApiModelProperty(value = "Debe colocar el número con el que el acreditado se encuentra afiliado a una institución de seguro social, el cual se compone por 11 caracteres Solo aplica para INFONAVIT y FOVISSSTE")
	public String getNumeroSeguridadSocial() {
		return numeroSeguridadSocial;
	}

	public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
		this.numeroSeguridadSocial = numeroSeguridadSocial;
	}

	public PersonaPeticion nacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
		return this;
	}

	@ApiModelProperty(value = "Debe contener la clave de la nacionalidad del consumidor los valores posibles son los siguientes: MX = México.")
	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public PersonaPeticion residencia(CatalogoResidencia residencia) {
		this.residencia = residencia;
		return this;
	}

	@ApiModelProperty(value = "")
	public CatalogoResidencia getResidencia() {
		return residencia;
	}

	public void setResidencia(CatalogoResidencia residencia) {
		this.residencia = residencia;
	}

	public PersonaPeticion estadoCivil(CatalogoEstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
		return this;
	}

	@ApiModelProperty(value = "")
	public CatalogoEstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(CatalogoEstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public PersonaPeticion sexo(CatalogoSexo sexo) {
		this.sexo = sexo;
		return this;
	}

	@ApiModelProperty(value = "")
	public CatalogoSexo getSexo() {
		return sexo;
	}

	public void setSexo(CatalogoSexo sexo) {
		this.sexo = sexo;
	}

	public PersonaPeticion claveElector(String claveElector) {
		this.claveElector = claveElector;
		return this;
	}

	@ApiModelProperty(value = "La clave de elector que se encuentra en el IFE/INE.")
	public String getClaveElector() {
		return claveElector;
	}

	public void setClaveElector(String claveElector) {
		this.claveElector = claveElector;
	}

	public PersonaPeticion numeroDependientes(String numeroDependientes) {
		this.numeroDependientes = numeroDependientes;
		return this;
	}

	@ApiModelProperty(value = "Número de personas que dependen de la persona.")
	public String getNumeroDependientes() {
		return numeroDependientes;
	}

	public void setNumeroDependientes(String numeroDependientes) {
		this.numeroDependientes = numeroDependientes;
	}

	public PersonaPeticion fechaDefuncion(String fechaDefuncion) {
		this.fechaDefuncion = fechaDefuncion;
		return this;
	}

	@ApiModelProperty(example = "9999-01-01", value = "Fecha de nacimiento de la persona, en el formato especificado (por defecto yyyy-MM-dd)")
	public String getFechaDefuncion() {
		return fechaDefuncion;
	}

	public void setFechaDefuncion(String fechaDefuncion) {
		this.fechaDefuncion = fechaDefuncion;
	}

	public PersonaPeticion domicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
		return this;
	}

	@ApiModelProperty(value = "")
	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PersonaPeticion personaPeticion = (PersonaPeticion) o;
		return Objects.equals(this.primerNombre, personaPeticion.primerNombre)
				&& Objects.equals(this.segundoNombre, personaPeticion.segundoNombre)
				&& Objects.equals(this.apellidoPaterno, personaPeticion.apellidoPaterno)
				&& Objects.equals(this.apellidoMaterno, personaPeticion.apellidoMaterno)
				&& Objects.equals(this.apellidoAdicional, personaPeticion.apellidoAdicional)
				&& Objects.equals(this.fechaNacimiento, personaPeticion.fechaNacimiento)
				&& Objects.equals(this.rfc, personaPeticion.rfc) && Objects.equals(this.curp, personaPeticion.curp)
				&& Objects.equals(this.numeroSeguridadSocial, personaPeticion.numeroSeguridadSocial)
				&& Objects.equals(this.nacionalidad, personaPeticion.nacionalidad)
				&& Objects.equals(this.residencia, personaPeticion.residencia)
				&& Objects.equals(this.estadoCivil, personaPeticion.estadoCivil)
				&& Objects.equals(this.sexo, personaPeticion.sexo)
				&& Objects.equals(this.claveElector, personaPeticion.claveElector)
				&& Objects.equals(this.numeroDependientes, personaPeticion.numeroDependientes)
				&& Objects.equals(this.fechaDefuncion, personaPeticion.fechaDefuncion)
				&& Objects.equals(this.domicilio, personaPeticion.domicilio);
	}

	@Override
	public int hashCode() {
		return Objects.hash(primerNombre, segundoNombre, apellidoPaterno, apellidoMaterno, apellidoAdicional,
				fechaNacimiento, rfc, curp, numeroSeguridadSocial, nacionalidad, residencia, estadoCivil, sexo,
				claveElector, numeroDependientes, fechaDefuncion, domicilio);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PersonaPeticion {\n");

		sb.append("    primerNombre: ").append(toIndentedString(primerNombre)).append("\n");
		sb.append("    segundoNombre: ").append(toIndentedString(segundoNombre)).append("\n");
		sb.append("    apellidoPaterno: ").append(toIndentedString(apellidoPaterno)).append("\n");
		sb.append("    apellidoMaterno: ").append(toIndentedString(apellidoMaterno)).append("\n");
		sb.append("    apellidoAdicional: ").append(toIndentedString(apellidoAdicional)).append("\n");
		sb.append("    fechaNacimiento: ").append(toIndentedString(fechaNacimiento)).append("\n");
		sb.append("    rfc: ").append(toIndentedString(rfc)).append("\n");
		sb.append("    curp: ").append(toIndentedString(curp)).append("\n");
		sb.append("    numeroSeguridadSocial: ").append(toIndentedString(numeroSeguridadSocial)).append("\n");
		sb.append("    nacionalidad: ").append(toIndentedString(nacionalidad)).append("\n");
		sb.append("    residencia: ").append(toIndentedString(residencia)).append("\n");
		sb.append("    estadoCivil: ").append(toIndentedString(estadoCivil)).append("\n");
		sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
		sb.append("    claveElector: ").append(toIndentedString(claveElector)).append("\n");
		sb.append("    numeroDependientes: ").append(toIndentedString(numeroDependientes)).append("\n");
		sb.append("    fechaDefuncion: ").append(toIndentedString(fechaDefuncion)).append("\n");
		sb.append("    domicilio: ").append(toIndentedString(domicilio)).append("\n");
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
