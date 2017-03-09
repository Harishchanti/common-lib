package com.ailiens.optimusprime.autobots.rest.dto.n3ow.quicksilver;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class CreateJobRequestDTO {

	private String command;
	private String schedule;
	private String owner;

	/**
	 *
	 * @return
	 * The command
	 */
	public String getCommand() {
		return command;
	}

	public CreateJobRequestDTO(){

	}
	/**
	 *
	 * @param command
	 * The command
	 */
	public void setCommand(String command) {
		this.command = command;
	}

	/**
	 *
	 * @return
	 * The schedule
	 */
	public String getSchedule() {
		return schedule;
	}

	/**
	 *
	 * @param schedule
	 * The schedule
	 */
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	/**
	 *
	 * @return
	 * The owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 *
	 * @param owner
	 * The owner
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

}
