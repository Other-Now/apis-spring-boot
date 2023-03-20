package dev.danvega.streamsschedule.model;

public class Value {
    private String messaging_product;
    private MetaData metaData;
    private Contacts contacts;
    private Messagess messages;

    public Value(String messaging_product, MetaData metaData, Contacts contacts, Messagess messages) {
        this.messaging_product = messaging_product;
        this.metaData = metaData;
        this.contacts = contacts;
        this.messages = messages;
    }

    public String getMessaging_product() {
        return messaging_product;
    }

    public void setMessaging_product(String messaging_product) {
        this.messaging_product = messaging_product;
    }

    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    public Contacts getContacts() {
        return contacts;
    }

    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }

    public Messagess getMessages() {
        return messages;
    }

    public void setMessages(Messagess messages) {
        this.messages = messages;
    }
}
