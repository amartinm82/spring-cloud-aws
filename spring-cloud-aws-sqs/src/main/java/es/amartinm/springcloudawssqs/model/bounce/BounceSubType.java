package es.amartinm.springcloudawssqs.model.bounce;

public enum BounceSubType {

    Undetermined("Undetermined"),
    General("General"),
    NoEmail("NoEmail"),
    Suppressed("Suppressed"),
    MailboxFull("MailboxFull"),
    MessageTooLarge("MessageTooLarge"),
    ContentRejected("ContentRejected"),
    AttachmentRejected("AttachmentRejected");

    private String value;

    private BounceSubType(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }

    public static BounceSubType fromValue(String value) {
        if (value != null && !"".equals(value)) {
            BounceSubType[] var1 = values();
            int var2 = var1.length;

            for (int var3 = 0; var3 < var2; ++var3) {
                BounceSubType enumEntry = var1[var3];
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
