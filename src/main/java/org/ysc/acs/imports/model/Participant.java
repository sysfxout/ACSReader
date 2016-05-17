package org.ysc.acs.imports.model;

import java.util.List;

public class Participant {
	private int participantId;
	private int championId;
	private String teamId;
	private ImportedStats stats;
	private int spell1Id, spell2Id;
	private List<Rune> runes;
	private List<Mastery> masteries;
	private Timeline timeline;

	// User defined
	private String name;
	private String team;
	private String opp;
	private String gameVersion;
	private String result;

	public String getOppId(){
		if(teamId.equals("100"))
			return "200";
		return "100";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getGameVersion() {
		return gameVersion;
	}

	public void setGameVersion(String gameVersion) {
		this.gameVersion = gameVersion;
	}
	
	

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public int getParticipantId() {
		return participantId;
	}

	public String getTeamId() {
		return teamId;
	}

	public int getChampionId() {
		return championId;
	}

	public ImportedStats getStats() {
		return stats;
	}

	public int getSpell1Id() {
		return spell1Id;
	}

	public int getSpell2Id() {
		return spell2Id;
	}

	public List<Rune> getRunes() {
		return runes;
	}

	public List<Mastery> getMasteries() {
		return masteries;
	}

	public Timeline getTimeline() {
		return timeline;
	}

	@Override
	public String toString() {
		return "Participant [participantId=" + participantId + ", teamId=" + teamId + ", stats=" + stats + "]";
	}

}
