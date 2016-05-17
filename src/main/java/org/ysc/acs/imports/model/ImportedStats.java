package org.ysc.acs.imports.model;

public class ImportedStats {
	private boolean win;
	private int item0, item1, item2, item3, item4, item5, item6;
	private int kills, deaths, assists;
	private int largestKillingSpree, largestMultiKill, killingSprees;
	private int longestTimeSpentLiving;
	private int doubleKills, tripleKills, quadraKills, pentaKills, unrealKills;
	private int totalDamageDealt, magicDamageDealt, physicalDamageDealt,
			trueDamagedealt;
	private int largestCriticalStrike;
	private int totalDamageDealtToChampions, magicDamageDealtToChampions,
			physicalDamageDealtToChampions;
	private int totalHeal, totalUnitsHealed;
	private int totalDamageTaken, magicalDamageTaken, physicalDamageTaken,
			trueDaamgeTaken;
	private int goldEarned, goldSpent;
	private int turretKills, inhibitorKills;
	private int totalMinionsKilled, neutralMinionsKilled,
			neutralMinionsKilledTeamJungle, neutralMinionsKilledEnemyJungle;
	private int totalTimeCrowdControlDealt;
	private int champLevel;
	private int visionWardsBoughtInGame, sightWardsBoughtInGame;
	private int wardsPlaced, wardsKilled;
	private boolean firstBloodKill, firstBloodAssist, firstTowerKill,
			firstTowerAssist, firstInhibitorKill, firstInhibitorAssist;

	public int getCreepScore(){
		return totalMinionsKilled+neutralMinionsKilled;
	}
	
	public boolean isWin() {
		return win;
	}

	public int getKills() {
		return kills;
	}

	public int getDeaths() {
		return deaths;
	}

	public int getAssists() {
		return assists;
	}

	public int getTripleKills() {
		return tripleKills;
	}

	public int getQuadraKills() {
		return quadraKills;
	}

	public int getPentaKills() {
		return pentaKills;
	}

	public int getTotalMinionsKilled() {
		return totalMinionsKilled;
	}

	public int getNeutralMinionsKilled() {
		return neutralMinionsKilled;
	}

	public int getItem0() {
		return item0;
	}

	public int getItem1() {
		return item1;
	}

	public int getItem2() {
		return item2;
	}

	public int getItem3() {
		return item3;
	}

	public int getItem4() {
		return item4;
	}

	public int getItem5() {
		return item5;
	}

	public int getItem6() {
		return item6;
	}

	public int getLargestKillingSpree() {
		return largestKillingSpree;
	}

	public int getLargestMultiKill() {
		return largestMultiKill;
	}

	public int getKillingSprees() {
		return killingSprees;
	}

	public int getLongestTimeSpentLiving() {
		return longestTimeSpentLiving;
	}

	public int getDoubleKills() {
		return doubleKills;
	}

	public int getUnrealKills() {
		return unrealKills;
	}

	public int getTotalDamageDealt() {
		return totalDamageDealt;
	}

	public int getMagicDamageDealt() {
		return magicDamageDealt;
	}

	public int getPhysicalDamageDealt() {
		return physicalDamageDealt;
	}

	public int getTrueDamagedealt() {
		return trueDamagedealt;
	}

	public int getLargestCriticalStrike() {
		return largestCriticalStrike;
	}

	public int getTotalDamageDealtToChampions() {
		return totalDamageDealtToChampions;
	}

	public int getMagicDamageDealtToChampions() {
		return magicDamageDealtToChampions;
	}

	public int getPhysicalDamageDealtToChampions() {
		return physicalDamageDealtToChampions;
	}

	public int getTotalHeal() {
		return totalHeal;
	}

	public int getTotalUnitsHealed() {
		return totalUnitsHealed;
	}

	public int getTotalDamageTaken() {
		return totalDamageTaken;
	}

	public int getMagicalDamageTaken() {
		return magicalDamageTaken;
	}

	public int getPhysicalDamageTaken() {
		return physicalDamageTaken;
	}

	public int getTrueDaamgeTaken() {
		return trueDaamgeTaken;
	}

	public int getGoldEarned() {
		return goldEarned;
	}

	public int getGoldSpent() {
		return goldSpent;
	}

	public int getTurretKills() {
		return turretKills;
	}

	public int getInhibitorKills() {
		return inhibitorKills;
	}

	public int getNeutralMinionsKilledTeamJungle() {
		return neutralMinionsKilledTeamJungle;
	}

	public int getNeutralMinionsKilledEnemyJungle() {
		return neutralMinionsKilledEnemyJungle;
	}

	public int getTotalTimeCrowdControlDealt() {
		return totalTimeCrowdControlDealt;
	}

	public int getChampLevel() {
		return champLevel;
	}

	public int getVisionWardsBoughtInGame() {
		return visionWardsBoughtInGame;
	}

	public int getSightWardsBoughtInGame() {
		return sightWardsBoughtInGame;
	}

	public int getWardsPlaced() {
		return wardsPlaced;
	}

	public int getWardsKilled() {
		return wardsKilled;
	}



	@Override
	public String toString() {
		return "Stats [kills=" + kills + ", deaths=" + deaths + ", assists="
				+ assists + ", tripleKills=" + tripleKills + ", quadraKills="
				+ quadraKills + ", pentaKills=" + pentaKills
				+ ", totalMinionsKilled=" + totalMinionsKilled + "]";
	}

}
