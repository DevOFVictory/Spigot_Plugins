package de.devofvictory.skykitpvp.objects;

public enum SuperPower {
	
		ENEMY_FREEZE("Gegner einfrieren"), BEE_ATTACK("Bienen beschw�ren"), HEALING_TREE("Heilungsbaum erschaffen"), PROTECTION_WALL("Schutzwand erstellen"), FIRE_RUNNER("Feuer unter den F��en"), 
		FIRE_BALL("Feuerball schie�en"), ARROW_RAIN("Pfeile regnen"), ENEMY_ROCKET("Gegner katapultieren"), WOLF_ATTACK("W�lfe beschw�ren"), TORNADO("Tornado beschw�ren"), 
		ENEMY_GRABBLER("Gegner heranziehen"), LIGHTNING("Blitze schleudern"), ENEMY_CONFUSE("Gegner verwirren"), NINJA("Charakter boosten"), RAMMING_ATTACK("Gegner zerstampfen"),
		BAT_DISGUISE("Fledermaus werden"), TELEPORT("Charakter teleportieren"), ENEMY_SWAP("Gegner tauschen");
		
		private String name;
		
		private SuperPower(final String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
	
	

}
