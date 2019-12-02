package io.apihub.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.apihub.client.model.Razon;
import java.util.ArrayList;
import java.util.List;

@ApiModel(description = "")

public class Score {
	@SerializedName("nombreScore")
	private String nombreScore = null;
	@SerializedName("score")
	private String score = null;
	@SerializedName("razones")
	private List<Razon> razones = null;

	public Score nombreScore(String nombreScore) {
		this.nombreScore = nombreScore;
		return this;
	}

	@ApiModelProperty(example = "FICO", value = "Nombre del tipo de score")
	public String getNombreScore() {
		return nombreScore;
	}

	public void setNombreScore(String nombreScore) {
		this.nombreScore = nombreScore;
	}

	public Score score(String score) {
		this.score = score;
		return this;
	}

	@ApiModelProperty(value = "Calificación que obtuvo la persona evaluada.")
	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public Score razones(List<Razon> razones) {
		this.razones = razones;
		return this;
	}

	public Score addRazonesItem(Razon razonesItem) {
		if (this.razones == null) {
			this.razones = new ArrayList<Razon>();
		}
		this.razones.add(razonesItem);
		return this;
	}

	@ApiModelProperty(value = "Razones por las que se generó el score.")
	public List<Razon> getRazones() {
		return razones;
	}

	public void setRazones(List<Razon> razones) {
		this.razones = razones;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Score score = (Score) o;
		return Objects.equals(this.nombreScore, score.nombreScore) && Objects.equals(this.score, score.score)
				&& Objects.equals(this.razones, score.razones);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombreScore, score, razones);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Score {\n");

		sb.append("    nombreScore: ").append(toIndentedString(nombreScore)).append("\n");
		sb.append("    score: ").append(toIndentedString(score)).append("\n");
		sb.append("    razones: ").append(toIndentedString(razones)).append("\n");
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
