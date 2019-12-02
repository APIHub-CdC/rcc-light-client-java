package io.apihub.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.apihub.client.model.PersonaPLD;
import java.util.ArrayList;
import java.util.List;

@ApiModel(description = "Si existen errores, se listarán")

public class PersonasPLD {
	@SerializedName("pld")
	private List<PersonaPLD> pld = null;

	public PersonasPLD pld(List<PersonaPLD> pld) {
		this.pld = pld;
		return this;
	}

	public PersonasPLD addPldItem(PersonaPLD pldItem) {
		if (this.pld == null) {
			this.pld = new ArrayList<PersonaPLD>();
		}
		this.pld.add(pldItem);
		return this;
	}

	@ApiModelProperty(value = "")
	public List<PersonaPLD> getPld() {
		return pld;
	}

	public void setPld(List<PersonaPLD> pld) {
		this.pld = pld;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PersonasPLD personasPLD = (PersonasPLD) o;
		return Objects.equals(this.pld, personasPLD.pld);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pld);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PersonasPLD {\n");

		sb.append("    pld: ").append(toIndentedString(pld)).append("\n");
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
