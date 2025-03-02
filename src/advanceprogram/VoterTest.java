package advanceprogram;

public class VoterTest {
	
	    public static void main(String[] args) {
	        try {
	            Voter voter1 = new Voter("V101", "John Doe", 17);
	        } catch (IllegalArgumentException e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	        try {
	            Voter voter2 = new Voter("V102", "Alice Smith", 20);
	            System.out.println("Voter " + voter2.getName() + " with Voter ID " + voter2.getVoterId() + " has been successfully registered.");
	        } catch (IllegalArgumentException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}

