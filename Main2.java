import java.util.ArrayList;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args)
    {
        ArrayList <Integer> arr = new ArrayList<>();
        int count = 0;
        int k = 0;
        int count_letters = 0;
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        char[] words1 = words.toCharArray();
        for(int i = 0; i < words.length(); ++i)
        {
            if(words1[i] != ' ') {
                count_letters++;
            }
            /*if(count_letters == 3 && words1[i] == ' ')
            {
                count++;
                count_letters = 0;
                //arr.add(k, count);
                //k++;
                System.out.println(count);
            }
            if (count_letters != 3 && words1[i] == ' ')
            {
                count_letters = 0;
                count++;
            }*/
            if (words1[i] == ' ')
            {
                if(count_letters == 3)
                {
                    count++;
                    count_letters = 0;
                    System.out.println(count);
                }
                else{
                    count++;
                    count_letters = 0;
                }
            }
            if(i == words.length() - 1 && count_letters == 3) {
                count++;
                System.out.println(count);
            }
        }
        /*for(int i = 0; i < arr.size(); ++i)
        {
            System.out.println(arr.get(i));
        }*/
    }
}
