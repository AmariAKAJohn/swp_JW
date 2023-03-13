package hundinkatze;

public class Hund extends Futter{
		public String Rasse;
		public int ID;
		public String geräusch;
		public Hund(String rasse, int ID, String geräusch, String essen) {
			super(essen);
			rasse = this.Rasse;
			ID = this.ID;
			geräusch = this.geräusch;
		}
	
}
