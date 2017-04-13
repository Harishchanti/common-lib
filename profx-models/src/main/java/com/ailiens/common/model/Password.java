package com.ailiens.common.model;

/**
 * Created by akki on 13/1/16.
 */
public class Password {

    boolean temporary, setTemporayPasswordLink;
    String value, type;

    public boolean isTemporary() {
        return temporary;
    }

    public void setTemporary(boolean temporary) {
        this.temporary = temporary;
    }

    public boolean isSetTemporayPasswordLink() {
        return setTemporayPasswordLink;
    }

    public void setSetTemporayPasswordLink(boolean setTemporayPasswordLink) {
        this.setTemporayPasswordLink = setTemporayPasswordLink;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Password{" +
                "temporary=" + temporary +
                ", setTemporayPasswordLink=" + setTemporayPasswordLink +
                ", value='" + value + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
