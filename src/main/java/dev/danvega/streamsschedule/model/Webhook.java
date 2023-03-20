package dev.danvega.streamsschedule.model;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Webhook {
    private String object;
    private List<Entryy> entry= new ArrayList<>();

    public Webhook(String object, List<Entryy> entry) {
        this.object = object;
        this.entry = entry;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public List<Entryy> getEntry() {
        return entry;
    }

    public void setEntry(List<Entryy> entry) {
        this.entry = entry;
    }
}
