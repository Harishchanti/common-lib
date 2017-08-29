
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.historyDTO;

import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class History {

    private String ffCenter;
    private String ffCenterId;
    private String fromState;
    private String toState;
    private String comment;
    private String reason;
    private String time;



    public String getFfCenterId() {
		return ffCenterId;
	}

	public void setFfCenterId(String ffCenterId) {
		this.ffCenterId = ffCenterId;
	}

	/**
     *
     * @return
     *     The ffCenter
     */
    public String getFfCenter() {
        return ffCenter;
    }

    /**
     *
     * @param ffCenter
     *     The ffCenter
     */
    public void setFfCenter(String ffCenter) {
        this.ffCenter = ffCenter;
    }

    /**
     *
     * @return
     *     The fromState
     */
    public String getFromState() {
        return fromState;
    }
    public History(){
        super();
    }


    /**
     *
     * @param fromState
     *     The fromState
     */
    public void setFromState(String fromState) {
        this.fromState = fromState;
    }

    /**
     *
     * @return
     *     The toState
     */
    public String getToState() {
        return toState;
    }

    /**
     *
     * @param toState
     *     The toState
     */
    public void setToState(String toState) {
        this.toState = toState;
    }

    /**
     *
     * @return
     *     The comment
     */
    public String getComment() {
        return comment;
    }

    /**
     *
     * @param comment
     *     The comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     *
     * @return
     *     The reason
     */
    public String getReason() {
        return reason;
    }

    /**
     *
     * @param reason
     *     The reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     *
     * @return
     *     The time
     */
    public String getTime() {
        return time;
    }

    /**
     *
     * @param time
     *     The time
     */
    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
