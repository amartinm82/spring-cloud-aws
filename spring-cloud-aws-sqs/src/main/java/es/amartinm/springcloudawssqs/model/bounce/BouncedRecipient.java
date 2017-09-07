package es.amartinm.springcloudawssqs.model.bounce;

public class BouncedRecipient {

    private String emailAddress;
    private String action;
    private String status;
    private String diagnosticCode;

    public BouncedRecipient() {
    }

    public BouncedRecipient(String emailAddress, String action, String status, String diagnosticCode) {
        this.emailAddress = emailAddress;
        this.action = action;
        this.status = status;
        this.diagnosticCode = diagnosticCode;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDiagnosticCode() {
        return diagnosticCode;
    }

    public void setDiagnosticCode(String diagnosticCode) {
        this.diagnosticCode = diagnosticCode;
    }
}