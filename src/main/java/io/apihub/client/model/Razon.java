package io.apihub.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.apihub.client.model.CatalogoRazones;

@ApiModel(description = "Razones por las que se generó el score")

public class Razon {
	@SerializedName("clave")
	private CatalogoRazones clave = null;
	@SerializedName("descripcion")
	private String descripcion = null;

	public Razon clave(CatalogoRazones clave) {
		this.clave = clave;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	public CatalogoRazones getClave() {
		return clave;
	}

	public void setClave(CatalogoRazones clave) {
		this.clave = clave;
	}

	public Razon descripcion(String descripcion) {
		this.descripcion = descripcion;
		return this;
	}

	@ApiModelProperty(required = true, value = "Descripción de la razón")
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Razon razon = (Razon) o;
		return Objects.equals(this.clave, razon.clave) && Objects.equals(this.descripcion, razon.descripcion);
	}

	@Override
	public int hashCode() {
		return Objects.hash(clave, descripcion);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Razon {\n");

		sb.append("    clave: ").append(toIndentedString(clave)).append("\n");
		sb.append("    descripcion: ").append(toIndentedString(descripcion)).append("\n");
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
