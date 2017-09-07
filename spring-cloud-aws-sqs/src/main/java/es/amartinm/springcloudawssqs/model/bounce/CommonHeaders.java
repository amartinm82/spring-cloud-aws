package es.amartinm.springcloudawssqs.model.bounce;

import java.util.List;

public class CommonHeaders {

    private List<String> from;
    private List<String> to;
    private String subject;

    public CommonHeaders() {
    }

    public CommonHeaders(List<String> from, List<String> to, String subject) {
        this.from = from;
        this.to = to;
        this.subject = subject;
    }

    public List<String> getFrom() {
        return from;
    }

    public void setFrom(List<String> from) {
        this.from = from;
    }

    public List<String> getTo() {
        return to;
    }

    public void setTo(List<String> to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
