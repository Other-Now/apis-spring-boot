package dev.danvega.streamsschedule.model;

public class Contacts {
    private Profiless profile;

    private long wa_id;

    public Contacts(Profiless profile, long wa_id) {
        this.profile = profile;
        this.wa_id = wa_id;
    }

    public Profiless getProfile() {
        return profile;
    }

    public void setProfile(Profiless profile) {
        this.profile = profile;
    }

    public long getWa_id() {
        return wa_id;
    }

    public void setWa_id(long wa_id) {
        this.wa_id = wa_id;
    }
}
