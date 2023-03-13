package hundinkatze;

public class Katze extends Hund{
		public int schlafen;
	public Katze(int schlafen, String rasse, int ID, String geräusch, String essen) {
		super(rasse, ID, geräusch, essen);
		schlafen = this.schlafen;
		}
}
