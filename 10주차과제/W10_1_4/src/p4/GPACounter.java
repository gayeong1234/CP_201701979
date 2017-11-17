package p4;

public class GPACounter {
	private int _numberOfGPA3;
	private int _numberOfGPA2;
	private int _numberOfGPA1;
	private int _numberOfGPA0;
	
	public GPACounter()
	{
		this._numberOfGPA3 = 0;
		this._numberOfGPA2 = 0;
		this._numberOfGPA1 = 0;
		this._numberOfGPA0 = 0;
	}
	
	public void count (double aGPA)
	{
		if(aGPA>=3.0) {
			this._numberOfGPA3++;
		}
		else if(aGPA>=2.0) {
			this._numberOfGPA2++;
		}
		else if(aGPA>=1.0) {
			this._numberOfGPA1++;
		}
		else {
			this._numberOfGPA0++;
		}
	}
}
