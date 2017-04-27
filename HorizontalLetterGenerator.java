/**
 * Created by sulav on 6.3.17.
 */
public class HorizontalLetterGenerator {
    public static boolean validate_letters(char[] letters)
    {
        for(int i=0;i<letters.length; i++)
        {
            if (letters[i]!='X' && letters[i]!='Y' && letters[i]!='Z')
            {
                System.out.println("Invalid letter paramenter. letters should be either X,Y or Z");
                return false;
            }
        }
        return true;
    }

    public static boolean validate_number(int n)
    {
        if (n<3 || n%2==1)
        {
            System.out.println("Invalid number parameter. number should be odd and greater than or equal to 3");
            return false;
        }
        return true;
    }
    //prints ith row of X
    public static void printX(int num, int i)
    {
            for(int j=0;j<num;j++)
            {
                if ((i==0 && j==num-1) || (i==num-1 && j==0) || (j==i || i+j==num-1))
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("  ");
    }

    public static void printY(int num, int i)
    {
        for(int j=0;j<num;j++)
        {
            if (i<num/2 && ((i==0 && j==num-1) || (i==num-1 && j==0) || (j==i || i+j==num-1)))
                System.out.printf("*");
            else if(i>=num/2 && j==num/2)
                System.out.printf("*");
            else
                System.out.printf(" ");
        }
        System.out.printf("  ");
    }

    public static void printZ(int num, int i)
    {
        for(int j=0;j<num;j++)
        {
            if (i==0 || i==num-1)
                System.out.printf("*");
            else if (i+j==num-1 && (i>=num/2 || j>=num/2))
            {
                System.out.printf("*");
            }
            else
                System.out.printf(" ");
        }
        System.out.printf("  ");
    }

    //prints letters horizontally if the input parameters are valid
    public static void printLetters_horizontally(char[] letters, int num)
    {
        if (validate_letters(letters) || validate_number(num))
        {
            for(int i=0;i<num;i++)
            {
                for (int j = 0; j < letters.length; j++)
                {
                    if (letters[j] == 'X')
                        printX(num,i);
                    else if (letters[j] == 'Y')
                        printY(num,i);
                    else
                        printZ(num,i);
                }
                System.out.println(" ");
            }
        }
        System.out.println("\n");
    }


    //simple test cases.
    public static void main(String[] args)
    {
        char test[]="XYZ".toCharArray();
        printLetters_horizontally(test,3);
        char test_2[]="XYZ".toCharArray();
        printLetters_horizontally(test_2,5);

    }
}
