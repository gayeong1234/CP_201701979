package p3;

public class Student {
	private int _scoreKorean;
	private int _scoreEnglish;
	private int _scoreComputer;
	public Student()
	{
		this._scoreKorean = 0;
		this._scoreEnglish = 0;
		this._scoreComputer = 0;
	}
	public void setScoreKorean(int aScoreKorean)
	{
		this._scoreKorean = aScoreKorean;
	}
	public int scoreKorean()
	{
		return this._scoreKorean;
	}
	public char gradeKorean()
	{
		if (this._scoreKorean>=90) {
			return 'A';
		}
		else if (this._scoreKorean>=80) {
			return 'B';
		}
		else if (this._scoreKorean>=70) {
			return 'C';
		}
		else if (this._scoreKorean>=60) {
			return 'D';
		}
		else {
			return 'F';
		}
		
	}
	public void setScoreEnglish(int aScoreEnglish)
	{
		this._scoreEnglish = aScoreEnglish;
	}
	public int scoreEnglish()
	{
		return this._scoreEnglish;
	}
	public char gradeEnglish()
	{
		if (this._scoreEnglish>=90) {
			return 'A';
		}
		else if (this._scoreEnglish>=80) {
			return 'B';
		}
		else if (this._scoreEnglish>=70) {
			return 'C';
		}
		else if (this._scoreEnglish>=60) {
			return 'D';
		}
		else {
			return 'F';
		}
	}
	public void setScoreComputer(int aScoreComputer)
	{
		this._scoreComputer = aScoreComputer;
	}
	public int scoreComputer()
	{
		return this._scoreComputer;
	}
	public char gradeComputer()
	{
		if (this._scoreComputer>=90) {
			return 'A';
		}
		else if (this._scoreComputer>=80) {
			return 'B';
		}
		else if (this._scoreComputer>=70) {
			return 'C';
		}
		else if (this._scoreComputer>=60) {
			return 'D';
		}
		else {
			return 'F';
		}
	}
}
