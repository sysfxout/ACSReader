package org.ysc.acs.mapping;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.ysc.acs.file.model.PlayerPosition;

public class PlayerPositionMap {

	private static File positionDir;
	private static String workingFilename;
	private static final String POSITION_DIR = "PlayerPositions";

	public enum Position {
		TOP, JNG, MID, ADC, SUP, TEAM;
	}

	private static List<PlayerPosition> basePositionList = new ArrayList<PlayerPosition>();
	private static List<PlayerPosition> specialCasePositionList = new ArrayList<PlayerPosition>();

	public static void init() {
		positionDir = new File(POSITION_DIR);
		for (File file : positionDir.listFiles()) {
			if (file.getName().contains("SpecialCase")) {
				importSpecialCase(file);
			} else {
				workingFilename = file.getName().replace(".csv", "");
				importFile(file);
			}
		}
	}

	private static void importFile(File file) {
		InputStream is;
		BufferedReader br = null;
		try {
			is = new FileInputStream(file);
			br = new BufferedReader(new InputStreamReader(is));

			basePositionList = br.lines().map(mapBaseToPlayerPosition).collect(Collectors.toList());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void importSpecialCase(File file) {
		InputStream is;
		BufferedReader br = null;
		try {
			is = new FileInputStream(file);
			br = new BufferedReader(new InputStreamReader(is));
			specialCasePositionList = br.lines().map(mapSpecialToPlayerPosition).collect(Collectors.toList());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static Function<String, PlayerPosition> mapBaseToPlayerPosition = (line) -> {
		String[] parsedFilename = workingFilename.split("-");
		String[] s = line.split(",");
		return new PlayerPosition(s[0], s[1], parsedFilename[0], parsedFilename[1]);
	};

	private static Function<String, PlayerPosition> mapSpecialToPlayerPosition = (line) -> {
		String[] s = line.split(",");
		return new PlayerPosition(s[0], s[1], s[2], s[3], s[4]);
	};

	public static Position getPlayerPosition(String name, String season, String region, String gameId) {
		if (gameId != null && !gameId.equals(""))
			for (PlayerPosition playerPosition : specialCasePositionList) {
				if (playerPosition.getName().equalsIgnoreCase(name) && playerPosition.getSeason().equals(season)
						&& playerPosition.getRegion().equals(region) && playerPosition.getGameId().equals(gameId))
					return playerPosition.getPosition();
			}
		for (PlayerPosition playerPosition : basePositionList) {
			try {
				if (playerPosition.getName().equalsIgnoreCase(name) && playerPosition.getSeason().equals(season)
						&& playerPosition.getRegion().equals(region))
							return playerPosition.getPosition();
			} catch (NullPointerException e) {
				System.err.println(name+", "+season+", "+region+", "+gameId);
			}
		}
		return null;
	}

	public static List<PlayerPosition> getBasePositionList() {
		return basePositionList;
	}

	public static List<PlayerPosition> getSpecialCasePositionList() {
		return specialCasePositionList;
	}


}
