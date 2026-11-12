public class DataRunner {

  /**
   * Creates a UserStory object using the medication
   * and outcome files, then prints the information.
   */
  public static void main(String[] args) {

    UserStory hi = new UserStory("medication.txt", "outcome.txt");

    // Prints the medication names and outcomes.
    System.out.println(hi);
  }
}
