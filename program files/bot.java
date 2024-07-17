import java.util.* ;

class Requirements {
    public static boolean primenumber(int n){
        int count =0;
        for(int i=1;i<n;i++){
            if(n%i==0)
                count++;
        }
        return count == 2;
    }
    public static int digitcount(int n){
        if(n<10)
            return 1;
        else
            return 2;
    }

}



class Algorithm {
    public  void number() {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int randomIndex = random.nextInt(1, 100);
        int attempts = 5;
        System.out.println("Rules : I have chosen a number from 1-100 which means 1 and 100 is in the range. you are given 5 chances to guess that number. with each incorrect guess you are given hints to guess the number. Good luck !");
        while (attempts >= 0) {
            System.out.print("enter your guess : ");
            int guess = scan.nextInt();
            if (guess != randomIndex) {
                if (attempts == 5) {
                    if (randomIndex % 2 == 0 && randomIndex % 5 == 0)
                        System.out.println("the number is a multiple of 5 and is even");
                    else if (randomIndex % 2 == 0)
                        System.out.println("the number is an even number and is not a multiple of 5");
                    else if (randomIndex % 5 == 0)
                        System.out.println("the number is odd and divisible by 5 ");
                    else
                        System.out.println("the number is odd and is not divisible by 5");
                } else if (attempts == 4) {
                    System.out.println("the number when divided by 10 gives " + (randomIndex % 10) + " as a remainder. " + "\n" + "the number of digits in the number is " + (Requirements.digitcount(randomIndex)));

                } else if (attempts == 3) {
                    if (randomIndex < 50)
                        System.out.println("the number is less than 50");
                    else
                        System.out.println("the number is greater than 50. (maybe 50)");

                } else if (attempts == 2) {
                    if (randomIndex > 70)
                        System.out.println("the number is greater than 70");
                    else if (randomIndex > 50 && randomIndex <= 70)
                        System.out.println("the number is less than 70 or maybe 70");
                    else if (randomIndex < 50 && randomIndex < 30)
                        System.out.println("the number is less than 30");
                    else
                        System.out.println("the number is greater or equal to 30");
                    if (Requirements.primenumber(randomIndex))
                        System.out.println("the number is a prime number");
                    else
                        System.out.println("the number is not a prime number");
                } else if (attempts == 1) {
                    System.out.println("the square of the number when divided by 10 gives " + (randomIndex * randomIndex % 10) + " as remainder");

                } else {
                    System.out.println("the number is " + randomIndex);
                }
                attempts--;
            } else {
                System.out.println("you guessed it right ");
                break;
            }
        }
    }

    public void word(){
        String[] word = {"faith","fault","costs","cramp","clamp","candy","slaps","slabs","story","glory","flows","blows","bland","baker","bents","tents","short","shots","crops","stops","flops","flips","falls","wings","sting","style","bites"};
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int index = random.nextInt(word.length);
        int attempts = 5;
        String correct = word[index];
        System.out.println("Rules : I have chosen a word which has 5 letters in it. you have to guess it. with every guess I will provide which letter in your guess is present in the chosen word or not. Good luck!");
        while(attempts>=0){
          System.out.print("enter your guess : ");
            String guess = scan.nextLine();
          if(guess.equals(correct)){
              System.out.println("You guessed it right");
                break;
          }
          if(guess.length() == correct.length()){
              for(int i=0; i< guess.length();i++){
                  if(guess.charAt(i)==correct.charAt(i)){
                      System.out.println(guess.charAt(i)+" is in the correct place ");
                  }
                  else if(correct.contains(String.valueOf(guess.charAt(i)))){
                      System.out.println(guess.charAt(i)+" is present in the word but not in the correct place");

                  }
                  else
                      System.out.println(guess.charAt(i)+" is not in the word");
              }
          }
          else
              System.out.println("your guess should be of 5 letters");
          attempts--;
        }
    }

    public void object(){
HashMap<String, String[]> objectsAndHints = new HashMap<>();

objectsAndHints.put("Button", new String[]{
    "It is often pushed to activate something.",
    "It can be found on clothing or electronic devices.",
    "It comes in various shapes, sizes, and materials.",
    "It may have decorative elements.",
    "It can be used to make a selection."
});

objectsAndHints.put("Ice Cube", new String[]{
    "It is cold and melts in warm temperatures.",
    "It can be used to cool drinks.",
    "It is made by freezing water.",
    "It can be transparent or cloudy.",
    "It can be crushed or shaved."
});

objectsAndHints.put("Smoke Detector", new String[]{
    "It beeps to warn of smoke or fire.",
    "It is usually mounted on the ceiling.",
    "It runs on batteries or electricity.",
    "It can save lives by alerting people to danger.",
    "It should be tested regularly."
});

objectsAndHints.put("Tennis Ball", new String[]{
    "It is used for playing tennis.",
    "It is hollow and covered with felt.",
    "It can bounce high.",
    "It comes in yellow or green color (typically).",
    "It needs a racket to be hit."
});

objectsAndHints.put("Comb", new String[]{
    "It is used to style and detangle hair.",
    "It has rows of fine teeth.",
    "It can be made of plastic, metal, or wood.",
    "It comes in various sizes and shapes.",
    "It can be used on wet or dry hair."
});

objectsAndHints.put("Net (Fishing Net)", new String[]{
    "It is used to catch fish or other aquatic animals.",
    "It is made of mesh material with holes.",
    "It can be cast or thrown into water.",
    "It traps animals by entanglement.",
    "It comes in various sizes and designs."
});

objectsAndHints.put("Newspaper", new String[]{
    "It contains news articles and information.",
    "It is usually printed on paper.",
    "It can be delivered daily or weekly.",
    "It may also include advertisements.",
    "It can be recycled after use."
});

objectsAndHints.put("Forklift", new String[]{
    "It is used to lift and move heavy objects.",
    "It has forks at the front for lifting.",
    "It can be powered by electricity, gas, or diesel.",
    "It is commonly used in warehouses and factories.",
    "It requires a skilled operator."
});

objectsAndHints.put("Stapler", new String[]{
    "It is used to fasten sheets of paper together.",
    "It uses staples, which are metal pins.",
    "It requires pressure to operate.",
    "It comes in various sizes and designs.",
    "It is a common office supply."
});

objectsAndHints.put("Sandal", new String[]{
    "It is a type of open-toed footwear.",
    "It is usually worn in warm weather.",
    "It can be made of leather, rubber, or other materials.",
    "It provides comfort and ventilation for the feet.",
    "It comes in various styles for different occasions."
});

objectsAndHints.put("Microwave", new String[]{
    "It is used to heat food quickly.",
    "It uses electricity and electromagnetic waves.",
    "It has a timer to control cooking time.",
    "It is a common kitchen appliance.",
    "It can also be used for defrosting or reheating food."
});

objectsAndHints.put("Eraser", new String[]{
    "It is used to remove pencil marks from paper.",
    "It can be made of rubber or other materials.",
    "It comes in various shapes and sizes.",
    "It is a common school and office supply.",
    "It can be used lightly to avoid damaging the paper."
});

objectsAndHints.put("Keychain", new String[]{
    "It holds keys together for easy organization.",
    "It can be attached to a belt loop or bag.",
    "It can be made of metal, leather, plastic, or other materials.",
    "It may have decorative elements like keyrings or charms.",
    "It helps to prevent losing keys."
});


objectsAndHints.put("Suitcase", new String[]{
    "It is used for travel to carry clothes and belongings.",
    "It has a hard or soft shell for protection.",
    "It comes in various sizes for different travel needs.",
    "It may have wheels for easy transport.",
    "It can be locked for security.",
    "It is a common travel accessory."
});

objectsAndHints.put("Thermometer", new String[]{
    "It measures temperature.",
    "It can be used for body temperature, weather, or cooking.",
    "It may be digital or contain mercury (be careful).",
    "It displays temperature in degrees (Celsius or Fahrenheit).",
    "It is a useful tool for monitoring various temperatures."
});

objectsAndHints.put("Light Switch", new String[]{
    "It turns lights on and off.",
    "It is mounted on the wall for easy access.",
    "It comes in various styles, like rockers or toggles.",
    "It is connected to the electrical wiring.",
    "It is a basic component of lighting control."
});

objectsAndHints.put("Paintbrush", new String[]{
    "It is used for painting with liquid paint.",
    "It has bristles for holding and applying paint.",
    "It comes in different sizes and shapes for various techniques.",
    "It can be used with different types of paint and canvas.",
    "It requires cleaning after use."
});

objectsAndHints.put("Webcam", new String[]{
    "It captures video and images through a computer.",
    "It has a lens for focusing the image.",
    "It is often used for video calls or conferences.",
    "It can be built-in to a computer or be an external device.",
    "It may require additional software for functionality."
});

       Random random = new Random();
        ArrayList<String> objectList = new ArrayList<>(objectsAndHints.keySet()); // Convert HashMap keys to a list
        String object = objectList.get(random.nextInt(objectList.size())); // Get random object from list

        Scanner scanner = new Scanner(System.in);

        int chances = 5;
        int hintIndex = 1;

        System.out.println("Welcome to the Object Guessing Game!");
        String preGameHint = objectsAndHints.get(object)[0];  // Get the first hint for pre-game
        System.out.println("First hint: " + preGameHint); // Display the first hint

        while (chances > 0) {
            System.out.printf("Guess (%d chances left): ", chances);
            String guess = scanner.nextLine().toLowerCase();

            if (guess.equalsIgnoreCase(object)) {
                System.out.println("Congratulations! You guessed the object correctly.");
                break;
            } else {
                chances--;

                if (hintIndex < objectsAndHints.get(object).length) {
                    System.out.println("Hint " + (hintIndex + 1) + ": " + objectsAndHints.get(object)[hintIndex]);
                    hintIndex++;
                } else {
                    System.out.println("No more hints available.");
                }

                if (chances == 0) {
                    System.out.println("You ran out of chances. The object was: " + object);
                }
            }
        }

        //scanner.close();
    }


}















class Interaction {
    public  static String username;

    Interaction(String s){
        username =s;
    }

    public   void choice(String answer){
        Algorithm algo = new Algorithm();
        switch (answer) {
            case "/word" -> algo.word();
            case "/number" -> algo.number();
            case "/object" -> algo.object();
            default -> {
                Scanner sc = new Scanner(System.in);
                System.out.println("enter a correct option ");
                String s = sc.nextLine();
                choice(s);
            }
        }
    }



    public  void interaction(){
        Scanner sc = new Scanner(System.in);
        System.out.println("hey "+ username+" ! wanna play a game ? (yes /no)");
        String reply = sc.nextLine();
        if(reply.equalsIgnoreCase("yes")) {
            System.out.println("these are the games I can help you play with");
            System.out.println(" 1. guess the word game - command is /word \n 2.  guess the number game - command is /number \n 3. guess the object name - command is /object ");
            System.out.println("what game do you want to play ? ");
            String answer = sc.nextLine();
            choice(answer);
            while(true){
                System.out.println("Do you want to play again? (yes/no)");
                String kys = sc.nextLine();
                if(kys.equalsIgnoreCase("yes")){
                    System.out.println("please name the game by command ");
                    String okay = sc.nextLine();
                    choice(okay);
                }
                else{
                    System.out.println("okay , feel free to use me anytime , bye !");
                    break;
                }

            }
        }
        else if(reply.equalsIgnoreCase("no"))
            System.out.println("okay , see you later");
        else
            System.out.println("what? I'm taking it as no then");

    }



}

class Executable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hey user, what should I call you ? ");
        String name = sc.nextLine();
        Interaction interact = new Interaction(name);
        interact.interaction();

    }
}

