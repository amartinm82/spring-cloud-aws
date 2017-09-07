package es.amartinm.springcloudawssqs.model.complaint;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ComplaintFeedbackType {

    Abuse("abuse"),
    Auth("auth"),
    Fraud("fraud"),
    NotSpam("not-spam"),
    Other("other"),
    Virus("virus");

    private String value;

    @JsonValue
    public String getValue() {
        return value;
    }

    private ComplaintFeedbackType(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }

    public static ComplaintFeedbackType fromValue(String value) {
        if (value != null && !"".equals(value)) {
            ComplaintFeedbackType[] var1 = values();
            int var2 = var1.length;

            for (int var3 = 0; var3 < var2; ++var3) {
                ComplaintFeedbackType enumEntry = var1[var3];
                if (enumEntry.toString().equals(value)) {
                    return enumEntry;
                }
            }

            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        } else {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
    }
}
