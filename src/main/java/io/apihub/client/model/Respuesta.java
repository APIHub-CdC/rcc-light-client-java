package io.apihub.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import io.apihub.client.model.Consulta;
import io.apihub.client.model.Credito;
import io.apihub.client.model.Domicilio;
import io.apihub.client.model.Empleo;
import io.apihub.client.model.PersonaPLD;
import io.apihub.client.model.PersonaRespuesta;
import io.apihub.client.model.Score;
import java.util.ArrayList;
import java.util.List;

public class Respuesta {
	@SerializedName("folioConsulta")
	private String folioConsulta = null;
	@SerializedName("persona")
	private PersonaRespuesta persona = null;
	@SerializedName("consultas")
	private List<Consulta> consultas = null;
	@SerializedName("creditos")
	private List<Credito> creditos = null;
	@SerializedName("domicilios")
	private List<Domicilio> domicilios = null;
	@SerializedName("empleos")
	private List<Empleo> empleos = null;
	@SerializedName("scores")
	private List<Score> scores = null;
	@SerializedName("pld")
	private List<PersonaPLD> pld = null;

	public Respuesta folioConsulta(String folioConsulta) {
		this.folioConsulta = folioConsulta;
		return this;
	}

	@ApiModelProperty(example = "386636538", value = "Folio de la consulta")
	public String getFolioConsulta() {
		return folioConsulta;
	}

	public void setFolioConsulta(String folioConsulta) {
		this.folioConsulta = folioConsulta;
	}

	public Respuesta persona(PersonaRespuesta persona) {
		this.persona = persona;
		return this;
	}

	@ApiModelProperty(value = "")
	public PersonaRespuesta getPersona() {
		return persona;
	}

	public void setPersona(PersonaRespuesta persona) {
		this.persona = persona;
	}

	public Respuesta consultas(List<Consulta> consultas) {
		this.consultas = consultas;
		return this;
	}

	public Respuesta addConsultasItem(Consulta consultasItem) {
		if (this.consultas == null) {
			this.consultas = new ArrayList<Consulta>();
		}
		this.consultas.add(consultasItem);
		return this;
	}

	@ApiModelProperty(value = "")
	public List<Consulta> getConsultas() {
		return consultas;
	}

	public void setConsultas(List<Consulta> consultas) {
		this.consultas = consultas;
	}

	public Respuesta creditos(List<Credito> creditos) {
		this.creditos = creditos;
		return this;
	}

	public Respuesta addCreditosItem(Credito creditosItem) {
		if (this.creditos == null) {
			this.creditos = new ArrayList<Credito>();
		}
		this.creditos.add(creditosItem);
		return this;
	}

	@ApiModelProperty(value = "")
	public List<Credito> getCreditos() {
		return creditos;
	}

	public void setCreditos(List<Credito> creditos) {
		this.creditos = creditos;
	}

	public Respuesta domicilios(List<Domicilio> domicilios) {
		this.domicilios = domicilios;
		return this;
	}

	public Respuesta addDomiciliosItem(Domicilio domiciliosItem) {
		if (this.domicilios == null) {
			this.domicilios = new ArrayList<Domicilio>();
		}
		this.domicilios.add(domiciliosItem);
		return this;
	}

	@ApiModelProperty(value = "")
	public List<Domicilio> getDomicilios() {
		return domicilios;
	}

	public void setDomicilios(List<Domicilio> domicilios) {
		this.domicilios = domicilios;
	}

	public Respuesta empleos(List<Empleo> empleos) {
		this.empleos = empleos;
		return this;
	}

	public Respuesta addEmpleosItem(Empleo empleosItem) {
		if (this.empleos == null) {
			this.empleos = new ArrayList<Empleo>();
		}
		this.empleos.add(empleosItem);
		return this;
	}

	@ApiModelProperty(value = "")
	public List<Empleo> getEmpleos() {
		return empleos;
	}

	public void setEmpleos(List<Empleo> empleos) {
		this.empleos = empleos;
	}

	public Respuesta scores(List<Score> scores) {
		this.scores = scores;
		return this;
	}

	public Respuesta addScoresItem(Score scoresItem) {
		if (this.scores == null) {
			this.scores = new ArrayList<Score>();
		}
		this.scores.add(scoresItem);
		return this;
	}

	@ApiModelProperty(value = "")
	public List<Score> getScores() {
		return scores;
	}

	public void setScores(List<Score> scores) {
		this.scores = scores;
	}

	public Respuesta pld(List<PersonaPLD> pld) {
		this.pld = pld;
		return this;
	}

	public Respuesta addPldItem(PersonaPLD pldItem) {
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
		Respuesta respuesta = (Respuesta) o;
		return Objects.equals(this.folioConsulta, respuesta.folioConsulta)
				&& Objects.equals(this.persona, respuesta.persona)
				&& Objects.equals(this.consultas, respuesta.consultas)
				&& Objects.equals(this.creditos, respuesta.creditos)
				&& Objects.equals(this.domicilios, respuesta.domicilios)
				&& Objects.equals(this.empleos, respuesta.empleos) && Objects.equals(this.scores, respuesta.scores)
				&& Objects.equals(this.pld, respuesta.pld);
	}

	@Override
	public int hashCode() {
		return Objects.hash(folioConsulta, persona, consultas, creditos, domicilios, empleos, scores, pld);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Respuesta {\n");

		sb.append("    folioConsulta: ").append(toIndentedString(folioConsulta)).append("\n");
		sb.append("    persona: ").append(toIndentedString(persona)).append("\n");
		sb.append("    consultas: ").append(toIndentedString(consultas)).append("\n");
		sb.append("    creditos: ").append(toIndentedString(creditos)).append("\n");
		sb.append("    domicilios: ").append(toIndentedString(domicilios)).append("\n");
		sb.append("    empleos: ").append(toIndentedString(empleos)).append("\n");
		sb.append("    scores: ").append(toIndentedString(scores)).append("\n");
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
