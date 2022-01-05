package ReaderAndWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class DatabaseReader { //handles the database of words
    TreeMap<String, String> wordsDatabase; //K = word in dutch, V = word in english

    public DatabaseReader(File wordsDatabaseFile){
        wordsDatabase = loadAllWords(wordsDatabaseFile); //initialize the entire words database upon startup
    }

    public TreeMap<String,String> loadAllWords(File wordsDatabaseFile){
        TreeMap<String, String> wordsDatabaseTreeMap = new TreeMap<>();

        try{
            Scanner wordsReader = new Scanner(wordsDatabaseFile);
            while(wordsReader.hasNextLine()){
                //TODO if db has an empty first line?
                String databaseLine = wordsReader.nextLine();
                if(databaseLine.isEmpty()){
                    continue;
                } else {
                    String[] databaseLineSplit = databaseLine.split(":");
                    String wordDutch = databaseLineSplit[0];
                    String wordEnglish = databaseLineSplit[1];
                    wordsDatabaseTreeMap.put(wordDutch,wordEnglish);
                }
            }
            wordsReader.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

        return wordsDatabaseTreeMap;
    }

    public String translateDutchWord(String argDutchWord){ //K = word in dutch, V = word in english
        for (String dutchWordFromDb : wordsDatabase.keySet()) {
            if(dutchWordFromDb.trim().toLowerCase().equals(argDutchWord)){
                return wordsDatabase.get(dutchWordFromDb);
            }
        }
        return "";
    }

    public String translateEnglishWord(String argEnglishWord){ //K = word in dutch, V = word in english
        for (Map.Entry<String, String> wordsDatabaseEntry : wordsDatabase.entrySet()) {
            if(wordsDatabaseEntry.getValue().equals(argEnglishWord)){
                return wordsDatabaseEntry.getKey();
            }
        }

        return "";
    }

    public String generateRandomDutchWord(){ //K = word in dutch, V = word in english
        Set<String> keySet = wordsDatabase.keySet();
        List<String> keyList = new ArrayList<>(keySet);

        int size = keyList.size();
        int randIdx = new Random().nextInt(size);

        return keyList.get(randIdx);
    }

    public String generateRandomEnglishWord(){ //K = word in dutch, V = word in english
        Set<String> keySet = wordsDatabase.keySet();
        List<String > keyList = new ArrayList<>(keySet);

        int size = keyList.size();
        int randIdx = new Random().nextInt(size);

        String randomKey = keyList.get(randIdx);
        return wordsDatabase.get(randomKey);
    }
}
