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
 * Represents the possible components that can be returned from Destiny \&quot;Get\&quot; calls such as GetProfile, GetCharacter, GetVendor etc...  When making one of these requests, you will pass one or more of these components as a comma separated list in the \&quot;?components&#x3D;\&quot; querystring parameter. For instance, if you want baseline Profile data, Character Data, and character progressions, you would pass \&quot;?components&#x3D;Profiles,Characters,CharacterProgressions\&quot; You may use either the numerical or string values.
 */
public enum DestinyDestinyComponentType {
  
  NUMBER_0(0),
  
  NUMBER_100(100),
  
  NUMBER_101(101),
  
  NUMBER_102(102),
  
  NUMBER_103(103),
  
  NUMBER_104(104),
  
  NUMBER_200(200),
  
  NUMBER_201(201),
  
  NUMBER_202(202),
  
  NUMBER_203(203),
  
  NUMBER_204(204),
  
  NUMBER_205(205),
  
  NUMBER_300(300),
  
  NUMBER_301(301),
  
  NUMBER_302(302),
  
  NUMBER_303(303),
  
  NUMBER_304(304),
  
  NUMBER_305(305),
  
  NUMBER_306(306),
  
  NUMBER_307(307),
  
  NUMBER_308(308),
  
  NUMBER_400(400),
  
  NUMBER_401(401),
  
  NUMBER_402(402),
  
  NUMBER_500(500),
  
  NUMBER_600(600),
  
  NUMBER_700(700),
  
  NUMBER_800(800),
  
  NUMBER_900(900);

  private Integer value;

  DestinyDestinyComponentType(Integer value) {
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
  public static DestinyDestinyComponentType fromValue(String text) {
    for (DestinyDestinyComponentType b : DestinyDestinyComponentType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

