
# DestinyDefinitionsDestinyVendorDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayProperties** | [**DestinyDefinitionsDestinyVendorDisplayPropertiesDefinition**](DestinyDefinitionsDestinyVendorDisplayPropertiesDefinition.md) |  |  [optional]
**buyString** | **String** | If the vendor has a custom localized string describing the \&quot;buy\&quot; action, that is returned here. |  [optional]
**sellString** | **String** | Ditto for selling. Not that you can sell items to a vendor anymore. Will it come back? Who knows. The string&#39;s still there. |  [optional]
**displayItemHash** | **Integer** | If the vendor has an item that should be displayed as the \&quot;featured\&quot; item, this is the hash identifier for that DestinyVendorItemDefinition.  Apparently this is usually a related currency, like a reputation token. But it need not be restricted to that. |  [optional]
**inhibitBuying** | **Boolean** | If this is true, you aren&#39;t allowed to buy whatever the vendor is selling. |  [optional]
**inhibitSelling** | **Boolean** | If this is true, you&#39;re not allowed to sell whatever the vendor is buying. |  [optional]
**factionHash** | **Integer** | If the Vendor has a faction, this hash will be valid and point to a DestinyFactionDefinition.  The game UI and BNet often mine the faction definition for additional elements and details to place on the screen, such as the faction&#39;s Progression status (aka \&quot;Reputation\&quot;). |  [optional]
**resetIntervalMinutes** | **Integer** | A number used for calculating the frequency of a vendor&#39;s inventory resetting/refreshing.  Don&#39;t worry about calculating this - we do it on the server side and send you the next refresh date with the live data. |  [optional]
**resetOffsetMinutes** | **Integer** | Again, used for reset/refreshing of inventory. Don&#39;t worry too much about it. Unless you want to. |  [optional]
**failureStrings** | **List&lt;String&gt;** | If an item can&#39;t be purchased from the vendor, there may be many \&quot;custom\&quot;/game state specific reasons why not.  This is a list of localized strings with messages for those custom failures. The live BNet data will return a failureIndexes property for items that can&#39;t be purchased: using those values to index into this array, you can show the user the appropriate failure message for the item that can&#39;t be bought. |  [optional]
**unlockRanges** | [**List&lt;DatesDateRange&gt;**](DatesDateRange.md) | If we were able to predict the dates when this Vendor will be visible/available, this will be the list of those date ranges. Sadly, we&#39;re not able to predict this very frequently, so this will often be useless data. |  [optional]
**vendorIdentifier** | **String** | The internal identifier for the Vendor. A holdover from the old days of Vendors, but we don&#39;t have time to refactor it away. |  [optional]
**vendorPortrait** | **String** | A portrait of the Vendor&#39;s smiling mug. Or frothing tentacles. |  [optional]
**vendorBanner** | **String** | If the vendor has a custom banner image, that can be found here. |  [optional]
**enabled** | **Boolean** | If a vendor is not enabled, we won&#39;t even save the vendor&#39;s definition, and we won&#39;t return any items or info about them. It&#39;s as if they don&#39;t exist. |  [optional]
**visible** | **Boolean** | If a vendor is not visible, we still have and will give vendor definition info, but we won&#39;t use them for things like Advisors or UI. |  [optional]
**vendorSubcategoryIdentifier** | **String** | The identifier of the VendorCategoryDefinition for this vendor&#39;s subcategory. |  [optional]
**consolidateCategories** | **Boolean** | If TRUE, consolidate categories that only differ by trivial properties (such as having minor differences in name) |  [optional]
**actions** | [**List&lt;DestinyDefinitionsDestinyVendorActionDefinition&gt;**](DestinyDefinitionsDestinyVendorActionDefinition.md) | Describes \&quot;actions\&quot; that can be performed on a vendor. Currently, none of these exist. But theoretically a Vendor could let you interact with it by performing actions. We&#39;ll see what these end up looking like if they ever get used. |  [optional]
**categories** | [**List&lt;DestinyDefinitionsDestinyVendorCategoryEntryDefinition&gt;**](DestinyDefinitionsDestinyVendorCategoryEntryDefinition.md) | These are the headers for sections of items that the vendor is selling. When you see items organized by category in the header, it is these categories that it is showing.  Well, technically not *exactly* these. On BNet, it doesn&#39;t make sense to have categories be \&quot;paged\&quot; as we do in Destiny, so we run some heuristics to attempt to aggregate pages of categories together.   These are the categories post-concatenation, if the vendor had concatenation applied. If you want the pre-aggregated category data, use originalCategories. |  [optional]
**originalCategories** | [**List&lt;DestinyDefinitionsDestinyVendorCategoryEntryDefinition&gt;**](DestinyDefinitionsDestinyVendorCategoryEntryDefinition.md) | See the categories property for a description of categories and why originalCategories exists. |  [optional]
**displayCategories** | [**List&lt;DestinyDefinitionsDestinyDisplayCategoryDefinition&gt;**](DestinyDefinitionsDestinyDisplayCategoryDefinition.md) | Display Categories are different from \&quot;categories\&quot; in that these are specifically for visual grouping and display of categories in Vendor UI.   The \&quot;categories\&quot; structure is for validation of the contained items, and can be categorized entirely separately from \&quot;Display Categories\&quot;, there need be and often will be no meaningful relationship between the two. |  [optional]
**interactions** | [**List&lt;DestinyDefinitionsDestinyVendorInteractionDefinition&gt;**](DestinyDefinitionsDestinyVendorInteractionDefinition.md) | In addition to selling items, vendors can have \&quot;interactions\&quot;: UI where you \&quot;talk\&quot; with the vendor and they offer you a reward, some item, or merely acknowledge via dialog that you did something cool. |  [optional]
**inventoryFlyouts** | [**List&lt;DestinyDefinitionsDestinyVendorInventoryFlyoutDefinition&gt;**](DestinyDefinitionsDestinyVendorInventoryFlyoutDefinition.md) | If the vendor shows you items from your own inventory - such as the Vault vendor does - this data describes the UI around showing those inventory buckets and which ones get shown. |  [optional]
**itemList** | [**List&lt;DestinyDefinitionsDestinyVendorItemDefinition&gt;**](DestinyDefinitionsDestinyVendorItemDefinition.md) | If the vendor sells items (or merely has a list of items to show like the \&quot;Sack\&quot; vendors do), this is the list of those items that the vendor can sell. From this list, only a subset will be available from the vendor at any given time, selected randomly and reset on the vendor&#39;s refresh interval.  Note that a vendor can sell the same item multiple ways: for instance, nothing stops a vendor from selling you some specific weapon but using two different currencies, or the same weapon at multiple \&quot;item levels\&quot;. |  [optional]
**services** | [**List&lt;DestinyDefinitionsDestinyVendorServiceDefinition&gt;**](DestinyDefinitionsDestinyVendorServiceDefinition.md) | BNet doesn&#39;t use this data yet, but it appears to be an optional list of flavor text about services that the Vendor can provide. |  [optional]
**acceptedItems** | [**List&lt;DestinyDefinitionsDestinyVendorAcceptedItemDefinition&gt;**](DestinyDefinitionsDestinyVendorAcceptedItemDefinition.md) | If the Vendor is actually a vehicle for the transferring of items (like the Vault and Postmaster vendors), this defines the list of source-&gt;destination buckets for transferring. |  [optional]
**returnWithVendorRequest** | **Boolean** | As many of you know, Vendor data has historically been pretty brutal on the BNet servers. In an effort to reduce this workload, only Vendors with this flag set will be returned on Vendor requests. This allows us to filter out Vendors that don&#39;t dynamic data that&#39;s particularly useful: things like \&quot;Preview/Sack\&quot; vendors, for example, that you can usually suss out the details for using just the definitions themselves. |  [optional]
**locations** | [**List&lt;DestinyDefinitionsVendorsDestinyVendorLocationDefinition&gt;**](DestinyDefinitionsVendorsDestinyVendorLocationDefinition.md) | A vendor can be at different places in the world depending on the game/character/account state. This is the list of possible locations for the vendor, along with conditions we use to determine which one is currently active. |  [optional]
**groups** | [**List&lt;DestinyDefinitionsDestinyVendorGroupReference&gt;**](DestinyDefinitionsDestinyVendorGroupReference.md) | A vendor can be a part of 0 or 1 \&quot;groups\&quot; at a time: a group being a collection of Vendors related by either location or function/purpose. It&#39;s used for our our Companion Vendor UI. Only one of these can be active for a Vendor at a time. |  [optional]
**ignoreSaleItemHashes** | **List&lt;Integer&gt;** | Some items don&#39;t make sense to return in the API, for example because they represent an action to be performed rather than an item being sold. I&#39;d rather we not do this, but at least in the short term this is a workable workaround. |  [optional]
**hash** | **Integer** | The unique identifier for this entity. Guaranteed to be unique for the type of entity, but not globally.  When entities refer to each other in Destiny content, it is this hash that they are referring to. |  [optional]
**index** | **Integer** | The index of the entity as it was found in the investment tables. |  [optional]
**redacted** | **Boolean** | If this is true, then there is an entity with this identifier/type combination, but BNet is not yet allowed to show it. Sorry! |  [optional]


