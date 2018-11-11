
public class Stringovi { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//ulazni parametri // niz stringova
	
		String [] fajlovi = { "picture1.jpg",
				"text1.txt", 
				"picture2.png", 
				"text2.doc", 
				"picture3.gif"};
		
//resenje
		
		for(int i = 0; i < fajlovi.length; i++) {
			
			if(fajlovi[i].endsWith(".jpg")) {
				System.out.println("Fajl: " + fajlovi[i] + " - je tipa JPG");
			}
			
			//ostalo isto, za png i gif
		}
		
				
	}

}
