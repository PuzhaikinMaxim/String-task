import java.util.ArrayList;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args)
    {
        /*int count = 0;
        int count_length = 0;
        int max = 0;
        int start = 0;
        int end = 0;
        int start_mem = 0;
        int end_mem = 0;
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        char[] words1 = words.toCharArray();
        for(int i = 0; i < words.length(); ++i)
        {
            if(words1[i] == ' ') {
                start = i + 1;
                end = start;
                if(count_length >= max) {
                    max = count_length;
                    start_mem = start;
                    end_mem = end;
                }
                count_length = 0;
            }
            if(words1[i] != ' ') {
                end++;
                count_length++;
            }
        }*/
        /*for(int i = start_mem; i < end_mem; ++i)
        {
            System.out.print(words1[i]);
        }*/
        int lenght = 0;
        int max = 0;
        int start=0;
        int end=0;
        int end_mem = 0;
        int start_mem = 0;
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        char[] word = words.toCharArray();
        for(int i = 0; i < words.length(); ++i)
        {
            if(word[i] != ' ')
            {
                end++;
                lenght++;
            }
            if(word[i] == ' ')
            {
                if(lenght >= max){
                    max = lenght;
                    end_mem = end;
                    start_mem = start;
                }
                lenght = 0;
                start = i + 1;
                end = start;
            }
            if(i == words.length() - 1 && lenght >= max)
            {
                end_mem = end;
                start_mem = start;
            }
        }
        for(int i = start_mem;i < end_mem; ++i)
        {
            System.out.print(word[i]);
        }
    }
}
