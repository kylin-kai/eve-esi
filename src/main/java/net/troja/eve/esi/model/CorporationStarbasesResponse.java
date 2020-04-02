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
public class CorporationStarbasesResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_MOON_ID = "moon_id";
    @SerializedName(SERIALIZED_NAME_MOON_ID)
    private Integer moonId;

    public static final String SERIALIZED_NAME_ONLINED_SINCE = "onlined_since";
    @SerializedName(SERIALIZED_NAME_ONLINED_SINCE)
    private OffsetDateTime onlinedSince;

    public static final String SERIALIZED_NAME_REINFORCED_UNTIL = "reinforced_until";
    @SerializedName(SERIALIZED_NAME_REINFORCED_UNTIL)
    private OffsetDateTime reinforcedUntil;

    public static final String SERIALIZED_NAME_STARBASE_ID = "starbase_id";
    @SerializedName(SERIALIZED_NAME_STARBASE_ID)
    private Long starbaseId;

    /**
     * state string
     */
    @JsonAdapter(StateEnum.Adapter.class)
    public enum StateEnum {
        OFFLINE("offline"),

        ONLINE("online"),

        ONLINING("onlining"),

        REINFORCED("reinforced"),

        UNANCHORING("unanchoring");

        private String value;

        StateEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StateEnum fromValue(String value) {
            for (StateEnum b : StateEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<StateEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StateEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StateEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_STATE = "state";
    @SerializedName(SERIALIZED_NAME_STATE)
    private StateEnum state;

    public static final String SERIALIZED_NAME_SYSTEM_ID = "system_id";
    @SerializedName(SERIALIZED_NAME_SYSTEM_ID)
    private Integer systemId;

    public static final String SERIALIZED_NAME_TYPE_ID = "type_id";
    @SerializedName(SERIALIZED_NAME_TYPE_ID)
    private Integer typeId;

    public static final String SERIALIZED_NAME_UNANCHOR_AT = "unanchor_at";
    @SerializedName(SERIALIZED_NAME_UNANCHOR_AT)
    private OffsetDateTime unanchorAt;

    public CorporationStarbasesResponse moonId(Integer moonId) {

        this.moonId = moonId;
        return this;
    }

    /**
     * The moon this starbase (POS) is anchored on, unanchored POSes do not have
     * this information
     * 
     * @return moonId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The moon this starbase (POS) is anchored on, unanchored POSes do not have this information")
    public Integer getMoonId() {
        return moonId;
    }

    public void setMoonId(Integer moonId) {
        this.moonId = moonId;
    }

    public CorporationStarbasesResponse onlinedSince(OffsetDateTime onlinedSince) {

        this.onlinedSince = onlinedSince;
        return this;
    }

    /**
     * When the POS onlined, for starbases (POSes) in online state
     * 
     * @return onlinedSince
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "When the POS onlined, for starbases (POSes) in online state")
    public OffsetDateTime getOnlinedSince() {
        return onlinedSince;
    }

    public void setOnlinedSince(OffsetDateTime onlinedSince) {
        this.onlinedSince = onlinedSince;
    }

    public CorporationStarbasesResponse reinforcedUntil(OffsetDateTime reinforcedUntil) {

        this.reinforcedUntil = reinforcedUntil;
        return this;
    }

    /**
     * When the POS will be out of reinforcement, for starbases (POSes) in
     * reinforced state
     * 
     * @return reinforcedUntil
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "When the POS will be out of reinforcement, for starbases (POSes) in reinforced state")
    public OffsetDateTime getReinforcedUntil() {
        return reinforcedUntil;
    }

    public void setReinforcedUntil(OffsetDateTime reinforcedUntil) {
        this.reinforcedUntil = reinforcedUntil;
    }

    public CorporationStarbasesResponse starbaseId(Long starbaseId) {

        this.starbaseId = starbaseId;
        return this;
    }

    /**
     * Unique ID for this starbase (POS)
     * 
     * @return starbaseId
     **/
    @ApiModelProperty(required = true, value = "Unique ID for this starbase (POS)")
    public Long getStarbaseId() {
        return starbaseId;
    }

    public void setStarbaseId(Long starbaseId) {
        this.starbaseId = starbaseId;
    }

    public CorporationStarbasesResponse state(StateEnum state) {

        this.state = state;
        return this;
    }

    /**
     * state string
     * 
     * @return state
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "state string")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public CorporationStarbasesResponse systemId(Integer systemId) {

        this.systemId = systemId;
        return this;
    }

    /**
     * The solar system this starbase (POS) is in, unanchored POSes have this
     * information
     * 
     * @return systemId
     **/
    @ApiModelProperty(required = true, value = "The solar system this starbase (POS) is in, unanchored POSes have this information")
    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    public CorporationStarbasesResponse typeId(Integer typeId) {

        this.typeId = typeId;
        return this;
    }

    /**
     * Starbase (POS) type
     * 
     * @return typeId
     **/
    @ApiModelProperty(required = true, value = "Starbase (POS) type")
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public CorporationStarbasesResponse unanchorAt(OffsetDateTime unanchorAt) {

        this.unanchorAt = unanchorAt;
        return this;
    }

    /**
     * When the POS started unanchoring, for starbases (POSes) in unanchoring
     * state
     * 
     * @return unanchorAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "When the POS started unanchoring, for starbases (POSes) in unanchoring state")
    public OffsetDateTime getUnanchorAt() {
        return unanchorAt;
    }

    public void setUnanchorAt(OffsetDateTime unanchorAt) {
        this.unanchorAt = unanchorAt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationStarbasesResponse corporationStarbasesResponse = (CorporationStarbasesResponse) o;
        return Objects.equals(this.moonId, corporationStarbasesResponse.moonId)
                && Objects.equals(this.onlinedSince, corporationStarbasesResponse.onlinedSince)
                && Objects.equals(this.reinforcedUntil, corporationStarbasesResponse.reinforcedUntil)
                && Objects.equals(this.starbaseId, corporationStarbasesResponse.starbaseId)
                && Objects.equals(this.state, corporationStarbasesResponse.state)
                && Objects.equals(this.systemId, corporationStarbasesResponse.systemId)
                && Objects.equals(this.typeId, corporationStarbasesResponse.typeId)
                && Objects.equals(this.unanchorAt, corporationStarbasesResponse.unanchorAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moonId, onlinedSince, reinforcedUntil, starbaseId, state, systemId, typeId, unanchorAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationStarbasesResponse {\n");
        sb.append("    moonId: ").append(toIndentedString(moonId)).append("\n");
        sb.append("    onlinedSince: ").append(toIndentedString(onlinedSince)).append("\n");
        sb.append("    reinforcedUntil: ").append(toIndentedString(reinforcedUntil)).append("\n");
        sb.append("    starbaseId: ").append(toIndentedString(starbaseId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
        sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
        sb.append("    unanchorAt: ").append(toIndentedString(unanchorAt)).append("\n");
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
