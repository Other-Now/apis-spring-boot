package dev.danvega.streamsschedule.model;

import java.util.ArrayList;
import java.util.List;

public class Entryy {
    private String id;
    private List<Changes> changes= new ArrayList<>();

    public Entryy(String id, List<Changes> changes) {
        this.id = id;
        this.changes = changes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Changes> getChanges() {
        return changes;
    }

    public void setChanges(List<Changes> changes) {
        this.changes = changes;
    }
}
