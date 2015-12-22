package model;

public class Room_status {
	private int id;
	private int games_times;
	private int room_number;
	private int first;//0 is false;1 is true;
	private int lock_status;
	private int times;
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
	public int getRoom_number() {
		return room_number;
	}
	public void setRoom_number(int room_number) {
		this.room_number = room_number;
	}
	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public int getLock_status() {
		return lock_status;
	}
	public void setLock_status(int lock_status) {
		this.lock_status = lock_status;
	}
	public int getTimes() {
		return times;
	}
	public void setTimes(int times) {
		this.times = times;
	}
	
	
}
