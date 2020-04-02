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
import java.util.ArrayList;
import java.util.List;
import net.troja.eve.esi.model.Position;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class StationResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_MAX_DOCKABLE_SHIP_VOLUME = "max_dockable_ship_volume";
    @SerializedName(SERIALIZED_NAME_MAX_DOCKABLE_SHIP_VOLUME)
    private Float maxDockableShipVolume;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_OFFICE_RENTAL_COST = "office_rental_cost";
    @SerializedName(SERIALIZED_NAME_OFFICE_RENTAL_COST)
    private Float officeRentalCost;

    public static final String SERIALIZED_NAME_OWNER = "owner";
    @SerializedName(SERIALIZED_NAME_OWNER)
    private Integer owner;

    public static final String SERIALIZED_NAME_POSITION = "position";
    @SerializedName(SERIALIZED_NAME_POSITION)
    private Position position;

    public static final String SERIALIZED_NAME_RACE_ID = "race_id";
    @SerializedName(SERIALIZED_NAME_RACE_ID)
    private Integer raceId;

    public static final String SERIALIZED_NAME_REPROCESSING_EFFICIENCY = "reprocessing_efficiency";
    @SerializedName(SERIALIZED_NAME_REPROCESSING_EFFICIENCY)
    private Float reprocessingEfficiency;

    public static final String SERIALIZED_NAME_REPROCESSING_STATIONS_TAKE = "reprocessing_stations_take";
    @SerializedName(SERIALIZED_NAME_REPROCESSING_STATIONS_TAKE)
    private Float reprocessingStationsTake;

    /**
     * service string
     */
    @JsonAdapter(ServicesEnum.Adapter.class)
    public enum ServicesEnum {
        BOUNTY_MISSIONS("bounty-missions"),

        ASSASINATION_MISSIONS("assasination-missions"),

        COURIER_MISSIONS("courier-missions"),

        INTERBUS("interbus"),

        REPROCESSING_PLANT("reprocessing-plant"),

        REFINERY("refinery"),

        MARKET("market"),

        BLACK_MARKET("black-market"),

        STOCK_EXCHANGE("stock-exchange"),

        CLONING("cloning"),

        SURGERY("surgery"),

        DNA_THERAPY("dna-therapy"),

        REPAIR_FACILITIES("repair-facilities"),

        FACTORY("factory"),

        LABRATORY("labratory"),

        GAMBLING("gambling"),

        FITTING("fitting"),

        PAINTSHOP("paintshop"),

        NEWS("news"),

        STORAGE("storage"),

        INSURANCE("insurance"),

        DOCKING("docking"),

        OFFICE_RENTAL("office-rental"),

        JUMP_CLONE_FACILITY("jump-clone-facility"),

        LOYALTY_POINT_STORE("loyalty-point-store"),

        NAVY_OFFICES("navy-offices"),

        SECURITY_OFFICES("security-offices");

        private String value;

        ServicesEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ServicesEnum fromValue(String value) {
            for (ServicesEnum b : ServicesEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<ServicesEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ServicesEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ServicesEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ServicesEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_SERVICES = "services";
    @SerializedName(SERIALIZED_NAME_SERVICES)
    private List<ServicesEnum> services = new ArrayList<>();

    public static final String SERIALIZED_NAME_STATION_ID = "station_id";
    @SerializedName(SERIALIZED_NAME_STATION_ID)
    private Integer stationId;

    public static final String SERIALIZED_NAME_SYSTEM_ID = "system_id";
    @SerializedName(SERIALIZED_NAME_SYSTEM_ID)
    private Integer systemId;

    public static final String SERIALIZED_NAME_TYPE_ID = "type_id";
    @SerializedName(SERIALIZED_NAME_TYPE_ID)
    private Integer typeId;

    public StationResponse maxDockableShipVolume(Float maxDockableShipVolume) {

        this.maxDockableShipVolume = maxDockableShipVolume;
        return this;
    }

    /**
     * max_dockable_ship_volume number
     * 
     * @return maxDockableShipVolume
     **/
    @ApiModelProperty(required = true, value = "max_dockable_ship_volume number")
    public Float getMaxDockableShipVolume() {
        return maxDockableShipVolume;
    }

    public void setMaxDockableShipVolume(Float maxDockableShipVolume) {
        this.maxDockableShipVolume = maxDockableShipVolume;
    }

    public StationResponse name(String name) {

        this.name = name;
        return this;
    }

    /**
     * name string
     * 
     * @return name
     **/
    @ApiModelProperty(required = true, value = "name string")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StationResponse officeRentalCost(Float officeRentalCost) {

        this.officeRentalCost = officeRentalCost;
        return this;
    }

    /**
     * office_rental_cost number
     * 
     * @return officeRentalCost
     **/
    @ApiModelProperty(required = true, value = "office_rental_cost number")
    public Float getOfficeRentalCost() {
        return officeRentalCost;
    }

    public void setOfficeRentalCost(Float officeRentalCost) {
        this.officeRentalCost = officeRentalCost;
    }

    public StationResponse owner(Integer owner) {

        this.owner = owner;
        return this;
    }

    /**
     * ID of the corporation that controls this station
     * 
     * @return owner
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "ID of the corporation that controls this station")
    public Integer getOwner() {
        return owner;
    }

    public void setOwner(Integer owner) {
        this.owner = owner;
    }

    public StationResponse position(Position position) {

        this.position = position;
        return this;
    }

    /**
     * Get position
     * 
     * @return position
     **/
    @ApiModelProperty(required = true, value = "")
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public StationResponse raceId(Integer raceId) {

        this.raceId = raceId;
        return this;
    }

    /**
     * race_id integer
     * 
     * @return raceId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "race_id integer")
    public Integer getRaceId() {
        return raceId;
    }

    public void setRaceId(Integer raceId) {
        this.raceId = raceId;
    }

    public StationResponse reprocessingEfficiency(Float reprocessingEfficiency) {

        this.reprocessingEfficiency = reprocessingEfficiency;
        return this;
    }

    /**
     * reprocessing_efficiency number
     * 
     * @return reprocessingEfficiency
     **/
    @ApiModelProperty(required = true, value = "reprocessing_efficiency number")
    public Float getReprocessingEfficiency() {
        return reprocessingEfficiency;
    }

    public void setReprocessingEfficiency(Float reprocessingEfficiency) {
        this.reprocessingEfficiency = reprocessingEfficiency;
    }

    public StationResponse reprocessingStationsTake(Float reprocessingStationsTake) {

        this.reprocessingStationsTake = reprocessingStationsTake;
        return this;
    }

    /**
     * reprocessing_stations_take number
     * 
     * @return reprocessingStationsTake
     **/
    @ApiModelProperty(required = true, value = "reprocessing_stations_take number")
    public Float getReprocessingStationsTake() {
        return reprocessingStationsTake;
    }

    public void setReprocessingStationsTake(Float reprocessingStationsTake) {
        this.reprocessingStationsTake = reprocessingStationsTake;
    }

    public StationResponse services(List<ServicesEnum> services) {

        this.services = services;
        return this;
    }

    public StationResponse addServicesItem(ServicesEnum servicesItem) {
        this.services.add(servicesItem);
        return this;
    }

    /**
     * services array
     * 
     * @return services
     **/
    @ApiModelProperty(required = true, value = "services array")
    public List<ServicesEnum> getServices() {
        return services;
    }

    public void setServices(List<ServicesEnum> services) {
        this.services = services;
    }

    public StationResponse stationId(Integer stationId) {

        this.stationId = stationId;
        return this;
    }

    /**
     * station_id integer
     * 
     * @return stationId
     **/
    @ApiModelProperty(required = true, value = "station_id integer")
    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public StationResponse systemId(Integer systemId) {

        this.systemId = systemId;
        return this;
    }

    /**
     * The solar system this station is in
     * 
     * @return systemId
     **/
    @ApiModelProperty(required = true, value = "The solar system this station is in")
    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    public StationResponse typeId(Integer typeId) {

        this.typeId = typeId;
        return this;
    }

    /**
     * type_id integer
     * 
     * @return typeId
     **/
    @ApiModelProperty(required = true, value = "type_id integer")
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
        StationResponse stationResponse = (StationResponse) o;
        return Objects.equals(this.maxDockableShipVolume, stationResponse.maxDockableShipVolume)
                && Objects.equals(this.name, stationResponse.name)
                && Objects.equals(this.officeRentalCost, stationResponse.officeRentalCost)
                && Objects.equals(this.owner, stationResponse.owner)
                && Objects.equals(this.position, stationResponse.position)
                && Objects.equals(this.raceId, stationResponse.raceId)
                && Objects.equals(this.reprocessingEfficiency, stationResponse.reprocessingEfficiency)
                && Objects.equals(this.reprocessingStationsTake, stationResponse.reprocessingStationsTake)
                && Objects.equals(this.services, stationResponse.services)
                && Objects.equals(this.stationId, stationResponse.stationId)
                && Objects.equals(this.systemId, stationResponse.systemId)
                && Objects.equals(this.typeId, stationResponse.typeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxDockableShipVolume, name, officeRentalCost, owner, position, raceId,
                reprocessingEfficiency, reprocessingStationsTake, services, stationId, systemId, typeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StationResponse {\n");
        sb.append("    maxDockableShipVolume: ").append(toIndentedString(maxDockableShipVolume)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    officeRentalCost: ").append(toIndentedString(officeRentalCost)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    raceId: ").append(toIndentedString(raceId)).append("\n");
        sb.append("    reprocessingEfficiency: ").append(toIndentedString(reprocessingEfficiency)).append("\n");
        sb.append("    reprocessingStationsTake: ").append(toIndentedString(reprocessingStationsTake)).append("\n");
        sb.append("    services: ").append(toIndentedString(services)).append("\n");
        sb.append("    stationId: ").append(toIndentedString(stationId)).append("\n");
        sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
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
