package es.amartinm.springcloudawssqs.model.bounce;

import java.util.Date;
import java.util.List;

public class Bounce {

    private BounceType bounceType;
    private BounceSubType bounceSubType;
    private List<BouncedRecipient> bouncedRecipients;
    private Date timestamp;
    private String feedbackId;
    // optional
    private String remoteMtaIp;
    private String reportingMTA;

    public Bounce() {
        super();
    }

    public Bounce(BounceType bounceType, BounceSubType bounceSubType,
                  List<BouncedRecipient> bouncedRecipients, Date timestamp,
                  String feedbackId, String remoteMtaIp,
                  String reportingMTA) {
        this.bounceType = bounceType;
        this.bounceSubType = bounceSubType;
        this.bouncedRecipients = bouncedRecipients;
        this.timestamp = timestamp;
        this.feedbackId = feedbackId;
        this.remoteMtaIp = remoteMtaIp;
        this.reportingMTA = reportingMTA;
    }

    public BounceType getBounceType() {
        return bounceType;
    }

    public void setBounceType(BounceType bounceType) {
        this.bounceType = bounceType;
    }

    public BounceSubType getBounceSubType() {
        return bounceSubType;
    }

    public void setBounceSubType(BounceSubType bounceSubType) {
        this.bounceSubType = bounceSubType;
    }

    public List<BouncedRecipient> getBouncedRecipients() {
        return bouncedRecipients;
    }

    public void setBouncedRecipients(List<BouncedRecipient> bouncedRecipients) {
        this.bouncedRecipients = bouncedRecipients;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(String feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getRemoteMtaIp() {
        return remoteMtaIp;
    }

    public void setRemoteMtaIp(String remoteMtaIp) {
        this.remoteMtaIp = remoteMtaIp;
    }

    public String getReportingMTA() {
        return reportingMTA;
    }

    public void setReportingMTA(String reportingMTA) {
        this.reportingMTA = reportingMTA;
    }
}