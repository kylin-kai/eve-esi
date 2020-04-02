/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * The version of the OpenAPI document: 1.3.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package net.troja.eve.esi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CorporationMemberTrackingResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_BASE_ID = "base_id";
    @SerializedName(SERIALIZED_NAME_BASE_ID)
    private Integer baseId;

    public static final String SERIALIZED_NAME_CHARACTER_ID = "character_id";
    @SerializedName(SERIALIZED_NAME_CHARACTER_ID)
    private Integer characterId;

    public static final String SERIALIZED_NAME_LOCATION_ID = "location_id";
    @SerializedName(SERIALIZED_NAME_LOCATION_ID)
    private Long locationId;

    public static final String SERIALIZED_NAME_LOGOFF_DATE = "logoff_date";
    @SerializedName(SERIALIZED_NAME_LOGOFF_DATE)
    private OffsetDateTime logoffDate;

    public static final String SERIALIZED_NAME_LOGON_DATE = "logon_date";
    @SerializedName(SERIALIZED_NAME_LOGON_DATE)
    private OffsetDateTime logonDate;

    public static final String SERIALIZED_NAME_SHIP_TYPE_ID = "ship_type_id";
    @SerializedName(SERIALIZED_NAME_SHIP_TYPE_ID)
    private Integer shipTypeId;

    public static final String SERIALIZED_NAME_START_DATE = "start_date";
    @SerializedName(SERIALIZED_NAME_START_DATE)
    private OffsetDateTime startDate;

    public CorporationMemberTrackingResponse baseId(Integer baseId) {

        this.baseId = baseId;
        return this;
    }

    /**
     * base_id integer
     * 
     * @return baseId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "base_id integer")
    public Integer getBaseId() {
        return baseId;
    }

    public void setBaseId(Integer baseId) {
        this.baseId = baseId;
    }

    public CorporationMemberTrackingResponse characterId(Integer characterId) {

        this.characterId = characterId;
        return this;
    }

    /**
     * character_id integer
     * 
     * @return characterId
     **/
    @ApiModelProperty(required = true, value = "character_id integer")
    public Integer getCharacterId() {
        return characterId;
    }

    public void setCharacterId(Integer characterId) {
        this.characterId = characterId;
    }

    public CorporationMemberTrackingResponse locationId(Long locationId) {

        this.locationId = locationId;
        return this;
    }

    /**
     * location_id integer
     * 
     * @return locationId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "location_id integer")
    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public CorporationMemberTrackingResponse logoffDate(OffsetDateTime logoffDate) {

        this.logoffDate = logoffDate;
        return this;
    }

    /**
     * logoff_date string
     * 
     * @return logoffDate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "logoff_date string")
    public OffsetDateTime getLogoffDate() {
        return logoffDate;
    }

    public void setLogoffDate(OffsetDateTime logoffDate) {
        this.logoffDate = logoffDate;
    }

    public CorporationMemberTrackingResponse logonDate(OffsetDateTime logonDate) {

        this.logonDate = logonDate;
        return this;
    }

    /**
     * logon_date string
     * 
     * @return logonDate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "logon_date string")
    public OffsetDateTime getLogonDate() {
        return logonDate;
    }

    public void setLogonDate(OffsetDateTime logonDate) {
        this.logonDate = logonDate;
    }

    public CorporationMemberTrackingResponse shipTypeId(Integer shipTypeId) {

        this.shipTypeId = shipTypeId;
        return this;
    }

    /**
     * ship_type_id integer
     * 
     * @return shipTypeId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "ship_type_id integer")
    public Integer getShipTypeId() {
        return shipTypeId;
    }

    public void setShipTypeId(Integer shipTypeId) {
        this.shipTypeId = shipTypeId;
    }

    public CorporationMemberTrackingResponse startDate(OffsetDateTime startDate) {

        this.startDate = startDate;
        return this;
    }

    /**
     * start_date string
     * 
     * @return startDate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "start_date string")
    public OffsetDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationMemberTrackingResponse corporationMemberTrackingResponse = (CorporationMemberTrackingResponse) o;
        return Objects.equals(this.baseId, corporationMemberTrackingResponse.baseId)
                && Objects.equals(this.characterId, corporationMemberTrackingResponse.characterId)
                && Objects.equals(this.locationId, corporationMemberTrackingResponse.locationId)
                && Objects.equals(this.logoffDate, corporationMemberTrackingResponse.logoffDate)
                && Objects.equals(this.logonDate, corporationMemberTrackingResponse.logonDate)
                && Objects.equals(this.shipTypeId, corporationMemberTrackingResponse.shipTypeId)
                && Objects.equals(this.startDate, corporationMemberTrackingResponse.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseId, characterId, locationId, logoffDate, logonDate, shipTypeId, startDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationMemberTrackingResponse {\n");
        sb.append("    baseId: ").append(toIndentedString(baseId)).append("\n");
        sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
        sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
        sb.append("    logoffDate: ").append(toIndentedString(logoffDate)).append("\n");
        sb.append("    logonDate: ").append(toIndentedString(logonDate)).append("\n");
        sb.append("    shipTypeId: ").append(toIndentedString(shipTypeId)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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
