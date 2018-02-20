// Auteurs : Julien Cardinal, Paul Sasu

public class CV {
	
	private String nom;
	private String prenom;
	private String formation;
	private int expTrav;
	private String[] comps;
	private String attentes;
	
	public CV( String nom, String prenom, String formation, int expTrav, String[] comps, String attentes ) {		
		
		this.nom = nom;
		this.prenom = prenom;
		this.formation = formation;
		this.expTrav = expTrav;
		this.comps = comps;
		this.attentes = attentes;
		
	}

	public static void main( String[] args ) {
		
		String[] tabCompsJulien = { "Rigoureux", "Perfectionniste", "Ponctuel" };
		
		String[] tabCompsPaul = { "Ponctuel" };
		
		System.out.println( "Bienvenue chez Barette!" );
		
		CV julien = new CV( "Cardinal", "Julien", "\u00C9tudiant en informatique de gestion", 0, tabCompsJulien,
				"Savoir comment mieux documenter mes codes." );
		
		CV paul = new CV( "Sasu", "Paul", "\u00C9tudiant en informatique de gestion", 0, tabCompsPaul, "R\u00E9ussir" );
		
		julien.affiche();
		
		paul.affiche();
		
	}
	
	public void affiche() {
		
		System.out.println( "\nNom : " + nom );
		System.out.println( "Pr\u00E9nom : " + prenom );
		System.out.println( "Formation : " + formation );
		System.out.println( "Exp\u00E9rience de travail : " + expTrav + " ann\u00E9e(s)" );
		System.out.print( "Comp\u00E9tences : " );
		
		for ( String comp : comps ) {
			
			System.out.print( comp + ", " );
			
		}
		
		System.out.println();
		System.out.println( "Attentes : " + attentes );
		
	}

}
