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
public class CorporationWalletJournalResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_AMOUNT = "amount";
    @SerializedName(SERIALIZED_NAME_AMOUNT)
    private Double amount;

    public static final String SERIALIZED_NAME_BALANCE = "balance";
    @SerializedName(SERIALIZED_NAME_BALANCE)
    private Double balance;

    public static final String SERIALIZED_NAME_CONTEXT_ID = "context_id";
    @SerializedName(SERIALIZED_NAME_CONTEXT_ID)
    private Long contextId;

    /**
     * The type of the given context_id if present
     */
    @JsonAdapter(ContextIdTypeEnum.Adapter.class)
    public enum ContextIdTypeEnum {
        STRUCTURE_ID("structure_id"),

        STATION_ID("station_id"),

        MARKET_TRANSACTION_ID("market_transaction_id"),

        CHARACTER_ID("character_id"),

        CORPORATION_ID("corporation_id"),

        ALLIANCE_ID("alliance_id"),

        EVE_SYSTEM("eve_system"),

        INDUSTRY_JOB_ID("industry_job_id"),

        CONTRACT_ID("contract_id"),

        PLANET_ID("planet_id"),

        SYSTEM_ID("system_id"),

        TYPE_ID("type_id");

        private String value;

        ContextIdTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ContextIdTypeEnum fromValue(String value) {
            for (ContextIdTypeEnum b : ContextIdTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<ContextIdTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ContextIdTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ContextIdTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ContextIdTypeEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_CONTEXT_ID_TYPE = "context_id_type";
    @SerializedName(SERIALIZED_NAME_CONTEXT_ID_TYPE)
    private ContextIdTypeEnum contextIdType;

    public static final String SERIALIZED_NAME_DATE = "date";
    @SerializedName(SERIALIZED_NAME_DATE)
    private OffsetDateTime date;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_FIRST_PARTY_ID = "first_party_id";
    @SerializedName(SERIALIZED_NAME_FIRST_PARTY_ID)
    private Integer firstPartyId;

    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private Long id;

    public static final String SERIALIZED_NAME_REASON = "reason";
    @SerializedName(SERIALIZED_NAME_REASON)
    private String reason;

    /**
     * \&quot;The transaction type for the given. transaction. Different
     * transaction types will populate different attributes. Note: If you have
     * an existing XML API application that is using ref_types, you will need to
     * know which string ESI ref_type maps to which integer. You can look at the
     * following file to see string-&gt;int mappings:
     * https://github.com/ccpgames
     * /eve-glue/blob/master/eve_glue/wallet_journal_ref.py\&quot;
     */
    @JsonAdapter(RefTypeEnum.Adapter.class)
    public enum RefTypeEnum {
        ACCELERATION_GATE_FEE("acceleration_gate_fee"),

        ADVERTISEMENT_LISTING_FEE("advertisement_listing_fee"),

        AGENT_DONATION("agent_donation"),

        AGENT_LOCATION_SERVICES("agent_location_services"),

        AGENT_MISCELLANEOUS("agent_miscellaneous"),

        AGENT_MISSION_COLLATERAL_PAID("agent_mission_collateral_paid"),

        AGENT_MISSION_COLLATERAL_REFUNDED("agent_mission_collateral_refunded"),

        AGENT_MISSION_REWARD("agent_mission_reward"),

        AGENT_MISSION_REWARD_CORPORATION_TAX("agent_mission_reward_corporation_tax"),

        AGENT_MISSION_TIME_BONUS_REWARD("agent_mission_time_bonus_reward"),

        AGENT_MISSION_TIME_BONUS_REWARD_CORPORATION_TAX("agent_mission_time_bonus_reward_corporation_tax"),

        AGENT_SECURITY_SERVICES("agent_security_services"),

        AGENT_SERVICES_RENDERED("agent_services_rendered"),

        AGENTS_PREWARD("agents_preward"),

        ALLIANCE_MAINTAINANCE_FEE("alliance_maintainance_fee"),

        ALLIANCE_REGISTRATION_FEE("alliance_registration_fee"),

        ASSET_SAFETY_RECOVERY_TAX("asset_safety_recovery_tax"),

        BOUNTY("bounty"),

        BOUNTY_PRIZE("bounty_prize"),

        BOUNTY_PRIZE_CORPORATION_TAX("bounty_prize_corporation_tax"),

        BOUNTY_PRIZES("bounty_prizes"),

        BOUNTY_REIMBURSEMENT("bounty_reimbursement"),

        BOUNTY_SURCHARGE("bounty_surcharge"),

        BROKERS_FEE("brokers_fee"),

        CLONE_ACTIVATION("clone_activation"),

        CLONE_TRANSFER("clone_transfer"),

        CONTRABAND_FINE("contraband_fine"),

        CONTRACT_AUCTION_BID("contract_auction_bid"),

        CONTRACT_AUCTION_BID_CORP("contract_auction_bid_corp"),

        CONTRACT_AUCTION_BID_REFUND("contract_auction_bid_refund"),

        CONTRACT_AUCTION_SOLD("contract_auction_sold"),

        CONTRACT_BROKERS_FEE("contract_brokers_fee"),

        CONTRACT_BROKERS_FEE_CORP("contract_brokers_fee_corp"),

        CONTRACT_COLLATERAL("contract_collateral"),

        CONTRACT_COLLATERAL_DEPOSITED_CORP("contract_collateral_deposited_corp"),

        CONTRACT_COLLATERAL_PAYOUT("contract_collateral_payout"),

        CONTRACT_COLLATERAL_REFUND("contract_collateral_refund"),

        CONTRACT_DEPOSIT("contract_deposit"),

        CONTRACT_DEPOSIT_CORP("contract_deposit_corp"),

        CONTRACT_DEPOSIT_REFUND("contract_deposit_refund"),

        CONTRACT_DEPOSIT_SALES_TAX("contract_deposit_sales_tax"),

        CONTRACT_PRICE("contract_price"),

        CONTRACT_PRICE_PAYMENT_CORP("contract_price_payment_corp"),

        CONTRACT_REVERSAL("contract_reversal"),

        CONTRACT_REWARD("contract_reward"),

        CONTRACT_REWARD_DEPOSITED("contract_reward_deposited"),

        CONTRACT_REWARD_DEPOSITED_CORP("contract_reward_deposited_corp"),

        CONTRACT_REWARD_REFUND("contract_reward_refund"),

        CONTRACT_SALES_TAX("contract_sales_tax"),

        COPYING("copying"),

        CORPORATE_REWARD_PAYOUT("corporate_reward_payout"),

        CORPORATE_REWARD_TAX("corporate_reward_tax"),

        CORPORATION_ACCOUNT_WITHDRAWAL("corporation_account_withdrawal"),

        CORPORATION_BULK_PAYMENT("corporation_bulk_payment"),

        CORPORATION_DIVIDEND_PAYMENT("corporation_dividend_payment"),

        CORPORATION_LIQUIDATION("corporation_liquidation"),

        CORPORATION_LOGO_CHANGE_COST("corporation_logo_change_cost"),

        CORPORATION_PAYMENT("corporation_payment"),

        CORPORATION_REGISTRATION_FEE("corporation_registration_fee"),

        COURIER_MISSION_ESCROW("courier_mission_escrow"),

        CSPA("cspa"),

        CSPAOFFLINEREFUND("cspaofflinerefund"),

        DATACORE_FEE("datacore_fee"),

        DNA_MODIFICATION_FEE("dna_modification_fee"),

        DOCKING_FEE("docking_fee"),

        DUEL_WAGER_ESCROW("duel_wager_escrow"),

        DUEL_WAGER_PAYMENT("duel_wager_payment"),

        DUEL_WAGER_REFUND("duel_wager_refund"),

        FACTORY_SLOT_RENTAL_FEE("factory_slot_rental_fee"),

        GM_CASH_TRANSFER("gm_cash_transfer"),

        INDUSTRY_JOB_TAX("industry_job_tax"),

        INFRASTRUCTURE_HUB_MAINTENANCE("infrastructure_hub_maintenance"),

        INHERITANCE("inheritance"),

        INSURANCE("insurance"),

        JUMP_CLONE_ACTIVATION_FEE("jump_clone_activation_fee"),

        JUMP_CLONE_INSTALLATION_FEE("jump_clone_installation_fee"),

        KILL_RIGHT_FEE("kill_right_fee"),

        LP_STORE("lp_store"),

        MANUFACTURING("manufacturing"),

        MARKET_ESCROW("market_escrow"),

        MARKET_FINE_PAID("market_fine_paid"),

        MARKET_TRANSACTION("market_transaction"),

        MEDAL_CREATION("medal_creation"),

        MEDAL_ISSUED("medal_issued"),

        MISSION_COMPLETION("mission_completion"),

        MISSION_COST("mission_cost"),

        MISSION_EXPIRATION("mission_expiration"),

        MISSION_REWARD("mission_reward"),

        OFFICE_RENTAL_FEE("office_rental_fee"),

        OPERATION_BONUS("operation_bonus"),

        OPPORTUNITY_REWARD("opportunity_reward"),

        PLANETARY_CONSTRUCTION("planetary_construction"),

        PLANETARY_EXPORT_TAX("planetary_export_tax"),

        PLANETARY_IMPORT_TAX("planetary_import_tax"),

        PLAYER_DONATION("player_donation"),

        PLAYER_TRADING("player_trading"),

        PROJECT_DISCOVERY_REWARD("project_discovery_reward"),

        PROJECT_DISCOVERY_TAX("project_discovery_tax"),

        REACTION("reaction"),

        RELEASE_OF_IMPOUNDED_PROPERTY("release_of_impounded_property"),

        REPAIR_BILL("repair_bill"),

        REPROCESSING_TAX("reprocessing_tax"),

        RESEARCHING_MATERIAL_PRODUCTIVITY("researching_material_productivity"),

        RESEARCHING_TECHNOLOGY("researching_technology"),

        RESEARCHING_TIME_PRODUCTIVITY("researching_time_productivity"),

        RESOURCE_WARS_REWARD("resource_wars_reward"),

        REVERSE_ENGINEERING("reverse_engineering"),

        SECURITY_PROCESSING_FEE("security_processing_fee"),

        SHARES("shares"),

        SOVEREIGNITY_BILL("sovereignity_bill"),

        STORE_PURCHASE("store_purchase"),

        STORE_PURCHASE_REFUND("store_purchase_refund"),

        STRUCTURE_GATE_JUMP("structure_gate_jump"),

        TRANSACTION_TAX("transaction_tax"),

        UPKEEP_ADJUSTMENT_FEE("upkeep_adjustment_fee"),

        WAR_ALLY_CONTRACT("war_ally_contract"),

        WAR_FEE("war_fee"),

        WAR_FEE_SURRENDER("war_fee_surrender");

        private String value;

        RefTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static RefTypeEnum fromValue(String value) {
            for (RefTypeEnum b : RefTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<RefTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final RefTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public RefTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return RefTypeEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_REF_TYPE = "ref_type";
    @SerializedName(SERIALIZED_NAME_REF_TYPE)
    private RefTypeEnum refType;

    public static final String SERIALIZED_NAME_SECOND_PARTY_ID = "second_party_id";
    @SerializedName(SERIALIZED_NAME_SECOND_PARTY_ID)
    private Integer secondPartyId;

    public static final String SERIALIZED_NAME_TAX = "tax";
    @SerializedName(SERIALIZED_NAME_TAX)
    private Double tax;

    public static final String SERIALIZED_NAME_TAX_RECEIVER_ID = "tax_receiver_id";
    @SerializedName(SERIALIZED_NAME_TAX_RECEIVER_ID)
    private Integer taxReceiverId;

    public CorporationWalletJournalResponse amount(Double amount) {

        this.amount = amount;
        return this;
    }

    /**
     * The amount of ISK given or taken from the wallet as a result of the given
     * transaction. Positive when ISK is deposited into the wallet and negative
     * when ISK is withdrawn
     * 
     * @return amount
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The amount of ISK given or taken from the wallet as a result of the given transaction. Positive when ISK is deposited into the wallet and negative when ISK is withdrawn")
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public CorporationWalletJournalResponse balance(Double balance) {

        this.balance = balance;
        return this;
    }

    /**
     * Wallet balance after transaction occurred
     * 
     * @return balance
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Wallet balance after transaction occurred")
    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public CorporationWalletJournalResponse contextId(Long contextId) {

        this.contextId = contextId;
        return this;
    }

    /**
     * An ID that gives extra context to the particular transaction. Because of
     * legacy reasons the context is completely different per ref_type and means
     * different things. It is also possible to not have a context_id
     * 
     * @return contextId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "An ID that gives extra context to the particular transaction. Because of legacy reasons the context is completely different per ref_type and means different things. It is also possible to not have a context_id")
    public Long getContextId() {
        return contextId;
    }

    public void setContextId(Long contextId) {
        this.contextId = contextId;
    }

    public CorporationWalletJournalResponse contextIdType(ContextIdTypeEnum contextIdType) {

        this.contextIdType = contextIdType;
        return this;
    }

    /**
     * The type of the given context_id if present
     * 
     * @return contextIdType
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The type of the given context_id if present")
    public ContextIdTypeEnum getContextIdType() {
        return contextIdType;
    }

    public void setContextIdType(ContextIdTypeEnum contextIdType) {
        this.contextIdType = contextIdType;
    }

    public CorporationWalletJournalResponse date(OffsetDateTime date) {

        this.date = date;
        return this;
    }

    /**
     * Date and time of transaction
     * 
     * @return date
     **/
    @ApiModelProperty(required = true, value = "Date and time of transaction")
    public OffsetDateTime getDate() {
        return date;
    }

    public void setDate(OffsetDateTime date) {
        this.date = date;
    }

    public CorporationWalletJournalResponse description(String description) {

        this.description = description;
        return this;
    }

    /**
     * The reason for the transaction, mirrors what is seen in the client
     * 
     * @return description
     **/
    @ApiModelProperty(required = true, value = "The reason for the transaction, mirrors what is seen in the client")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CorporationWalletJournalResponse firstPartyId(Integer firstPartyId) {

        this.firstPartyId = firstPartyId;
        return this;
    }

    /**
     * The id of the first party involved in the transaction. This attribute has
     * no consistency and is different or non existant for particular ref_types.
     * The description attribute will help make sense of what this attribute
     * means. For more info about the given ID it can be dropped into the
     * /universe/names/ ESI route to determine its type and name
     * 
     * @return firstPartyId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The id of the first party involved in the transaction. This attribute has no consistency and is different or non existant for particular ref_types. The description attribute will help make sense of what this attribute means. For more info about the given ID it can be dropped into the /universe/names/ ESI route to determine its type and name")
    public Integer getFirstPartyId() {
        return firstPartyId;
    }

    public void setFirstPartyId(Integer firstPartyId) {
        this.firstPartyId = firstPartyId;
    }

    public CorporationWalletJournalResponse id(Long id) {

        this.id = id;
        return this;
    }

    /**
     * Unique journal reference ID
     * 
     * @return id
     **/
    @ApiModelProperty(required = true, value = "Unique journal reference ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CorporationWalletJournalResponse reason(String reason) {

        this.reason = reason;
        return this;
    }

    /**
     * The user stated reason for the transaction. Only applies to some
     * ref_types
     * 
     * @return reason
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The user stated reason for the transaction. Only applies to some ref_types")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public CorporationWalletJournalResponse refType(RefTypeEnum refType) {

        this.refType = refType;
        return this;
    }

    /**
     * \&quot;The transaction type for the given. transaction. Different
     * transaction types will populate different attributes. Note: If you have
     * an existing XML API application that is using ref_types, you will need to
     * know which string ESI ref_type maps to which integer. You can look at the
     * following file to see string-&gt;int mappings:
     * https://github.com/ccpgames
     * /eve-glue/blob/master/eve_glue/wallet_journal_ref.py\&quot;
     * 
     * @return refType
     **/
    @ApiModelProperty(required = true, value = "\"The transaction type for the given. transaction. Different transaction types will populate different attributes. Note: If you have an existing XML API application that is using ref_types, you will need to know which string ESI ref_type maps to which integer. You can look at the following file to see string->int mappings: https://github.com/ccpgames/eve-glue/blob/master/eve_glue/wallet_journal_ref.py\"")
    public RefTypeEnum getRefType() {
        return refType;
    }

    public void setRefType(RefTypeEnum refType) {
        this.refType = refType;
    }

    public CorporationWalletJournalResponse secondPartyId(Integer secondPartyId) {

        this.secondPartyId = secondPartyId;
        return this;
    }

    /**
     * The id of the second party involved in the transaction. This attribute
     * has no consistency and is different or non existant for particular
     * ref_types. The description attribute will help make sense of what this
     * attribute means. For more info about the given ID it can be dropped into
     * the /universe/names/ ESI route to determine its type and name
     * 
     * @return secondPartyId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The id of the second party involved in the transaction. This attribute has no consistency and is different or non existant for particular ref_types. The description attribute will help make sense of what this attribute means. For more info about the given ID it can be dropped into the /universe/names/ ESI route to determine its type and name")
    public Integer getSecondPartyId() {
        return secondPartyId;
    }

    public void setSecondPartyId(Integer secondPartyId) {
        this.secondPartyId = secondPartyId;
    }

    public CorporationWalletJournalResponse tax(Double tax) {

        this.tax = tax;
        return this;
    }

    /**
     * Tax amount received. Only applies to tax related transactions
     * 
     * @return tax
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Tax amount received. Only applies to tax related transactions")
    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public CorporationWalletJournalResponse taxReceiverId(Integer taxReceiverId) {

        this.taxReceiverId = taxReceiverId;
        return this;
    }

    /**
     * The corporation ID receiving any tax paid. Only applies to tax related
     * transactions
     * 
     * @return taxReceiverId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The corporation ID receiving any tax paid. Only applies to tax related transactions")
    public Integer getTaxReceiverId() {
        return taxReceiverId;
    }

    public void setTaxReceiverId(Integer taxReceiverId) {
        this.taxReceiverId = taxReceiverId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationWalletJournalResponse corporationWalletJournalResponse = (CorporationWalletJournalResponse) o;
        return Objects.equals(this.amount, corporationWalletJournalResponse.amount)
                && Objects.equals(this.balance, corporationWalletJournalResponse.balance)
                && Objects.equals(this.contextId, corporationWalletJournalResponse.contextId)
                && Objects.equals(this.contextIdType, corporationWalletJournalResponse.contextIdType)
                && Objects.equals(this.date, corporationWalletJournalResponse.date)
                && Objects.equals(this.description, corporationWalletJournalResponse.description)
                && Objects.equals(this.firstPartyId, corporationWalletJournalResponse.firstPartyId)
                && Objects.equals(this.id, corporationWalletJournalResponse.id)
                && Objects.equals(this.reason, corporationWalletJournalResponse.reason)
                && Objects.equals(this.refType, corporationWalletJournalResponse.refType)
                && Objects.equals(this.secondPartyId, corporationWalletJournalResponse.secondPartyId)
                && Objects.equals(this.tax, corporationWalletJournalResponse.tax)
                && Objects.equals(this.taxReceiverId, corporationWalletJournalResponse.taxReceiverId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, balance, contextId, contextIdType, date, description, firstPartyId, id, reason,
                refType, secondPartyId, tax, taxReceiverId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationWalletJournalResponse {\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
        sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
        sb.append("    contextIdType: ").append(toIndentedString(contextIdType)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    firstPartyId: ").append(toIndentedString(firstPartyId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    refType: ").append(toIndentedString(refType)).append("\n");
        sb.append("    secondPartyId: ").append(toIndentedString(secondPartyId)).append("\n");
        sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
        sb.append("    taxReceiverId: ").append(toIndentedString(taxReceiverId)).append("\n");
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
