package hundinkatze;

public class Hund extends Futter{
		public String Rasse;
		public int ID;
		public String ger�usch;
		public Hund(String rasse, int ID, String ger�usch, String essen) {
			super(essen);
			rasse = this.Rasse;
			ID = this.ID;
			ger�usch = this.ger�usch;
		}
	
}
