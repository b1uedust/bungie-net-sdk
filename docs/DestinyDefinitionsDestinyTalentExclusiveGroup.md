
# DestinyDefinitionsDestinyTalentExclusiveGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupHash** | **Long** | The identifier for this exclusive group. Only guaranteed unique within the talent grid, not globally. |  [optional]
**loreHash** | **Long** | If this group has an associated piece of lore to show next to it, this will be the identifier for that DestinyLoreDefinition. |  [optional]
**nodeHashes** | **List&lt;Long&gt;** | A quick reference of the talent nodes that are part of this group, by their Talent Node hashes. (See DestinyTalentNodeDefinition.nodeHash) |  [optional]
**opposingGroupHashes** | **List&lt;Long&gt;** | A quick reference of Groups whose nodes will be deactivated if any node in this group is activated. |  [optional]
**opposingNodeHashes** | **List&lt;Long&gt;** | A quick reference of Nodes that will be deactivated if any node in this group is activated, by their Talent Node hashes. (See DestinyTalentNodeDefinition.nodeHash) |  [optional]



