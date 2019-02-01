public class Rettangolo
{
	private double base;
	private double altezza;

	public void setBase(double base)
	{
		this.base = base;
	}
	
	public void setAltezza(double altezza)
	{
		this.altezza = altezza;
	}
	
	public double getAltezza()
	{
		return altezza;
	}
	
	public double getBase()
	{
		return base;
	}
	
	public double Area()
	{
		return this.base * this.altezza;
	}
}
