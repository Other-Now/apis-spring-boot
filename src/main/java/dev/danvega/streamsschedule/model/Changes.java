package dev.danvega.streamsschedule.model;

public class Changes {
    private Value value;
    private String field;

    public Changes(Value value, String field) {
        this.value = value;
        this.field = field;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
