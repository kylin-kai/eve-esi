/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.3.2.dev3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package net.troja.eve.esi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import net.troja.eve.esi.model.GetCharactersCharacterIdPlanetsPlanetIdContent;
import net.troja.eve.esi.model.GetCharactersCharacterIdPlanetsPlanetIdExtractorDetails;
import net.troja.eve.esi.model.GetCharactersCharacterIdPlanetsPlanetIdFactoryDetails;
import java.io.Serializable;

/**
 * pin object
 */
@ApiModel(description = "pin object")
public class PlanetPin implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("content")
    private List<GetCharactersCharacterIdPlanetsPlanetIdContent> content = new ArrayList<GetCharactersCharacterIdPlanetsPlanetIdContent>();

    @JsonProperty("expiry_time")
    private OffsetDateTime expiryTime = null;

    @JsonProperty("extractor_details")
    private GetCharactersCharacterIdPlanetsPlanetIdExtractorDetails extractorDetails = null;

    @JsonProperty("factory_details")
    private GetCharactersCharacterIdPlanetsPlanetIdFactoryDetails factoryDetails = null;

    @JsonProperty("install_time")
    private OffsetDateTime installTime = null;

    @JsonProperty("last_cycle_start")
    private OffsetDateTime lastCycleStart = null;

    @JsonProperty("latitude")
    private Float latitude = null;

    @JsonProperty("longitude")
    private Float longitude = null;

    @JsonProperty("pin_id")
    private Long pinId = null;

    @JsonProperty("schematic_id")
    private Integer schematicId = null;

    @JsonProperty("type_id")
    private Integer typeId = null;

    public PlanetPin content(List<GetCharactersCharacterIdPlanetsPlanetIdContent> content) {
        this.content = content;
        return this;
    }

    public PlanetPin addContentItem(GetCharactersCharacterIdPlanetsPlanetIdContent contentItem) {
        this.content.add(contentItem);
        return this;
    }

    /**
     * content array
     * 
     * @return content
     **/
    @ApiModelProperty(example = "null", value = "content array")
    public List<GetCharactersCharacterIdPlanetsPlanetIdContent> getContent() {
        return content;
    }

    public void setContent(List<GetCharactersCharacterIdPlanetsPlanetIdContent> content) {
        this.content = content;
    }

    public PlanetPin expiryTime(OffsetDateTime expiryTime) {
        this.expiryTime = expiryTime;
        return this;
    }

    /**
     * expiry_time string
     * 
     * @return expiryTime
     **/
    @ApiModelProperty(example = "null", value = "expiry_time string")
    public OffsetDateTime getExpiryTime() {
        return expiryTime;
    }

    public void setExpiryTime(OffsetDateTime expiryTime) {
        this.expiryTime = expiryTime;
    }

    public PlanetPin extractorDetails(GetCharactersCharacterIdPlanetsPlanetIdExtractorDetails extractorDetails) {
        this.extractorDetails = extractorDetails;
        return this;
    }

    /**
     * Get extractorDetails
     * 
     * @return extractorDetails
     **/
    @ApiModelProperty(example = "null", value = "")
    public GetCharactersCharacterIdPlanetsPlanetIdExtractorDetails getExtractorDetails() {
        return extractorDetails;
    }

    public void setExtractorDetails(GetCharactersCharacterIdPlanetsPlanetIdExtractorDetails extractorDetails) {
        this.extractorDetails = extractorDetails;
    }

    public PlanetPin factoryDetails(GetCharactersCharacterIdPlanetsPlanetIdFactoryDetails factoryDetails) {
        this.factoryDetails = factoryDetails;
        return this;
    }

    /**
     * Get factoryDetails
     * 
     * @return factoryDetails
     **/
    @ApiModelProperty(example = "null", value = "")
    public GetCharactersCharacterIdPlanetsPlanetIdFactoryDetails getFactoryDetails() {
        return factoryDetails;
    }

    public void setFactoryDetails(GetCharactersCharacterIdPlanetsPlanetIdFactoryDetails factoryDetails) {
        this.factoryDetails = factoryDetails;
    }

    public PlanetPin installTime(OffsetDateTime installTime) {
        this.installTime = installTime;
        return this;
    }

    /**
     * install_time string
     * 
     * @return installTime
     **/
    @ApiModelProperty(example = "null", value = "install_time string")
    public OffsetDateTime getInstallTime() {
        return installTime;
    }

    public void setInstallTime(OffsetDateTime installTime) {
        this.installTime = installTime;
    }

    public PlanetPin lastCycleStart(OffsetDateTime lastCycleStart) {
        this.lastCycleStart = lastCycleStart;
        return this;
    }

    /**
     * last_cycle_start string
     * 
     * @return lastCycleStart
     **/
    @ApiModelProperty(example = "null", value = "last_cycle_start string")
    public OffsetDateTime getLastCycleStart() {
        return lastCycleStart;
    }

    public void setLastCycleStart(OffsetDateTime lastCycleStart) {
        this.lastCycleStart = lastCycleStart;
    }

    public PlanetPin latitude(Float latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * latitude number
     * 
     * @return latitude
     **/
    @ApiModelProperty(example = "null", required = true, value = "latitude number")
    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public PlanetPin longitude(Float longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * longitude number
     * 
     * @return longitude
     **/
    @ApiModelProperty(example = "null", required = true, value = "longitude number")
    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public PlanetPin pinId(Long pinId) {
        this.pinId = pinId;
        return this;
    }

    /**
     * pin_id integer
     * 
     * @return pinId
     **/
    @ApiModelProperty(example = "null", required = true, value = "pin_id integer")
    public Long getPinId() {
        return pinId;
    }

    public void setPinId(Long pinId) {
        this.pinId = pinId;
    }

    public PlanetPin schematicId(Integer schematicId) {
        this.schematicId = schematicId;
        return this;
    }

    /**
     * schematic_id integer
     * 
     * @return schematicId
     **/
    @ApiModelProperty(example = "null", value = "schematic_id integer")
    public Integer getSchematicId() {
        return schematicId;
    }

    public void setSchematicId(Integer schematicId) {
        this.schematicId = schematicId;
    }

    public PlanetPin typeId(Integer typeId) {
        this.typeId = typeId;
        return this;
    }

    /**
     * type_id integer
     * 
     * @return typeId
     **/
    @ApiModelProperty(example = "null", required = true, value = "type_id integer")
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlanetPin planetPin = (PlanetPin) o;
        return Objects.equals(this.content, planetPin.content) && Objects.equals(this.expiryTime, planetPin.expiryTime)
                && Objects.equals(this.extractorDetails, planetPin.extractorDetails)
                && Objects.equals(this.factoryDetails, planetPin.factoryDetails)
                && Objects.equals(this.installTime, planetPin.installTime)
                && Objects.equals(this.lastCycleStart, planetPin.lastCycleStart)
                && Objects.equals(this.latitude, planetPin.latitude)
                && Objects.equals(this.longitude, planetPin.longitude) && Objects.equals(this.pinId, planetPin.pinId)
                && Objects.equals(this.schematicId, planetPin.schematicId)
                && Objects.equals(this.typeId, planetPin.typeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, expiryTime, extractorDetails, factoryDetails, installTime, lastCycleStart,
                latitude, longitude, pinId, schematicId, typeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlanetPin {\n");

        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    expiryTime: ").append(toIndentedString(expiryTime)).append("\n");
        sb.append("    extractorDetails: ").append(toIndentedString(extractorDetails)).append("\n");
        sb.append("    factoryDetails: ").append(toIndentedString(factoryDetails)).append("\n");
        sb.append("    installTime: ").append(toIndentedString(installTime)).append("\n");
        sb.append("    lastCycleStart: ").append(toIndentedString(lastCycleStart)).append("\n");
        sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
        sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
        sb.append("    pinId: ").append(toIndentedString(pinId)).append("\n");
        sb.append("    schematicId: ").append(toIndentedString(schematicId)).append("\n");
        sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
