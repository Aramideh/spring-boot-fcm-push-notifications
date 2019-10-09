package net.mestwin.fcmpushnotifications;

import net.mestwin.fcmpushnotifications.controller.PushNotificationController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;




@SpringBootApplication
@EnableScheduling
@EnableSwagger2

public class FcmPushNotificationsApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(FcmPushNotificationsApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources( FcmPushNotificationsApplication.class );
	}
}

