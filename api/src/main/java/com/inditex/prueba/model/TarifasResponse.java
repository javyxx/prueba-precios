package com.inditex.prueba.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TarifasResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-03T11:15:34.362354800+01:00[Europe/Madrid]", comments = "Generator version: 7.11.0")
public class TarifasResponse {

  private @Nullable Integer productoId;

  private @Nullable Integer cadenaId;

  private @Nullable Integer tarifaId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime fechaInicio;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime fechaFin;

  private @Nullable Float precioFinal;

  public TarifasResponse productoId(Integer productoId) {
    this.productoId = productoId;
    return this;
  }

  /**
   * Identificador del producto.
   * @return productoId
   */
  
  @Schema(name = "productoId", description = "Identificador del producto.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("productoId")
  public Integer getProductoId() {
    return productoId;
  }

  public void setProductoId(Integer productoId) {
    this.productoId = productoId;
  }

  public TarifasResponse cadenaId(Integer cadenaId) {
    this.cadenaId = cadenaId;
    return this;
  }

  /**
   * Identificador de la cadena.
   * @return cadenaId
   */
  
  @Schema(name = "cadenaId", description = "Identificador de la cadena.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cadenaId")
  public Integer getCadenaId() {
    return cadenaId;
  }

  public void setCadenaId(Integer cadenaId) {
    this.cadenaId = cadenaId;
  }

  public TarifasResponse tarifaId(Integer tarifaId) {
    this.tarifaId = tarifaId;
    return this;
  }

  /**
   * Identificador de la tarifa aplicada.
   * @return tarifaId
   */
  
  @Schema(name = "tarifaId", description = "Identificador de la tarifa aplicada.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tarifaId")
  public Integer getTarifaId() {
    return tarifaId;
  }

  public void setTarifaId(Integer tarifaId) {
    this.tarifaId = tarifaId;
  }

  public TarifasResponse fechaInicio(OffsetDateTime fechaInicio) {
    this.fechaInicio = fechaInicio;
    return this;
  }

  /**
   * Fecha de inicio de la aplicación de la tarifa.
   * @return fechaInicio
   */
  @Valid 
  @Schema(name = "fechaInicio", description = "Fecha de inicio de la aplicación de la tarifa.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fechaInicio")
  public OffsetDateTime getFechaInicio() {
    return fechaInicio;
  }

  public void setFechaInicio(OffsetDateTime fechaInicio) {
    this.fechaInicio = fechaInicio;
  }

  public TarifasResponse fechaFin(OffsetDateTime fechaFin) {
    this.fechaFin = fechaFin;
    return this;
  }

  /**
   * Fecha de fin de la aplicación de la tarifa.
   * @return fechaFin
   */
  @Valid 
  @Schema(name = "fechaFin", description = "Fecha de fin de la aplicación de la tarifa.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fechaFin")
  public OffsetDateTime getFechaFin() {
    return fechaFin;
  }

  public void setFechaFin(OffsetDateTime fechaFin) {
    this.fechaFin = fechaFin;
  }

  public TarifasResponse precioFinal(Float precioFinal) {
    this.precioFinal = precioFinal;
    return this;
  }

  /**
   * Precio final a aplicar.
   * @return precioFinal
   */
  
  @Schema(name = "precioFinal", description = "Precio final a aplicar.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("precioFinal")
  public Float getPrecioFinal() {
    return precioFinal;
  }

  public void setPrecioFinal(Float precioFinal) {
    this.precioFinal = precioFinal;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TarifasResponse tarifasResponse = (TarifasResponse) o;
    return Objects.equals(this.productoId, tarifasResponse.productoId) &&
        Objects.equals(this.cadenaId, tarifasResponse.cadenaId) &&
        Objects.equals(this.tarifaId, tarifasResponse.tarifaId) &&
        Objects.equals(this.fechaInicio, tarifasResponse.fechaInicio) &&
        Objects.equals(this.fechaFin, tarifasResponse.fechaFin) &&
        Objects.equals(this.precioFinal, tarifasResponse.precioFinal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productoId, cadenaId, tarifaId, fechaInicio, fechaFin, precioFinal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TarifasResponse {\n");
    sb.append("    productoId: ").append(toIndentedString(productoId)).append("\n");
    sb.append("    cadenaId: ").append(toIndentedString(cadenaId)).append("\n");
    sb.append("    tarifaId: ").append(toIndentedString(tarifaId)).append("\n");
    sb.append("    fechaInicio: ").append(toIndentedString(fechaInicio)).append("\n");
    sb.append("    fechaFin: ").append(toIndentedString(fechaFin)).append("\n");
    sb.append("    precioFinal: ").append(toIndentedString(precioFinal)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

