package ReaderAndWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DatabaseWriter { //writes words into the database

    //create words DB if needed
    public void createWordDatabase() {
        File wordsDatabase = new File("words_database.txt");

        try {
            wordsDatabase.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //write new entry
    public void writeWordIntoDatabase(File wordsDatabase, String wordDutch, String wordEnglish) { //TODO empty words must be handled somehow

        try {
            FileWriter writer = new FileWriter(wordsDatabase);
            writer.write("%n" + wordDutch + ":" + wordEnglish);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
