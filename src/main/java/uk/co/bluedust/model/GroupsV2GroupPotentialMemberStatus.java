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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets GroupsV2.GroupPotentialMemberStatus
 */
public enum GroupsV2GroupPotentialMemberStatus {
  
  NUMBER_0(0),
  
  NUMBER_1(1),
  
  NUMBER_2(2);

  private Integer value;

  GroupsV2GroupPotentialMemberStatus(Integer value) {
    this.value = value;
  }

  @JsonValue
  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static GroupsV2GroupPotentialMemberStatus fromValue(String text) {
    for (GroupsV2GroupPotentialMemberStatus b : GroupsV2GroupPotentialMemberStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
