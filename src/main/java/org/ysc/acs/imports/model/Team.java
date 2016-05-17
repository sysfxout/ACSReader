package org.ysc.acs.imports.model;

import java.util.ArrayList;
import java.util.List;

import org.ysc.acs.mapping.ChampionMap;

public class Team {
	private String teamId;
	private String win;
	private boolean firstBlood;
	private boolean firstTower, firstInhibitor, firstBaron, firstDragon, firstRiftHerald;
	private int towerKills, baronKills, dragonKills, riftHeraldKills;
	private List<Ban> bans;

	// User Defined
	public boolean isWin() {
		if (win.equalsIgnoreCase("win"))
			return true;
		return false;
	}

	// Getters/Setters
	public String getTeamId() {
		return teamId;
	}

	public String getWin() {
		if (win.equalsIgnoreCase("win"))
			return "Win";
		return "Loss";
	}

	public boolean isFirstBlood() {
		return firstBlood;
	}

	public int getTowerKills() {
		return towerKills;
	}

	public int getBaronKills() {
		return baronKills;
	}

	public int getDragonKills() {
		return dragonKills;
	}

	public List<Ban> getBans() {
		return bans;
	}

	public boolean isFirstTower() {
		return firstTower;
	}

	public boolean isFirstInhibitor() {
		return firstInhibitor;
	}

	public boolean isFirstBaron() {
		return firstBaron;
	}

	public boolean isFirstDragon() {
		return firstDragon;
	}

	public boolean isFirstRiftHerald() {
		return firstRiftHerald;
	}

	public int getRiftHeraldKills() {
		return riftHeraldKills;
	}

	public List<String> getBansAsNames() {
		List<String> stringBanList = new ArrayList<String>();
		for (Ban ban : bans) {
			stringBanList.add(ChampionMap.getChampionName(ban.getChampionId()));
		}
		return stringBanList;
	}

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", win=" + win + "]";
	}

}
