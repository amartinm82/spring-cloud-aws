package es.amartinm.springcloudawssqs.model.bounce;

import com.amazonaws.services.simpleemail.model.NotificationType;
import es.amartinm.springcloudawssqs.model.MailNotification;

public class BounceNotification extends MailNotification {

    private Bounce bounce;

    public BounceNotification() {
        super();
    }

    public BounceNotification(NotificationType notificationType, Mail mail,
                              Bounce bounce) {
        super(notificationType, mail);
        this.bounce = bounce;
    }

    public Bounce getBounce() {
        return bounce;
    }

    public void setBounce(Bounce bounce) {
        this.bounce = bounce;
    }
}