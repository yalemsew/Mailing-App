package MailingSystem;

public class ResultMap {
    private String stringValue;
    private double doubleValue;

    public ResultMap(String stringValue, double doubleValue) {
        this.stringValue = stringValue;
        this.doubleValue = doubleValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }
}
