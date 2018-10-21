
# DestinyResponsesDestinyCharacterResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inventory** | **Object** | The character-level non-equipped inventory items.  COMPONENT TYPE: CharacterInventories |  [optional]
**character** | **Object** | Base information about the character in question.  COMPONENT TYPE: Characters |  [optional]
**progressions** | **Object** | Character progression data, including Milestones.  COMPONENT TYPE: CharacterProgressions |  [optional]
**renderData** | **Object** | Character rendering data - a minimal set of information about equipment and dyes used for rendering.  COMPONENT TYPE: CharacterRenderData |  [optional]
**activities** | **Object** | Activity data - info about current activities available to the player.  COMPONENT TYPE: CharacterActivities |  [optional]
**equipment** | **Object** | Equipped items on the character.  COMPONENT TYPE: CharacterEquipment |  [optional]
**kiosks** | **Object** | Items available from Kiosks that are available to this specific character.   COMPONENT TYPE: Kiosks |  [optional]
**plugSets** | **Object** | When sockets refer to reusable Plug Sets (see DestinyPlugSetDefinition for more info), this is the set of plugs and their states that are scoped to this character.  This comes back with ItemSockets, as it is needed for a complete picture of the sockets on requested items.  COMPONENT TYPE: ItemSockets |  [optional]
**presentationNodes** | **Object** | COMPONENT TYPE: PresentationNodes |  [optional]
**records** | **Object** | COMPONENT TYPE: Records |  [optional]
**collectibles** | **Object** | COMPONENT TYPE: Collectibles |  [optional]
**itemComponents** | **Object** | The set of components belonging to the player&#39;s instanced items.  COMPONENT TYPE: [See inside the DestinyItemComponentSet contract for component types.] |  [optional]
**uninstancedItemComponents** | **Object** | The set of components belonging to the player&#39;s UNinstanced items. Because apparently now those too can have information relevant to the character&#39;s state.  COMPONENT TYPE: [See inside the DestinyItemComponentSet contract for component types.] |  [optional]
**currencyLookups** | **Object** | A \&quot;lookup\&quot; convenience component that can be used to quickly check if the character has access to items that can be used for purchasing.  COMPONENT TYPE: CurrencyLookups |  [optional]



