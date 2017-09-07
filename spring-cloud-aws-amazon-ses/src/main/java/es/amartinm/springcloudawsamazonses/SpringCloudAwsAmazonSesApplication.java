package es.amartinm.springcloudawsamazonses;

import es.amartinm.springcloudawsamazonses.service.SendingMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:/AWSContext.xml"})
public class SpringCloudAwsAmazonSesApplication implements CommandLineRunner {

    @Autowired
    private SendingMailService sendingMailService;

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAwsAmazonSesApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        sendingMailService.sendMailMessage();
    }
}
