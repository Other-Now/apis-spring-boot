package dev.danvega.streamsschedule.model;

public class MetaData {
    private long display_phone_number;
    private long phone_number_id;

    public MetaData(long display_phone_number, long phone_number_id) {
        this.display_phone_number = display_phone_number;
        this.phone_number_id = phone_number_id;
    }

    public long getDisplay_phone_number() {
        return display_phone_number;
    }

    public void setDisplay_phone_number(long display_phone_number) {
        this.display_phone_number = display_phone_number;
    }

    public long getPhone_number_id() {
        return phone_number_id;
    }

    public void setPhone_number_id(long phone_number_id) {
        this.phone_number_id = phone_number_id;
    }
}
