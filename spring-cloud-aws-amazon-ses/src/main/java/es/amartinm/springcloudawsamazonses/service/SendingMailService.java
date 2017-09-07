package es.amartinm.springcloudawsamazonses.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class SendingMailService {

    private MailSender mailSender;

    @Autowired
    public SendingMailService(MailSender mailSender) {
        this.mailSender = mailSender;
    }


    public void sendMailMessage() {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
//        simpleMailMessage.setFrom("alvaro.martin@2getherbank.com");
//        simpleMailMessage.setTo("alvaro.martin@2getherbank.com");
//        simpleMailMessage.setSubject("Spring Boot Amazon SES (using Spring Cloud AWS) Test subject");
//        simpleMailMessage.setText("Spring Boot Amazon SES (using Spring Cloud AWS) Test content bounced");
//        this.mailSender.send(simpleMailMessage);

        simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("alvaro.martin@2getherbank.com");
        simpleMailMessage.setTo("bounce@simulator.amazonses.com");
        simpleMailMessage.setSubject("Spring Boot Amazon SES (using Spring Cloud AWS) Test subject");
        simpleMailMessage.setText("Spring Boot Amazon SES (using Spring Cloud AWS) Test content bounced");
        this.mailSender.send(simpleMailMessage);

        simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("alvaro.martin@2getherbank.com");
        simpleMailMessage.setTo("complaint@simulator.amazonses.com");
        simpleMailMessage.setSubject("Spring Boot Amazon SES (using Spring Cloud AWS) Test subject");
        simpleMailMessage.setText("Spring Boot Amazon SES (using Spring Cloud AWS) Test content complaint");
        this.mailSender.send(simpleMailMessage);
    }
}