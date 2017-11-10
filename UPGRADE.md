# Upgrade Guide

_After `7.4.0` all `MINOR` and `MAJOR` version bumps will have upgrade notes 
posted here._

[2017-11-XX] 7.15.x to 7.16.x
---------------------------

### CHANGED - Make `data` an optional parameter on Sync Document/List Item/Map Item update.

```java
// 7.15.x
Document.updater("IS123", "ET123", data).update();
SyncListItem.updater("IS123", "ES123", 1, data).update();
SyncMapItem.updater("IS123", "MP123", "myKey", data).update();
```

```java
// 7.16.x
Document.updater("IS123", "ET123").setData(data).update();
SyncListItem.updater("IS123", "ES123", 1).setData(data).update();
SyncMapItem.updater("IS123", "MP123", "myKey").setData(data).update();
```


[2017-05-24] 7.14.x to 7.15.x
---------------------------

### CHANGED - Make `body` an optional parameter on Chat Message creation.

```java
// 7.14.x
Message.creator("IS123", "CH123", "this is the body");
```

```java
// 7.15.x
MessageCreator creator = Message.creator("IS123", "CH123");
```

### CHANGED - `data`, `apn`, `gcm`, `fcm`, `sms` parameters in `Notifications` create resource are maps instead of strings.

```java
// 7.14.x
NotificationCreator notificationCreator = Notification.creator("IS123");
notificationCreator.setData("{\"key\": \"value\"}");
notificationCreator.setApn("{\"key\": \"value\"}");
```

```java
// 7.15.x
Map<String, Object> data = new HashMap<~>();
data.put("key", "value);

NotificationCreator notificationCreator = Notification.creator("IS123");
notificationCreator.setData(data);
notificationCreator.setApn(data);
```


[2017-05-24] 7.10.x to 7.11.x
---------------------------

### CHANGED - Rename `Recording` to `RoomRecording` in TwilioVideo

#### Affected Resources
    - `src/main/java/com/twilio/rest/video/v1/room/Recording.java`
    - `src/main/java/com/twilio/rest/video/v1/room/RecordingFetcher.java`
    - `src/main/java/com/twilio/rest/video/v1/room/RecordingReader.java`
    - `src/test/java/com/twilio/rest/video/v1/room/RecordingTest.java`

```java
// 7.10.x
Recording.fetcher();
Recording.reader();
```

```java
// 7.11.x
RoomRecording.fetcher();
RoomRecording.reader();
```


[2017-05-19] 7.9.x to 7.10.x
---------------------------

### CHANGED - Remove convenience method `getSid()` on records that do not have a sid

#### Rationale
There already exists a getter for the resource

#### Affected Resources
  - `src/main/java/com/twilio/rest/lookups/v1/PhoneNumber.java`

```java
// 7.9.x
resource.getSid();
```

```java
// 7.10.x
resource.getPhoneNumber().toString();
```

  - `src/main/java/com/twilio/rest/pricing/v1/messaging/Country.java`
  - `src/main/java/com/twilio/rest/pricing/v1/phonenumber/Country.java`
  - `src/main/java/com/twilio/rest/pricing/v1/voice/Country.java`

```java
// 7.9.x
resource.getSid();
```

```java
// 7.10.x
resource.getIsoCountry();
```

  - `src/main/java/com/twilio/rest/pricing/v1/voice/Number.java`

```java
// 7.9.x
resource.getSid();
```

```java
// 7.10.x
resource.getNumber().toString();
```


[2017-02-01] 7.4.x to 7.5.x
---------------------------

### CHANGED - Remove required updating of `friendlyName` parameter when updating TaskRouter Activities 
  - Updating `friendlyName` is now done through a setter instead of the constructor

#### Rationale
The `friendlyName` parameter is optional when updating TaskRouter Activities

#### Affected Resources
  - TaskRouter Activities

#### 7.4.x
```java
Activity.updater("WS123", "AC123", "friendlyName").update();

```

#### 7.5.x
```java
Activity.updater("WS123", "AC123").setFriendlyName("friendlyName").update();
```

### CHANGED - Filterting of Tasks by `assignmentStatus` now takes a list of statuses

#### Rationale
Filtering by Tasks exposes the ability to filter by multiple status. The library is being updated
to support this feature

#### 5.3.x
```java
Task.reader("WS123").setAssignmentStatus(Task.Status.ASSIGNED).read();
```

#### 5.4.x
```java
Task.reader("WS123").setAssignmentStatus(Lists.newArrayList(
    Task.Status.ASSIGNED.toString(), 
    Task.Status.CANCELED.toString()
)).read();
```
