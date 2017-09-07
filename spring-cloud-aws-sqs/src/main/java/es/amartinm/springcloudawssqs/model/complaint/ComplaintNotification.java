package es.amartinm.springcloudawssqs.model.complaint;

import com.amazonaws.services.simpleemail.model.NotificationType;
import es.amartinm.springcloudawssqs.model.MailNotification;
import es.amartinm.springcloudawssqs.model.bounce.Mail;

public class ComplaintNotification extends MailNotification {

    private Complaint complaint;

    public ComplaintNotification() {
    }

    public ComplaintNotification(NotificationType notificationType, Mail mail, Complaint complaint) {
        super(notificationType, mail);
        this.complaint = complaint;
    }

    public Complaint getComplaint() {
        return complaint;
    }

    public void setComplaint(Complaint complaint) {
        this.complaint = complaint;
    }
}
