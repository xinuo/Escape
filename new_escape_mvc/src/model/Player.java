package model;

public class Player {
	private int id;
	private String user;
	private int number;
	private int games_times;
	private int key_number;
	private int clue;
	private int hp;
	private int stay_room;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getGames_times() {
		return games_times;
	}
	public void setGames_times(int games_times) {
		this.games_times = games_times;
	}
	public int getKey_number() {
		return key_number;
	}
	public void setKey_number(int key_number) {
		this.key_number = key_number;
	}
	public int getClue() {
		return clue;
	}
	public void setClue(int clue) {
		this.clue = clue;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getStay_room() {
		return stay_room;
	}
	public void setStay_room(int stay_room) {
		this.stay_room = stay_room;
	}
	
}
