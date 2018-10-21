
# DestinyResponsesDestinyVendorResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vendor** | **Object** | The base properties of the vendor.  COMPONENT TYPE: Vendors |  [optional]
**categories** | **Object** | Categories that the vendor has available, and references to the sales therein.  COMPONENT TYPE: VendorCategories |  [optional]
**sales** | **Object** | Sales, keyed by the vendorItemIndex of the item being sold.  COMPONENT TYPE: VendorSales |  [optional]
**itemComponents** | **Object** | Item components, keyed by the vendorItemIndex of the active sale items.  COMPONENT TYPE: [See inside the DestinyItemComponentSet contract for component types.] |  [optional]
**currencyLookups** | **Object** | A \&quot;lookup\&quot; convenience component that can be used to quickly check if the character has access to items that can be used for purchasing.  COMPONENT TYPE: CurrencyLookups |  [optional]



