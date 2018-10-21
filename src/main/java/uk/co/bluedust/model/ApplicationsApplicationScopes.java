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
 * Gets or Sets Applications.ApplicationScopes
 */
public enum ApplicationsApplicationScopes {
  
  NUMBER_1(1l),
  
  NUMBER_2(2l),
  
  NUMBER_4(4l),
  
  NUMBER_8(8l),
  
  NUMBER_16(16l),
  
  NUMBER_32(32l),
  
  NUMBER_64(64l),
  
  NUMBER_128(128l),
  
  NUMBER_256(256l),
  
  NUMBER_512(512l),
  
  NUMBER_1024(1024l),
  
  NUMBER_2048(2048l);

  private Long value;

  ApplicationsApplicationScopes(Long value) {
    this.value = value;
  }

  @JsonValue
  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ApplicationsApplicationScopes fromValue(String text) {
    for (ApplicationsApplicationScopes b : ApplicationsApplicationScopes.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

