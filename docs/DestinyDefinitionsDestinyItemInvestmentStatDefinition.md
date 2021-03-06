
# DestinyDefinitionsDestinyItemInvestmentStatDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**statTypeHash** | **Long** | The hash identifier for the DestinyStatDefinition defining this stat. |  [optional]
**value** | **Integer** | The raw \&quot;Investment\&quot; value for the stat, before transformations are performed to turn this raw stat into stats that are displayed in the game UI. |  [optional]
**isConditionallyActive** | **Boolean** | If this is true, the stat will only be applied on the item in certain game state conditions, and we can&#39;t know statically whether or not this stat will be applied. Check the \&quot;live\&quot; API data instead for whether this value is being applied on a specific instance of the item in question, and you can use this to decide whether you want to show the stat on the generic view of the item, or whether you want to show some kind of caveat or warning about the stat value being conditional on game state. |  [optional]



