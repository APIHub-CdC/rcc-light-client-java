package io.apihub.client.api;

import io.apihub.client.ApiClient;
import io.apihub.client.ApiException;
import io.apihub.client.ApiResponse;
import io.apihub.client.Configuration;
import io.apihub.client.Pair;
import io.apihub.client.ProgressRequestBody;
import io.apihub.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.apihub.client.model.Consultas;
import io.apihub.client.model.Creditos;
import io.apihub.client.model.Domicilios;
import io.apihub.client.model.Empleos;
import io.apihub.client.model.PersonaPeticion;
import io.apihub.client.model.PersonasPLD;
import io.apihub.client.model.Respuesta;
import io.apihub.client.model.Scores;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RCCLightFicoScorePldApi {
	private ApiClient apiClient;

	public RCCLightFicoScorePldApi() {
		this(Configuration.getDefaultApiClient());
	}

	public RCCLightFicoScorePldApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public okhttp3.Call getConsultasCall(String folioConsulta, String xApiKey, String username,
			String password, final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
		String localVarPath = "/{folioConsulta}/consultas".replaceAll("\\{" + "folioConsulta" + "\\}",
				apiClient.escapeString(folioConsulta.toString()));
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		if (xApiKey != null)
			localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
		if (username != null)
			localVarHeaderParams.put("username", apiClient.parameterToString(username));
		if (password != null)
			localVarHeaderParams.put("password", apiClient.parameterToString(password));
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = { "application/json" };
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null)
			localVarHeaderParams.put("Accept", localVarAccept);
		final String[] localVarContentTypes = { "application/json" };
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);
		if (progressListener != null) {
			apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
				@Override
				public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
					okhttp3.Response originalResponse = chain.proceed(chain.request());
					return originalResponse.newBuilder()
							.body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
				}
			});
		}
		String[] localVarAuthNames = new String[] {};
		return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
				localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	private okhttp3.Call getConsultasValidateBeforeCall(String folioConsulta, String xApiKey,
			String username, String password, final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		if (folioConsulta == null) {
			throw new ApiException("Missing the required parameter 'folioConsulta' when calling getConsultas(Async)");
		}
		if (xApiKey == null) {
			throw new ApiException("Missing the required parameter 'xApiKey' when calling getConsultas(Async)");
		}
		if (username == null) {
			throw new ApiException("Missing the required parameter 'username' when calling getConsultas(Async)");
		}
		if (password == null) {
			throw new ApiException("Missing the required parameter 'password' when calling getConsultas(Async)");
		}

		okhttp3.Call call = getConsultasCall(folioConsulta, xApiKey, username, password, progressListener,
				progressRequestListener);
		return call;
	}

	public Consultas getConsultas(String folioConsulta, String xApiKey, String username,
			String password) throws ApiException {
		ApiResponse<Consultas> resp = getConsultasWithHttpInfo(folioConsulta, xApiKey, username, password);
		return resp.getData();
	}

	public ApiResponse<Consultas> getConsultasWithHttpInfo(String folioConsulta, String xApiKey,
			String username, String password) throws ApiException {
		okhttp3.Call call = getConsultasValidateBeforeCall(folioConsulta, xApiKey, username, password, null,
				null);
		Type localVarReturnType = new TypeToken<Consultas>() {
		}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	public okhttp3.Call getCreditosCall(String folioConsulta, String xApiKey, String username,
			String password, final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
		String localVarPath = "/{folioConsulta}/creditos".replaceAll("\\{" + "folioConsulta" + "\\}",
				apiClient.escapeString(folioConsulta.toString()));
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		if (xApiKey != null)
			localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
		if (username != null)
			localVarHeaderParams.put("username", apiClient.parameterToString(username));
		if (password != null)
			localVarHeaderParams.put("password", apiClient.parameterToString(password));
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = { "application/json" };
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null)
			localVarHeaderParams.put("Accept", localVarAccept);
		final String[] localVarContentTypes = { "application/json" };
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);
		if (progressListener != null) {
			apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
				@Override
				public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
					okhttp3.Response originalResponse = chain.proceed(chain.request());
					return originalResponse.newBuilder()
							.body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
				}
			});
		}
		String[] localVarAuthNames = new String[] {};
		return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
				localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	private okhttp3.Call getCreditosValidateBeforeCall(String folioConsulta, String xApiKey,
			String username, String password, final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		if (folioConsulta == null) {
			throw new ApiException("Missing the required parameter 'folioConsulta' when calling getCreditos(Async)");
		}
		if (xApiKey == null) {
			throw new ApiException("Missing the required parameter 'xApiKey' when calling getCreditos(Async)");
		}
		if (username == null) {
			throw new ApiException("Missing the required parameter 'username' when calling getCreditos(Async)");
		}
		if (password == null) {
			throw new ApiException("Missing the required parameter 'password' when calling getCreditos(Async)");
		}

		okhttp3.Call call = getCreditosCall(folioConsulta, xApiKey, username, password, progressListener,
				progressRequestListener);
		return call;
	}

	public Creditos getCreditos(String folioConsulta, String xApiKey, String username,
			String password) throws ApiException {
		ApiResponse<Creditos> resp = getCreditosWithHttpInfo(folioConsulta, xApiKey, username, password);
		return resp.getData();
	}

	public ApiResponse<Creditos> getCreditosWithHttpInfo(String folioConsulta, String xApiKey,
			String username, String password) throws ApiException {
		okhttp3.Call call = getCreditosValidateBeforeCall(folioConsulta, xApiKey, username, password, null,
				null);
		Type localVarReturnType = new TypeToken<Creditos>() {
		}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	public okhttp3.Call getDomiciliosCall(String folioConsulta, String xApiKey, String username,
			String password, final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
		String localVarPath = "/{folioConsulta}/domicilios".replaceAll("\\{" + "folioConsulta" + "\\}",
				apiClient.escapeString(folioConsulta.toString()));
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		if (xApiKey != null)
			localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
		if (username != null)
			localVarHeaderParams.put("username", apiClient.parameterToString(username));
		if (password != null)
			localVarHeaderParams.put("password", apiClient.parameterToString(password));
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = { "application/json" };
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null)
			localVarHeaderParams.put("Accept", localVarAccept);
		final String[] localVarContentTypes = { "application/json" };
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);
		if (progressListener != null) {
			apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
				@Override
				public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
					okhttp3.Response originalResponse = chain.proceed(chain.request());
					return originalResponse.newBuilder()
							.body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
				}
			});
		}
		String[] localVarAuthNames = new String[] {};
		return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
				localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	private okhttp3.Call getDomiciliosValidateBeforeCall(String folioConsulta, String xApiKey,
			String username, String password, final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		if (folioConsulta == null) {
			throw new ApiException("Missing the required parameter 'folioConsulta' when calling getDomicilios(Async)");
		}
		if (xApiKey == null) {
			throw new ApiException("Missing the required parameter 'xApiKey' when calling getDomicilios(Async)");
		}
		if (username == null) {
			throw new ApiException("Missing the required parameter 'username' when calling getDomicilios(Async)");
		}
		if (password == null) {
			throw new ApiException("Missing the required parameter 'password' when calling getDomicilios(Async)");
		}

		okhttp3.Call call = getDomiciliosCall(folioConsulta, xApiKey, username, password, progressListener,
				progressRequestListener);
		return call;
	}

	public Domicilios getDomicilios(String folioConsulta, String xApiKey, String username,
			String password) throws ApiException {
		ApiResponse<Domicilios> resp = getDomiciliosWithHttpInfo(folioConsulta, xApiKey, username,
				password);
		return resp.getData();
	}

	public ApiResponse<Domicilios> getDomiciliosWithHttpInfo(String folioConsulta, String xApiKey,
			String username, String password) throws ApiException {
		okhttp3.Call call = getDomiciliosValidateBeforeCall(folioConsulta, xApiKey, username, password,
				null, null);
		Type localVarReturnType = new TypeToken<Domicilios>() {
		}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	public okhttp3.Call getEmpleosCall(String folioConsulta, String xApiKey, String username,
			String password, final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
		String localVarPath = "/{folioConsulta}/empleos".replaceAll("\\{" + "folioConsulta" + "\\}",
				apiClient.escapeString(folioConsulta.toString()));
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		if (xApiKey != null)
			localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
		if (username != null)
			localVarHeaderParams.put("username", apiClient.parameterToString(username));
		if (password != null)
			localVarHeaderParams.put("password", apiClient.parameterToString(password));
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = { "application/json" };
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null)
			localVarHeaderParams.put("Accept", localVarAccept);
		final String[] localVarContentTypes = { "application/json" };
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);
		if (progressListener != null) {
			apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
				@Override
				public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
					okhttp3.Response originalResponse = chain.proceed(chain.request());
					return originalResponse.newBuilder()
							.body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
				}
			});
		}
		String[] localVarAuthNames = new String[] {};
		return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
				localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	private okhttp3.Call getEmpleosValidateBeforeCall(String folioConsulta, String xApiKey,
			String username, String password, final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		if (folioConsulta == null) {
			throw new ApiException("Missing the required parameter 'folioConsulta' when calling getEmpleos(Async)");
		}
		if (xApiKey == null) {
			throw new ApiException("Missing the required parameter 'xApiKey' when calling getEmpleos(Async)");
		}
		if (username == null) {
			throw new ApiException("Missing the required parameter 'username' when calling getEmpleos(Async)");
		}
		if (password == null) {
			throw new ApiException("Missing the required parameter 'password' when calling getEmpleos(Async)");
		}

		okhttp3.Call call = getEmpleosCall(folioConsulta, xApiKey, username, password, progressListener,
				progressRequestListener);
		return call;
	}

	public Empleos getEmpleos(String folioConsulta, String xApiKey, String username, String password)
			throws ApiException {
		ApiResponse<Empleos> resp = getEmpleosWithHttpInfo(folioConsulta, xApiKey, username, password);
		return resp.getData();
	}

	public ApiResponse<Empleos> getEmpleosWithHttpInfo(String folioConsulta, String xApiKey,
			String username, String password) throws ApiException {
		okhttp3.Call call = getEmpleosValidateBeforeCall(folioConsulta, xApiKey, username, password, null,
				null);
		Type localVarReturnType = new TypeToken<Empleos>() {
		}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	public okhttp3.Call getPLDCall(String folioConsulta, String xApiKey, String username,
			String password, final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
		String localVarPath = "/{folioConsulta}/pld".replaceAll("\\{" + "folioConsulta" + "\\}",
				apiClient.escapeString(folioConsulta.toString()));
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		if (xApiKey != null)
			localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
		if (username != null)
			localVarHeaderParams.put("username", apiClient.parameterToString(username));
		if (password != null)
			localVarHeaderParams.put("password", apiClient.parameterToString(password));
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = { "application/json" };
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null)
			localVarHeaderParams.put("Accept", localVarAccept);
		final String[] localVarContentTypes = { "application/json" };
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);
		if (progressListener != null) {
			apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
				@Override
				public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
					okhttp3.Response originalResponse = chain.proceed(chain.request());
					return originalResponse.newBuilder()
							.body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
				}
			});
		}
		String[] localVarAuthNames = new String[] {};
		return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
				localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	private okhttp3.Call getPLDValidateBeforeCall(String folioConsulta, String xApiKey,
			String username, String password, final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		if (folioConsulta == null) {
			throw new ApiException("Missing the required parameter 'folioConsulta' when calling getPLD(Async)");
		}
		if (xApiKey == null) {
			throw new ApiException("Missing the required parameter 'xApiKey' when calling getPLD(Async)");
		}
		if (username == null) {
			throw new ApiException("Missing the required parameter 'username' when calling getPLD(Async)");
		}
		if (password == null) {
			throw new ApiException("Missing the required parameter 'password' when calling getPLD(Async)");
		}

		okhttp3.Call call = getPLDCall(folioConsulta, xApiKey, username, password, progressListener,
				progressRequestListener);
		return call;
	}

	public PersonasPLD getPLD(String folioConsulta, String xApiKey, String username, String password)
			throws ApiException {
		ApiResponse<PersonasPLD> resp = getPLDWithHttpInfo(folioConsulta, xApiKey, username, password);
		return resp.getData();
	}

	public ApiResponse<PersonasPLD> getPLDWithHttpInfo(String folioConsulta, String xApiKey,
			String username, String password) throws ApiException {
		okhttp3.Call call = getPLDValidateBeforeCall(folioConsulta, xApiKey, username, password, null,
				null);
		Type localVarReturnType = new TypeToken<PersonasPLD>() {
		}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	public okhttp3.Call getReporteCall(String xApiKey, String username, String password,
			PersonaPeticion body, Boolean xFullReport, final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = body;
		String localVarPath = "";
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		if (xApiKey != null)
			localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
		if (username != null)
			localVarHeaderParams.put("username", apiClient.parameterToString(username));
		if (password != null)
			localVarHeaderParams.put("password", apiClient.parameterToString(password));
		if (xFullReport != null)
			localVarHeaderParams.put("x-full-report", apiClient.parameterToString(xFullReport));
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = { "application/json" };
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null)
			localVarHeaderParams.put("Accept", localVarAccept);
		final String[] localVarContentTypes = { "application/json" };
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);
		if (progressListener != null) {
			apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
				@Override
				public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
					okhttp3.Response originalResponse = chain.proceed(chain.request());
					return originalResponse.newBuilder()
							.body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
				}
			});
		}
		String[] localVarAuthNames = new String[] {};
		return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
				localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	private okhttp3.Call getReporteValidateBeforeCall(String xApiKey, String username,
			String password, PersonaPeticion body, Boolean xFullReport,
			final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		if (xApiKey == null) {
			throw new ApiException("Missing the required parameter 'xApiKey' when calling getReporte(Async)");
		}
		if (username == null) {
			throw new ApiException("Missing the required parameter 'username' when calling getReporte(Async)");
		}
		if (password == null) {
			throw new ApiException("Missing the required parameter 'password' when calling getReporte(Async)");
		}
		if (body == null) {
			throw new ApiException("Missing the required parameter 'body' when calling getReporte(Async)");
		}

		okhttp3.Call call = getReporteCall(xApiKey, username, password, body, xFullReport, progressListener,
				progressRequestListener);
		return call;
	}

	public Respuesta getReporte(String xApiKey, String username, String password,
			PersonaPeticion body, Boolean xFullReport) throws ApiException {
		ApiResponse<Respuesta> resp = getReporteWithHttpInfo(xApiKey, username, password, body,
				xFullReport);
		return resp.getData();
	}

	public ApiResponse<Respuesta> getReporteWithHttpInfo(String xApiKey, String username,
			String password, PersonaPeticion body, Boolean xFullReport) throws ApiException {
		okhttp3.Call call = getReporteValidateBeforeCall(xApiKey, username, password, body, xFullReport,
				null, null);
		Type localVarReturnType = new TypeToken<Respuesta>() {
		}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	public okhttp3.Call getScoresCall(String folioConsulta, String xApiKey, String username,
			String password, final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
		String localVarPath = "/{folioConsulta}/scores".replaceAll("\\{" + "folioConsulta" + "\\}",
				apiClient.escapeString(folioConsulta.toString()));
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		if (xApiKey != null)
			localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
		if (username != null)
			localVarHeaderParams.put("username", apiClient.parameterToString(username));
		if (password != null)
			localVarHeaderParams.put("password", apiClient.parameterToString(password));
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = { "application/json" };
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null)
			localVarHeaderParams.put("Accept", localVarAccept);
		final String[] localVarContentTypes = { "application/json" };
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);
		if (progressListener != null) {
			apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
				@Override
				public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
					okhttp3.Response originalResponse = chain.proceed(chain.request());
					return originalResponse.newBuilder()
							.body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
				}
			});
		}
		String[] localVarAuthNames = new String[] {};
		return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
				localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	private okhttp3.Call getScoresValidateBeforeCall(String folioConsulta, String xApiKey,
			String username, String password, final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		if (folioConsulta == null) {
			throw new ApiException("Missing the required parameter 'folioConsulta' when calling getScores(Async)");
		}
		if (xApiKey == null) {
			throw new ApiException("Missing the required parameter 'xApiKey' when calling getScores(Async)");
		}
		if (username == null) {
			throw new ApiException("Missing the required parameter 'username' when calling getScores(Async)");
		}
		if (password == null) {
			throw new ApiException("Missing the required parameter 'password' when calling getScores(Async)");
		}

		okhttp3.Call call = getScoresCall(folioConsulta, xApiKey, username, password, progressListener,
				progressRequestListener);
		return call;
	}

	public Scores getScores(String folioConsulta, String xApiKey, String username, String password)
			throws ApiException {
		ApiResponse<Scores> resp = getScoresWithHttpInfo(folioConsulta, xApiKey, username, password);
		return resp.getData();
	}

	public ApiResponse<Scores> getScoresWithHttpInfo(String folioConsulta, String xApiKey,
			String username, String password) throws ApiException {
		okhttp3.Call call = getScoresValidateBeforeCall(folioConsulta, xApiKey, username, password, null,
				null);
		Type localVarReturnType = new TypeToken<Scores>() {
		}.getType();
		return apiClient.execute(call, localVarReturnType);
	}
}
