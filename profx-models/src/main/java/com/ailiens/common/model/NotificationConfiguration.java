package com.ailiens.common.model;

import com.ailiens.common.model.Deserializer.NotificationConfigurationDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.io.Serializable;

/**
 * Created by vaibhav on 18/11/15.
 */
@JsonDeserialize(using = NotificationConfigurationDeserializer.class)
public class NotificationConfiguration implements Serializable{

    /**
	 *
	 */
	private static final long serialVersionUID = 9054649290867743587L;

	public boolean notification;

    public String countPerMonth;

    public String countPerWeek;

    public String countPerDay;

    public String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isNotification() {
        return notification;
    }

    public void setNotification(boolean notification) {
        this.notification = notification;
    }

    public String getCountPerMonth() {
        return countPerMonth;
    }

    public void setCountPerMonth(String countPerMonth) {
        this.countPerMonth = countPerMonth;
    }

    public String getCountPerWeek() {
        return countPerWeek;
    }

    public void setCountPerWeek(String countPerWeek) {
        this.countPerWeek = countPerWeek;
    }

    public String getCountPerDay() {
        return countPerDay;
    }

    public void setCountPerDay(String countPerDay) {
        this.countPerDay = countPerDay;
    }
}
