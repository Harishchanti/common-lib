package com.ailiens.optimusprime.autobots.rest.dto;

import com.ailiens.optimusprime.domain.Consignment;
import com.ailiens.optimusprime.domain.Courier;

public class JsonResponseDTO {
 private Consignment con;
 private Courier cour;
public Consignment getCon() {
	return con;
}
public void setCon(Consignment con) {
	this.con = con;
}
public Courier getCour() {
	return cour;
}
public void setCour(Courier cour) {
	this.cour = cour;
}
public JsonResponseDTO(Consignment con, Courier cour) {
	super();
	this.con = con;
	this.cour = cour;
}


}
