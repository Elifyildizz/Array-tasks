import java.util.*;

public class TriviaGame {
    public static void main(String[] args) {
        System.out.println("Welcome to our trivia.\nYou have to answer 10 multiple question.\nIf you answer correctly, you will get 10 points for each question.\nIf you answer incorrectly, you will lose 5 points for each question.");

        Scanner scanner = new Scanner(System.in);
        Map<String, String> questionsAnswers = new HashMap<>();
        questionsAnswers.put("What is the longest river in the world?\nAnswer:", "nile");
        questionsAnswers.put("What is the biggest planet in our solar system?\nAnswer:", "jupiter");
        questionsAnswers.put("What is the largest organ in the human body?\nAnswer:", "skin");
        questionsAnswers.put("What is the highest mountain in the world?\nAnswer:", "everest");
        questionsAnswers.put("What is the 4 letter mineral that every living thing needs?\nAnswer:", "salt");
        questionsAnswers.put("What is the contrasting color of white?\nAnswer:", "black");
        questionsAnswers.put("What is the color of blood?\nAnswer:", "Red");
        questionsAnswers.put("What is the most common element in the universe?\nAnswer:", "carbon");
        questionsAnswers.put("Who invented telephone?\nAnswer:", "graham bell");
        questionsAnswers.put("What is the unit of electric?\nAnswer:", "watt");

        int totalPoints = questionsAnswers.size() * 10;

        int userScore = questionsAnswers.entrySet().stream()
                .mapToInt(entry -> {
                    System.out.println(entry.getKey());
                    String userAnswer = scanner.nextLine().toLowerCase();
                    return userAnswer.equals(entry.getValue().toLowerCase()) ? 10 : -5;
                })
                .sum();

        int finalScore = Math.max(0, userScore);

        System.out.println("Your final score: " + finalScore + " out of " + totalPoints);
    }
}
