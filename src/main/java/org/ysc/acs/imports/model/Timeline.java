package org.ysc.acs.imports.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Timeline {
	String role, lane;
	private static Logger logger = LogManager.getLogger(Timeline.class.getName());
	public String getLane() {
		convertRole();
		convertLane();
		return lane;
	}

	private void convertRole() {
		switch (role) {
		case "DUO_SUPPORT":
			role = "SUP";
			break;
		case "DUO_CARRY":
			role = "ADC";
			break;
		}
	}

	private void convertLane() {
		switch (lane) {
		case "BOTTOM":
			lane = role;
			break;
		case "MIDDLE":
			lane = "MID";
			break;
		case "JUNGLE":
			lane = "JNG";
			break;
		case "TOP":
			switch (role) {
			case "SUP":
			case "ADC":
				logger.debug("TOP => SUP/ADC");
				lane = role;
				break;
			}
			break;
		}
	}
}
