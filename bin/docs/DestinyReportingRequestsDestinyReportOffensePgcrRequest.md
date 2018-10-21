
# DestinyReportingRequestsDestinyReportOffensePgcrRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reasonCategoryHashes** | **List&lt;Integer&gt;** | So you&#39;ve decided to report someone instead of cursing them and their descendants. Well, okay then. This is the category or categorie(s) of infractions for which you are reporting the user. These are hash identifiers that map to DestinyReportReasonCategoryDefinition entries. |  [optional]
**reasonHashes** | **List&lt;Integer&gt;** | If applicable, provide a more specific reason(s) within the general category of problems provided by the reasonHash. This is also an identifier for a reason. All reasonHashes provided must be children of at least one the reasonCategoryHashes provided. |  [optional]
**offendingCharacterId** | **Long** | Within the PGCR provided when calling the Reporting endpoint, this should be the character ID of the user that you thought was violating terms of use. They must exist in the PGCR provided. |  [optional]



