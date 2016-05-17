package org.ysc.acs;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import org.junit.*;
import org.ysc.acs.mapping.ChampionMap;
import org.ysc.acs.mapping.PlayerPositionMap;
import org.ysc.acs.model.Player;




public class ACSReaderTest {

	private static List<Player> players;

	@BeforeClass
	public static void setupPlayers() {
		PlayerPositionMap.init();
		ChampionMap.init();
		
		String testFile = "src/test/testJson.json";
		String gameId = "W1D1G1";
		String season = "SPR16";
		String region = "NA";

		try {
			ACSReader reader = new ACSReader(new FileReader(testFile), season, region, gameId);
			players = reader.getPlayers();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testGamsu() {
		Player player = players.get(0);
		assertEquals(
				"Player [name=Gamsu, championId=2, championName=Olaf, position=TOP, team=FNC, opp=OG, result=WIN, adScore=34.91, dkScore=37.82, eSportsScore=24.91]",
				player.toString());
	}

	@Test
	public void testSpirit() {
		Player player = players.get(1);
		assertEquals(
				"Player [name=Spirit, championId=154, championName=Zac, position=JNG, team=FNC, opp=OG, result=WIN, adScore=37.46, dkScore=38.92, eSportsScore=28.46]",
				player.toString());
	}

	@Test
	public void testFebiven() {
		Player player = players.get(2);
		assertEquals(
				"Player [name=Febiven, championId=7, championName=LeBlanc, position=MID, team=FNC, opp=OG, result=WIN, adScore=35.06, dkScore=38.12, eSportsScore=27.06]",
				player.toString());
	}

	@Test
	public void testRekkles() {
		Player player = players.get(3);
		assertEquals(
				"Player [name=Rekkles, championId=236, championName=Lucian, position=ADC, team=FNC, opp=OG, result=WIN, adScore=31.9, dkScore=35.8, eSportsScore=24.4]",
				player.toString());
	}

	@Test
	public void testNoxiak() {
		Player player = players.get(4);
		assertEquals(
				"Player [name=Noxiak, championId=78, championName=Poppy, position=SUP, team=FNC, opp=OG, result=WIN, adScore=26.45, dkScore=26.9, eSportsScore=20.45]",
				player.toString());
	}

	@Test
	public void testSoaz() {
		Player player = players.get(5);
		assertEquals(
				"Player [name=sOAZ, championId=127, championName=Lissandra, position=TOP, team=OG, opp=FNC, result=LOSS, adScore=5.41, dkScore=7.82, eSportsScore=6.41]",
				player.toString());
	}

	@Test
	public void testAmazing() {
		Player player = players.get(6);
		assertEquals(
				"Player [name=Amazing, championId=64, championName=Lee Sin, position=JNG, team=OG, opp=FNC, result=LOSS, adScore=12.13, dkScore=13.26, eSportsScore=10.13]",
				player.toString());
	}

	@Test
	public void testPowerOfEvil() {
		Player player = players.get(7);
		assertEquals(
				"Player [name=PowerOfEvil, championId=61, championName=Orianna, position=MID, team=OG, opp=FNC, result=LOSS, adScore=17.240000000000002, dkScore=20.48, eSportsScore=13.74]",
				player.toString());
	}

	@Test
	public void testZven() {
		Player player = players.get(8);
		assertEquals(
				"Player [name=Zven, championId=81, championName=Ezreal, position=ADC, team=OG, opp=FNC, result=LOSS, adScore=11.25, dkScore=14.5, eSportsScore=9.75]",
				player.toString());
	}

	@Test
	public void testMithy() {
		Player player = players.get(9);
		assertEquals(
				"Player [name=Mithy, championId=48, championName=Trundle, position=SUP, team=OG, opp=FNC, result=LOSS, adScore=10.38, dkScore=10.76, eSportsScore=8.38]",
				player.toString());
	}

}
