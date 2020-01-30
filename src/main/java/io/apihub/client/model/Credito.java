package io.apihub.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.apihub.client.model.CatalogoFrecuenciaPago;
import io.apihub.client.model.CatalogoMoneda;
import io.apihub.client.model.CatalogoPrevencion;
import io.apihub.client.model.CatalogoTipoResponsabilidad;

@ApiModel(description = "El elemento de crédito contiene el comportamiento actual e histórico del crédito del consumidor, este elemento se repite dependiendo del número de cuentas del consumidor.")

public class Credito {
	@SerializedName("fechaActualizacion")
	private String fechaActualizacion = null;
	@SerializedName("registroImpugnado")
	private Integer registroImpugnado = null;
	@SerializedName("claveOtorgante")
	private String claveOtorgante = null;
	@SerializedName("nombreOtorgante")
	private String nombreOtorgante = null;
	@SerializedName("cuentaActual")
	private String cuentaActual = null;
	@SerializedName("tipoResponsabilidad")
	private CatalogoTipoResponsabilidad tipoResponsabilidad = null;
	@SerializedName("tipoCuenta")
	private String tipoCuenta = null;
	@SerializedName("tipoCredito")
	private String tipoCredito = null;
	@SerializedName("claveUnidadMonetaria")
	private CatalogoMoneda claveUnidadMonetaria = null;
	@SerializedName("valorActivoValuacion")
	private Integer valorActivoValuacion = null;
	@SerializedName("numeroPagos")
	private Integer numeroPagos = null;
	@SerializedName("frecuenciaPagos")
	private CatalogoFrecuenciaPago frecuenciaPagos = null;
	@SerializedName("montoPagar")
	private Float montoPagar = null;
	@SerializedName("fechaAperturaCuenta")
	private String fechaAperturaCuenta = null;
	@SerializedName("fechaUltimoPago")
	private String fechaUltimoPago = null;
	@SerializedName("fechaUltimaCompra")
	private String fechaUltimaCompra = null;
	@SerializedName("fechaCierreCuenta")
	private String fechaCierreCuenta = null;
	@SerializedName("fechaReporte")
	private String fechaReporte = null;
	@SerializedName("ultimaFechaSaldoCero")
	private String ultimaFechaSaldoCero = null;
	@SerializedName("garantia")
	private String garantia = null;
	@SerializedName("creditoMaximo")
	private Float creditoMaximo = null;
	@SerializedName("saldoActual")
	private Float saldoActual = null;
	@SerializedName("limiteCredito")
	private Float limiteCredito = null;
	@SerializedName("saldoVencido")
	private Float saldoVencido = null;
	@SerializedName("numeroPagosVencidos")
	private Integer numeroPagosVencidos = null;
	@SerializedName("pagoActual")
	private String pagoActual = null;
	@SerializedName("historicoPagos")
	private String historicoPagos = null;
	@SerializedName("fechaRecienteHistoricoPagos")
	private String fechaRecienteHistoricoPagos = null;
	@SerializedName("fechaAntiguaHistoricoPagos")
	private String fechaAntiguaHistoricoPagos = null;
	@SerializedName("clavePrevencion")
	private CatalogoPrevencion clavePrevencion = null;
	@SerializedName("totalPagosReportados")
	private Integer totalPagosReportados = null;
	@SerializedName("peorAtraso")
	private Float peorAtraso = null;
	@SerializedName("fechaPeorAtraso")
	private String fechaPeorAtraso = null;
	@SerializedName("saldoVencidoPeorAtraso")
	private Double saldoVencidoPeorAtraso = null;
	@SerializedName("montoUltimoPago")
	private Double montoUltimoPago = null;

	public Credito fechaActualizacion(String fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
		return this;
	}

	@ApiModelProperty(example = "2016-04-30", value = "Fecha en que se actualizó la información de la cuenta.")
	public String getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(String fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	public Credito registroImpugnado(Integer registroImpugnado) {
		this.registroImpugnado = registroImpugnado;
		return this;
	}

	@ApiModelProperty(example = "0", value = "En caso de que el valor sea mayor que cero, indica que es un registro impugnado por el Consumidor. La etiqueta muestra un dato igual a “0001” para Registro Impugnado. Si este se reporta, significa que el consumidor final solicitó una aclaración sobre esta cuenta, en apego a la Ley de las Sociedades de Información Crediticia.")
	public Integer getRegistroImpugnado() {
		return registroImpugnado;
	}

	public void setRegistroImpugnado(Integer registroImpugnado) {
		this.registroImpugnado = registroImpugnado;
	}

	public Credito claveOtorgante(String claveOtorgante) {
		this.claveOtorgante = claveOtorgante;
		return this;
	}

	@ApiModelProperty(example = "CDC0001", value = "Contiene la clave del otorgante que reporta el crédito. <br>Nota: Este elemento solo es reportado para reporte de crédito especial.")
	public String getClaveOtorgante() {
		return claveOtorgante;
	}

	public void setClaveOtorgante(String claveOtorgante) {
		this.claveOtorgante = claveOtorgante;
	}

	public Credito nombreOtorgante(String nombreOtorgante) {
		this.nombreOtorgante = nombreOtorgante;
		return this;
	}

	@ApiModelProperty(example = "MICROFINANCIERA", value = "Contiene el Nombre del Otorgante de Crédito que reporto el Crédito. Ver Tabla: Tipo de Negocio. <br>Nota: Este elemento solo es reportado para reporte de crédito especial.")
	public String getNombreOtorgante() {
		return nombreOtorgante;
	}

	public void setNombreOtorgante(String nombreOtorgante) {
		this.nombreOtorgante = nombreOtorgante;
	}

	public Credito cuentaActual(String cuentaActual) {
		this.cuentaActual = cuentaActual;
		return this;
	}

	@ApiModelProperty(example = "303139149", value = "Numero de la Cuenta que reporto el Otorgante.<br>Nota: Este elemento solo es reportado para reporte de crédito especial.")
	public String getCuentaActual() {
		return cuentaActual;
	}

	public void setCuentaActual(String cuentaActual) {
		this.cuentaActual = cuentaActual;
	}

	public Credito tipoResponsabilidad(CatalogoTipoResponsabilidad tipoResponsabilidad) {
		this.tipoResponsabilidad = tipoResponsabilidad;
		return this;
	}

	@ApiModelProperty(value = "")
	public CatalogoTipoResponsabilidad getTipoResponsabilidad() {
		return tipoResponsabilidad;
	}

	public void setTipoResponsabilidad(CatalogoTipoResponsabilidad tipoResponsabilidad) {
		this.tipoResponsabilidad = tipoResponsabilidad;
	}

	public Credito tipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
		return this;
	}

	@ApiModelProperty(example = "F", value = "<p>Si tipoCuenta tiene una sóla posición observe el catálogo de tipo cuenta</p><p>Si tipoCuenta tiene os posiciones observe el catálogo de tipo contrato</p>")
	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public Credito tipoCredito(String tipoCredito) {
		this.tipoCredito = tipoCredito;
		return this;
	}

	@ApiModelProperty(example = "PP", value = "<p>Si tipoCredito tiene una sóla posición observe el catálogo de tipo cuenta</p><p>Si tipoCredito tiene dos posiciones observe el catálogo de tipo contrato</p>")
	public String getTipoCredito() {
		return tipoCredito;
	}

	public void setTipoCredito(String tipoCredito) {
		this.tipoCredito = tipoCredito;
	}

	public Credito claveUnidadMonetaria(CatalogoMoneda claveUnidadMonetaria) {
		this.claveUnidadMonetaria = claveUnidadMonetaria;
		return this;
	}

	@ApiModelProperty(value = "")
	public CatalogoMoneda getClaveUnidadMonetaria() {
		return claveUnidadMonetaria;
	}

	public void setClaveUnidadMonetaria(CatalogoMoneda claveUnidadMonetaria) {
		this.claveUnidadMonetaria = claveUnidadMonetaria;
	}

	public Credito valorActivoValuacion(Integer valorActivoValuacion) {
		this.valorActivoValuacion = valorActivoValuacion;
		return this;
	}

	@ApiModelProperty(example = "0", value = "Valor total del activo para propósitos de evaluación o recuperación. Es el valor monetario de la garantía.")
	public Integer getValorActivoValuacion() {
		return valorActivoValuacion;
	}

	public void setValorActivoValuacion(Integer valorActivoValuacion) {
		this.valorActivoValuacion = valorActivoValuacion;
	}

	public Credito numeroPagos(Integer numeroPagos) {
		this.numeroPagos = numeroPagos;
		return this;
	}

	@ApiModelProperty(example = "2", value = "Es el número total de pagos (Plazos) correspondientes a la cuenta.")
	public Integer getNumeroPagos() {
		return numeroPagos;
	}

	public void setNumeroPagos(Integer numeroPagos) {
		this.numeroPagos = numeroPagos;
	}

	public Credito frecuenciaPagos(CatalogoFrecuenciaPago frecuenciaPagos) {
		this.frecuenciaPagos = frecuenciaPagos;
		return this;
	}

	@ApiModelProperty(value = "")
	public CatalogoFrecuenciaPago getFrecuenciaPagos() {
		return frecuenciaPagos;
	}

	public void setFrecuenciaPagos(CatalogoFrecuenciaPago frecuenciaPagos) {
		this.frecuenciaPagos = frecuenciaPagos;
	}

	public Credito montoPagar(Float montoPagar) {
		this.montoPagar = montoPagar;
		return this;
	}

	@ApiModelProperty(example = "6276.0", value = "Es la cantidad que el Consumidor paga en el periodo asignado a la cuenta.")
	public Float getMontoPagar() {
		return montoPagar;
	}

	public void setMontoPagar(Float montoPagar) {
		this.montoPagar = montoPagar;
	}

	public Credito fechaAperturaCuenta(String fechaAperturaCuenta) {
		this.fechaAperturaCuenta = fechaAperturaCuenta;
		return this;
	}

	@ApiModelProperty(example = "2018-01-20", value = "La fecha de apertura es la fecha en que el Otorgante reporta la apertura del crédito al consumidor.")
	public String getFechaAperturaCuenta() {
		return fechaAperturaCuenta;
	}

	public void setFechaAperturaCuenta(String fechaAperturaCuenta) {
		this.fechaAperturaCuenta = fechaAperturaCuenta;
	}

	public Credito fechaUltimoPago(String fechaUltimoPago) {
		this.fechaUltimoPago = fechaUltimoPago;
		return this;
	}

	@ApiModelProperty(example = "2018-02-20", value = "Fecha más reciente en la que el cliente efectuó un pago.")
	public String getFechaUltimoPago() {
		return fechaUltimoPago;
	}

	public void setFechaUltimoPago(String fechaUltimoPago) {
		this.fechaUltimoPago = fechaUltimoPago;
	}

	public Credito fechaUltimaCompra(String fechaUltimaCompra) {
		this.fechaUltimaCompra = fechaUltimaCompra;
		return this;
	}

	@ApiModelProperty(example = "2018-02-26", value = "Fecha más reciente en que el cliente efectuó una compra o disposición de crédito.")
	public String getFechaUltimaCompra() {
		return fechaUltimaCompra;
	}

	public void setFechaUltimaCompra(String fechaUltimaCompra) {
		this.fechaUltimaCompra = fechaUltimaCompra;
	}

	public Credito fechaCierreCuenta(String fechaCierreCuenta) {
		this.fechaCierreCuenta = fechaCierreCuenta;
		return this;
	}

	@ApiModelProperty(example = "2016-04-29", value = "Fecha cuando el otorgante o el consumidor, cerró la cuenta.")
	public String getFechaCierreCuenta() {
		return fechaCierreCuenta;
	}

	public void setFechaCierreCuenta(String fechaCierreCuenta) {
		this.fechaCierreCuenta = fechaCierreCuenta;
	}

	public Credito fechaReporte(String fechaReporte) {
		this.fechaReporte = fechaReporte;
		return this;
	}

	@ApiModelProperty(example = "2018-02-28", value = "Periodo al que corresponde el crédito reportado por el Otorgante.")
	public String getFechaReporte() {
		return fechaReporte;
	}

	public void setFechaReporte(String fechaReporte) {
		this.fechaReporte = fechaReporte;
	}

	public Credito ultimaFechaSaldoCero(String ultimaFechaSaldoCero) {
		this.ultimaFechaSaldoCero = ultimaFechaSaldoCero;
		return this;
	}

	@ApiModelProperty(example = "1980-01-04", value = "Fecha en que la cuenta tuvo saldo cero. Para cuentas de pagos fijos (F) o hipoteca (H), cuando se encuentra una fecha en estas cuentas debe ser igual a la fecha de cierre.")
	public String getUltimaFechaSaldoCero() {
		return ultimaFechaSaldoCero;
	}

	public void setUltimaFechaSaldoCero(String ultimaFechaSaldoCero) {
		this.ultimaFechaSaldoCero = ultimaFechaSaldoCero;
	}

	public Credito garantia(String garantia) {
		this.garantia = garantia;
		return this;
	}

	@ApiModelProperty(example = "SEGURO DE VIDA S.A. DE C.V.", value = "Contiene una descripción alfanumérica de la garantía utilizada para asegurar el crédito otorgado a esta cuenta.")
	public String getGarantia() {
		return garantia;
	}

	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}

	public Credito creditoMaximo(Float creditoMaximo) {
		this.creditoMaximo = creditoMaximo;
		return this;
	}

	@ApiModelProperty(example = "25104.0", value = "Contiene el máximo importe de crédito utilizado por el consumidor.")
	public Float getCreditoMaximo() {
		return creditoMaximo;
	}

	public void setCreditoMaximo(Float creditoMaximo) {
		this.creditoMaximo = creditoMaximo;
	}

	public Credito saldoActual(Float saldoActual) {
		this.saldoActual = saldoActual;
		return this;
	}

	@ApiModelProperty(example = "14714.0", value = "Es el saldo del crédito en el periodo reportado para esta cuenta.")
	public Float getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(Float saldoActual) {
		this.saldoActual = saldoActual;
	}

	public Credito limiteCredito(Float limiteCredito) {
		this.limiteCredito = limiteCredito;
		return this;
	}

	@ApiModelProperty(example = "0.0", value = "Límite de crédito para esta cuenta.")
	public Float getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(Float limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public Credito saldoVencido(Float saldoVencido) {
		this.saldoVencido = saldoVencido;
		return this;
	}

	@ApiModelProperty(example = "0.0", value = "Saldo Vencido al periodo reportado para esta cuenta.")
	public Float getSaldoVencido() {
		return saldoVencido;
	}

	public void setSaldoVencido(Float saldoVencido) {
		this.saldoVencido = saldoVencido;
	}

	public Credito numeroPagosVencidos(Integer numeroPagosVencidos) {
		this.numeroPagosVencidos = numeroPagosVencidos;
		return this;
	}

	@ApiModelProperty(example = "0", value = "Número de pagos vencidos a la fecha del reporte.")
	public Integer getNumeroPagosVencidos() {
		return numeroPagosVencidos;
	}

	public void setNumeroPagosVencidos(Integer numeroPagosVencidos) {
		this.numeroPagosVencidos = numeroPagosVencidos;
	}

	public Credito pagoActual(String pagoActual) {
		this.pagoActual = pagoActual;
		return this;
	}

	@ApiModelProperty(example = " V", value = "Pago actual.")
	public String getPagoActual() {
		return pagoActual;
	}

	public void setPagoActual(String pagoActual) {
		this.pagoActual = pagoActual;
	}

	public Credito historicoPagos(String historicoPagos) {
		this.historicoPagos = historicoPagos;
		return this;
	}

	@ApiModelProperty(example = " V-- V", value = "Se presenta la información del histórico de pagos.")
	public String getHistoricoPagos() {
		return historicoPagos;
	}

	public void setHistoricoPagos(String historicoPagos) {
		this.historicoPagos = historicoPagos;
	}

	public Credito fechaRecienteHistoricoPagos(String fechaRecienteHistoricoPagos) {
		this.fechaRecienteHistoricoPagos = fechaRecienteHistoricoPagos;
		return this;
	}

	@ApiModelProperty(example = "2016-03-16", value = "Fecha del último histórico de esta cuenta que se integro a la Base de Datos.")
	public String getFechaRecienteHistoricoPagos() {
		return fechaRecienteHistoricoPagos;
	}

	public void setFechaRecienteHistoricoPagos(String fechaRecienteHistoricoPagos) {
		this.fechaRecienteHistoricoPagos = fechaRecienteHistoricoPagos;
	}

	public Credito fechaAntiguaHistoricoPagos(String fechaAntiguaHistoricoPagos) {
		this.fechaAntiguaHistoricoPagos = fechaAntiguaHistoricoPagos;
		return this;
	}

	@ApiModelProperty(example = "1980-01-04", value = "Fecha de inicio del patrón histórico de pagos.")
	public String getFechaAntiguaHistoricoPagos() {
		return fechaAntiguaHistoricoPagos;
	}

	public void setFechaAntiguaHistoricoPagos(String fechaAntiguaHistoricoPagos) {
		this.fechaAntiguaHistoricoPagos = fechaAntiguaHistoricoPagos;
	}

	public Credito clavePrevencion(CatalogoPrevencion clavePrevencion) {
		this.clavePrevencion = clavePrevencion;
		return this;
	}

	@ApiModelProperty(value = "")
	public CatalogoPrevencion getClavePrevencion() {
		return clavePrevencion;
	}

	public void setClavePrevencion(CatalogoPrevencion clavePrevencion) {
		this.clavePrevencion = clavePrevencion;
	}

	public Credito totalPagosReportados(Integer totalPagosReportados) {
		this.totalPagosReportados = totalPagosReportados;
		return this;
	}

	@ApiModelProperty(example = "3", value = "Estadística del comportamiento crediticio del consumidor.")
	public Integer getTotalPagosReportados() {
		return totalPagosReportados;
	}

	public void setTotalPagosReportados(Integer totalPagosReportados) {
		this.totalPagosReportados = totalPagosReportados;
	}

	public Credito peorAtraso(Float peorAtraso) {
		this.peorAtraso = peorAtraso;
		return this;
	}

	@ApiModelProperty(example = "0.0", value = "Contiene el peor atraso en la historia del crédito relacionado con fecha del Peor atraso y Saldo Vencido del Peor Atraso.")
	public Float getPeorAtraso() {
		return peorAtraso;
	}

	public void setPeorAtraso(Float peorAtraso) {
		this.peorAtraso = peorAtraso;
	}

	public Credito fechaPeorAtraso(String fechaPeorAtraso) {
		this.fechaPeorAtraso = fechaPeorAtraso;
		return this;
	}

	@ApiModelProperty(example = "2016-03-16", value = "Fecha en la que el cliente tuvo su peor atraso.")
	public String getFechaPeorAtraso() {
		return fechaPeorAtraso;
	}

	public void setFechaPeorAtraso(String fechaPeorAtraso) {
		this.fechaPeorAtraso = fechaPeorAtraso;
	}

	public Credito saldoVencidoPeorAtraso(Double saldoVencidoPeorAtraso) {
		this.saldoVencidoPeorAtraso = saldoVencidoPeorAtraso;
		return this;
	}

	@ApiModelProperty(value = "Contiene el saldo vencido del peor atraso en la historia del crédito. Relacionado con Peor Atraso y fecha del Peor Atraso.")
	public Double getSaldoVencidoPeorAtraso() {
		return saldoVencidoPeorAtraso;
	}

	public void setSaldoVencidoPeorAtraso(Double saldoVencidoPeorAtraso) {
		this.saldoVencidoPeorAtraso = saldoVencidoPeorAtraso;
	}

	public Credito montoUltimoPago(Double montoUltimoPago) {
		this.montoUltimoPago = montoUltimoPago;
		return this;
	}

	@ApiModelProperty(value = "Es la cantidad del pago más reciente que el consumidor efectuó.")
	public Double getMontoUltimoPago() {
		return montoUltimoPago;
	}

	public void setMontoUltimoPago(Double montoUltimoPago) {
		this.montoUltimoPago = montoUltimoPago;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Credito credito = (Credito) o;
		return Objects.equals(this.fechaActualizacion, credito.fechaActualizacion)
				&& Objects.equals(this.registroImpugnado, credito.registroImpugnado)
				&& Objects.equals(this.claveOtorgante, credito.claveOtorgante)
				&& Objects.equals(this.nombreOtorgante, credito.nombreOtorgante)
				&& Objects.equals(this.cuentaActual, credito.cuentaActual)
				&& Objects.equals(this.tipoResponsabilidad, credito.tipoResponsabilidad)
				&& Objects.equals(this.tipoCuenta, credito.tipoCuenta)
				&& Objects.equals(this.tipoCredito, credito.tipoCredito)
				&& Objects.equals(this.claveUnidadMonetaria, credito.claveUnidadMonetaria)
				&& Objects.equals(this.valorActivoValuacion, credito.valorActivoValuacion)
				&& Objects.equals(this.numeroPagos, credito.numeroPagos)
				&& Objects.equals(this.frecuenciaPagos, credito.frecuenciaPagos)
				&& Objects.equals(this.montoPagar, credito.montoPagar)
				&& Objects.equals(this.fechaAperturaCuenta, credito.fechaAperturaCuenta)
				&& Objects.equals(this.fechaUltimoPago, credito.fechaUltimoPago)
				&& Objects.equals(this.fechaUltimaCompra, credito.fechaUltimaCompra)
				&& Objects.equals(this.fechaCierreCuenta, credito.fechaCierreCuenta)
				&& Objects.equals(this.fechaReporte, credito.fechaReporte)
				&& Objects.equals(this.ultimaFechaSaldoCero, credito.ultimaFechaSaldoCero)
				&& Objects.equals(this.garantia, credito.garantia)
				&& Objects.equals(this.creditoMaximo, credito.creditoMaximo)
				&& Objects.equals(this.saldoActual, credito.saldoActual)
				&& Objects.equals(this.limiteCredito, credito.limiteCredito)
				&& Objects.equals(this.saldoVencido, credito.saldoVencido)
				&& Objects.equals(this.numeroPagosVencidos, credito.numeroPagosVencidos)
				&& Objects.equals(this.pagoActual, credito.pagoActual)
				&& Objects.equals(this.historicoPagos, credito.historicoPagos)
				&& Objects.equals(this.fechaRecienteHistoricoPagos, credito.fechaRecienteHistoricoPagos)
				&& Objects.equals(this.fechaAntiguaHistoricoPagos, credito.fechaAntiguaHistoricoPagos)
				&& Objects.equals(this.clavePrevencion, credito.clavePrevencion)
				&& Objects.equals(this.totalPagosReportados, credito.totalPagosReportados)
				&& Objects.equals(this.peorAtraso, credito.peorAtraso)
				&& Objects.equals(this.fechaPeorAtraso, credito.fechaPeorAtraso)
				&& Objects.equals(this.saldoVencidoPeorAtraso, credito.saldoVencidoPeorAtraso)
				&& Objects.equals(this.montoUltimoPago, credito.montoUltimoPago);
	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaActualizacion, registroImpugnado, claveOtorgante, nombreOtorgante, cuentaActual,
				tipoResponsabilidad, tipoCuenta, tipoCredito, claveUnidadMonetaria, valorActivoValuacion, numeroPagos,
				frecuenciaPagos, montoPagar, fechaAperturaCuenta, fechaUltimoPago, fechaUltimaCompra, fechaCierreCuenta,
				fechaReporte, ultimaFechaSaldoCero, garantia, creditoMaximo, saldoActual, limiteCredito, saldoVencido,
				numeroPagosVencidos, pagoActual, historicoPagos, fechaRecienteHistoricoPagos,
				fechaAntiguaHistoricoPagos, clavePrevencion, totalPagosReportados, peorAtraso, fechaPeorAtraso,
				saldoVencidoPeorAtraso, montoUltimoPago);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Credito {\n");

		sb.append("    fechaActualizacion: ").append(toIndentedString(fechaActualizacion)).append("\n");
		sb.append("    registroImpugnado: ").append(toIndentedString(registroImpugnado)).append("\n");
		sb.append("    claveOtorgante: ").append(toIndentedString(claveOtorgante)).append("\n");
		sb.append("    nombreOtorgante: ").append(toIndentedString(nombreOtorgante)).append("\n");
		sb.append("    cuentaActual: ").append(toIndentedString(cuentaActual)).append("\n");
		sb.append("    tipoResponsabilidad: ").append(toIndentedString(tipoResponsabilidad)).append("\n");
		sb.append("    tipoCuenta: ").append(toIndentedString(tipoCuenta)).append("\n");
		sb.append("    tipoCredito: ").append(toIndentedString(tipoCredito)).append("\n");
		sb.append("    claveUnidadMonetaria: ").append(toIndentedString(claveUnidadMonetaria)).append("\n");
		sb.append("    valorActivoValuacion: ").append(toIndentedString(valorActivoValuacion)).append("\n");
		sb.append("    numeroPagos: ").append(toIndentedString(numeroPagos)).append("\n");
		sb.append("    frecuenciaPagos: ").append(toIndentedString(frecuenciaPagos)).append("\n");
		sb.append("    montoPagar: ").append(toIndentedString(montoPagar)).append("\n");
		sb.append("    fechaAperturaCuenta: ").append(toIndentedString(fechaAperturaCuenta)).append("\n");
		sb.append("    fechaUltimoPago: ").append(toIndentedString(fechaUltimoPago)).append("\n");
		sb.append("    fechaUltimaCompra: ").append(toIndentedString(fechaUltimaCompra)).append("\n");
		sb.append("    fechaCierreCuenta: ").append(toIndentedString(fechaCierreCuenta)).append("\n");
		sb.append("    fechaReporte: ").append(toIndentedString(fechaReporte)).append("\n");
		sb.append("    ultimaFechaSaldoCero: ").append(toIndentedString(ultimaFechaSaldoCero)).append("\n");
		sb.append("    garantia: ").append(toIndentedString(garantia)).append("\n");
		sb.append("    creditoMaximo: ").append(toIndentedString(creditoMaximo)).append("\n");
		sb.append("    saldoActual: ").append(toIndentedString(saldoActual)).append("\n");
		sb.append("    limiteCredito: ").append(toIndentedString(limiteCredito)).append("\n");
		sb.append("    saldoVencido: ").append(toIndentedString(saldoVencido)).append("\n");
		sb.append("    numeroPagosVencidos: ").append(toIndentedString(numeroPagosVencidos)).append("\n");
		sb.append("    pagoActual: ").append(toIndentedString(pagoActual)).append("\n");
		sb.append("    historicoPagos: ").append(toIndentedString(historicoPagos)).append("\n");
		sb.append("    fechaRecienteHistoricoPagos: ").append(toIndentedString(fechaRecienteHistoricoPagos))
				.append("\n");
		sb.append("    fechaAntiguaHistoricoPagos: ").append(toIndentedString(fechaAntiguaHistoricoPagos)).append("\n");
		sb.append("    clavePrevencion: ").append(toIndentedString(clavePrevencion)).append("\n");
		sb.append("    totalPagosReportados: ").append(toIndentedString(totalPagosReportados)).append("\n");
		sb.append("    peorAtraso: ").append(toIndentedString(peorAtraso)).append("\n");
		sb.append("    fechaPeorAtraso: ").append(toIndentedString(fechaPeorAtraso)).append("\n");
		sb.append("    saldoVencidoPeorAtraso: ").append(toIndentedString(saldoVencidoPeorAtraso)).append("\n");
		sb.append("    montoUltimoPago: ").append(toIndentedString(montoUltimoPago)).append("\n");
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
