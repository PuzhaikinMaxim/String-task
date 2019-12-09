import java.util.Scanner;
public class Main3 {
    public static void main(String[] args)
    {
        int count = 0;
        int count2 = 0;
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        char[] words1 = words.toCharArray();
        for(int i = 0; i < words.length(); ++i)
        {
            if (words1[i] == 'а' || words1[i] == 'е' || words1[i] == 'о' || words1[i] == 'у'|| words1[i] == 'я' || words1[i] =='и' || words1[i] == 'ю' || words1[i] == 'ы' || words1[i] == 'А' || words1[i] == 'Е' || words1[i] == 'О' || words1[i] == 'У'|| words1[i] == 'Я' || words1[i] =='И' || words1[i] == 'Ю'|| words1[i] == 'Ы')
            {
                if (count == 0)
                {
                    count2++;
                }
            }
            if (words1[i] == ' ')
            {
                count = 0;
            }
            if (count < 1)
                count++;
        }
        System.out.println(count2);
    }
}
