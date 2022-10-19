import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("필터로 커피를 우려내는 중");
    }

    @Override
    public void addCondiments() {
        System.out.println("설탕과 우유를 추가하는 중");
    }

    @Override
    public boolean customerWantsCondiments() {
        return getUserInput().toLowerCase().startsWith("y");
    }
    
    private String getUserInput() {
        String answer = null;

        System.out.print("커피에 우유와 설탕을 넣을까요? (y/n) ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
        
        return answer == null ? "no" : answer;
    }

}
