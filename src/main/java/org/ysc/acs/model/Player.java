package org.ysc.acs.model;

import org.ysc.acs.imports.model.ImportedStats;
import org.ysc.acs.imports.model.Participant;
import org.ysc.acs.mapping.ChampionMap;
import org.ysc.acs.mapping.PlayerPositionMap;

public class Player {
	private String name;
	private int championId;
	private String championName;
	private String position;
	private String team, opp;
	private String result; // Win/Loss

	private double adScore, dkScore, eSportsScore;

	public Player(Participant participant, String tournament, String year, String region, String gameId) {

		ImportedStats stats = participant.getStats();
		name = participant.getName();
		championId = participant.getChampionId();
		championName = ChampionMap.getChampionName(championId);
		position = PlayerPositionMap.getPlayerPosition(name, tournament, year, region, gameId).toString();
		team = participant.getTeam();
		opp = participant.getOpp();
		if (stats.isWin())
			result = "WIN";
		else
			result = "LOSS";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getChampionId() {
		return championId;
	}

	public void setChampionId(int championId) {
		this.championId = championId;
	}

	public String getChampionName() {
		return championName;
	}

	public void setChampionName(String championName) {
		this.championName = championName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getOpp() {
		return opp;
	}

	public void setOpp(String opp) {
		this.opp = opp;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public double getAdScore() {
		return adScore;
	}

	public void setAdScore(double adScore) {
		this.adScore = adScore;
	}

	public double getDkScore() {
		return dkScore;
	}

	public void setDkScore(double dkScore) {
		this.dkScore = dkScore;
	}

	public double geteSportsScore() {
		return eSportsScore;
	}

	public void seteSportsScore(double eSportsScore) {
		this.eSportsScore = eSportsScore;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", championId=" + championId + ", championName=" + championName + ", position="
				+ position + ", team=" + team + ", opp=" + opp + ", result=" + result + ", adScore=" + adScore
				+ ", dkScore=" + dkScore + ", eSportsScore=" + eSportsScore + "]";
	}

	

}
