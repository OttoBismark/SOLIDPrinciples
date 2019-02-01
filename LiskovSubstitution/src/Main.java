public class Main
{
	public static void main(String[] args)
	{
//		Rettangolo ret = new Rettangolo(); /* Area del rettangolo = BASE * ALTEZZA */
		Rettangolo ret = new Quadrato(); /* Area del quadrato = LAT^2 */
		ret.setBase(10);
		ret.setAltezza(30);
		if(ret.Area() != 300)
		{
			System.out.println("C'è qualcosa che non va...");
		}
		else
		{
			System.out.println("Hai calcolato l'area del rettangolo");
		}
	}
}
