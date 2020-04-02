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
import java.util.ArrayList;
import java.util.List;
import net.troja.eve.esi.model.SovereigntyCampaignParticipant;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class SovereigntyCampaignsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ATTACKERS_SCORE = "attackers_score";
    @SerializedName(SERIALIZED_NAME_ATTACKERS_SCORE)
    private Float attackersScore;

    public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
    @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
    private Integer campaignId;

    public static final String SERIALIZED_NAME_CONSTELLATION_ID = "constellation_id";
    @SerializedName(SERIALIZED_NAME_CONSTELLATION_ID)
    private Integer constellationId;

    public static final String SERIALIZED_NAME_DEFENDER_ID = "defender_id";
    @SerializedName(SERIALIZED_NAME_DEFENDER_ID)
    private Integer defenderId;

    public static final String SERIALIZED_NAME_DEFENDER_SCORE = "defender_score";
    @SerializedName(SERIALIZED_NAME_DEFENDER_SCORE)
    private Float defenderScore;

    /**
     * Type of event this campaign is for. tcu_defense, ihub_defense and
     * station_defense are referred to as \&quot;Defense Events\&quot;,
     * station_freeport as \&quot;Freeport Events\&quot;.
     */
    @JsonAdapter(EventTypeEnum.Adapter.class)
    public enum EventTypeEnum {
        TCU_DEFENSE("tcu_defense"),

        IHUB_DEFENSE("ihub_defense"),

        STATION_DEFENSE("station_defense"),

        STATION_FREEPORT("station_freeport");

        private String value;

        EventTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static EventTypeEnum fromValue(String value) {
            for (EventTypeEnum b : EventTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<EventTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final EventTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public EventTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return EventTypeEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_EVENT_TYPE = "event_type";
    @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
    private EventTypeEnum eventType;

    public static final String SERIALIZED_NAME_PARTICIPANTS = "participants";
    @SerializedName(SERIALIZED_NAME_PARTICIPANTS)
    private List<SovereigntyCampaignParticipant> participants = null;

    public static final String SERIALIZED_NAME_SOLAR_SYSTEM_ID = "solar_system_id";
    @SerializedName(SERIALIZED_NAME_SOLAR_SYSTEM_ID)
    private Integer solarSystemId;

    public static final String SERIALIZED_NAME_START_TIME = "start_time";
    @SerializedName(SERIALIZED_NAME_START_TIME)
    private OffsetDateTime startTime;

    public static final String SERIALIZED_NAME_STRUCTURE_ID = "structure_id";
    @SerializedName(SERIALIZED_NAME_STRUCTURE_ID)
    private Long structureId;

    public SovereigntyCampaignsResponse attackersScore(Float attackersScore) {

        this.attackersScore = attackersScore;
        return this;
    }

    /**
     * Score for all attacking parties, only present in Defense Events.
     * 
     * @return attackersScore
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Score for all attacking parties, only present in Defense Events. ")
    public Float getAttackersScore() {
        return attackersScore;
    }

    public void setAttackersScore(Float attackersScore) {
        this.attackersScore = attackersScore;
    }

    public SovereigntyCampaignsResponse campaignId(Integer campaignId) {

        this.campaignId = campaignId;
        return this;
    }

    /**
     * Unique ID for this campaign.
     * 
     * @return campaignId
     **/
    @ApiModelProperty(required = true, value = "Unique ID for this campaign.")
    public Integer getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Integer campaignId) {
        this.campaignId = campaignId;
    }

    public SovereigntyCampaignsResponse constellationId(Integer constellationId) {

        this.constellationId = constellationId;
        return this;
    }

    /**
     * The constellation in which the campaign will take place.
     * 
     * @return constellationId
     **/
    @ApiModelProperty(required = true, value = "The constellation in which the campaign will take place. ")
    public Integer getConstellationId() {
        return constellationId;
    }

    public void setConstellationId(Integer constellationId) {
        this.constellationId = constellationId;
    }

    public SovereigntyCampaignsResponse defenderId(Integer defenderId) {

        this.defenderId = defenderId;
        return this;
    }

    /**
     * Defending alliance, only present in Defense Events
     * 
     * @return defenderId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Defending alliance, only present in Defense Events ")
    public Integer getDefenderId() {
        return defenderId;
    }

    public void setDefenderId(Integer defenderId) {
        this.defenderId = defenderId;
    }

    public SovereigntyCampaignsResponse defenderScore(Float defenderScore) {

        this.defenderScore = defenderScore;
        return this;
    }

    /**
     * Score for the defending alliance, only present in Defense Events.
     * 
     * @return defenderScore
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Score for the defending alliance, only present in Defense Events. ")
    public Float getDefenderScore() {
        return defenderScore;
    }

    public void setDefenderScore(Float defenderScore) {
        this.defenderScore = defenderScore;
    }

    public SovereigntyCampaignsResponse eventType(EventTypeEnum eventType) {

        this.eventType = eventType;
        return this;
    }

    /**
     * Type of event this campaign is for. tcu_defense, ihub_defense and
     * station_defense are referred to as \&quot;Defense Events\&quot;,
     * station_freeport as \&quot;Freeport Events\&quot;.
     * 
     * @return eventType
     **/
    @ApiModelProperty(required = true, value = "Type of event this campaign is for. tcu_defense, ihub_defense and station_defense are referred to as \"Defense Events\", station_freeport as \"Freeport Events\". ")
    public EventTypeEnum getEventType() {
        return eventType;
    }

    public void setEventType(EventTypeEnum eventType) {
        this.eventType = eventType;
    }

    public SovereigntyCampaignsResponse participants(List<SovereigntyCampaignParticipant> participants) {

        this.participants = participants;
        return this;
    }

    public SovereigntyCampaignsResponse addParticipantsItem(SovereigntyCampaignParticipant participantsItem) {
        if (this.participants == null) {
            this.participants = new ArrayList<>();
        }
        this.participants.add(participantsItem);
        return this;
    }

    /**
     * Alliance participating and their respective scores, only present in
     * Freeport Events.
     * 
     * @return participants
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Alliance participating and their respective scores, only present in Freeport Events. ")
    public List<SovereigntyCampaignParticipant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<SovereigntyCampaignParticipant> participants) {
        this.participants = participants;
    }

    public SovereigntyCampaignsResponse solarSystemId(Integer solarSystemId) {

        this.solarSystemId = solarSystemId;
        return this;
    }

    /**
     * The solar system the structure is located in.
     * 
     * @return solarSystemId
     **/
    @ApiModelProperty(required = true, value = "The solar system the structure is located in. ")
    public Integer getSolarSystemId() {
        return solarSystemId;
    }

    public void setSolarSystemId(Integer solarSystemId) {
        this.solarSystemId = solarSystemId;
    }

    public SovereigntyCampaignsResponse startTime(OffsetDateTime startTime) {

        this.startTime = startTime;
        return this;
    }

    /**
     * Time the event is scheduled to start.
     * 
     * @return startTime
     **/
    @ApiModelProperty(required = true, value = "Time the event is scheduled to start. ")
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public SovereigntyCampaignsResponse structureId(Long structureId) {

        this.structureId = structureId;
        return this;
    }

    /**
     * The structure item ID that is related to this campaign.
     * 
     * @return structureId
     **/
    @ApiModelProperty(required = true, value = "The structure item ID that is related to this campaign. ")
    public Long getStructureId() {
        return structureId;
    }

    public void setStructureId(Long structureId) {
        this.structureId = structureId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SovereigntyCampaignsResponse sovereigntyCampaignsResponse = (SovereigntyCampaignsResponse) o;
        return Objects.equals(this.attackersScore, sovereigntyCampaignsResponse.attackersScore)
                && Objects.equals(this.campaignId, sovereigntyCampaignsResponse.campaignId)
                && Objects.equals(this.constellationId, sovereigntyCampaignsResponse.constellationId)
                && Objects.equals(this.defenderId, sovereigntyCampaignsResponse.defenderId)
                && Objects.equals(this.defenderScore, sovereigntyCampaignsResponse.defenderScore)
                && Objects.equals(this.eventType, sovereigntyCampaignsResponse.eventType)
                && Objects.equals(this.participants, sovereigntyCampaignsResponse.participants)
                && Objects.equals(this.solarSystemId, sovereigntyCampaignsResponse.solarSystemId)
                && Objects.equals(this.startTime, sovereigntyCampaignsResponse.startTime)
                && Objects.equals(this.structureId, sovereigntyCampaignsResponse.structureId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attackersScore, campaignId, constellationId, defenderId, defenderScore, eventType,
                participants, solarSystemId, startTime, structureId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SovereigntyCampaignsResponse {\n");
        sb.append("    attackersScore: ").append(toIndentedString(attackersScore)).append("\n");
        sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
        sb.append("    constellationId: ").append(toIndentedString(constellationId)).append("\n");
        sb.append("    defenderId: ").append(toIndentedString(defenderId)).append("\n");
        sb.append("    defenderScore: ").append(toIndentedString(defenderScore)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
        sb.append("    solarSystemId: ").append(toIndentedString(solarSystemId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    structureId: ").append(toIndentedString(structureId)).append("\n");
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
