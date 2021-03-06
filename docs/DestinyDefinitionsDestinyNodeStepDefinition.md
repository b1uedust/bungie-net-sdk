
# DestinyDefinitionsDestinyNodeStepDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayProperties** | **Object** | These are the display properties actually used to render the Talent Node. The currently active step&#39;s displayProperties are shown. |  [optional]
**stepIndex** | **Integer** | The index of this step in the list of Steps on the Talent Node.  Unfortunately, this is the closest thing we have to an identifier for the Step: steps are not provided a content version agnostic identifier. This means that, when you are dealing with talent nodes, you will need to first ensure that you have the latest version of content. |  [optional]
**nodeStepHash** | **Long** | The hash of this node step. Unfortunately, while it can be used to uniquely identify the step within a node, it is also content version dependent and should not be relied on without ensuring you have the latest vesion of content. |  [optional]
**interactionDescription** | **String** | If you can interact with this node in some way, this is the localized description of that interaction. |  [optional]
**damageType** | **Object** | An enum representing a damage type granted by activating this step, if any. |  [optional]
**damageTypeHash** | **Long** | If the step provides a damage type, this will be the hash identifier used to look up the damage type&#39;s DestinyDamageTypeDefinition. |  [optional]
**activationRequirement** | **Object** | If the step has requirements for activation (they almost always do, if nothing else than for the Talent Grid&#39;s Progression to have reached a certain level), they will be defined here. |  [optional]
**canActivateNextStep** | **Boolean** | There was a time when talent nodes could be activated multiple times, and the effects of subsequent Steps would be compounded on each other, essentially \&quot;upgrading\&quot; the node. We have moved away from this, but theoretically the capability still exists.  I continue to return this in case it is used in the future: if true and this step is the current step in the node, you are allowed to activate the node a second time to receive the benefits of the next step in the node, which will then become the active step. |  [optional]
**nextStepIndex** | **Integer** | The stepIndex of the next step in the talent node, or -1 if this is the last step or if the next step to be chosen is random.  This doesn&#39;t really matter anymore unless canActivateNextStep begins to be used again. |  [optional]
**isNextStepRandom** | **Boolean** | If true, the next step to be chosen is random, and if you&#39;re allowed to activate the next step. (if canActivateNextStep &#x3D; true) |  [optional]
**perkHashes** | **List&lt;Long&gt;** | The list of hash identifiers for Perks (DestinySandboxPerkDefinition) that are applied when this step is active. Perks provide a variety of benefits and modifications - examine DestinySandboxPerkDefinition to learn more. |  [optional]
**startProgressionBarAtProgress** | **Integer** | When the Talent Grid&#39;s progression reaches this value, the circular \&quot;progress bar\&quot; that surrounds the talent node should be shown.  This also indicates the lower bound of said progress bar, with the upper bound being the progress required to reach activationRequirement.gridLevel. (at some point I should precalculate the upper bound and put it in the definition to save people time) |  [optional]
**statHashes** | **List&lt;Long&gt;** | When the step provides stat benefits on the item or character, this is the list of hash identifiers for stats (DestinyStatDefinition) that are provided. |  [optional]
**affectsQuality** | **Boolean** | If this is true, the step affects the item&#39;s Quality in some way. See DestinyInventoryItemDefinition for more information about the meaning of Quality. I already made a joke about Zen and the Art of Motorcycle Maintenance elsewhere in the documentation, so I will avoid doing it again. Oops too late |  [optional]
**stepGroups** | **Object** | In Destiny 1, the Armory&#39;s Perk Filtering was driven by a concept of TalentNodeStepGroups: categorizations of talent nodes based on their functionality. While the Armory isn&#39;t a BNet-facing thing for now, and the new Armory will need to account for Sockets rather than Talent Nodes, this categorization capability feels useful enough to still keep around. |  [optional]
**affectsLevel** | **Boolean** | If true, this step can affect the level of the item. See DestinyInventoryItemDefintion for more information about item levels and their effect on stats. |  [optional]
**socketReplacements** | [**List&lt;DestinyDefinitionsDestinyNodeSocketReplaceResponse&gt;**](DestinyDefinitionsDestinyNodeSocketReplaceResponse.md) | If this step is activated, this will be a list of information used to replace socket items with new Plugs. See DestinyInventoryItemDefinition for more information about sockets and plugs. |  [optional]



