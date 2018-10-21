
# DestinyHistoricalStatsDefinitionsDestinyHistoricalStatsDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**statId** | **String** | Unique programmer friendly ID for this stat |  [optional]
**group** | **Object** | Statistic group |  [optional]
**periodTypes** | [**List&lt;DestinyHistoricalStatsDefinitionsPeriodType&gt;**](DestinyHistoricalStatsDefinitionsPeriodType.md) | Time periods the statistic covers |  [optional]
**modes** | [**List&lt;DestinyHistoricalStatsDefinitionsDestinyActivityModeType&gt;**](DestinyHistoricalStatsDefinitionsDestinyActivityModeType.md) | Game modes where this statistic can be reported. |  [optional]
**category** | **Object** | Category for the stat. |  [optional]
**statName** | **String** | Display name |  [optional]
**statNameAbbr** | **String** | Display name abbreviated |  [optional]
**statDescription** | **String** | Description of a stat if applicable. |  [optional]
**unitType** | **Object** | Unit, if any, for the statistic |  [optional]
**iconImage** | **String** | Optional URI to an icon for the statistic |  [optional]
**mergeMethod** | [**MergeMethodEnum**](#MergeMethodEnum) | Optional icon for the statistic |  [optional]
**unitLabel** | **String** | Localized Unit Name for the stat. |  [optional]
**weight** | **Integer** | Weight assigned to this stat indicating its relative impressiveness. |  [optional]
**medalTierHash** | **Integer** | The tier associated with this medal - be it implicitly or explicitly. |  [optional]


<a name="MergeMethodEnum"></a>
## Enum: MergeMethodEnum
Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_2 | 2



