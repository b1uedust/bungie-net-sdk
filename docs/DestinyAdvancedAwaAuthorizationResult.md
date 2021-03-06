
# DestinyAdvancedAwaAuthorizationResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userSelection** | **Object** | Indication of how the user responded to the request. If the value is \&quot;Approved\&quot; the actionToken will contain the token that can be presented when performing the advanced write action. |  [optional]
**responseReason** | [**DestinyAdvancedAwaResponseReason**](DestinyAdvancedAwaResponseReason.md) |  |  [optional]
**developerNote** | **String** | Message to the app developer to help understand the response. |  [optional]
**actionToken** | **String** | Credential used to prove the user authorized an advanced write action. |  [optional]
**maximumNumberOfUses** | **Integer** | This token may be used to perform the requested action this number of times, at a maximum. If this value is 0, then there is no limit. |  [optional]
**validUntil** | [**OffsetDateTime**](OffsetDateTime.md) | Time, UTC, when token expires. |  [optional]
**type** | **Object** | Advanced Write Action Type from the permission request. |  [optional]
**membershipType** | **Object** | MembershipType from the permission request. |  [optional]



