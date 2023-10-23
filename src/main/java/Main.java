import models.NoteController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter note");
        String userInput = scanner.nextLine();
        NoteController noteController = new NoteController();
        noteController.writeToFile(userInput);
    }
}
