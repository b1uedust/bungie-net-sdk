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
 * This enumeration represents the most restrictive type of gating that is being performed by an entity. This is useful as a shortcut to avoid a lot of lookups when determining whether the gating on an Entity applies to everyone equally, or to their specific Profile or Character states.  None &#x3D; There is no gating on this item. Global &#x3D; The gating on this item is based entirely on global game state. It will be gated the same for everyone. Clan &#x3D; The gating on this item is at the Clan level. For instance, if you&#39;re gated by Clan level this will be the case. Profile &#x3D; The gating includes Profile-specific checks, but not on the Profile&#39;s characters. An example of this might be when you acquire an Emblem: the Emblem will be available in your Kiosk for all characters in your Profile from that point onward. Character &#x3D; The gating includes Character-specific checks, including character level restrictions. An example of this might be an item that you can&#39;t purchase from a Vendor until you reach a specific Character Level. Item &#x3D; The gating includes item-specific checks. For BNet, this generally implies that we&#39;ll show this data only on a character level or deeper. AssumedWorstCase &#x3D; The unlocks and checks being used for this calculation are of an unknown type and are used for unknown purposes. For instance, if some great person decided that an unlock value should be globally scoped, but then the game changes it using character-specific data in a way that BNet doesn&#39;t know about. Because of the open-ended potential for this to occur, many unlock checks for \&quot;globally\&quot; scoped unlock data may be assumed as the worst case unless it has been specifically whitelisted as otherwise. That sucks, but them&#39;s the breaks.
 */
public enum DestinyDestinyGatingScope {
  
  NUMBER_0(0),
  
  NUMBER_1(1),
  
  NUMBER_2(2),
  
  NUMBER_3(3),
  
  NUMBER_4(4),
  
  NUMBER_5(5),
  
  NUMBER_6(6);

  private Integer value;

  DestinyDestinyGatingScope(Integer value) {
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
  public static DestinyDestinyGatingScope fromValue(String text) {
    for (DestinyDestinyGatingScope b : DestinyDestinyGatingScope.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
