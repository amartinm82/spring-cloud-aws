package es.amartinm.springcloudawssqs.model.complaint;

import java.util.Date;
import java.util.List;

public class Complaint {

    private List<ComplainedRecipient> complainedRecipients;
    private String timestamp;
    private String feedbackId;
    //optional
    private String userAgent;
    private ComplaintFeedbackType complaintFeedbackType;
    private Date arrivalDate;

    public Complaint() {
    }

    public Complaint(List<ComplainedRecipient> complainedRecipients, String timestamp, String feedbackId,
                     String userAgent, ComplaintFeedbackType complaintFeedbackType, Date arrivalDate) {
        this.complainedRecipients = complainedRecipients;
        this.timestamp = timestamp;
        this.feedbackId = feedbackId;
        this.userAgent = userAgent;
        this.complaintFeedbackType = complaintFeedbackType;
        this.arrivalDate = arrivalDate;
    }

    public List<ComplainedRecipient> getComplainedRecipients() {
        return complainedRecipients;
    }

    public void setComplainedRecipients(List<ComplainedRecipient> complainedRecipients) {
        this.complainedRecipients = complainedRecipients;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(String feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public ComplaintFeedbackType getComplaintFeedbackType() {
        return complaintFeedbackType;
    }

    public void setComplaintFeedbackType(ComplaintFeedbackType complaintFeedbackType) {
        this.complaintFeedbackType = complaintFeedbackType;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
}
