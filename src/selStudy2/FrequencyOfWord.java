package selStudy2;

public class FrequencyOfWord {


    public static void main(String[] args) {
        System.out.println(frequency("Java java jAvA", "java"));
    }
    public static int frequency(String sentence, String word){
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        int frequencyWord = 0;

      while (sentence.contains(word)){
          frequencyWord++;
          sentence = sentence.replaceFirst(word, "");
      }

return frequencyWord;

    }




}
/*

6. Create a method named frequencyOfWord that takes two arguments:
            1. sentence (String)
            2. word (String)

    The method should return the frequency of the word from the sentence

        Ex:
            frequencyOfWord("Java java jAvA", "java")  ==> 4
 */