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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import uk.co.bluedust.model.DestinyBaseItemComponentSetOfint64;

/**
 * The response for GetDestinyProfile, with components for character and item-level data.
 */
@ApiModel(description = "The response for GetDestinyProfile, with components for character and item-level data.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyResponsesDestinyProfileResponse {
  @JsonProperty("vendorReceipts")
  private Object vendorReceipts = null;

  @JsonProperty("profileInventory")
  private Object profileInventory = null;

  @JsonProperty("profileCurrencies")
  private Object profileCurrencies = null;

  @JsonProperty("profile")
  private Object profile = null;

  @JsonProperty("profileKiosks")
  private Object profileKiosks = null;

  @JsonProperty("profilePlugSets")
  private Object profilePlugSets = null;

  @JsonProperty("profileProgression")
  private Object profileProgression = null;

  @JsonProperty("profilePresentationNodes")
  private Object profilePresentationNodes = null;

  @JsonProperty("profileRecords")
  private Object profileRecords = null;

  @JsonProperty("profileCollectibles")
  private Object profileCollectibles = null;

  @JsonProperty("characters")
  private Object characters = null;

  @JsonProperty("characterInventories")
  private Object characterInventories = null;

  @JsonProperty("characterProgressions")
  private Object characterProgressions = null;

  @JsonProperty("characterRenderData")
  private Object characterRenderData = null;

  @JsonProperty("characterActivities")
  private Object characterActivities = null;

  @JsonProperty("characterEquipment")
  private Object characterEquipment = null;

  @JsonProperty("characterKiosks")
  private Object characterKiosks = null;

  @JsonProperty("characterPlugSets")
  private Object characterPlugSets = null;

  @JsonProperty("characterUninstancedItemComponents")
  private Map<String, DestinyBaseItemComponentSetOfint64> characterUninstancedItemComponents = null;

  @JsonProperty("characterPresentationNodes")
  private Object characterPresentationNodes = null;

  @JsonProperty("characterRecords")
  private Object characterRecords = null;

  @JsonProperty("characterCollectibles")
  private Object characterCollectibles = null;

  @JsonProperty("itemComponents")
  private Object itemComponents = null;

  @JsonProperty("characterCurrencyLookups")
  private Object characterCurrencyLookups = null;

  public DestinyResponsesDestinyProfileResponse vendorReceipts(Object vendorReceipts) {
    this.vendorReceipts = vendorReceipts;
    return this;
  }

   /**
   * Recent, refundable purchases you have made from vendors. When will you use it? Couldn&#39;t say...  COMPONENT TYPE: VendorReceipts
   * @return vendorReceipts
  **/
  @ApiModelProperty(value = "Recent, refundable purchases you have made from vendors. When will you use it? Couldn't say...  COMPONENT TYPE: VendorReceipts")
  public Object getVendorReceipts() {
    return vendorReceipts;
  }

  public void setVendorReceipts(Object vendorReceipts) {
    this.vendorReceipts = vendorReceipts;
  }

  public DestinyResponsesDestinyProfileResponse profileInventory(Object profileInventory) {
    this.profileInventory = profileInventory;
    return this;
  }

   /**
   * The profile-level inventory of the Destiny Profile.  COMPONENT TYPE: ProfileInventories
   * @return profileInventory
  **/
  @ApiModelProperty(value = "The profile-level inventory of the Destiny Profile.  COMPONENT TYPE: ProfileInventories")
  public Object getProfileInventory() {
    return profileInventory;
  }

  public void setProfileInventory(Object profileInventory) {
    this.profileInventory = profileInventory;
  }

  public DestinyResponsesDestinyProfileResponse profileCurrencies(Object profileCurrencies) {
    this.profileCurrencies = profileCurrencies;
    return this;
  }

   /**
   * The profile-level currencies owned by the Destiny Profile.  COMPONENT TYPE: ProfileCurrencies
   * @return profileCurrencies
  **/
  @ApiModelProperty(value = "The profile-level currencies owned by the Destiny Profile.  COMPONENT TYPE: ProfileCurrencies")
  public Object getProfileCurrencies() {
    return profileCurrencies;
  }

  public void setProfileCurrencies(Object profileCurrencies) {
    this.profileCurrencies = profileCurrencies;
  }

  public DestinyResponsesDestinyProfileResponse profile(Object profile) {
    this.profile = profile;
    return this;
  }

   /**
   * The basic information about the Destiny Profile (formerly \&quot;Account\&quot;).  COMPONENT TYPE: Profiles
   * @return profile
  **/
  @ApiModelProperty(value = "The basic information about the Destiny Profile (formerly \"Account\").  COMPONENT TYPE: Profiles")
  public Object getProfile() {
    return profile;
  }

  public void setProfile(Object profile) {
    this.profile = profile;
  }

  public DestinyResponsesDestinyProfileResponse profileKiosks(Object profileKiosks) {
    this.profileKiosks = profileKiosks;
    return this;
  }

   /**
   * Items available from Kiosks that are available Profile-wide (i.e. across all characters)  This component returns information about what Kiosk items are available to you on a *Profile* level. It is theoretically possible for Kiosks to have items gated by specific Character as well. If you ever have those, you will find them on the characterKiosks property.  COMPONENT TYPE: Kiosks
   * @return profileKiosks
  **/
  @ApiModelProperty(value = "Items available from Kiosks that are available Profile-wide (i.e. across all characters)  This component returns information about what Kiosk items are available to you on a *Profile* level. It is theoretically possible for Kiosks to have items gated by specific Character as well. If you ever have those, you will find them on the characterKiosks property.  COMPONENT TYPE: Kiosks")
  public Object getProfileKiosks() {
    return profileKiosks;
  }

  public void setProfileKiosks(Object profileKiosks) {
    this.profileKiosks = profileKiosks;
  }

  public DestinyResponsesDestinyProfileResponse profilePlugSets(Object profilePlugSets) {
    this.profilePlugSets = profilePlugSets;
    return this;
  }

   /**
   * When sockets refer to reusable Plug Sets (see DestinyPlugSetDefinition for more info), this is the set of plugs and their states that are profile-scoped.  This comes back with ItemSockets, as it is needed for a complete picture of the sockets on requested items.  COMPONENT TYPE: ItemSockets
   * @return profilePlugSets
  **/
  @ApiModelProperty(value = "When sockets refer to reusable Plug Sets (see DestinyPlugSetDefinition for more info), this is the set of plugs and their states that are profile-scoped.  This comes back with ItemSockets, as it is needed for a complete picture of the sockets on requested items.  COMPONENT TYPE: ItemSockets")
  public Object getProfilePlugSets() {
    return profilePlugSets;
  }

  public void setProfilePlugSets(Object profilePlugSets) {
    this.profilePlugSets = profilePlugSets;
  }

  public DestinyResponsesDestinyProfileResponse profileProgression(Object profileProgression) {
    this.profileProgression = profileProgression;
    return this;
  }

   /**
   * When we have progression information - such as Checklists - that may apply profile-wide, it will be returned here rather than in the per-character progression data.  COMPONENT TYPE: ProfileProgression
   * @return profileProgression
  **/
  @ApiModelProperty(value = "When we have progression information - such as Checklists - that may apply profile-wide, it will be returned here rather than in the per-character progression data.  COMPONENT TYPE: ProfileProgression")
  public Object getProfileProgression() {
    return profileProgression;
  }

  public void setProfileProgression(Object profileProgression) {
    this.profileProgression = profileProgression;
  }

  public DestinyResponsesDestinyProfileResponse profilePresentationNodes(Object profilePresentationNodes) {
    this.profilePresentationNodes = profilePresentationNodes;
    return this;
  }

   /**
   * COMPONENT TYPE: PresentationNodes
   * @return profilePresentationNodes
  **/
  @ApiModelProperty(value = "COMPONENT TYPE: PresentationNodes")
  public Object getProfilePresentationNodes() {
    return profilePresentationNodes;
  }

  public void setProfilePresentationNodes(Object profilePresentationNodes) {
    this.profilePresentationNodes = profilePresentationNodes;
  }

  public DestinyResponsesDestinyProfileResponse profileRecords(Object profileRecords) {
    this.profileRecords = profileRecords;
    return this;
  }

   /**
   * COMPONENT TYPE: Records
   * @return profileRecords
  **/
  @ApiModelProperty(value = "COMPONENT TYPE: Records")
  public Object getProfileRecords() {
    return profileRecords;
  }

  public void setProfileRecords(Object profileRecords) {
    this.profileRecords = profileRecords;
  }

  public DestinyResponsesDestinyProfileResponse profileCollectibles(Object profileCollectibles) {
    this.profileCollectibles = profileCollectibles;
    return this;
  }

   /**
   * COMPONENT TYPE: Collectibles
   * @return profileCollectibles
  **/
  @ApiModelProperty(value = "COMPONENT TYPE: Collectibles")
  public Object getProfileCollectibles() {
    return profileCollectibles;
  }

  public void setProfileCollectibles(Object profileCollectibles) {
    this.profileCollectibles = profileCollectibles;
  }

  public DestinyResponsesDestinyProfileResponse characters(Object characters) {
    this.characters = characters;
    return this;
  }

   /**
   * Basic information about each character, keyed by the CharacterId.  COMPONENT TYPE: Characters
   * @return characters
  **/
  @ApiModelProperty(value = "Basic information about each character, keyed by the CharacterId.  COMPONENT TYPE: Characters")
  public Object getCharacters() {
    return characters;
  }

  public void setCharacters(Object characters) {
    this.characters = characters;
  }

  public DestinyResponsesDestinyProfileResponse characterInventories(Object characterInventories) {
    this.characterInventories = characterInventories;
    return this;
  }

   /**
   * The character-level non-equipped inventory items, keyed by the Character&#39;s Id.  COMPONENT TYPE: CharacterInventories
   * @return characterInventories
  **/
  @ApiModelProperty(value = "The character-level non-equipped inventory items, keyed by the Character's Id.  COMPONENT TYPE: CharacterInventories")
  public Object getCharacterInventories() {
    return characterInventories;
  }

  public void setCharacterInventories(Object characterInventories) {
    this.characterInventories = characterInventories;
  }

  public DestinyResponsesDestinyProfileResponse characterProgressions(Object characterProgressions) {
    this.characterProgressions = characterProgressions;
    return this;
  }

   /**
   * Character-level progression data, keyed by the Character&#39;s Id.  COMPONENT TYPE: CharacterProgressions
   * @return characterProgressions
  **/
  @ApiModelProperty(value = "Character-level progression data, keyed by the Character's Id.  COMPONENT TYPE: CharacterProgressions")
  public Object getCharacterProgressions() {
    return characterProgressions;
  }

  public void setCharacterProgressions(Object characterProgressions) {
    this.characterProgressions = characterProgressions;
  }

  public DestinyResponsesDestinyProfileResponse characterRenderData(Object characterRenderData) {
    this.characterRenderData = characterRenderData;
    return this;
  }

   /**
   * Character rendering data - a minimal set of info needed to render a character in 3D - keyed by the Character&#39;s Id.  COMPONENT TYPE: CharacterRenderData
   * @return characterRenderData
  **/
  @ApiModelProperty(value = "Character rendering data - a minimal set of info needed to render a character in 3D - keyed by the Character's Id.  COMPONENT TYPE: CharacterRenderData")
  public Object getCharacterRenderData() {
    return characterRenderData;
  }

  public void setCharacterRenderData(Object characterRenderData) {
    this.characterRenderData = characterRenderData;
  }

  public DestinyResponsesDestinyProfileResponse characterActivities(Object characterActivities) {
    this.characterActivities = characterActivities;
    return this;
  }

   /**
   * Character activity data - the activities available to this character and its status, keyed by the Character&#39;s Id.  COMPONENT TYPE: CharacterActivities
   * @return characterActivities
  **/
  @ApiModelProperty(value = "Character activity data - the activities available to this character and its status, keyed by the Character's Id.  COMPONENT TYPE: CharacterActivities")
  public Object getCharacterActivities() {
    return characterActivities;
  }

  public void setCharacterActivities(Object characterActivities) {
    this.characterActivities = characterActivities;
  }

  public DestinyResponsesDestinyProfileResponse characterEquipment(Object characterEquipment) {
    this.characterEquipment = characterEquipment;
    return this;
  }

   /**
   * The character&#39;s equipped items, keyed by the Character&#39;s Id.  COMPONENT TYPE: CharacterEquipment
   * @return characterEquipment
  **/
  @ApiModelProperty(value = "The character's equipped items, keyed by the Character's Id.  COMPONENT TYPE: CharacterEquipment")
  public Object getCharacterEquipment() {
    return characterEquipment;
  }

  public void setCharacterEquipment(Object characterEquipment) {
    this.characterEquipment = characterEquipment;
  }

  public DestinyResponsesDestinyProfileResponse characterKiosks(Object characterKiosks) {
    this.characterKiosks = characterKiosks;
    return this;
  }

   /**
   * Items available from Kiosks that are available to a specific character as opposed to the account as a whole. It must be combined with data from the profileKiosks property to get a full picture of the character&#39;s available items to check out of a kiosk.  This component returns information about what Kiosk items are available to you on a *Character* level. Usually, kiosk items will be earned for the entire Profile (all characters) at once. To find those, look in the profileKiosks property.  COMPONENT TYPE: Kiosks
   * @return characterKiosks
  **/
  @ApiModelProperty(value = "Items available from Kiosks that are available to a specific character as opposed to the account as a whole. It must be combined with data from the profileKiosks property to get a full picture of the character's available items to check out of a kiosk.  This component returns information about what Kiosk items are available to you on a *Character* level. Usually, kiosk items will be earned for the entire Profile (all characters) at once. To find those, look in the profileKiosks property.  COMPONENT TYPE: Kiosks")
  public Object getCharacterKiosks() {
    return characterKiosks;
  }

  public void setCharacterKiosks(Object characterKiosks) {
    this.characterKiosks = characterKiosks;
  }

  public DestinyResponsesDestinyProfileResponse characterPlugSets(Object characterPlugSets) {
    this.characterPlugSets = characterPlugSets;
    return this;
  }

   /**
   * When sockets refer to reusable Plug Sets (see DestinyPlugSetDefinition for more info), this is the set of plugs and their states, per character, that are character-scoped.  This comes back with ItemSockets, as it is needed for a complete picture of the sockets on requested items.  COMPONENT TYPE: ItemSockets
   * @return characterPlugSets
  **/
  @ApiModelProperty(value = "When sockets refer to reusable Plug Sets (see DestinyPlugSetDefinition for more info), this is the set of plugs and their states, per character, that are character-scoped.  This comes back with ItemSockets, as it is needed for a complete picture of the sockets on requested items.  COMPONENT TYPE: ItemSockets")
  public Object getCharacterPlugSets() {
    return characterPlugSets;
  }

  public void setCharacterPlugSets(Object characterPlugSets) {
    this.characterPlugSets = characterPlugSets;
  }

  public DestinyResponsesDestinyProfileResponse characterUninstancedItemComponents(Map<String, DestinyBaseItemComponentSetOfint64> characterUninstancedItemComponents) {
    this.characterUninstancedItemComponents = characterUninstancedItemComponents;
    return this;
  }

  public DestinyResponsesDestinyProfileResponse putCharacterUninstancedItemComponentsItem(String key, DestinyBaseItemComponentSetOfint64 characterUninstancedItemComponentsItem) {
    if (this.characterUninstancedItemComponents == null) {
      this.characterUninstancedItemComponents = new HashMap<>();
    }
    this.characterUninstancedItemComponents.put(key, characterUninstancedItemComponentsItem);
    return this;
  }

   /**
   * Do you ever get the feeling that a system was designed *too* flexibly? That it can be used in so many different ways that you end up being unable to provide an easy to use abstraction for the mess that&#39;s happening under the surface?  Let&#39;s talk about character-specific data that might be related to items without instances. These two statements are totally unrelated, I promise.  At some point during D2, it was decided that items - such as Bounties - could be given to characters and *not* have instance data, but that *could* display and even use relevant state information on your account and character.  Up to now, any item that had meaningful dependencies on character or account state had to be instanced, and thus \&quot;itemComponents\&quot; was all that you needed: it was keyed by item&#39;s instance IDs and provided the stateful information you needed inside.  Unfortunately, we don&#39;t live in such a magical world anymore. This is information held on a per-character basis about non-instanced items that the characters have in their inventory - or that reference character-specific state information even if it&#39;s in Account-level inventory - and the values related to that item&#39;s state in relation to the given character.  To give a concrete example, look at a Moments of Triumph bounty. They exist in a character&#39;s inventory, and show/care about a character&#39;s progression toward completing the bounty. But the bounty itself is a non-instanced item, like a mod or a currency. This returns that data for the characters who have the bounty in their inventory.  I&#39;m not crying, you&#39;re crying Okay we&#39;re both crying but it&#39;s going to be okay I promise Actually I shouldn&#39;t promise that, I don&#39;t know if it&#39;s going to be okay
   * @return characterUninstancedItemComponents
  **/
  @ApiModelProperty(value = "Do you ever get the feeling that a system was designed *too* flexibly? That it can be used in so many different ways that you end up being unable to provide an easy to use abstraction for the mess that's happening under the surface?  Let's talk about character-specific data that might be related to items without instances. These two statements are totally unrelated, I promise.  At some point during D2, it was decided that items - such as Bounties - could be given to characters and *not* have instance data, but that *could* display and even use relevant state information on your account and character.  Up to now, any item that had meaningful dependencies on character or account state had to be instanced, and thus \"itemComponents\" was all that you needed: it was keyed by item's instance IDs and provided the stateful information you needed inside.  Unfortunately, we don't live in such a magical world anymore. This is information held on a per-character basis about non-instanced items that the characters have in their inventory - or that reference character-specific state information even if it's in Account-level inventory - and the values related to that item's state in relation to the given character.  To give a concrete example, look at a Moments of Triumph bounty. They exist in a character's inventory, and show/care about a character's progression toward completing the bounty. But the bounty itself is a non-instanced item, like a mod or a currency. This returns that data for the characters who have the bounty in their inventory.  I'm not crying, you're crying Okay we're both crying but it's going to be okay I promise Actually I shouldn't promise that, I don't know if it's going to be okay")
  public Map<String, DestinyBaseItemComponentSetOfint64> getCharacterUninstancedItemComponents() {
    return characterUninstancedItemComponents;
  }

  public void setCharacterUninstancedItemComponents(Map<String, DestinyBaseItemComponentSetOfint64> characterUninstancedItemComponents) {
    this.characterUninstancedItemComponents = characterUninstancedItemComponents;
  }

  public DestinyResponsesDestinyProfileResponse characterPresentationNodes(Object characterPresentationNodes) {
    this.characterPresentationNodes = characterPresentationNodes;
    return this;
  }

   /**
   * COMPONENT TYPE: PresentationNodes
   * @return characterPresentationNodes
  **/
  @ApiModelProperty(value = "COMPONENT TYPE: PresentationNodes")
  public Object getCharacterPresentationNodes() {
    return characterPresentationNodes;
  }

  public void setCharacterPresentationNodes(Object characterPresentationNodes) {
    this.characterPresentationNodes = characterPresentationNodes;
  }

  public DestinyResponsesDestinyProfileResponse characterRecords(Object characterRecords) {
    this.characterRecords = characterRecords;
    return this;
  }

   /**
   * COMPONENT TYPE: Records
   * @return characterRecords
  **/
  @ApiModelProperty(value = "COMPONENT TYPE: Records")
  public Object getCharacterRecords() {
    return characterRecords;
  }

  public void setCharacterRecords(Object characterRecords) {
    this.characterRecords = characterRecords;
  }

  public DestinyResponsesDestinyProfileResponse characterCollectibles(Object characterCollectibles) {
    this.characterCollectibles = characterCollectibles;
    return this;
  }

   /**
   * COMPONENT TYPE: Collectibles
   * @return characterCollectibles
  **/
  @ApiModelProperty(value = "COMPONENT TYPE: Collectibles")
  public Object getCharacterCollectibles() {
    return characterCollectibles;
  }

  public void setCharacterCollectibles(Object characterCollectibles) {
    this.characterCollectibles = characterCollectibles;
  }

  public DestinyResponsesDestinyProfileResponse itemComponents(Object itemComponents) {
    this.itemComponents = itemComponents;
    return this;
  }

   /**
   * Information about instanced items across all returned characters, keyed by the item&#39;s instance ID.  COMPONENT TYPE: [See inside the DestinyItemComponentSet contract for component types.]
   * @return itemComponents
  **/
  @ApiModelProperty(value = "Information about instanced items across all returned characters, keyed by the item's instance ID.  COMPONENT TYPE: [See inside the DestinyItemComponentSet contract for component types.]")
  public Object getItemComponents() {
    return itemComponents;
  }

  public void setItemComponents(Object itemComponents) {
    this.itemComponents = itemComponents;
  }

  public DestinyResponsesDestinyProfileResponse characterCurrencyLookups(Object characterCurrencyLookups) {
    this.characterCurrencyLookups = characterCurrencyLookups;
    return this;
  }

   /**
   * A \&quot;lookup\&quot; convenience component that can be used to quickly check if the character has access to items that can be used for purchasing.  COMPONENT TYPE: CurrencyLookups
   * @return characterCurrencyLookups
  **/
  @ApiModelProperty(value = "A \"lookup\" convenience component that can be used to quickly check if the character has access to items that can be used for purchasing.  COMPONENT TYPE: CurrencyLookups")
  public Object getCharacterCurrencyLookups() {
    return characterCurrencyLookups;
  }

  public void setCharacterCurrencyLookups(Object characterCurrencyLookups) {
    this.characterCurrencyLookups = characterCurrencyLookups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyResponsesDestinyProfileResponse destinyResponsesDestinyProfileResponse = (DestinyResponsesDestinyProfileResponse) o;
    return Objects.equals(this.vendorReceipts, destinyResponsesDestinyProfileResponse.vendorReceipts) &&
        Objects.equals(this.profileInventory, destinyResponsesDestinyProfileResponse.profileInventory) &&
        Objects.equals(this.profileCurrencies, destinyResponsesDestinyProfileResponse.profileCurrencies) &&
        Objects.equals(this.profile, destinyResponsesDestinyProfileResponse.profile) &&
        Objects.equals(this.profileKiosks, destinyResponsesDestinyProfileResponse.profileKiosks) &&
        Objects.equals(this.profilePlugSets, destinyResponsesDestinyProfileResponse.profilePlugSets) &&
        Objects.equals(this.profileProgression, destinyResponsesDestinyProfileResponse.profileProgression) &&
        Objects.equals(this.profilePresentationNodes, destinyResponsesDestinyProfileResponse.profilePresentationNodes) &&
        Objects.equals(this.profileRecords, destinyResponsesDestinyProfileResponse.profileRecords) &&
        Objects.equals(this.profileCollectibles, destinyResponsesDestinyProfileResponse.profileCollectibles) &&
        Objects.equals(this.characters, destinyResponsesDestinyProfileResponse.characters) &&
        Objects.equals(this.characterInventories, destinyResponsesDestinyProfileResponse.characterInventories) &&
        Objects.equals(this.characterProgressions, destinyResponsesDestinyProfileResponse.characterProgressions) &&
        Objects.equals(this.characterRenderData, destinyResponsesDestinyProfileResponse.characterRenderData) &&
        Objects.equals(this.characterActivities, destinyResponsesDestinyProfileResponse.characterActivities) &&
        Objects.equals(this.characterEquipment, destinyResponsesDestinyProfileResponse.characterEquipment) &&
        Objects.equals(this.characterKiosks, destinyResponsesDestinyProfileResponse.characterKiosks) &&
        Objects.equals(this.characterPlugSets, destinyResponsesDestinyProfileResponse.characterPlugSets) &&
        Objects.equals(this.characterUninstancedItemComponents, destinyResponsesDestinyProfileResponse.characterUninstancedItemComponents) &&
        Objects.equals(this.characterPresentationNodes, destinyResponsesDestinyProfileResponse.characterPresentationNodes) &&
        Objects.equals(this.characterRecords, destinyResponsesDestinyProfileResponse.characterRecords) &&
        Objects.equals(this.characterCollectibles, destinyResponsesDestinyProfileResponse.characterCollectibles) &&
        Objects.equals(this.itemComponents, destinyResponsesDestinyProfileResponse.itemComponents) &&
        Objects.equals(this.characterCurrencyLookups, destinyResponsesDestinyProfileResponse.characterCurrencyLookups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorReceipts, profileInventory, profileCurrencies, profile, profileKiosks, profilePlugSets, profileProgression, profilePresentationNodes, profileRecords, profileCollectibles, characters, characterInventories, characterProgressions, characterRenderData, characterActivities, characterEquipment, characterKiosks, characterPlugSets, characterUninstancedItemComponents, characterPresentationNodes, characterRecords, characterCollectibles, itemComponents, characterCurrencyLookups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyResponsesDestinyProfileResponse {\n");
    
    sb.append("    vendorReceipts: ").append(toIndentedString(vendorReceipts)).append("\n");
    sb.append("    profileInventory: ").append(toIndentedString(profileInventory)).append("\n");
    sb.append("    profileCurrencies: ").append(toIndentedString(profileCurrencies)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    profileKiosks: ").append(toIndentedString(profileKiosks)).append("\n");
    sb.append("    profilePlugSets: ").append(toIndentedString(profilePlugSets)).append("\n");
    sb.append("    profileProgression: ").append(toIndentedString(profileProgression)).append("\n");
    sb.append("    profilePresentationNodes: ").append(toIndentedString(profilePresentationNodes)).append("\n");
    sb.append("    profileRecords: ").append(toIndentedString(profileRecords)).append("\n");
    sb.append("    profileCollectibles: ").append(toIndentedString(profileCollectibles)).append("\n");
    sb.append("    characters: ").append(toIndentedString(characters)).append("\n");
    sb.append("    characterInventories: ").append(toIndentedString(characterInventories)).append("\n");
    sb.append("    characterProgressions: ").append(toIndentedString(characterProgressions)).append("\n");
    sb.append("    characterRenderData: ").append(toIndentedString(characterRenderData)).append("\n");
    sb.append("    characterActivities: ").append(toIndentedString(characterActivities)).append("\n");
    sb.append("    characterEquipment: ").append(toIndentedString(characterEquipment)).append("\n");
    sb.append("    characterKiosks: ").append(toIndentedString(characterKiosks)).append("\n");
    sb.append("    characterPlugSets: ").append(toIndentedString(characterPlugSets)).append("\n");
    sb.append("    characterUninstancedItemComponents: ").append(toIndentedString(characterUninstancedItemComponents)).append("\n");
    sb.append("    characterPresentationNodes: ").append(toIndentedString(characterPresentationNodes)).append("\n");
    sb.append("    characterRecords: ").append(toIndentedString(characterRecords)).append("\n");
    sb.append("    characterCollectibles: ").append(toIndentedString(characterCollectibles)).append("\n");
    sb.append("    itemComponents: ").append(toIndentedString(itemComponents)).append("\n");
    sb.append("    characterCurrencyLookups: ").append(toIndentedString(characterCurrencyLookups)).append("\n");
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

