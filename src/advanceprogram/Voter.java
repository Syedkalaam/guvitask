package advanceprogram;

public class Voter {
	
	    private String voterId;
	    private String name;
	    private int age;

	    public Voter(String voterId, String name, int age) {
	        this.voterId = voterId;
	        this.name = name;
	        this.age = age;

	        if (age < 18) {
	            throw new IllegalArgumentException("Invalid age for voter. Age must be 18 or above.");
	        }
	    }

	    public String getVoterId() {
	        return voterId;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }
	}


