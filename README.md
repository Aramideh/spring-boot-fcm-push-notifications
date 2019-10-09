# Spring Boot + FCM - simple push notifications server-side application
![alt text](https://blog.mestwin.net/wp-content/uploads/2019/06/fcm-spring-boot-result-1-216x300.png "Push notifications - result")

This is a forked project from https://github.com/imaginalis/spring-boot-fcm-push-notifications repository, which i decided to add swagger api to have an elegant documentation and also Spring Boot Web Security Configuration enabled so logging in to the swagge ui will not bes witout some user authentication.


## Technologies

+ Spring Boot
+ Firebase Cloud Messaging
+ Swagger Api

## Configuration

+ Provide your own Firebase Admin SDK, JSON-formatted file (service account credentials) and place it inside the project (for example _src/resources/google_)
+ Change the path and defaults in **application.properties**

PS: FCM Service accont credentials looks like this:
```
{
  "type": "service_account",
  "project_id": "",
  "private_key_id": "",
  "private_key": "",
  "client_email": "",
  "client_id": "",
  "auth_uri": "https://accounts.google.com/o/oauth2/auth",
  "token_uri": "https://oauth2.googleapis.com/token",
  "auth_provider_x509_cert_url": "https://www.googleapis.com/oauth2/v1/certs",
  "client_x509_cert_url": ""
}
```




## Endpoints

List of all endpoints are located in the http://localhost:9090/swagger-ui.html address. if you want to change the 9090 port, modify the **application.properties** file in the project.


## Swagger ui Login Credential
***User Name:*** user 

***Password:*** welcome1





![alt text](https://github.com/Aramideh/spring-boot-fcm-push-notifications/blob/master/FCM.png "Swagger Ui")


+ **Success response**

`{
    "status": 200,
    "message": "Notification has been sent."
}`

## More information

+ Blog post: [Send push notifications from Spring Boot server-side application using FCM](https://blog.mestwin.net/send-push-notifications-from-spring-boot-server-side-application-using-fcm/)

+ Client-side Ionic application: [ionic-fcm-push-notifications](https://github.com/imaginalis/ionic-fcm-push-notifications)



### Authors
* please refer to Acknowledgments section
* [**Sadeq Aramideh**](https://github.com/Aramideh)

### Acknowledgments
* [Firebase Cloud Messaging Quickstart](https://github.com/imaginalis/spring-boot-fcm-push-notifications)

