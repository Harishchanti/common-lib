package com.ailiens.common.model;

import java.io.Serializable;

/**
 * Created by vaibhav on 19/10/15.
 */
public class EmailConfiguration extends NotificationConfiguration implements Serializable{
    /**
	 *
	 */
	private static final long serialVersionUID = 1824791511108468291L;

	@Override
    public String getType() {
        return super.getType();
    }

    @Override
    public void setType(String type) {
        super.setType(type);
    }

    @Override
    public boolean isNotification() {
        return super.isNotification();
    }

    @Override
    public void setNotification(boolean notification) {
        super.setNotification(notification);
    }

    @Override
    public String getCountPerMonth() {
        return super.getCountPerMonth();
    }

    @Override
    public void setCountPerMonth(String countPerMonth) {
        super.setCountPerMonth(countPerMonth);
    }

    @Override
    public String getCountPerWeek() {
        return super.getCountPerWeek();
    }

    @Override
    public void setCountPerWeek(String countPerWeek) {
        super.setCountPerWeek(countPerWeek);
    }

    @Override
    public String getCountPerDay() {
        return super.getCountPerDay();
    }

    @Override
    public void setCountPerDay(String countPerDay) {
        super.setCountPerDay(countPerDay);
    }
}
