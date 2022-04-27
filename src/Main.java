import java.util.Scanner;

public class Main {
    public static String temp(){
        try{
            String input = "mohammad";
            if (input.equals("mohammad"))
                return "good job";
            else
                throw new MohammadException();
        }catch (MohammadException e){
            return e.getMessage();
        }
    }
}
