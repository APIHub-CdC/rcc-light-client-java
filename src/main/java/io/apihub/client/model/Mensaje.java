package io.apihub.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "El elemento de Mensaje contiene información acerca de los mensajes emitidos por Círculo de Crédito, este elemento se repite dependiendo del número de mensajes.")

public class Mensaje {
	@SerializedName("tipoMensaje")
	private Integer tipoMensaje = null;
	@SerializedName("leyenda")
	private String leyenda = null;

	public Mensaje tipoMensaje(Integer tipoMensaje) {
		this.tipoMensaje = tipoMensaje;
		return this;
	}

	@ApiModelProperty(example = "2", value = "Descripción del contenido en este campo: <br>1 = Expediente Bloqueado <br>2 = Respuesta otras SIC's<br> 3 = Respuesta General de PLD")
	public Integer getTipoMensaje() {
		return tipoMensaje;
	}

	public void setTipoMensaje(Integer tipoMensaje) {
		this.tipoMensaje = tipoMensaje;
	}

	public Mensaje leyenda(String leyenda) {
		this.leyenda = leyenda;
		return this;
	}

	@ApiModelProperty(example = "Respuesta exitosa de otras SIC's", value = "<p>Contiene la descripción del mensaje. Para la respuesta de otras SIC's ver descripciones en Tabla : Respuestas SIC</p><p>Catálogo Respuestas SIC</p><table><thead><tr><th>Leyenda</th></tr></thead><tbody><tr><td>Respuesta exitosa de otras SIC's</td></tr><tr><td>No se obtuvo respuesta de otras SIC's</td></tr><tr><td>Error en la respuesta otras SIC's</td></tr><tr><td>Sistema no disponible en otras SIC's</td></tr></tbody></table><p>Para PLD los mensajes de respuesta serán enviados en el elemento de Mensaje del Reporte de Crédito para los tipos de mensaje 3:</p><table><thead><tr><th>Nombre Campo</th><th>Longitud</th><th>Ejemplo</th></tr></thead><tbody><tr><td>tipoMensaje</td><td>02</td><td>3</td></tr><tr><td>leyenda</td><td>48</td><td>ABCDEF011190DDMMYYYY</td></tr></tbody></table><ul><li>ABCDEF  Posiciones uno a la seis contiene la abreviatura de la lista en la que hizo coincidencia. En caso de que la descripción se menor a 6 posiciones, se complementará con ceros a la derecha: Ver: Catálogo Listas</li><li>01: Posiciones siete y ocho, contiene el tipo de parentesco. Ver Catálogo \"Tipo Parentesco\"</li><li>11: Posiciones nueve y diez, contiene el tipo de lista en la que fue localizado el expediente. Ver catálogo: \"TipoLista\".</li><li>90: Posiciones once y doce, contiene el tipo de coincidencia. Ver catálogo \"Tipo Coincidencia\"</li><li>DDMMYYYY: Posiciones trece a la veinte contiene la fecha de la consulta.</li></ul><p>En caso de que no exista coincidencia exacta, se enviara el valor \"dummy\" de la siguiente manera:ABCDEF000000000000000001032017. Aparecerán las letras ABCDEF seguido de dieciséis dígitos en 0 y la fecha de consulta.</p><p>Catálogo Tipo Listas</p><table><thead><tr><th>Nombre</th><th>Descripción</th></tr></thead><tbody><tr><td>QEQ</td><td>PEPs Nacionales</td></tr><tr><td>PEP</td><td>PEP's Nacionales con Familiares y Consanguíneos</td></tr><tr><td>FUNC</td><td>Funcionarios que trabajan en el Gobierno (No PEP)</td></tr><tr><td>FAMI</td><td>Familiares de los funcionarios</td></tr><tr><td>VENC</td><td>Vencidos (Ex PEP más de un año)</td></tr><tr><td>PEPINT</td><td>PEPs Internacionales</td></tr><tr><td>HMT</td><td>Her Majesty's Treasury</td></tr><tr><td>ONUAQ</td><td>Lista de Terroristas Al Qaida</td></tr><tr><td>ICE</td><td>US Immigration and Customs Enforcement</td></tr><tr><td>DFAT</td><td>Department of Foreign Affairs and Trade</td></tr><tr><td>ONUTAL</td><td>Lista de Terroristas Talibanes</td></tr><tr><td>BID</td><td>Banco Interamericano de Desarrollo</td></tr><tr><td>PGJ</td><td>Procuraduría General de Justicia</td></tr><tr><td>BM</td><td>Banco Mundial</td></tr><tr><td>INTP</td><td>Interpol Organización Internacional de Policía Criminal</td></tr><tr><td>EPA</td><td>Environmental Protection Agency</td></tr><tr><td>ATF</td><td>Bureau of Alcohol, Tobacco, Firearms and Explosives</td></tr><tr><td>USMS</td><td>US Marshals Servicies</td></tr><tr><td>SSEU</td><td>Secret Service</td></tr><tr><td>PIS</td><td>Postal Inspection Service</td></tr><tr><td>OFAC</td><td>Office of Foreingn Assets Control</td></tr><tr><td>DEA</td><td>Drug Enforcement Administration</td></tr><tr><td>BIS</td><td>Bureau of Industry and Security</td></tr><tr><td>BOE</td><td>Bank of England</td></tr><tr><td>OSFI</td><td>Office of the Superintendent of Financial Institutions</td></tr><tr><td>PGR</td><td>Procuraduría General de la República</td></tr><tr><td>LMW</td><td>London Most Wanted</td></tr><tr><td>UKMW</td><td>United Kingdom Most Wanted</td></tr><tr><td>SANC</td><td>Funcionarios Sancionados</td></tr><tr><td>SAT69</td><td>Contribuyentes Incumplidos</td></tr><tr><td>SAT69B</td><td>Contribuyentes que emitieron comprobantes fiscales que simulan operaciones inexistentes</td></tr></tbody></table><p>Catálogo: Tipo Parentesco</p><table><thead><tr><th>Clave</th><th>Descripción</th></tr></thead><tbody><tr><td>01</td><td>Principal</td></tr><tr><td>02</td><td>Alias</td></tr><tr><td>03</td><td>Esposa</td></tr><tr><td>04</td><td>Hija</td></tr><tr><td>05</td><td>Hijo</td></tr></tbody></table><p>Catálogo: Tipo Lista</p><table><thead><tr><th>Clave</th><th>Descripción</th></tr></thead><tbody><tr><td>11</td><td>PEP Nacional</td></tr><tr><td>22</td><td>PEP Internacional</td></tr><tr><td>33</td><td>PLD</td></tr><tr><td>44</td><td>Justicia Nacional</td></tr></tbody></table><p>Catálogo Tipo Coincidencia</p><table><thead><tr><th>Clave</th><th>Descripción</th></tr></thead><tbody><tr><td>10</td><td>Exacto</td></tr><tr><td>99</td><td>Múltiple</td></tr></tbody></table>")
	public String getLeyenda() {
		return leyenda;
	}

	public void setLeyenda(String leyenda) {
		this.leyenda = leyenda;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Mensaje mensaje = (Mensaje) o;
		return Objects.equals(this.tipoMensaje, mensaje.tipoMensaje) && Objects.equals(this.leyenda, mensaje.leyenda);
	}

	@Override
	public int hashCode() {
		return Objects.hash(tipoMensaje, leyenda);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Mensaje {\n");

		sb.append("    tipoMensaje: ").append(toIndentedString(tipoMensaje)).append("\n");
		sb.append("    leyenda: ").append(toIndentedString(leyenda)).append("\n");
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
