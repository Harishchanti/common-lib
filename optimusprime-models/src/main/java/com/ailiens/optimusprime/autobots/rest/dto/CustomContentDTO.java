package com.ailiens.optimusprime.autobots.rest.dto;

public class CustomContentDTO {
    private String id;
    private Object object;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "CustomContentDTO{" +
            "id='" + id + '\'' +
            ", object=" + object +
            '}';
    }
}
