
# DestinyVendorsDestinyVendorReceipt

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currencyPaid** | [**List&lt;DestinyDestinyItemQuantity&gt;**](DestinyDestinyItemQuantity.md) | The amount paid for the item, in terms of items that were consumed in the purchase and their quantity. |  [optional]
**itemReceived** | **Object** | The item that was received, and its quantity. |  [optional]
**licenseUnlockHash** | **Long** | The unlock flag used to determine whether you still have the purchased item. |  [optional]
**purchasedByCharacterId** | **Long** | The ID of the character who made the purchase. |  [optional]
**refundPolicy** | **Object** | Whether you can get a refund, and what happens in order for the refund to be received. See the DestinyVendorItemRefundPolicy enum for details. |  [optional]
**sequenceNumber** | **Integer** | The identifier of this receipt. |  [optional]
**timeToExpiration** | **Long** | The seconds since epoch at which this receipt is rendered invalid. |  [optional]
**expiresOn** | [**OffsetDateTime**](OffsetDateTime.md) | The date at which this receipt is rendered invalid. |  [optional]



