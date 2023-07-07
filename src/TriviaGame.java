import java.util.*;

public class TriviaGame {
    public static void main(String[] args) {
        System.out.println("Welcome to our trivia.\nYou have to answer 10 multiple question.\nIf you answer correct you will get 10 points for each question\nIf you answer wrong you will lose 5 points for each question.");
        Scanner scanner = new Scanner(System.in);
        Map<String, String> questionsAnswers = new HashMap<String, String>();
        List<String> answerList = new ArrayList<>();
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

        for (String i : questionsAnswers.keySet()) {
            System.out.println(i);
            String answers = scanner.next().toLowerCase();
            answerList.add(answers);
        }

        int point = questionsAnswers.entrySet().stream()
                .mapToInt(entry -> answerList.contains(entry.getValue()) && answerList.contains(entry.getKey()) ? 10 : -5)
                .sum();
        /*
        if(point<0){
            System.out.println("Your point is: 0");
        }
        else{
            System.out.println("Congrats! Your score is: "+point);
        }
         */
    }
}
