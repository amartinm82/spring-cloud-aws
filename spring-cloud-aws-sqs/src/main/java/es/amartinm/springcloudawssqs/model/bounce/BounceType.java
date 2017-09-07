package es.amartinm.springcloudawssqs.model.bounce;

public enum BounceType {

    Undetermined("Undetermined"),
    Permanent("Permanent"),
    Transient("Transient");

    private String value;

    private BounceType(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }

    public static BounceType fromValue(String value) {
        if (value != null && !"".equals(value)) {
            BounceType[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                BounceType enumEntry = var1[var3];
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