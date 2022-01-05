package ReaderAndWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DatabaseReader { //handles the database of words
    TreeMap<String, String> wordsDatabase;

    public DatabaseReader(File wordsDatabaseFile){
        wordsDatabase = loadAllWords(wordsDatabaseFile);
    }

    public TreeMap<String,String> loadAllWords(File wordsDatabaseFile){
        TreeMap<String, String> wordsDatabaseTreeMap = new TreeMap<>();

        try{
            Scanner wordsReader = new Scanner(wordsDatabaseFile);
            while(wordsReader.hasNextLine()){
                //TODO finish
                String[] databaseLine = wordsReader.nextLine().split(":");
                String wordDutch = databaseLine[0];
                String wordEnglish = databaseLine[1];
                wordsDatabaseTreeMap.put(wordDutch,wordEnglish);
            }

            wordsReader.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

        return wordsDatabaseTreeMap;
    }


}
