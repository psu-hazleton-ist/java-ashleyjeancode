package ica1;

public class Convert {

	private double meters;
	
	public Convert() {
		new Convert(5.0);
	}
	
	public Convert(double meters)
	{
		this.meters = meters;
	}
	
	public double getKilometers()
	{
		return this.meters * 0.001;
	}
	
	public double getMeters()
	{
		return this.meters;
	}
	
	public double getInches()
	{
		return this.meters * 39.37;
	}
	
	public double getFeet()
	{
		return this.meters * 3.282;
	}
	
	
}
