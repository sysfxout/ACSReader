package org.ysc.acs.file.model;

import org.ysc.acs.mapping.PlayerPositionMap.Position;

public class PlayerPosition {
	private String tournament;
	private String year;
	private String region;
	private String name;
	private String gameId;
	private Position position;

	public PlayerPosition(String name, String position, String tournament, String year, String region) {
		this.position = Position.valueOf(position);
		this.name = name;
		this.tournament = tournament;
		this.year = year;
		this.region = region;
	}

	public PlayerPosition(String name, String position, String tournament, String year, String region, String gameId) {
		this.name = name;
		this.position = Position.valueOf(position);
		this.tournament = tournament;
		this.year = year;
		this.region = region;
		this.gameId = gameId;
	}

	

	public String getTournament() {
		return tournament;
	}

	public void setTournament(String tournament) {
		this.tournament = tournament;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

}
