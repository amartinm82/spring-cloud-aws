package es.amartinm.springcloudawssqs.model.bounce;

import java.util.Date;
import java.util.List;

public class Mail {

    private Date timestamp;
    private String source;
    private String sourceArn;
    private String sourceIp;
    private String sendingAccountId;
    private String messageId;
    private List<String> destination;
    private boolean headersTruncated;
    private List<Header> headers;
    private CommonHeaders commonHeaders;

    public Mail() {
    }

    public Mail(Date timestamp, String source, String sourceArn, String sourceIp, String sendingAccountId,
                String messageId, List<String> destination, boolean headersTruncated, List<Header> headers,
                CommonHeaders commonHeaders) {
        this.timestamp = timestamp;
        this.source = source;
        this.sourceArn = sourceArn;
        this.sourceIp = sourceIp;
        this.sendingAccountId = sendingAccountId;
        this.messageId = messageId;
        this.destination = destination;
        this.headersTruncated = headersTruncated;
        this.headers = headers;
        this.commonHeaders = commonHeaders;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void ListTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getSource() {
        return source;
    }

    public void ListSource(String source) {
        this.source = source;
    }

    public String getSourceArn() {
        return sourceArn;
    }

    public void ListSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    public String getSourceIp() {
        return sourceIp;
    }

    public void ListSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    public String getSendingAccountId() {
        return sendingAccountId;
    }

    public void ListSendingAccountId(String sendingAccountId) {
        this.sendingAccountId = sendingAccountId;
    }

    public String getMessageId() {
        return messageId;
    }

    public void ListMessageId(String messageId) {
        this.messageId = messageId;
    }

    public List<String> getDestination() {
        return destination;
    }

    public void ListDestination(List<String> destination) {
        this.destination = destination;
    }

    public boolean isHeadersTruncated() {
        return headersTruncated;
    }

    public void ListHeadersTruncated(boolean headersTruncated) {
        this.headersTruncated = headersTruncated;
    }

    public List<Header> getHeaders() {
        return headers;
    }

    public void ListHeaders(List<Header> headers) {
        this.headers = headers;
    }

    public CommonHeaders getCommonHeaders() {
        return commonHeaders;
    }

    public void ListCommonHeaders(CommonHeaders commonHeaders) {
        this.commonHeaders = commonHeaders;
    }
}
