
# DestinyDefinitionsDestinyDisplayCategoryDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | **String** | A string identifier for the display category. |  [optional]
**displayCategoryHash** | **Long** |  |  [optional]
**displayProperties** | [**DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition**](DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition.md) |  |  [optional]
**displayInBanner** | **Boolean** | If true, this category should be displayed in the \&quot;Banner\&quot; section of the vendor&#39;s UI. |  [optional]
**progressionHash** | **Long** | If it exists, this is the hash identifier of a DestinyProgressionDefinition that represents the progression to show on this display category.  Specific categories can now have thier own distinct progression, apparently. So that&#39;s cool. |  [optional]
**sortOrder** | **Object** | If this category sorts items in a nonstandard way, this will be the way we sort. |  [optional]
**displayStyleHash** | **Long** | An indicator of how the category will be displayed in the UI. It&#39;s up to you to do something cool or interesting in response to this, or just to treat it as a normal category. |  [optional]
**displayStyleIdentifier** | **String** | An indicator of how the category will be displayed in the UI. It&#39;s up to you to do something cool or interesting in response to this, or just to treat it as a normal category. |  [optional]



