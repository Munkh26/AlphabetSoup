//Name: Munkhsoyombo Munkhbat
//Date: 09/24/2025
//Description: 

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
        //precondition: must have value in the letters, and add the company name
        //poscondition: returns first half of letters then company name then second half of letters 
        int num1 = (letters.length() / 2);
        System.out.println(num1);
        String currentLetter = letters.substring(0, num1);
        currentLetter += company + letters.substring(num1);
        return currentLetter;
    }


    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    public void removeFirstVowel(){
        //int test1 = letters.indexOf("a");
        //int test2 = letters.indexOf("e");
        //int test3 = letters.indexOf("i");
        //int test4 = letters.indexOf("o");
        //int test5 = letters.indexOf("u");
        
    }

    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    public void removeSome(int num){
        //precondition: User input never exceeds the length of the Letters
        //poscondition: it returns letters that got removed num letters from a random spot
        int randomIndex = (int) (Math.random() * letters.length());
        String part1 = letters.substring(0, randomIndex);
        int num2 = num - randomIndex;
        String part2 = letters.substring(randomIndex + num2);
        letters = part1 + part2;
    }

    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    public void removeWord(String word){
        

    }
}
