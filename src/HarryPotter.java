


public class HarryPotter {

	private boolean cloakOn;
	
	HarryPotter() {
		System.out.println("making Harry Potter...");
	}

	void castSpell(String spell){
		System.out.println("casting spell: " + spell);
	}

	void makeInvisible(boolean invisible) {
		this.cloakOn = invisible;
		
		if (cloakOn)
			System.out.println("Harry is invisible");
		else
			System.out.println("Harry is visible");
	}

	void spyOnSnape() {
		System.out.println("Harry sees Professor Snape doing nefarious things.");
	}

	public static void main(String[] args) {
		// 1. make harry potter
		HarryPotter Wizard = new HarryPotter();
		
		
		// 2. become invisible
		Wizard.makeInvisible(true);
		
		
		// 3. spy on professor snape
			Wizard.spyOnSnape();
		
		
		// 4. become visible again
			Wizard.makeInvisible(false);
		
		// 5. cast a “stupefy” spell
			Wizard.castSpell("Stupefy");
	
	
	
	
	}
	
	
	

}