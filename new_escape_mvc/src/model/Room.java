package model;

public class Room {
	private int id;
	private int games_times;
	private int number;
	private int clue;
	private int danger;
	private int safe;
	private int lock_status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
	public int getGames_times() {
		return games_times;
	}
	public void setGames_times(int games_times) {
		this.games_times = games_times;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getClue() {
		return clue;
	}
	public void setClue(int clue) {
		this.clue = clue;
	}
	public int getDanger() {
		return danger;
	}
	public void setDanger(int danger) {
		this.danger = danger;
	}
	public int getSafe() {
		return safe;
	}
	public void setSafe(int safe) {
		this.safe = safe;
	}
	public int getLock_status() {
		return lock_status;
	}
	public void setLock_status(int lock_status) {
		this.lock_status = lock_status;
	}
	
	
}
