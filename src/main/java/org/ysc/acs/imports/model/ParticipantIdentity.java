package org.ysc.acs.imports.model;

public class ParticipantIdentity {
	private int participantId;
	private ImportedPlayer player;

	public int getParticipantId() {
		return participantId;
	}

	public ImportedPlayer getPlayer() {
		return player;
	}

	@Override
	public String toString() {
		return "ParticipantIdentity [participantId=" + participantId
				+ ", player=" + player + "]";
	}

}
