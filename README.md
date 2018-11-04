# WHM-Java
Java WHMCS API Accessors

### Usage:
```java
//Instanciate a new WHMCS instance
WHMCS whmcs = new WHMCS(
    "https://mysite.com/whmcs/api.php",
    "my-identifier",
    "my-secret"
);
```
Using this WHMCS instance, you can now submit `Payload` objects using `WHMCS#submitPayload`

Example, using `AddAnnouncementPayload` ([API Reference](https://developers.whmcs.com/api-reference/addannouncement/)):
```java
Payload payload = new AddAnnouncementPayload(
    "2018-11-04 12:00:00",
    "My Announcement",
    "This is my Announcement!"
);
JSONObject response;
try {
  response = whmcs.submitPayload(payload);
} catch (IOException | InterruptedException e){
  e.printStackTrace();
  return;
}
String result = response.getString("result");
```
