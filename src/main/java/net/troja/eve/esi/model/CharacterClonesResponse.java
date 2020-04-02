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
import net.troja.eve.esi.model.Clone;
import net.troja.eve.esi.model.CloneHomeLocation;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CharacterClonesResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_HOME_LOCATION = "home_location";
    @SerializedName(SERIALIZED_NAME_HOME_LOCATION)
    private CloneHomeLocation homeLocation;

    public static final String SERIALIZED_NAME_JUMP_CLONES = "jump_clones";
    @SerializedName(SERIALIZED_NAME_JUMP_CLONES)
    private List<Clone> jumpClones = new ArrayList<>();

    public static final String SERIALIZED_NAME_LAST_CLONE_JUMP_DATE = "last_clone_jump_date";
    @SerializedName(SERIALIZED_NAME_LAST_CLONE_JUMP_DATE)
    private OffsetDateTime lastCloneJumpDate;

    public static final String SERIALIZED_NAME_LAST_STATION_CHANGE_DATE = "last_station_change_date";
    @SerializedName(SERIALIZED_NAME_LAST_STATION_CHANGE_DATE)
    private OffsetDateTime lastStationChangeDate;

    public CharacterClonesResponse homeLocation(CloneHomeLocation homeLocation) {

        this.homeLocation = homeLocation;
        return this;
    }

    /**
     * Get homeLocation
     * 
     * @return homeLocation
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public CloneHomeLocation getHomeLocation() {
        return homeLocation;
    }

    public void setHomeLocation(CloneHomeLocation homeLocation) {
        this.homeLocation = homeLocation;
    }

    public CharacterClonesResponse jumpClones(List<Clone> jumpClones) {

        this.jumpClones = jumpClones;
        return this;
    }

    public CharacterClonesResponse addJumpClonesItem(Clone jumpClonesItem) {
        this.jumpClones.add(jumpClonesItem);
        return this;
    }

    /**
     * jump_clones array
     * 
     * @return jumpClones
     **/
    @ApiModelProperty(required = true, value = "jump_clones array")
    public List<Clone> getJumpClones() {
        return jumpClones;
    }

    public void setJumpClones(List<Clone> jumpClones) {
        this.jumpClones = jumpClones;
    }

    public CharacterClonesResponse lastCloneJumpDate(OffsetDateTime lastCloneJumpDate) {

        this.lastCloneJumpDate = lastCloneJumpDate;
        return this;
    }

    /**
     * last_clone_jump_date string
     * 
     * @return lastCloneJumpDate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "last_clone_jump_date string")
    public OffsetDateTime getLastCloneJumpDate() {
        return lastCloneJumpDate;
    }

    public void setLastCloneJumpDate(OffsetDateTime lastCloneJumpDate) {
        this.lastCloneJumpDate = lastCloneJumpDate;
    }

    public CharacterClonesResponse lastStationChangeDate(OffsetDateTime lastStationChangeDate) {

        this.lastStationChangeDate = lastStationChangeDate;
        return this;
    }

    /**
     * last_station_change_date string
     * 
     * @return lastStationChangeDate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "last_station_change_date string")
    public OffsetDateTime getLastStationChangeDate() {
        return lastStationChangeDate;
    }

    public void setLastStationChangeDate(OffsetDateTime lastStationChangeDate) {
        this.lastStationChangeDate = lastStationChangeDate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterClonesResponse characterClonesResponse = (CharacterClonesResponse) o;
        return Objects.equals(this.homeLocation, characterClonesResponse.homeLocation)
                && Objects.equals(this.jumpClones, characterClonesResponse.jumpClones)
                && Objects.equals(this.lastCloneJumpDate, characterClonesResponse.lastCloneJumpDate)
                && Objects.equals(this.lastStationChangeDate, characterClonesResponse.lastStationChangeDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(homeLocation, jumpClones, lastCloneJumpDate, lastStationChangeDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterClonesResponse {\n");
        sb.append("    homeLocation: ").append(toIndentedString(homeLocation)).append("\n");
        sb.append("    jumpClones: ").append(toIndentedString(jumpClones)).append("\n");
        sb.append("    lastCloneJumpDate: ").append(toIndentedString(lastCloneJumpDate)).append("\n");
        sb.append("    lastStationChangeDate: ").append(toIndentedString(lastStationChangeDate)).append("\n");
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
