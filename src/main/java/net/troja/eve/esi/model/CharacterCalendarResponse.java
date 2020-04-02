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
 * event
 */
@ApiModel(description = "event")
public class CharacterCalendarResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_EVENT_DATE = "event_date";
    @SerializedName(SERIALIZED_NAME_EVENT_DATE)
    private OffsetDateTime eventDate;

    public static final String SERIALIZED_NAME_EVENT_ID = "event_id";
    @SerializedName(SERIALIZED_NAME_EVENT_ID)
    private Integer eventId;

    /**
     * event_response string
     */
    @JsonAdapter(EventResponseEnum.Adapter.class)
    public enum EventResponseEnum {
        DECLINED("declined"),

        NOT_RESPONDED("not_responded"),

        ACCEPTED("accepted"),

        TENTATIVE("tentative");

        private String value;

        EventResponseEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static EventResponseEnum fromValue(String value) {
            for (EventResponseEnum b : EventResponseEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<EventResponseEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final EventResponseEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public EventResponseEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return EventResponseEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_EVENT_RESPONSE = "event_response";
    @SerializedName(SERIALIZED_NAME_EVENT_RESPONSE)
    private EventResponseEnum eventResponse;

    public static final String SERIALIZED_NAME_IMPORTANCE = "importance";
    @SerializedName(SERIALIZED_NAME_IMPORTANCE)
    private Integer importance;

    public static final String SERIALIZED_NAME_TITLE = "title";
    @SerializedName(SERIALIZED_NAME_TITLE)
    private String title;

    public CharacterCalendarResponse eventDate(OffsetDateTime eventDate) {

        this.eventDate = eventDate;
        return this;
    }

    /**
     * event_date string
     * 
     * @return eventDate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "event_date string")
    public OffsetDateTime getEventDate() {
        return eventDate;
    }

    public void setEventDate(OffsetDateTime eventDate) {
        this.eventDate = eventDate;
    }

    public CharacterCalendarResponse eventId(Integer eventId) {

        this.eventId = eventId;
        return this;
    }

    /**
     * event_id integer
     * 
     * @return eventId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "event_id integer")
    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public CharacterCalendarResponse eventResponse(EventResponseEnum eventResponse) {

        this.eventResponse = eventResponse;
        return this;
    }

    /**
     * event_response string
     * 
     * @return eventResponse
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "event_response string")
    public EventResponseEnum getEventResponse() {
        return eventResponse;
    }

    public void setEventResponse(EventResponseEnum eventResponse) {
        this.eventResponse = eventResponse;
    }

    public CharacterCalendarResponse importance(Integer importance) {

        this.importance = importance;
        return this;
    }

    /**
     * importance integer
     * 
     * @return importance
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "importance integer")
    public Integer getImportance() {
        return importance;
    }

    public void setImportance(Integer importance) {
        this.importance = importance;
    }

    public CharacterCalendarResponse title(String title) {

        this.title = title;
        return this;
    }

    /**
     * title string
     * 
     * @return title
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "title string")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterCalendarResponse characterCalendarResponse = (CharacterCalendarResponse) o;
        return Objects.equals(this.eventDate, characterCalendarResponse.eventDate)
                && Objects.equals(this.eventId, characterCalendarResponse.eventId)
                && Objects.equals(this.eventResponse, characterCalendarResponse.eventResponse)
                && Objects.equals(this.importance, characterCalendarResponse.importance)
                && Objects.equals(this.title, characterCalendarResponse.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventDate, eventId, eventResponse, importance, title);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterCalendarResponse {\n");
        sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    eventResponse: ").append(toIndentedString(eventResponse)).append("\n");
        sb.append("    importance: ").append(toIndentedString(importance)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
