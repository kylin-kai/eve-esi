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
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class PlanetFactorySchematicResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_CYCLE_TIME = "cycle_time";
    @SerializedName(SERIALIZED_NAME_CYCLE_TIME)
    private Integer cycleTime;

    public static final String SERIALIZED_NAME_SCHEMATIC_NAME = "schematic_name";
    @SerializedName(SERIALIZED_NAME_SCHEMATIC_NAME)
    private String schematicName;

    public PlanetFactorySchematicResponse cycleTime(Integer cycleTime) {

        this.cycleTime = cycleTime;
        return this;
    }

    /**
     * Time in seconds to process a run
     * 
     * @return cycleTime
     **/
    @ApiModelProperty(required = true, value = "Time in seconds to process a run")
    public Integer getCycleTime() {
        return cycleTime;
    }

    public void setCycleTime(Integer cycleTime) {
        this.cycleTime = cycleTime;
    }

    public PlanetFactorySchematicResponse schematicName(String schematicName) {

        this.schematicName = schematicName;
        return this;
    }

    /**
     * schematic_name string
     * 
     * @return schematicName
     **/
    @ApiModelProperty(required = true, value = "schematic_name string")
    public String getSchematicName() {
        return schematicName;
    }

    public void setSchematicName(String schematicName) {
        this.schematicName = schematicName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlanetFactorySchematicResponse planetFactorySchematicResponse = (PlanetFactorySchematicResponse) o;
        return Objects.equals(this.cycleTime, planetFactorySchematicResponse.cycleTime)
                && Objects.equals(this.schematicName, planetFactorySchematicResponse.schematicName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cycleTime, schematicName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlanetFactorySchematicResponse {\n");
        sb.append("    cycleTime: ").append(toIndentedString(cycleTime)).append("\n");
        sb.append("    schematicName: ").append(toIndentedString(schematicName)).append("\n");
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
