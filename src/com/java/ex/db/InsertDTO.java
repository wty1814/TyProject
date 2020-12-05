package com.java.ex.db;

public class InsertDTO {
	private String Win;
	private String lose;
	private String score;
	public String getWin() {
		return Win;
	}
	public void setWin(String win) {
		Win = win;
	}
	public String getLose() {
		return lose;
	}
	public void setLose(String lose) {
		this.lose = lose;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
}
