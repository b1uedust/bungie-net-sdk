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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import uk.co.bluedust.model.DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition;
import uk.co.bluedust.model.DestinyDefinitionsMilestonesDestinyMilestoneChallengeActivityDefinition;
import uk.co.bluedust.model.DestinyDefinitionsMilestonesDestinyMilestoneQuestDefinition;
import uk.co.bluedust.model.DestinyDefinitionsMilestonesDestinyMilestoneRewardCategoryDefinition;
import uk.co.bluedust.model.DestinyDefinitionsMilestonesDestinyMilestoneValueDefinition;
import uk.co.bluedust.model.DestinyDefinitionsMilestonesDestinyMilestoneVendorDefinition;

/**
 * Milestones are an in-game concept where they&#39;re attempting to tell you what you can do next in-game.  If that sounds a lot like Advisors in Destiny 1, it is! So we threw out Advisors in the Destiny 2 API and tacked all of the data we would have put on Advisors onto Milestones instead.  Each Milestone represents something going on in the game right now:  - A \&quot;ritual activity\&quot; you can perform, like nightfall  - A \&quot;special event\&quot; that may have activities related to it, like Taco Tuesday (there&#39;s no Taco Tuesday in Destiny 2)  - A checklist you can fulfill, like helping your Clan complete all of its weekly objectives  - A tutorial quest you can play through, like the introduction to the Crucible.  Most of these milestones appear in game as well. Some of them are BNet only, because we&#39;re so extra. You&#39;re welcome.  There are some important caveats to understand about how we currently render Milestones and their deficiencies. The game currently doesn&#39;t have any content that actually tells you oughtright *what* the Milestone is: that is to say, what you&#39;ll be doing. The best we get is either a description of the overall Milestone, or of the Quest that the Milestone is having you partake in: which is usually something that assumes you already know what it&#39;s talking about, like \&quot;Complete 5 Challenges\&quot;. 5 Challenges for what? What&#39;s a challenge? These are not questions that the Milestone data will answer for you unfortunately.  This isn&#39;t great, and in the future I&#39;d like to add some custom text to give you more contextual information to pass on to your users. But for now, you can do what we do to render what little display info we do have:  Start by looking at the currently active quest (ideally, you&#39;ve fetched DestinyMilestone or DestinyPublicMilestone data from the API, so you know the currently active quest for the Milestone in question). Look up the Quests property in the Milestone Definition, and check if it has display properties. If it does, show that as the description of the Milestone. If it doesn&#39;t, fall back on the Milestone&#39;s description.  This approach will let you avoid, whenever possible, the even less useful (and sometimes nonexistant) milestone-level names and descriptions.
 */
@ApiModel(description = "Milestones are an in-game concept where they're attempting to tell you what you can do next in-game.  If that sounds a lot like Advisors in Destiny 1, it is! So we threw out Advisors in the Destiny 2 API and tacked all of the data we would have put on Advisors onto Milestones instead.  Each Milestone represents something going on in the game right now:  - A \"ritual activity\" you can perform, like nightfall  - A \"special event\" that may have activities related to it, like Taco Tuesday (there's no Taco Tuesday in Destiny 2)  - A checklist you can fulfill, like helping your Clan complete all of its weekly objectives  - A tutorial quest you can play through, like the introduction to the Crucible.  Most of these milestones appear in game as well. Some of them are BNet only, because we're so extra. You're welcome.  There are some important caveats to understand about how we currently render Milestones and their deficiencies. The game currently doesn't have any content that actually tells you oughtright *what* the Milestone is: that is to say, what you'll be doing. The best we get is either a description of the overall Milestone, or of the Quest that the Milestone is having you partake in: which is usually something that assumes you already know what it's talking about, like \"Complete 5 Challenges\". 5 Challenges for what? What's a challenge? These are not questions that the Milestone data will answer for you unfortunately.  This isn't great, and in the future I'd like to add some custom text to give you more contextual information to pass on to your users. But for now, you can do what we do to render what little display info we do have:  Start by looking at the currently active quest (ideally, you've fetched DestinyMilestone or DestinyPublicMilestone data from the API, so you know the currently active quest for the Milestone in question). Look up the Quests property in the Milestone Definition, and check if it has display properties. If it does, show that as the description of the Milestone. If it doesn't, fall back on the Milestone's description.  This approach will let you avoid, whenever possible, the even less useful (and sometimes nonexistant) milestone-level names and descriptions.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:59:02.979Z")
public class DestinyDefinitionsMilestonesDestinyMilestoneDefinition {
  @JsonProperty("displayProperties")
  private DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition displayProperties = null;

  @JsonProperty("image")
  private String image = null;

  @JsonProperty("milestoneType")
  private Object milestoneType = null;

  @JsonProperty("recruitable")
  private Boolean recruitable = null;

  @JsonProperty("friendlyName")
  private String friendlyName = null;

  @JsonProperty("showInExplorer")
  private Boolean showInExplorer = null;

  @JsonProperty("showInMilestones")
  private Boolean showInMilestones = null;

  @JsonProperty("explorePrioritizesActivityImage")
  private Boolean explorePrioritizesActivityImage = null;

  @JsonProperty("hasPredictableDates")
  private Boolean hasPredictableDates = null;

  @JsonProperty("quests")
  private Map<String, DestinyDefinitionsMilestonesDestinyMilestoneQuestDefinition> quests = null;

  @JsonProperty("rewards")
  private Map<String, DestinyDefinitionsMilestonesDestinyMilestoneRewardCategoryDefinition> rewards = null;

  @JsonProperty("vendorsDisplayTitle")
  private String vendorsDisplayTitle = null;

  @JsonProperty("vendors")
  private List<DestinyDefinitionsMilestonesDestinyMilestoneVendorDefinition> vendors = null;

  @JsonProperty("values")
  private Map<String, DestinyDefinitionsMilestonesDestinyMilestoneValueDefinition> values = null;

  @JsonProperty("isInGameMilestone")
  private Boolean isInGameMilestone = null;

  @JsonProperty("activities")
  private List<DestinyDefinitionsMilestonesDestinyMilestoneChallengeActivityDefinition> activities = null;

  @JsonProperty("defaultOrder")
  private Integer defaultOrder = null;

  @JsonProperty("hash")
  private Integer hash = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("redacted")
  private Boolean redacted = null;

  public DestinyDefinitionsMilestonesDestinyMilestoneDefinition displayProperties(DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition displayProperties) {
    this.displayProperties = displayProperties;
    return this;
  }

   /**
   * Get displayProperties
   * @return displayProperties
  **/
  @ApiModelProperty(value = "")
  public DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition getDisplayProperties() {
    return displayProperties;
  }

  public void setDisplayProperties(DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition displayProperties) {
    this.displayProperties = displayProperties;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneDefinition image(String image) {
    this.image = image;
    return this;
  }

   /**
   * A custom image someone made just for the milestone. Isn&#39;t that special?
   * @return image
  **/
  @ApiModelProperty(value = "A custom image someone made just for the milestone. Isn't that special?")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneDefinition milestoneType(Object milestoneType) {
    this.milestoneType = milestoneType;
    return this;
  }

   /**
   * An enumeration listing one of the possible types of milestones. Check out the DestinyMilestoneType enum for more info!
   * @return milestoneType
  **/
  @ApiModelProperty(value = "An enumeration listing one of the possible types of milestones. Check out the DestinyMilestoneType enum for more info!")
  public Object getMilestoneType() {
    return milestoneType;
  }

  public void setMilestoneType(Object milestoneType) {
    this.milestoneType = milestoneType;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneDefinition recruitable(Boolean recruitable) {
    this.recruitable = recruitable;
    return this;
  }

   /**
   * If True, then the Milestone has been integrated with BNet&#39;s recruiting feature.
   * @return recruitable
  **/
  @ApiModelProperty(value = "If True, then the Milestone has been integrated with BNet's recruiting feature.")
  public Boolean isRecruitable() {
    return recruitable;
  }

  public void setRecruitable(Boolean recruitable) {
    this.recruitable = recruitable;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneDefinition friendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
    return this;
  }

   /**
   * If the milestone has a friendly identifier for association with other features - such as Recruiting - that identifier can be found here. This is \&quot;friendly\&quot; in that it looks better in a URL than whatever the identifier for the Milestone actually is.
   * @return friendlyName
  **/
  @ApiModelProperty(value = "If the milestone has a friendly identifier for association with other features - such as Recruiting - that identifier can be found here. This is \"friendly\" in that it looks better in a URL than whatever the identifier for the Milestone actually is.")
  public String getFriendlyName() {
    return friendlyName;
  }

  public void setFriendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneDefinition showInExplorer(Boolean showInExplorer) {
    this.showInExplorer = showInExplorer;
    return this;
  }

   /**
   * If TRUE, this entry should be returned in the list of milestones for the \&quot;Explore Destiny\&quot; (i.e. new BNet homepage) features of Bungie.net (as long as the underlying event is active) Note that this is a property specifically used by BNet and the companion app for the \&quot;Live Events\&quot; feature of the front page/welcome view: it&#39;s not a reflection of what you see in-game.
   * @return showInExplorer
  **/
  @ApiModelProperty(value = "If TRUE, this entry should be returned in the list of milestones for the \"Explore Destiny\" (i.e. new BNet homepage) features of Bungie.net (as long as the underlying event is active) Note that this is a property specifically used by BNet and the companion app for the \"Live Events\" feature of the front page/welcome view: it's not a reflection of what you see in-game.")
  public Boolean isShowInExplorer() {
    return showInExplorer;
  }

  public void setShowInExplorer(Boolean showInExplorer) {
    this.showInExplorer = showInExplorer;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneDefinition showInMilestones(Boolean showInMilestones) {
    this.showInMilestones = showInMilestones;
    return this;
  }

   /**
   * Determines whether we&#39;ll show this Milestone in the user&#39;s personal Milestones list.
   * @return showInMilestones
  **/
  @ApiModelProperty(value = "Determines whether we'll show this Milestone in the user's personal Milestones list.")
  public Boolean isShowInMilestones() {
    return showInMilestones;
  }

  public void setShowInMilestones(Boolean showInMilestones) {
    this.showInMilestones = showInMilestones;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneDefinition explorePrioritizesActivityImage(Boolean explorePrioritizesActivityImage) {
    this.explorePrioritizesActivityImage = explorePrioritizesActivityImage;
    return this;
  }

   /**
   * If TRUE, \&quot;Explore Destiny\&quot; (the front page of BNet and the companion app) prioritize using the activity image over any overriding Quest or Milestone image provided. This unfortunate hack is brought to you by Trials of The Nine.
   * @return explorePrioritizesActivityImage
  **/
  @ApiModelProperty(value = "If TRUE, \"Explore Destiny\" (the front page of BNet and the companion app) prioritize using the activity image over any overriding Quest or Milestone image provided. This unfortunate hack is brought to you by Trials of The Nine.")
  public Boolean isExplorePrioritizesActivityImage() {
    return explorePrioritizesActivityImage;
  }

  public void setExplorePrioritizesActivityImage(Boolean explorePrioritizesActivityImage) {
    this.explorePrioritizesActivityImage = explorePrioritizesActivityImage;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneDefinition hasPredictableDates(Boolean hasPredictableDates) {
    this.hasPredictableDates = hasPredictableDates;
    return this;
  }

   /**
   * A shortcut for clients - and the server - to understand whether we can predict the start and end dates for this event. In practice, there are multiple ways that an event could have predictable date ranges, but not all events will be able to be predicted via any mechanism (for instance, events that are manually triggered on and off)
   * @return hasPredictableDates
  **/
  @ApiModelProperty(value = "A shortcut for clients - and the server - to understand whether we can predict the start and end dates for this event. In practice, there are multiple ways that an event could have predictable date ranges, but not all events will be able to be predicted via any mechanism (for instance, events that are manually triggered on and off)")
  public Boolean isHasPredictableDates() {
    return hasPredictableDates;
  }

  public void setHasPredictableDates(Boolean hasPredictableDates) {
    this.hasPredictableDates = hasPredictableDates;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneDefinition quests(Map<String, DestinyDefinitionsMilestonesDestinyMilestoneQuestDefinition> quests) {
    this.quests = quests;
    return this;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneDefinition putQuestsItem(String key, DestinyDefinitionsMilestonesDestinyMilestoneQuestDefinition questsItem) {
    if (this.quests == null) {
      this.quests = new HashMap<>();
    }
    this.quests.put(key, questsItem);
    return this;
  }

   /**
   * The full set of possible Quests that give the overview of the Milestone event/activity in question. Only one of these can be active at a time for a given Conceptual Milestone, but many of them may be \&quot;available\&quot; for the user to choose from. (for instance, with Milestones you can choose from the three available Quests, but only one can be active at a time) Keyed by the quest item.  As of Forsaken (~September 2018), Quest-style Milestones are being removed for many types of activities. There will likely be further revisions to the Milestone concept in the future.
   * @return quests
  **/
  @ApiModelProperty(value = "The full set of possible Quests that give the overview of the Milestone event/activity in question. Only one of these can be active at a time for a given Conceptual Milestone, but many of them may be \"available\" for the user to choose from. (for instance, with Milestones you can choose from the three available Quests, but only one can be active at a time) Keyed by the quest item.  As of Forsaken (~September 2018), Quest-style Milestones are being removed for many types of activities. There will likely be further revisions to the Milestone concept in the future.")
  public Map<String, DestinyDefinitionsMilestonesDestinyMilestoneQuestDefinition> getQuests() {
    return quests;
  }

  public void setQuests(Map<String, DestinyDefinitionsMilestonesDestinyMilestoneQuestDefinition> quests) {
    this.quests = quests;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneDefinition rewards(Map<String, DestinyDefinitionsMilestonesDestinyMilestoneRewardCategoryDefinition> rewards) {
    this.rewards = rewards;
    return this;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneDefinition putRewardsItem(String key, DestinyDefinitionsMilestonesDestinyMilestoneRewardCategoryDefinition rewardsItem) {
    if (this.rewards == null) {
      this.rewards = new HashMap<>();
    }
    this.rewards.put(key, rewardsItem);
    return this;
  }

   /**
   * If this milestone can provide rewards, this will define the categories into which the individual reward entries are placed.  This is keyed by the Category&#39;s hash, which is only guaranteed to be unique within a given Milestone.
   * @return rewards
  **/
  @ApiModelProperty(value = "If this milestone can provide rewards, this will define the categories into which the individual reward entries are placed.  This is keyed by the Category's hash, which is only guaranteed to be unique within a given Milestone.")
  public Map<String, DestinyDefinitionsMilestonesDestinyMilestoneRewardCategoryDefinition> getRewards() {
    return rewards;
  }

  public void setRewards(Map<String, DestinyDefinitionsMilestonesDestinyMilestoneRewardCategoryDefinition> rewards) {
    this.rewards = rewards;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneDefinition vendorsDisplayTitle(String vendorsDisplayTitle) {
    this.vendorsDisplayTitle = vendorsDisplayTitle;
    return this;
  }

   /**
   * If you&#39;re going to show Vendors for the Milestone, you can use this as a localized \&quot;header\&quot; for the section where you show that vendor data. It&#39;ll provide a more context-relevant clue about what the vendor&#39;s role is in the Milestone.
   * @return vendorsDisplayTitle
  **/
  @ApiModelProperty(value = "If you're going to show Vendors for the Milestone, you can use this as a localized \"header\" for the section where you show that vendor data. It'll provide a more context-relevant clue about what the vendor's role is in the Milestone.")
  public String getVendorsDisplayTitle() {
    return vendorsDisplayTitle;
  }

  public void setVendorsDisplayTitle(String vendorsDisplayTitle) {
    this.vendorsDisplayTitle = vendorsDisplayTitle;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneDefinition vendors(List<DestinyDefinitionsMilestonesDestinyMilestoneVendorDefinition> vendors) {
    this.vendors = vendors;
    return this;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneDefinition addVendorsItem(DestinyDefinitionsMilestonesDestinyMilestoneVendorDefinition vendorsItem) {
    if (this.vendors == null) {
      this.vendors = new ArrayList<>();
    }
    this.vendors.add(vendorsItem);
    return this;
  }

   /**
   * Sometimes, milestones will have rewards provided by Vendors. This definition gives the information needed to understand which vendors are relevant, the order in which they should be returned if order matters, and the conditions under which the Vendor is relevant to the user.
   * @return vendors
  **/
  @ApiModelProperty(value = "Sometimes, milestones will have rewards provided by Vendors. This definition gives the information needed to understand which vendors are relevant, the order in which they should be returned if order matters, and the conditions under which the Vendor is relevant to the user.")
  public List<DestinyDefinitionsMilestonesDestinyMilestoneVendorDefinition> getVendors() {
    return vendors;
  }

  public void setVendors(List<DestinyDefinitionsMilestonesDestinyMilestoneVendorDefinition> vendors) {
    this.vendors = vendors;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneDefinition values(Map<String, DestinyDefinitionsMilestonesDestinyMilestoneValueDefinition> values) {
    this.values = values;
    return this;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneDefinition putValuesItem(String key, DestinyDefinitionsMilestonesDestinyMilestoneValueDefinition valuesItem) {
    if (this.values == null) {
      this.values = new HashMap<>();
    }
    this.values.put(key, valuesItem);
    return this;
  }

   /**
   * Sometimes, milestones will have arbitrary values associated with them that are of interest to us or to third party developers. This is the collection of those values&#39; definitions, keyed by the identifier of the value and providing useful definition information such as localizable names and descriptions for the value.
   * @return values
  **/
  @ApiModelProperty(value = "Sometimes, milestones will have arbitrary values associated with them that are of interest to us or to third party developers. This is the collection of those values' definitions, keyed by the identifier of the value and providing useful definition information such as localizable names and descriptions for the value.")
  public Map<String, DestinyDefinitionsMilestonesDestinyMilestoneValueDefinition> getValues() {
    return values;
  }

  public void setValues(Map<String, DestinyDefinitionsMilestonesDestinyMilestoneValueDefinition> values) {
    this.values = values;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneDefinition isInGameMilestone(Boolean isInGameMilestone) {
    this.isInGameMilestone = isInGameMilestone;
    return this;
  }

   /**
   * Some milestones are explicit objectives that you can see and interact with in the game. Some milestones are more conceptual, built by BNet to help advise you on activities and events that happen in-game but that aren&#39;t explicitly shown in game as Milestones. If this is TRUE, you can see this as a milestone in the game. If this is FALSE, it&#39;s an event or activity you can participate in, but you won&#39;t see it as a Milestone in the game&#39;s UI.
   * @return isInGameMilestone
  **/
  @ApiModelProperty(value = "Some milestones are explicit objectives that you can see and interact with in the game. Some milestones are more conceptual, built by BNet to help advise you on activities and events that happen in-game but that aren't explicitly shown in game as Milestones. If this is TRUE, you can see this as a milestone in the game. If this is FALSE, it's an event or activity you can participate in, but you won't see it as a Milestone in the game's UI.")
  public Boolean isIsInGameMilestone() {
    return isInGameMilestone;
  }

  public void setIsInGameMilestone(Boolean isInGameMilestone) {
    this.isInGameMilestone = isInGameMilestone;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneDefinition activities(List<DestinyDefinitionsMilestonesDestinyMilestoneChallengeActivityDefinition> activities) {
    this.activities = activities;
    return this;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneDefinition addActivitiesItem(DestinyDefinitionsMilestonesDestinyMilestoneChallengeActivityDefinition activitiesItem) {
    if (this.activities == null) {
      this.activities = new ArrayList<>();
    }
    this.activities.add(activitiesItem);
    return this;
  }

   /**
   * A Milestone can now be represented by one or more activities directly (without a backing Quest), and that activity can have many challenges, modifiers, and related to it.
   * @return activities
  **/
  @ApiModelProperty(value = "A Milestone can now be represented by one or more activities directly (without a backing Quest), and that activity can have many challenges, modifiers, and related to it.")
  public List<DestinyDefinitionsMilestonesDestinyMilestoneChallengeActivityDefinition> getActivities() {
    return activities;
  }

  public void setActivities(List<DestinyDefinitionsMilestonesDestinyMilestoneChallengeActivityDefinition> activities) {
    this.activities = activities;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneDefinition defaultOrder(Integer defaultOrder) {
    this.defaultOrder = defaultOrder;
    return this;
  }

   /**
   * Get defaultOrder
   * @return defaultOrder
  **/
  @ApiModelProperty(value = "")
  public Integer getDefaultOrder() {
    return defaultOrder;
  }

  public void setDefaultOrder(Integer defaultOrder) {
    this.defaultOrder = defaultOrder;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneDefinition hash(Integer hash) {
    this.hash = hash;
    return this;
  }

   /**
   * The unique identifier for this entity. Guaranteed to be unique for the type of entity, but not globally.  When entities refer to each other in Destiny content, it is this hash that they are referring to.
   * @return hash
  **/
  @ApiModelProperty(value = "The unique identifier for this entity. Guaranteed to be unique for the type of entity, but not globally.  When entities refer to each other in Destiny content, it is this hash that they are referring to.")
  public Integer getHash() {
    return hash;
  }

  public void setHash(Integer hash) {
    this.hash = hash;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneDefinition index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * The index of the entity as it was found in the investment tables.
   * @return index
  **/
  @ApiModelProperty(value = "The index of the entity as it was found in the investment tables.")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneDefinition redacted(Boolean redacted) {
    this.redacted = redacted;
    return this;
  }

   /**
   * If this is true, then there is an entity with this identifier/type combination, but BNet is not yet allowed to show it. Sorry!
   * @return redacted
  **/
  @ApiModelProperty(value = "If this is true, then there is an entity with this identifier/type combination, but BNet is not yet allowed to show it. Sorry!")
  public Boolean isRedacted() {
    return redacted;
  }

  public void setRedacted(Boolean redacted) {
    this.redacted = redacted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsMilestonesDestinyMilestoneDefinition destinyDefinitionsMilestonesDestinyMilestoneDefinition = (DestinyDefinitionsMilestonesDestinyMilestoneDefinition) o;
    return Objects.equals(this.displayProperties, destinyDefinitionsMilestonesDestinyMilestoneDefinition.displayProperties) &&
        Objects.equals(this.image, destinyDefinitionsMilestonesDestinyMilestoneDefinition.image) &&
        Objects.equals(this.milestoneType, destinyDefinitionsMilestonesDestinyMilestoneDefinition.milestoneType) &&
        Objects.equals(this.recruitable, destinyDefinitionsMilestonesDestinyMilestoneDefinition.recruitable) &&
        Objects.equals(this.friendlyName, destinyDefinitionsMilestonesDestinyMilestoneDefinition.friendlyName) &&
        Objects.equals(this.showInExplorer, destinyDefinitionsMilestonesDestinyMilestoneDefinition.showInExplorer) &&
        Objects.equals(this.showInMilestones, destinyDefinitionsMilestonesDestinyMilestoneDefinition.showInMilestones) &&
        Objects.equals(this.explorePrioritizesActivityImage, destinyDefinitionsMilestonesDestinyMilestoneDefinition.explorePrioritizesActivityImage) &&
        Objects.equals(this.hasPredictableDates, destinyDefinitionsMilestonesDestinyMilestoneDefinition.hasPredictableDates) &&
        Objects.equals(this.quests, destinyDefinitionsMilestonesDestinyMilestoneDefinition.quests) &&
        Objects.equals(this.rewards, destinyDefinitionsMilestonesDestinyMilestoneDefinition.rewards) &&
        Objects.equals(this.vendorsDisplayTitle, destinyDefinitionsMilestonesDestinyMilestoneDefinition.vendorsDisplayTitle) &&
        Objects.equals(this.vendors, destinyDefinitionsMilestonesDestinyMilestoneDefinition.vendors) &&
        Objects.equals(this.values, destinyDefinitionsMilestonesDestinyMilestoneDefinition.values) &&
        Objects.equals(this.isInGameMilestone, destinyDefinitionsMilestonesDestinyMilestoneDefinition.isInGameMilestone) &&
        Objects.equals(this.activities, destinyDefinitionsMilestonesDestinyMilestoneDefinition.activities) &&
        Objects.equals(this.defaultOrder, destinyDefinitionsMilestonesDestinyMilestoneDefinition.defaultOrder) &&
        Objects.equals(this.hash, destinyDefinitionsMilestonesDestinyMilestoneDefinition.hash) &&
        Objects.equals(this.index, destinyDefinitionsMilestonesDestinyMilestoneDefinition.index) &&
        Objects.equals(this.redacted, destinyDefinitionsMilestonesDestinyMilestoneDefinition.redacted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayProperties, image, milestoneType, recruitable, friendlyName, showInExplorer, showInMilestones, explorePrioritizesActivityImage, hasPredictableDates, quests, rewards, vendorsDisplayTitle, vendors, values, isInGameMilestone, activities, defaultOrder, hash, index, redacted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsMilestonesDestinyMilestoneDefinition {\n");
    
    sb.append("    displayProperties: ").append(toIndentedString(displayProperties)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    milestoneType: ").append(toIndentedString(milestoneType)).append("\n");
    sb.append("    recruitable: ").append(toIndentedString(recruitable)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    showInExplorer: ").append(toIndentedString(showInExplorer)).append("\n");
    sb.append("    showInMilestones: ").append(toIndentedString(showInMilestones)).append("\n");
    sb.append("    explorePrioritizesActivityImage: ").append(toIndentedString(explorePrioritizesActivityImage)).append("\n");
    sb.append("    hasPredictableDates: ").append(toIndentedString(hasPredictableDates)).append("\n");
    sb.append("    quests: ").append(toIndentedString(quests)).append("\n");
    sb.append("    rewards: ").append(toIndentedString(rewards)).append("\n");
    sb.append("    vendorsDisplayTitle: ").append(toIndentedString(vendorsDisplayTitle)).append("\n");
    sb.append("    vendors: ").append(toIndentedString(vendors)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    isInGameMilestone: ").append(toIndentedString(isInGameMilestone)).append("\n");
    sb.append("    activities: ").append(toIndentedString(activities)).append("\n");
    sb.append("    defaultOrder: ").append(toIndentedString(defaultOrder)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    redacted: ").append(toIndentedString(redacted)).append("\n");
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

