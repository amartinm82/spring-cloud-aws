package es.amartinm.springcloudawssqs;

import com.fasterxml.jackson.databind.ObjectMapper;
import es.amartinm.springcloudawssqs.model.bounce.BounceNotification;
import es.amartinm.springcloudawssqs.model.complaint.ComplaintNotification;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.messaging.config.annotation.NotificationMessage;
import org.springframework.cloud.aws.messaging.listener.SqsMessageDeletionPolicy;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:/AWSMessagingContext.xml"})
public class SpringCloudAwsSqsApplication {

    @Bean
    public ObjectMapper getObjectMapper() {
        return new ObjectMapper();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAwsSqsApplication.class, args);
    }

    @SqsListener(value = "BounceMailQueue", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
    public void receiveBoiuncedMails(final @NotificationMessage String bounceJson) throws Exception {
        System.out.println("*********************************************************************************");
        System.out.println("Received bounced mail!!! " + bounceJson);

        //convert json string to object
        BounceNotification bounceNotification = this.getObjectMapper().readValue(bounceJson, BounceNotification.class);

        System.out.println("Recipient to block!!! " + bounceNotification.getBounce().getBouncedRecipients().get(0).getEmailAddress());
        System.out.println("*********************************************************************************");
    }

    @SqsListener(value = "ComplaintMailQueue", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
    public void receiveComplaintMail(final @NotificationMessage String complaintJson) throws Exception {
        System.out.println("*********************************************************************************");
        System.out.println("Received complaint mail!!! " + complaintJson);

        //convert json string to object
        ComplaintNotification complaintNotification = this.getObjectMapper().readValue(complaintJson, ComplaintNotification.class);

        System.out.println("Recipient to block!!! " + complaintNotification.getComplaint().getComplainedRecipients().get(0).getEmailAddress());
        System.out.println("*********************************************************************************");
    }
}
