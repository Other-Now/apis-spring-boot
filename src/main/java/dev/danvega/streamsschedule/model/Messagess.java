package dev.danvega.streamsschedule.model;
import java.sql.Time;
import java.sql.Timestamp;

public class Messagess {
    private   long from;
    private String id;
    private Timestamp timestamp;
    private String type;
    private Textt text;

    public Messagess(long from, String id, Timestamp timestamp, String type, Textt text) {
        this.from = from;
        this.id = id;
        this.timestamp = timestamp;
        this.type = type;
        this.text = text;
    }

    public long getFrom() {
        return from;
    }

    public void setFrom(long from) {
        this.from = from;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Textt getText() {
        return text;
    }

    public void setText(Textt text) {
        this.text = text;
    }
}
