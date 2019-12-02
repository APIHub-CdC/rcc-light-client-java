package io.apihub.client.api;

import io.apihub.client.ApiClient;
import io.apihub.client.ApiException;
import io.apihub.client.model.Consultas;
import io.apihub.client.model.Creditos;
import io.apihub.client.model.Domicilios;
import io.apihub.client.model.Empleos;
import io.apihub.client.model.PersonaPeticion;
import io.apihub.client.model.PersonasPLD;
import io.apihub.client.model.Respuesta;
import io.apihub.client.model.Scores;
import io.apihub.interceptor.SignerInterceptor;
import okhttp3.OkHttpClient;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RCCLightFicoscorePldApiTest {

	private final RCCLightFicoScorePldApi api = new RCCLightFicoScorePldApi();
	private ApiClient apiClient;
	private String xApiKey = null;
	private String username = null;
	private String password = null;
	private String folioConsulta = null;

	@Before()
	public void setUp() {
		
		this.apiClient = api.getApiClient();
		this.apiClient.setBasePath("the_url");
		OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .readTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(new SignerInterceptor())
                .build();
		apiClient.setHttpClient(okHttpClient);
		this.xApiKey = "your_api_key";
		this.username = "your_username";
		this.password = "your_password";
	}

	@Test
	public void getFullReportTest() throws ApiException {
		Boolean xFullReport = true;
		PersonaPeticion body = new PersonaPeticion();
		body.setPrimerNombre("XXXXX");
		body.setSegundoNombre("XXXXX");
		body.setApellidoPaterno("XXXXX");
		body.setApellidoMaterno("XXXXX");
		body.setApellidoAdicional(null);
		body.setFechaNacimiento("yyyy-MM-dd");

		Respuesta response = api.getReporte(this.xApiKey, this.username, this.password, body, xFullReport);
		Assert.assertTrue(response.getFolioConsulta() != null);
	}

	@Test
	public void getSegmentedReportTest() throws ApiException {
		Boolean xFullReport = false;
		PersonaPeticion body = new PersonaPeticion();
		body.setPrimerNombre("XXXXX");
		body.setSegundoNombre("XXXXX");
		body.setApellidoPaterno("XXXXX");
		body.setApellidoMaterno("XXXXX");
		body.setApellidoAdicional(null);
		body.setFechaNacimiento("yyyy-MM-dd");

		Respuesta response = api.getReporte(this.xApiKey, this.username, this.password, body, xFullReport);
		
		Assert.assertTrue(response.getFolioConsulta() != null);
		
		if(response.getFolioConsulta()!=null) {
        	this.folioConsulta = response.getFolioConsulta();
        	
        	Creditos creditos = api.getCreditos(this.folioConsulta, this.xApiKey, this.username, this.password);
        	Assert.assertTrue(creditos.getCreditos() != null);
        	
        	Domicilios domicilios = api.getDomicilios(this.folioConsulta, this.xApiKey, this.username, this.password);
        	Assert.assertTrue(domicilios.getDomicilios() != null);
        	
        	Empleos empleos = api.getEmpleos(this.folioConsulta, this.xApiKey, this.username, this.password);
        	Assert.assertTrue(empleos.getEmpleos() != null);
        	
        	Consultas consultas = api.getConsultas(this.folioConsulta, this.xApiKey, this.username, this.password);
        	Assert.assertTrue(consultas.getConsultas() != null);
        	
        	Scores scores = api.getScores(this.folioConsulta, this.xApiKey, this.username, this.password);
        	Assert.assertTrue(scores.getScores() != null);
        	
        	PersonasPLD pld = api.getPLD(this.folioConsulta, this.xApiKey, this.username, this.password);
        	Assert.assertTrue(pld.getPld() != null);
        } 
	}
}