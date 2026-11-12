import java.util.Scanner;

public class UserStory {

  // Priv instance variables 
  private String [] medication;
  private String [] outcome;

  // FileReaders to read 1D arrays
  public UserStory(String medicationFile, String outcomeFile){
    this.medication = FileReader.toStringArray(medicationFile);
    this.outcome = FileReader.toStringArray(outcomeFile);
  }


  // Returns both medication name and outcome
   public String toString() {
    String result = "Example Mental Health:\n";
    for (int i = 0; i < medication.length; i++) {
      result += "Name: " + medication[i] + " --- Outcome: " + outcome[i];
      result += "\n"; // new line
    }
    return result;
   }
}