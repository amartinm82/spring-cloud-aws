package es.amartinm.springcloudawssqs.model.complaint;

public class ComplainedRecipient {

    private String emailAddress;

    public ComplainedRecipient() {
    }

    public ComplainedRecipient(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
