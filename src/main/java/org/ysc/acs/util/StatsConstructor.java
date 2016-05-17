package org.ysc.acs.util;

import org.ysc.acs.imports.model.ImportedStats;
import org.ysc.acs.imports.model.Team;
import org.ysc.calculator.model.Stats;

public class StatsConstructor {
	public static Stats constructPlayerStats(ImportedStats importedStats) {
		Stats stats = new Stats();
		stats.setKDA(importedStats.getKills(), importedStats.getDeaths(), importedStats.getAssists());
		stats.setCs(importedStats.getCreepScore());
		stats.setTriple(importedStats.getTripleKills());
		stats.setQuadra(importedStats.getQuadraKills());
		stats.setPenta(importedStats.getPentaKills());
		stats.updateStats();
		return stats;
	}

	public static Stats constructTeamStats(Team team, int gameDuration) {
		Stats stats = new Stats();
		stats.setBaron(team.getBaronKills());
		stats.setDragon(team.getDragonKills());
		stats.setFb(team.isFirstBlood());
		stats.setTurret(team.getTowerKills());
		stats.setWin(team.isWin());
		if (gameDuration > 3000)
			stats.setWin30(false);
		else
			stats.setWin30(true);
		return stats;
	}
}
