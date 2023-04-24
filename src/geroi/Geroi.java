package geroi;

public class Geroi {
	private String cvqt;
	private String ime;
	private int vazrast;
	private double teglo;
    
    public Geroi(String i, String c, int v, double t) {
    	ime = i;
    	cvqt = c;
    	vazrast = v;
    	teglo = t;
    }
    
    public void Brumchi () {
    	System.out.println();
    	System.out.println("AZ sum " + ime + ".");
    	System.out.println("Cveta mi e " + cvqt + ".");
    	System.out.println("AZ sum na " + vazrast + " godini.");
    	System.out.println("Teja " + teglo + " kilograma.");
    }
    
    public void palimotor() {
    	System.out.println();
    	System.out.println("AZ sum " + ime + ".");
    	System.out.println("Cveta mi e " + cvqt + ".");
    	System.out.println("AZ sum na " + vazrast + " godini.");
    	System.out.println("Teja " + teglo + " kilograma.");
    }
    
    public void Opravqsiochilata() {
    	System.out.println();
    	System.out.println("AZ sum " + ime + ".");
    	System.out.println("Cveta mi e " + cvqt + ".");
    	System.out.println("AZ sum na " + vazrast + " godini.");
    	System.out.println("Teja " + teglo + " kilograma.");
    }
    public String getIme() {
	    return ime;
    }   
    public int getVazrast() {
	    return vazrast;
    }
    public double getTeglo() {
        return teglo;
    }
    
}
     



