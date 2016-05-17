package org.ysc.acs.imports.model;

public class ImportedPlayer {
	private String summonerName;

	public String getSummonerName() {
		return summonerName;
	}
	
	public String getName(){
		return summonerName.substring(summonerName.indexOf(' '), summonerName.length()).trim();
	}
	
	public String getTeam(){
		return summonerName.substring(0, summonerName.indexOf(' ')).trim();
	}
	
	
	@Override
	public String toString() {
		return "Player [summonerName=" + summonerName + ", "+getName()+", "+getTeam() + "]";
	}

}
