/*
 * ESI Meta Spec
 * ESI specs and miscellaneous routes
 *
 * The version of the OpenAPI document: 0.1
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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Per route status
 */
@ApiModel(description = "Per route status")
public class EsiStatusResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ENDPOINT = "endpoint";
    @SerializedName(SERIALIZED_NAME_ENDPOINT)
    private String endpoint;

    public static final String SERIALIZED_NAME_METHOD = "method";
    @SerializedName(SERIALIZED_NAME_METHOD)
    private String method;

    public static final String SERIALIZED_NAME_ROUTE = "route";
    @SerializedName(SERIALIZED_NAME_ROUTE)
    private String route;

    /**
     * Vague route status. Green is good, yellow is degraded, meaning slow or
     * potentially dropping requests. Red means most requests are not succeeding
     * and/or are very slow (5s+) on average.
     */
    @JsonAdapter(StatusEnum.Adapter.class)
    public enum StatusEnum {
        GREEN("green"),

        YELLOW("yellow"),

        RED("red");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<StatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StatusEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StatusEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_STATUS = "status";
    @SerializedName(SERIALIZED_NAME_STATUS)
    private StatusEnum status;

    public static final String SERIALIZED_NAME_TAGS = "tags";
    @SerializedName(SERIALIZED_NAME_TAGS)
    private List<String> tags = new ArrayList<>();

    public EsiStatusResponse endpoint(String endpoint) {

        this.endpoint = endpoint;
        return this;
    }

    /**
     * ESI Endpoint cluster advertising this route
     * 
     * @return endpoint
     **/
    @ApiModelProperty(required = true, value = "ESI Endpoint cluster advertising this route")
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public EsiStatusResponse method(String method) {

        this.method = method;
        return this;
    }

    /**
     * Swagger defined method
     * 
     * @return method
     **/
    @ApiModelProperty(required = true, value = "Swagger defined method")
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public EsiStatusResponse route(String route) {

        this.route = route;
        return this;
    }

    /**
     * Swagger defined route, not including version prefix
     * 
     * @return route
     **/
    @ApiModelProperty(required = true, value = "Swagger defined route, not including version prefix")
    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public EsiStatusResponse status(StatusEnum status) {

        this.status = status;
        return this;
    }

    /**
     * Vague route status. Green is good, yellow is degraded, meaning slow or
     * potentially dropping requests. Red means most requests are not succeeding
     * and/or are very slow (5s+) on average.
     * 
     * @return status
     **/
    @ApiModelProperty(required = true, value = "Vague route status. Green is good, yellow is degraded, meaning slow or potentially dropping requests. Red means most requests are not succeeding and/or are very slow (5s+) on average.")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public EsiStatusResponse tags(List<String> tags) {

        this.tags = tags;
        return this;
    }

    public EsiStatusResponse addTagsItem(String tagsItem) {
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * Swagger tags applicable to this route
     * 
     * @return tags
     **/
    @ApiModelProperty(required = true, value = "Swagger tags applicable to this route")
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EsiStatusResponse esiStatusResponse = (EsiStatusResponse) o;
        return Objects.equals(this.endpoint, esiStatusResponse.endpoint)
                && Objects.equals(this.method, esiStatusResponse.method)
                && Objects.equals(this.route, esiStatusResponse.route)
                && Objects.equals(this.status, esiStatusResponse.status)
                && Objects.equals(this.tags, esiStatusResponse.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpoint, method, route, status, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EsiStatusResponse {\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    route: ").append(toIndentedString(route)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
