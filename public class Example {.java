public class PezDispenser {
	private String mCharacterName;
	
	public PezDispenser(String characterName) {
	
		mCharacterName = characterName;
	}
	
	public String getCharacterName() {
		return mCharacterName;
	}
}

public class Example {
    
    public static void main(String[] args) {
        
        System.out.println("We are making a new Pez dispenser");
			PezDispenser dispenser = new PezDispenser();
			System.out.printf("The dispenser character is %s\n", 
							  dispenser.getCharacterName());
    }
}
//treehouse