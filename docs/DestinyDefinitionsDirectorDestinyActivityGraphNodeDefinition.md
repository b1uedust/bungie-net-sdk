
# DestinyDefinitionsDirectorDestinyActivityGraphNodeDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nodeId** | **Long** | An identifier for the Activity Graph Node, only guaranteed to be unique within its parent Activity Graph. |  [optional]
**overrideDisplay** | **Object** | The node *may* have display properties that override the active Activity&#39;s display properties. |  [optional]
**position** | **Object** | The position on the map for this node. |  [optional]
**featuringStates** | [**List&lt;DestinyDefinitionsDirectorDestinyActivityGraphNodeFeaturingStateDefinition&gt;**](DestinyDefinitionsDirectorDestinyActivityGraphNodeFeaturingStateDefinition.md) | The node may have various visual accents placed on it, or styles applied. These are the list of possible styles that the Node can have. The game iterates through each, looking for the first one that passes a check of the required game/character/account state in order to show that style, and then renders the node in that style. |  [optional]
**activities** | [**List&lt;DestinyDefinitionsDirectorDestinyActivityGraphNodeActivityDefinition&gt;**](DestinyDefinitionsDirectorDestinyActivityGraphNodeActivityDefinition.md) | The node may have various possible activities that could be active for it, however only one may be active at a time. See the DestinyActivityGraphNodeActivityDefinition for details. |  [optional]
**states** | [**List&lt;DestinyDefinitionsDirectorDestinyActivityGraphNodeStateEntry&gt;**](DestinyDefinitionsDirectorDestinyActivityGraphNodeStateEntry.md) | Represents possible states that the graph node can be in. These are combined with some checking that happens in the game client and server to determine which state is actually active at any given time. |  [optional]



