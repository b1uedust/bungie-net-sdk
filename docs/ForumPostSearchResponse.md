
# ForumPostSearchResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**relatedPosts** | [**List&lt;ForumPostResponse&gt;**](ForumPostResponse.md) |  |  [optional]
**authors** | [**List&lt;UserGeneralUser&gt;**](UserGeneralUser.md) |  |  [optional]
**groups** | [**List&lt;GroupsV2GroupResponse&gt;**](GroupsV2GroupResponse.md) |  |  [optional]
**searchedTags** | [**List&lt;TagsModelsContractsTagResponse&gt;**](TagsModelsContractsTagResponse.md) |  |  [optional]
**polls** | [**List&lt;ForumPollResponse&gt;**](ForumPollResponse.md) |  |  [optional]
**recruitmentDetails** | [**List&lt;ForumForumRecruitmentDetail&gt;**](ForumForumRecruitmentDetail.md) |  |  [optional]
**availablePages** | **Integer** |  |  [optional]
**results** | [**List&lt;ForumPostResponse&gt;**](ForumPostResponse.md) |  |  [optional]
**totalResults** | **Integer** |  |  [optional]
**hasMore** | **Boolean** |  |  [optional]
**query** | [**QueriesPagedQuery**](QueriesPagedQuery.md) |  |  [optional]
**replacementContinuationToken** | **String** |  |  [optional]
**useTotalResults** | **Boolean** | If useTotalResults is true, then totalResults represents an accurate count.  If False, it does not, and may be estimated/only the size of the current page.  Either way, you should probably always only trust hasMore.  This is a long-held historical throwback to when we used to do paging with known total results. Those queries toasted our database, and we were left to hastily alter our endpoints and create backward- compatible shims, of which useTotalResults is one. |  [optional]



