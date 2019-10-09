package net.mestwin.fcmpushnotifications.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.mestwin.fcmpushnotifications.model.PushNotificationRequest;
import net.mestwin.fcmpushnotifications.model.PushNotificationResponse;
import net.mestwin.fcmpushnotifications.service.PushNotificationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.ws.rs.core.MediaType;

@RestController
@RequestMapping("/firebase")
@Api(value="Firebase Cloud Messaging Webservices", description="WebServices to interact with Google's FCM")
public class PushNotificationController {

    private PushNotificationService pushNotificationService;

    public PushNotificationController(PushNotificationService pushNotificationService) {
        this.pushNotificationService = pushNotificationService;
    }

    //@PostMapping(value = "/notification/topic" )
    @RequestMapping( value = "/notification/topic" , method = RequestMethod.POST , consumes = {MediaType.APPLICATION_JSON } , produces = {MediaType.APPLICATION_JSON })
    public ResponseEntity sendNotification(@RequestBody PushNotificationRequest request) {
        pushNotificationService.sendPushNotificationWithoutData(request);
        return new ResponseEntity<>(new PushNotificationResponse(HttpStatus.OK.value(), "Notification has been sent."), HttpStatus.OK);
    }

    //@PostMapping("/notification/token")
    @RequestMapping( value = "/notification/token" , method = RequestMethod.POST , consumes = {MediaType.APPLICATION_JSON } , produces = {MediaType.APPLICATION_JSON })
    public ResponseEntity sendTokenNotification(@RequestBody PushNotificationRequest request) {
        pushNotificationService.sendPushNotificationToToken(request);
        return new ResponseEntity<>(new PushNotificationResponse(HttpStatus.OK.value(), "Notification has been sent."), HttpStatus.OK);
    }

    //@PostMapping("/notification/data")
    @RequestMapping( value = "/notification/data" , method = RequestMethod.POST , consumes = {MediaType.APPLICATION_JSON } , produces = {MediaType.APPLICATION_JSON })
    public ResponseEntity sendDataNotification(@RequestBody PushNotificationRequest request) {
        pushNotificationService.sendPushNotification(request);
        return new ResponseEntity<>(new PushNotificationResponse(HttpStatus.OK.value(), "Notification has been sent."), HttpStatus.OK);
    }

    //@GetMapping("/notification")
    @RequestMapping( value = "/notification" , method = RequestMethod.GET , consumes = {MediaType.APPLICATION_JSON } , produces = {MediaType.APPLICATION_JSON })
    public ResponseEntity sendSampleNotification() {
        pushNotificationService.sendSamplePushNotification();
        return new ResponseEntity<>(new PushNotificationResponse(HttpStatus.OK.value(), "Notification has been sent."), HttpStatus.OK);
    }
}
