package com.ailiens.common.model;

import java.io.Serializable;

/**
 * Created by vaibhav on 19/10/15.
 */
public class Anniversaries implements Serializable {

    /**
	 *
	 */
	private static final long serialVersionUID = -2033686034942238339L;

	private String linkedWith;

    private String date;

    private String type;

    public String getLinkedWith ()
    {
        return linkedWith;
    }

    public void setLinkedWith (String linkedWith)
    {
        this.linkedWith = linkedWith;
    }

    public String getDate ()
    {
        return date;
    }

    public void setDate (String date)
    {
        this.date = date;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [linkedWith = "+linkedWith+", date = "+date+", type = "+type+"]";
    }
}
