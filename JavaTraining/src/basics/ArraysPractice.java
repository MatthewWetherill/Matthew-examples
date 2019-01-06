package basics;

public class ArraysPractice {

	public static void main(String[] args) {
		
		/*
		String[] footballTeams = {"Man City", "Man Utd", "Chelsea", "Liverpool", "Tottenham", "Arsenal"};
		
		
		for (int i = 0; i < footballTeams.length; i++) {
			System.out.println("TOP 6 TEAM: " + footballTeams[i]);
		}
		*/
		/*
		int j = 0;
		boolean foundChamps = false;
		while (!foundChamps && j < footballTeams.length) {
			String team = footballTeams[j];
			System.out.println(team);
			if (team == "Liverpool") {
				System.out.println("CHAMPIONS!");
			}
		    j++;
		}
        */
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for (int k = 0; k < numbers.length; k++) {
			int squared = numbers[k] * numbers[k];
			System.out.println(numbers[k] + " squared = " + squared);
		}
		
	}

}
