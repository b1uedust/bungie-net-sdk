
# DestinyHistoricalStatsDestinyHistoricalStatsPeriodGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**period** | [**OffsetDateTime**](OffsetDateTime.md) | Period for the group. If the stat periodType is day, then this will have a specific day. If the type is monthly, then this value will be the first day of the applicable month. This value is not set when the periodType is &#39;all time&#39;. |  [optional]
**activityDetails** | **Object** | If the period group is for a specific activity, this property will be set. |  [optional]
**values** | [**Map&lt;String, DestinyHistoricalStatsDestinyHistoricalStatsValue&gt;**](DestinyHistoricalStatsDestinyHistoricalStatsValue.md) | Collection of stats for the period. |  [optional]



