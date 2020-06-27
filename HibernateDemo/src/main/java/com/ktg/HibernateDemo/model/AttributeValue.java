package com.ktg.HibernateDemo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(AttributeValueId.class)
public class AttributeValue implements Serializable {
    @Id
    private int eventId;
    @Id
    private String attrKey;
    @Id
    private String value;
    private String caption;

    public AttributeValue() {
    }

    public AttributeValue(int eventId, String attrKey, String value, String caption) {
        this.eventId = eventId;
        this.attrKey = attrKey;
        this.value = value;
        this.caption = caption;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getAttrKey() {
        return attrKey;
    }

    public void setAttrKey(String attrKey) {
        this.attrKey = attrKey;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

}

