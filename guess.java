import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class guess{
    public static void main(String[] args) {
        String [] word = {"python", "javascript", "c++", "c#", "java"};
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        String selected = word[rand.nextInt(word.length)];
        //
        //
        String tiret = "";
        for(int i = 0; i < selected.length(); i++){
            tiret += '-';
        }

        char [] ch = new char[selected.length()];
        for(int i = 0; i < ch.length; i++){
            ch[i] = tiret.charAt(i);
        }
        System.out.println(Arrays.toString(ch));
        //
        //

        int current_length = selected.length() * 2;
        int tries = 1;
        int char_index = 0;

        while(tries <= current_length){

            //get input from user
            System.out.print("Try to gess the next Character : ");
            char letter = sc.next().charAt(0);

            //
            if(letter == selected.charAt(char_index)){
                ch[char_index] = letter;
                System.out.println(Arrays.toString(ch));
                char_index++;
            }else{
                System.out.println("False, Try Again");
            }

            tries++;

            String neww = "";
            for(int i = 0; i < ch.length; i++){
                neww += ch[i];
            }

            if(ch[selected.length() - 1] == selected.charAt(selected.length() - 1)){
                System.out.println("The answer is : '"+ neww + "', Well Done");

                break;
            }

            else if(tries > current_length){
                System.out.println("You Lost");
            }


        }
    }
}
