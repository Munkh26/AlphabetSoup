//Name: Munkhsoyombo Munkhbat
//Date: 09/24/2025
//Description: This program will get inputs from the user and the program will output those acccording to do the command given by the user.

public class Soup {
    //these are instance variables 
    private String letters;
    private String company;

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
    public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.

    //adds a word to the pool of letters known as "letters"
    public void add(String word){
        //precondition: place anything after add
        //poscondition: returns the letters with added words
        letters += word;
    }


    //Use Math.random() to get a random character from the letters string and return it.
    public char randomLetter(){
        //precondition: must have added some value into the letters then use randomLetter
        //poscondition: returns a random char from the letters
        int num = letters.length();
        int randomNum = (int) (Math.random() * num); 
        char randomCharacter = letters.charAt(randomNum);
        return randomCharacter;
    }


    //returns the letters currently stored with the company name placed directly in the center of all
    //the letters
    public String companyCentered(){
        //precondition: must have value in the letters, and also add the company name or the company name will be "none"
        //poscondition: returns first half of letters then company name then second half of letters 
        int num1 = (letters.length() / 2);
        String currentLetter = letters.substring(0, num1);
        currentLetter += company + letters.substring(num1);
        return currentLetter;
    }


    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    public void removeFirstVowel(){
        //precondition: have a value in letters or it gives you nothing
        //poscondition: it will remove the first vowel in the letters, and  if there is no vowel, it will have no effect.
        letters = letters.replaceFirst("[AEIUOaeiou]", "");
    }

    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    public void removeSome(int num){
        //precondition: User input never exceeds the length of the Letters
        //poscondition: it returns letters that got removed num letters from a random spot.
        int randomIndex = (int) (Math.random() * letters.length());
        letters = letters.replaceAll(letters.substring(randomIndex, randomIndex + num), "");
    }

    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    //precondition: put word that is in the letters if you wanna remove the word, but if word is not in letter then it will do nothing.
    //poscondition: removes the word the user gave from the letters. If the word is not in letters then it does nothing.
    public void removeWord(String word){
        int num = letters.indexOf(word);
        if (num >= 0) {
            letters = letters.replace(letters.substring(num, num + word.length()), "");
        }
    }
}
