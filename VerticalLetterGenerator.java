public class VerticalLetterGenerator {
    /**
     *
     * @param letters
     * @return validity of letters
     */
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

    /**
     *
     * @param n
     * @return validity of n
     */
    public static boolean validate_number(int n)
    {
        if (n<3 || n%2==1)
        {
            System.out.println("Invalid number parameter. number should be odd and greater than or equal to 3");
            return false;
        }
        return true;
    }

    /**
     *
     * @param prints X
     */
    public static void printX(int num)
    {
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num;j++)
            {
                if ((i==0 && j==num-1) || (i==num-1 && j==0) || (j==i || i+j==num-1))
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.println("");
        }
        System.out.println("\n");
    }
    /*prints Y*/
    public static void printY(int num)
    {
        for(int i=0;i<num;i++)
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
            System.out.println("");
        }
        System.out.println("\n");
    }
    /*prints Z*/
    public static void printZ(int num)
    {
        for(int i=0;i<num;i++)
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
            System.out.println("");
        }
        System.out.println("\n");
    }
    /*Prints letters vertically if the parameters are valid*/
    public static void printLetters_vertically(char[] letters, int num)
    {
        if (validate_letters(letters) || validate_number(num))
        {
            for (int i = 0; i < letters.length; i++)
            {
                if (letters[i]=='X')
                    printX(num);
                else if (letters[i]=='Y')
                    printY(num);
                else
                    printZ(num);
            }
        }

    }


    //Simple Test CASES:
    public static void main(String[] args)
    {
        char test[]="XYZ".toCharArray();
        printLetters_vertically(test,3);
        char test_2[]="XYZ".toCharArray();
        printLetters_vertically(test_2,5);
	printLetters_vertically("XYZ".toCharArray(),100);
	printLetters_vertically("XYZ".toCharArray(),1000);

    }
}
