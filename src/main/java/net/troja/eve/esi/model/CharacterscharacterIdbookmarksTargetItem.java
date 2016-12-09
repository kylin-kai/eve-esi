/**
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.2.7.dev1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.troja.eve.esi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * item object
 */
@ApiModel(description = "item object")
public class CharacterscharacterIdbookmarksTargetItem implements Serializable {
    @JsonProperty("item_id")
    private Long itemId = null;

    @JsonProperty("type_id")
    private Integer typeId = null;

    public CharacterscharacterIdbookmarksTargetItem itemId(Long itemId) {
        this.itemId = itemId;
        return this;
    }

    /**
     * item_id integer
     * 
     * @return itemId
     **/
    @ApiModelProperty(example = "null", required = true, value = "item_id integer")
    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public CharacterscharacterIdbookmarksTargetItem typeId(Integer typeId) {
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
        CharacterscharacterIdbookmarksTargetItem characterscharacterIdbookmarksTargetItem = (CharacterscharacterIdbookmarksTargetItem) o;
        return Objects.equals(this.itemId, characterscharacterIdbookmarksTargetItem.itemId)
                && Objects.equals(this.typeId, characterscharacterIdbookmarksTargetItem.typeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, typeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterscharacterIdbookmarksTargetItem {\n");

        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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