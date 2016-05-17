package org.ysc.acs.imports.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.ysc.acs.mapping.ChampionMap;

public class Match {
	private int gameDuration; // time with ':' removed
	private String platformId;
	private String gameCreation; // epoch time
	private String gameVersion;
	private List<Team> teams;
	private List<Participant> participants;
	private List<ParticipantIdentity> participantIdentities;

	public int getGameDuration() {
		return gameDuration;
	}

	public String getGameVersion() {
		return gameVersion;
	}

	public void updateParticipants() {

		Map<String, String> teamMap = getTeamMap();
		for (ParticipantIdentity participantIdentity : participantIdentities) {
			for (Participant participant : participants) {
				if (participant.getParticipantId() == participantIdentity.getParticipantId()) {
					participant.setName(participantIdentity.getPlayer().getName());
					participant.setTeam(participantIdentity.getPlayer().getTeam());
					
					participant.setOpp(teamMap.get(participant.getOppId()));
					participant.setGameVersion(gameVersion);
					participant.setResult(getTeam(participant.getTeamId()).getWin());
					break;
				}
			}
		}
	}

	public Map<String, String> getTeamMap() {
		Map<String, String> teamMap = new HashMap<String, String>();
		String team1 = participantIdentities.get(0).getPlayer().getTeam();
		String teamId1 = participants.get(0).getTeamId();

		String team2 = participantIdentities.get(5).getPlayer().getTeam();
		String teamId2 = participants.get(5).getTeamId();

		teamMap.put(teamId1, team1);
		teamMap.put(teamId2, team2);
		return teamMap;
	}

	public Team getTeam(String teamId) {
		for (Team team : teams)
			if (team.getTeamId().equals(teamId))
				return team;
		return null;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public List<Participant> getParticipants() {
		return participants;
	}

	public List<ParticipantIdentity> getParticipantIdentities() {
		return participantIdentities;
	}

	@Override
	public String toString() {
		return "\n" + gameDuration + "\n" + teams + "\n" + participants + "\n" + participantIdentities;
	}

}
