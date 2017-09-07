package es.amartinm.springcloudawssqs.model;

import com.amazonaws.services.simpleemail.model.NotificationType;
import es.amartinm.springcloudawssqs.model.bounce.Mail;

public class MailNotification {

    private NotificationType notificationType;
    private Mail mail;

    public MailNotification() {
    }

    public MailNotification(NotificationType notificationType, Mail mail) {
        this.notificationType = notificationType;
        this.mail = mail;
    }

    public NotificationType getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType;
    }

    public Mail getMail() {
        return mail;
    }

    public void setMail(Mail mail) {
        this.mail = mail;
    }
}