import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter word:");
    String a = userInput.nextLine();
    userInput.close();
    a = a.toLowerCase();

    String b;
    String c;
    int comparison;
    int count = 1;

    for (int i = 0; i < a.length() - 1; i++) {
      b = a.substring(i, i+1);
      c = a.substring(i+1, i+2);
      comparison = c.compareTo(b);
      if (comparison >= 0) {
        count++;
      }
    }
    System.out.println(count);
  }
}