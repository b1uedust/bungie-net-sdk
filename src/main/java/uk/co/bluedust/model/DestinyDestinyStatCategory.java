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
import io.swagger.annotations.ApiModel;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * At last, stats have categories. Use this for whatever purpose you might wish.
 */
public enum DestinyDestinyStatCategory {
  
  NUMBER_0(0),
  
  NUMBER_1(1),
  
  NUMBER_2(2),
  
  NUMBER_3(3);

  private Integer value;

  DestinyDestinyStatCategory(Integer value) {
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
  public static DestinyDestinyStatCategory fromValue(String text) {
    for (DestinyDestinyStatCategory b : DestinyDestinyStatCategory.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

