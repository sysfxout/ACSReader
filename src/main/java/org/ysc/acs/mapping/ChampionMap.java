package org.ysc.acs.mapping;

import java.util.HashMap;
import java.util.Map;

public class ChampionMap {
	private static Map<Integer, String> championMap = new HashMap<Integer, String>();

	public static void init() {
		championMap.put(412, "Thresh");
		championMap.put(266, "Aatrox");
		championMap.put(23, "Tryndamere");
		championMap.put(79, "Gragas");
		championMap.put(69, "Cassiopeia");
		championMap.put(13, "Ryze");
		championMap.put(78, "Poppy");
		championMap.put(14, "Sion");
		championMap.put(202, "Jhin");
		championMap.put(1, "Annie");
		championMap.put(111, "Nautilus");
		championMap.put(43, "Karma");
		championMap.put(99, "Lux");
		championMap.put(103, "Ahri");
		championMap.put(2, "Olaf");
		championMap.put(112, "Viktor");
		championMap.put(27, "Singed");
		championMap.put(86, "Garen");
		championMap.put(34, "Anivia");
		championMap.put(57, "Maokai");
		championMap.put(127, "Lissandra");
		championMap.put(25, "Morgana");
		championMap.put(105, "Fizz");
		championMap.put(28, "Evelynn");
		championMap.put(238, "Zed");
		championMap.put(74, "Heimerdinger");
		championMap.put(68, "Rumble");
		championMap.put(37, "Sona");
		championMap.put(82, "Mordekaiser");
		championMap.put(96, "Kog'Maw");
		championMap.put(55, "Katarina");
		championMap.put(117, "Lulu");
		championMap.put(22, "Ashe");
		championMap.put(30, "Karthus");
		championMap.put(12, "Alistar");
		championMap.put(122, "Darius");
		championMap.put(67, "Vayne");
		championMap.put(110, "Varus");
		championMap.put(77, "Udyr");
		championMap.put(89, "Leona");
		championMap.put(126, "Jayce");
		championMap.put(134, "Syndra");
		championMap.put(80, "Pantheon");
		championMap.put(92, "Riven");
		championMap.put(121, "Kha'Zix");
		championMap.put(42, "Corki");
		championMap.put(51, "Caitlyn");
		championMap.put(268, "Azir");
		championMap.put(76, "Nidalee");
		championMap.put(85, "Kennen");
		championMap.put(3, "Galio");
		championMap.put(45, "Veigar");
		championMap.put(432, "Bard");
		championMap.put(150, "Gnar");
		championMap.put(90, "Malzahar");
		championMap.put(104, "Graves");
		championMap.put(254, "Vi");
		championMap.put(10, "Kayle");
		championMap.put(39, "Irelia");
		championMap.put(64, "Lee Sin");
		championMap.put(420, "Illaoi");
		championMap.put(60, "Elise");
		championMap.put(106, "Volibear");
		championMap.put(20, "Nunu");
		championMap.put(4, "Twisted Fate");
		championMap.put(24, "Jax");
		championMap.put(102, "Shyvana");
		championMap.put(429, "Kalista");
		championMap.put(36, "Dr. Mundo");
		championMap.put(223, "Tahm Kench");
		championMap.put(131, "Diana");
		championMap.put(63, "Brand");
		championMap.put(113, "Sejuani");
		championMap.put(8, "Vladimir");
		championMap.put(154, "Zac");
		championMap.put(421, "Rek'Sai");
		championMap.put(133, "Quinn");
		championMap.put(84, "Akali");
		championMap.put(18, "Tristana");
		championMap.put(120, "Hecarim");
		championMap.put(15, "Sivir");
		championMap.put(236, "Lucian");
		championMap.put(107, "Rengar");
		championMap.put(19, "Warwick");
		championMap.put(72, "Skarner");
		championMap.put(54, "Malphite");
		championMap.put(157, "Yasuo");
		championMap.put(101, "Xerath");
		championMap.put(17, "Teemo");
		championMap.put(58, "Renekton");
		championMap.put(75, "Nasus");
		championMap.put(119, "Draven");
		championMap.put(35, "Shaco");
		championMap.put(50, "Swain");
		championMap.put(115, "Ziggs");
		championMap.put(91, "Talon");
		championMap.put(40, "Janna");
		championMap.put(245, "Ekko");
		championMap.put(61, "Orianna");
		championMap.put(114, "Fiora");
		championMap.put(9, "Fiddlesticks");
		championMap.put(33, "Rammus");
		championMap.put(31, "Cho'Gath");
		championMap.put(7, "LeBlanc");
		championMap.put(26, "Zilean");
		championMap.put(16, "Soraka");
		championMap.put(56, "Nocturne");
		championMap.put(222, "Jinx");
		championMap.put(83, "Yorick");
		championMap.put(6, "Urgot");
		championMap.put(203, "Kindred");
		championMap.put(21, "Miss Fortune");
		championMap.put(62, "Wukong");
		championMap.put(53, "Blitzcrank");
		championMap.put(98, "Shen");
		championMap.put(201, "Braum");
		championMap.put(5, "Xin Zhao");
		championMap.put(29, "Twitch");
		championMap.put(11, "Master Yi");
		championMap.put(44, "Taric");
		championMap.put(32, "Amumu");
		championMap.put(41, "Gangplank");
		championMap.put(48, "Trundle");
		championMap.put(38, "Kassadin");
		championMap.put(161, "Vel'Koz");
		championMap.put(143, "Zyra");
		championMap.put(267, "Nami");
		championMap.put(59, "Jarvan IV");
		championMap.put(81, "Ezreal");
		championMap.put(136, "Aurelion Sol");

	}

	public static String getChampionName(int championId) {

		return championMap.get(championId);
	}
	
	public static void main(String[]args){
		ChampionMap.init();
		System.out.println(ChampionMap.championMap.size());
	}
}
