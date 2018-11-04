
# DestinyDefinitionsPresentationDestinyPresentationNodeDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayProperties** | [**DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition**](DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition.md) |  |  [optional]
**originalIcon** | **String** | The original icon for this presentation node, before we futzed with it. |  [optional]
**rootViewIcon** | **String** | Some presentation nodes are meant to be explicitly shown on the \&quot;root\&quot; or \&quot;entry\&quot; screens for the feature to which they are related. You should use this icon when showing them on such a view, if you have a similar \&quot;entry point\&quot; view in your UI. If you don&#39;t have a UI, then I guess it doesn&#39;t matter either way does it? |  [optional]
**nodeType** | [**DestinyDestinyPresentationNodeType**](DestinyDestinyPresentationNodeType.md) |  |  [optional]
**scope** | **Object** | Indicates whether this presentation node&#39;s state is determined on a per-character or on an account-wide basis. |  [optional]
**objectiveHash** | **Long** | If this presentation node shows a related objective (for instance, if it tracks the progress of its children), the objective being tracked is indicated here. |  [optional]
**completionRecordHash** | **Long** | If this presentation node has an associated \&quot;Record\&quot; that you can accomplish for completing its children, this is the identifier of that Record. |  [optional]
**children** | **Object** | The child entities contained by this presentation node. |  [optional]
**displayStyle** | **Object** | A hint for how to display this presentation node when it&#39;s shown in a list. |  [optional]
**screenStyle** | **Object** | A hint for how to display this presentation node when it&#39;s shown in its own detail screen. |  [optional]
**requirements** | **Object** | The requirements for being able to interact with this presentation node and its children. |  [optional]
**disableChildSubscreenNavigation** | **Boolean** | If this presentation node has children, but the game doesn&#39;t let you inspect the details of those children, that is indicated here. |  [optional]
**parentNodeHashes** | **List&lt;Long&gt;** | A quick reference to presentation nodes that have this node as a child. (presentation nodes can be parented under multiple parents) |  [optional]
**hash** | **Long** | The unique identifier for this entity. Guaranteed to be unique for the type of entity, but not globally.  When entities refer to each other in Destiny content, it is this hash that they are referring to. |  [optional]
**index** | **Integer** | The index of the entity as it was found in the investment tables. |  [optional]
**redacted** | **Boolean** | If this is true, then there is an entity with this identifier/type combination, but BNet is not yet allowed to show it. Sorry! |  [optional]



