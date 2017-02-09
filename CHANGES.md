twilio-java changelog
=====================

[2017-01-10] Version 7.4.0
--------------------------
- Added new AddOnResults API.
- Allow undocumented TwiML voice parameters for Conference, Dial, and Pause PR #317.
- Fix dates being serialized to null in some locales PR #320.
- Add `emergencyEnabled` field to Addresses.
- Add support for emergency phone numbers.
- Add support for ending conferences via the API.
- Add `region` field to Conferences.

- **Twilio Chat**
    - Add `membersCount` and `messagesCount` to Channel.
    - Add support for filtering on channel type when reading list of Channels.
    - Add `last_consumed_message_index` and `last_consumption_timestamp` fields to Member.
    - Remove ability to update Message body, was never supported by API (backwards incompatible).
    - Add support for new UserChannel Resource.

- **Taskrouter**
    - Add default worker fetch policy PR #313.
    - Add queue ordering for Workspace, TaskQueue.
    - Remove ability to specify `attributes` and `workflowSid` on Task creation (backwards incompatible).
    - Add `addons`, `taskQueueFriendlyName`, `workflowFriendlyName`, metdata to Task.
    - Use DateTimes for WorkspaceStatistics filtering (backwards incompatible).
    - Fix TaskQueueStatistics `cumulative` field incorrect type (backwards incompatible).
    - Fix TaskQueuesStatistics `cumulative` field incorrect type (backwards incompatible).
    - Remove ability to set `friendlyName` on TaskQueueStatistics (backwards incompatible).

[2016-11-30] Version 7.3.0
--------------------------
- Add `recordingStatusCallback` and `recordingStatusCallbackMethod` to Conference TwiML
- Fix TaskRouter Capabaility generation
- Address potential NPE in `ApiException`

[2016-11-16] Version 7.2.0
--------------------------
- Use separate enum for Updating Call `status`. This enum only exposes the statuses that a Call can be updated to.
- Move the `body` parameter to be required in updating Messages.
- Move the `friendlyName` parameter to be required in creating Queues.
- Add Particpant creation to Conferences.
- Add filtering by `CallSid` to Recordings.
- Add missing fields to Call Recordings.
- Add missing fields to Conferences.
- Add missing fields to IncomingPhoneNumbers.
- Add missing fields to Messages.

- **Twilio Chat**
    - Add Invites
    - Add `reachabilityEnabled`, `preWebhookUrl`, `postWebhookUrl`, `webhookMethod`, `webhookFilters`, `notifications` to Services.
    - Add `attributes`, `friendlyName`, `isOnline`, `isNotifiable` to Users.
    - Add `lastConsumedMessageIndex`, `lastConsumptionTimestamp` to Members.
    - Add `attributes`, `index` to Messages.
    - Add ability to update Members.
    - Add filtering by `identity` on Members.
    - Add webhook related parameters to Service updates.
    - Remove updating of `type` on Channels. 

[2016-10-05] Version 7.1.0
--------------------------
- Update Usage Records to use `LocalDate` instead of `DateTime`
- Update TwiML Generator to reflect latest docs:
    - Add `statusCallbackEvent`, `statusCallbackMethod`, `statusCallback` to `Conference`
    - Add `recordingStatusCallback`, `recordingStatusCallbackMethod` to `Dial`

[2016-10-04] Version 7.0.0
--------------------------
**New Major Version**

The newest version of the `twilio-java` helper library!

This version brings a host of changes to update and modernize the `twilio-java` helper library. It is auto-generated to produce a more consistent and correct product.

- [Migration Guide](https://www.twilio.com/docs/libraries/java/migration-guide)
- [Full API Documentation](https://twilio.github.io/twilio-java/)
- [General Documentation](https://www.twilio.com/docs/libraries/java)


[2016-01-26] Version 5.9.0
--------------------------
- Add support for WorkerReservations in TaskRouter
- Add support for filterFriendlyName in TaskRouter WorkflowRules
- Fix TaskRouter paging


[2015-12-16] Version 5.8.0
--------------------------
- Add support for IP Messaging


[2015-12-14] Version 5.7.1
--------------------------
- Add new getUsageRecords to support query by intervals
- Fix for ListResource's & NextGenListResource's ListIterator.next()


[2015-12-08] Version 5.7.0
--------------------------
- Change NBF to be optional parameter in AccessToken


[2015-12-03] Version 5.6.0
--------------------------
- Add access tokens


[2015-11-25] Version 5.5.1
--------------------------
- Exposed Recording's PriceUnit field


[2015-11-18] Version 5.5.0
--------------------------
- Fix authentication using key and secret


[2015-10-30] Version 5.4.0
--------------------------
- Add MessagingServiceSid


[2015-10-28] Version 5.3.0
--------------------------
- Add Keys endpoint


[2015-10-02] Version 5.2.1
--------------------------
- Normalized the Number type from spaces to underscore in Pricing Phone Number Country


[2015-09-24] Version 5.2.0
--------------------------
- Add support for TaskRouter reservations
- Add support for TaskRouter TwiML verbs


[2015-09-21] Version 5.1.0
--------------------------
- Add support for messaging in Twilio Pricing API
- Add support for Elastic SIP Trunking's API


[2015-09-14] Version 5.0.0
--------------------------
- Remove deprecated total and numpages from ListResource and response parsers


