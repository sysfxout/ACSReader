package org.ysc.acs;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.ysc.acs.imports.model.ImportedStats;
import org.ysc.acs.imports.model.Match;
import org.ysc.acs.imports.model.Participant;
import org.ysc.acs.model.Player;
import org.ysc.acs.util.StatsConstructor;
import org.ysc.calculator.Calculator;
import org.ysc.calculator.mapping.ADConversionMap;
import org.ysc.calculator.mapping.DKConversionMap;
import org.ysc.calculator.mapping.ESportsConversionMap;
import org.ysc.calculator.model.Stats;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ACSReader {
	private Gson gson;
	private Match match;
	private String tournament, year, region, gameId;

	public ACSReader(String url, String tournament, String year, String region, String gameId)
			throws IOException, MalformedURLException {
		Reader reader = new InputStreamReader(new URL(url).openStream());
		gson = new GsonBuilder().create();
		match = gson.fromJson(reader, Match.class);
		this.tournament = tournament;
		this.year = year;
		this.region = region;
		this.gameId = gameId;

	}

	public ACSReader(FileReader fileReader, String tournament, String year, String region, String gameId) {
		Reader reader = fileReader;
		gson = new GsonBuilder().create();
		match = gson.fromJson(reader, Match.class);
		this.tournament = tournament;
		this.year = year;
		this.region = region;
		this.gameId = gameId;

	}

	public Match getMatch() {
		return match;
	}

	public List<Player> getPlayers() {
		List<Player> players = new ArrayList<Player>();
		match.updateParticipants();
		for (Participant participant : match.getParticipants()) {
			ImportedStats importedStats = participant.getStats();
			Stats stats = StatsConstructor.constructPlayerStats(importedStats);
			Player player = new Player(participant, tournament, year, region, gameId);
			
			Calculator calculator = new Calculator(new DKConversionMap(), stats);
			player.setDkScore(calculator.calcluate());
			
			calculator.setConversionMap(new ADConversionMap());
			player.setAdScore(calculator.calcluate());
			
			calculator.setConversionMap(new ESportsConversionMap());
			player.seteSportsScore(calculator.calcluate());
			
			players.add(player);
		}
		return players;
	}
}
