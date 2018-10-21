/*
 * Bungie.Net API
 * These endpoints constitute the functionality exposed by Bungie.net, both for more traditional website functionality and for connectivity to Bungie video games and their related functionality.
 *
 * OpenAPI spec version: 2.3.2
 * Contact: support@bungie.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.co.bluedust.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import uk.co.bluedust.model.BungieMembershipType;

/**
 * DestinyRequestsActionsDestinyPostmasterTransferRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class DestinyRequestsActionsDestinyPostmasterTransferRequest {
  @JsonProperty("itemReferenceHash")
  private Integer itemReferenceHash = null;

  @JsonProperty("stackSize")
  private Integer stackSize = null;

  @JsonProperty("itemId")
  private Long itemId = null;

  @JsonProperty("characterId")
  private Long characterId = null;

  @JsonProperty("membershipType")
  private BungieMembershipType membershipType = null;

  public DestinyRequestsActionsDestinyPostmasterTransferRequest itemReferenceHash(Integer itemReferenceHash) {
    this.itemReferenceHash = itemReferenceHash;
    return this;
  }

   /**
   * Get itemReferenceHash
   * @return itemReferenceHash
  **/
  @ApiModelProperty(value = "")
  public Integer getItemReferenceHash() {
    return itemReferenceHash;
  }

  public void setItemReferenceHash(Integer itemReferenceHash) {
    this.itemReferenceHash = itemReferenceHash;
  }

  public DestinyRequestsActionsDestinyPostmasterTransferRequest stackSize(Integer stackSize) {
    this.stackSize = stackSize;
    return this;
  }

   /**
   * Get stackSize
   * @return stackSize
  **/
  @ApiModelProperty(value = "")
  public Integer getStackSize() {
    return stackSize;
  }

  public void setStackSize(Integer stackSize) {
    this.stackSize = stackSize;
  }

  public DestinyRequestsActionsDestinyPostmasterTransferRequest itemId(Long itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * Get itemId
   * @return itemId
  **/
  @ApiModelProperty(value = "")
  public Long getItemId() {
    return itemId;
  }

  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }

  public DestinyRequestsActionsDestinyPostmasterTransferRequest characterId(Long characterId) {
    this.characterId = characterId;
    return this;
  }

   /**
   * Get characterId
   * @return characterId
  **/
  @ApiModelProperty(value = "")
  public Long getCharacterId() {
    return characterId;
  }

  public void setCharacterId(Long characterId) {
    this.characterId = characterId;
  }

  public DestinyRequestsActionsDestinyPostmasterTransferRequest membershipType(BungieMembershipType membershipType) {
    this.membershipType = membershipType;
    return this;
  }

   /**
   * Get membershipType
   * @return membershipType
  **/
  @ApiModelProperty(value = "")
  public BungieMembershipType getMembershipType() {
    return membershipType;
  }

  public void setMembershipType(BungieMembershipType membershipType) {
    this.membershipType = membershipType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyRequestsActionsDestinyPostmasterTransferRequest destinyRequestsActionsDestinyPostmasterTransferRequest = (DestinyRequestsActionsDestinyPostmasterTransferRequest) o;
    return Objects.equals(this.itemReferenceHash, destinyRequestsActionsDestinyPostmasterTransferRequest.itemReferenceHash) &&
        Objects.equals(this.stackSize, destinyRequestsActionsDestinyPostmasterTransferRequest.stackSize) &&
        Objects.equals(this.itemId, destinyRequestsActionsDestinyPostmasterTransferRequest.itemId) &&
        Objects.equals(this.characterId, destinyRequestsActionsDestinyPostmasterTransferRequest.characterId) &&
        Objects.equals(this.membershipType, destinyRequestsActionsDestinyPostmasterTransferRequest.membershipType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemReferenceHash, stackSize, itemId, characterId, membershipType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyRequestsActionsDestinyPostmasterTransferRequest {\n");
    
    sb.append("    itemReferenceHash: ").append(toIndentedString(itemReferenceHash)).append("\n");
    sb.append("    stackSize: ").append(toIndentedString(stackSize)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
    sb.append("    membershipType: ").append(toIndentedString(membershipType)).append("\n");
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

