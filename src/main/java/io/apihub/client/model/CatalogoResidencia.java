package io.apihub.client.model;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@JsonAdapter(CatalogoResidencia.Adapter.class)
public enum CatalogoResidencia {

	_1("1"),

	_2("2"),

	_3("3"),

	_4("4"),

	_5("5");
	private String value;

	CatalogoResidencia(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	public static CatalogoResidencia fromValue(String text) {
		for (CatalogoResidencia b : CatalogoResidencia.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}

	public static class Adapter extends TypeAdapter<CatalogoResidencia> {
		@Override
		public void write(final JsonWriter jsonWriter, final CatalogoResidencia enumeration) throws IOException {
			jsonWriter.value(enumeration.getValue());
		}

		@Override
		public CatalogoResidencia read(final JsonReader jsonReader) throws IOException {
			String value = jsonReader.nextString();
			return CatalogoResidencia.fromValue(String.valueOf(value));
		}
	}
}
