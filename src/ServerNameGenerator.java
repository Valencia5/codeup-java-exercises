public class ServerNameGenerator {
//        String[] adjectives = new String[10];

        String[] adjectives= {"adventurous", "bewildered", "bloody", "defiant", "energetic", "magnificent", "powerful", "stormy", "thankful", "wide-eyed"};
        String [] nouns= {"Mexico", "Texas", "Football", "Weights", "Neil deGrass Tyson", "MMA", "Joe Rogan", "Marine Corps", "Guns", "Motorcycles"};

        //create the method
    public static String getRandom(String[] arr) {
        int randomName= (int) (Math.random() * arr.length);
        return arr[randomName];
    }
public static void main(String [] args){
    String randomAdjective = getRandom(adjectives);
    String randomNoun = getRandom(nouns);

    System.out.println("Here is the name: ");
    System.out.printf("%s-%s", randomAdjective,randomNoun);
}
    }

