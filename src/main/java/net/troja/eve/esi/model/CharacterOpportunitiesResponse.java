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
public class CharacterOpportunitiesResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_COMPLETED_AT = "completed_at";
    @SerializedName(SERIALIZED_NAME_COMPLETED_AT)
    private OffsetDateTime completedAt;

    public static final String SERIALIZED_NAME_TASK_ID = "task_id";
    @SerializedName(SERIALIZED_NAME_TASK_ID)
    private Integer taskId;

    public CharacterOpportunitiesResponse completedAt(OffsetDateTime completedAt) {

        this.completedAt = completedAt;
        return this;
    }

    /**
     * completed_at string
     * 
     * @return completedAt
     **/
    @ApiModelProperty(required = true, value = "completed_at string")
    public OffsetDateTime getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(OffsetDateTime completedAt) {
        this.completedAt = completedAt;
    }

    public CharacterOpportunitiesResponse taskId(Integer taskId) {

        this.taskId = taskId;
        return this;
    }

    /**
     * task_id integer
     * 
     * @return taskId
     **/
    @ApiModelProperty(required = true, value = "task_id integer")
    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterOpportunitiesResponse characterOpportunitiesResponse = (CharacterOpportunitiesResponse) o;
        return Objects.equals(this.completedAt, characterOpportunitiesResponse.completedAt)
                && Objects.equals(this.taskId, characterOpportunitiesResponse.taskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(completedAt, taskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterOpportunitiesResponse {\n");
        sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
