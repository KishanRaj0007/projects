import java.util.Scanner;
class game
{
    public static void main(String[] args)
    {
        int t = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Welcome, lets play TIC TAC TOE");
        System.out.println("you are X and computer is O");
        System.out.println("\n");
        int temp = 0;
        char[][] arr = new char[][]{{'_','_','_'},{'_','_','_'}, {'_','_','_'}};
        int[] userChoice = new int[3];
        int[] compChoice = new int[3];
        display(arr);
        
        while(true)
        {
            if (temp % 2 == 0)
            {
                
                System.out.println("\n");
                System.out.println("TURN X");
                System.out.println("Pick row and column number");
                System.out.println("\n");
                for (int i = 0; i < userChoice.length; i++) {
                    if (i == 1)
                    {
                        continue;
                    }
                    userChoice[i] = sc.nextInt();
                   
                }
                if (arr[userChoice[0]][userChoice[2]] == '_' )
                {
                    arr[userChoice[0]][userChoice[2]] = 'X';

                }
                 
                    temp++;
                    if (checkRow(arr) == 1 || checkColumn(arr) == 1 || checkLeftDiagonal(arr) == 1 || checkRightDiagonal(arr) == 1)
                    {
                        display(arr);
                        System.out.println("Congratulations, you won the game");
                        System.exit(0);
                    }
                    else if (checkRow(arr) == 2 || checkColumn(arr) == 2 || checkLeftDiagonal(arr) == 2 || checkRightDiagonal(arr) == 2)
                    {
                        System.out.println("You lost the game, better luck next time!!");
                        System.exit(0);
                    }
                    
                
                display(arr);
                

            }
            else
            {
                
                System.out.println("\n");
                System.out.println("TURN O");
                for (int i = 0; i < compChoice.length; i++) 
                {
                    if (i == 1)
                    {
                        continue;
                    }
                    compChoice[i] = ran();
                }

                while(t != 0)
                {

                
                    if (arr[compChoice[0]][compChoice[2]] != '_')
                    {
                        System.out.println("This position is already taken, please generate other position");
                    }
                    for (int i = 0; i < compChoice.length; i++) 
                {
                    if (i == 1)
                    {
                        continue;
                    }
                    compChoice[i] = ran();
                }
                 if (arr[compChoice[0]][compChoice[2]] == '_')
                 {
                    t = 0;
                    
                 }


                }
                    
                    
                
                if (arr[compChoice[0]][compChoice[2]] == '_' )
                {
                    arr[compChoice[0]][compChoice[2]] = 'O';
                }
               
                display(arr);
                temp++;
                if (checkRow(arr) == 1 || checkColumn(arr) == 1 || checkLeftDiagonal(arr) == 1 || checkRightDiagonal(arr) == 1)
                    {
                        display(arr);
                        System.out.println("Congratulations, you won the game");
                        System.exit(0);
                    }
                    else if (checkRow(arr) == 2 || checkColumn(arr) == 2 || checkLeftDiagonal(arr) == 2 || checkRightDiagonal(arr) == 2)
                    {
                        System.out.println("You lost the game, better luck next time!!");
                        System.exit(0);
                    }

                

                
            }

        }
    }
    public static void display (char[][] array)
    {
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("\t");
            System.out.print(i+" ");
            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j]+ " ");
                
            }
            System.out.println();
            

            
        }

    }
    public static int ran()
    {
        return (int)((Math.random()*2)+1);

    }
    public static int checkRow(char[][] ar1)
    {
        if (ar1[0][0] == 'X' && ar1[0][1] == 'X' && ar1[0][2] == 'X')
        {
            return 1;
        }
        else if (ar1[1][0] == 'X' && ar1[1][1] == 'X' && ar1[1][2] == 'X')
        {
            return 1;
        }
        else if (ar1[2][0] == 'X' && ar1[2][1] == 'X' && ar1[2][2] == 'X')
        {
            return 1;
        }
        else if(ar1[0][0] == 'O' && ar1[0][1] == 'O' && ar1[0][2] == 'O')
        {
            return 2;
        }
        else if (ar1[1][0] == 'O' && ar1[1][1] == 'O' && ar1[1][2] == 'O')
        {
            return 2;
        }
        else if (ar1[2][0] == 'O' && ar1[2][1] == 'O' && ar1[2][2] == 'O')
        {
            return 2;
        }
        else
        {
            return 3;
        }

    }
    public static int checkColumn(char[][] ar1)
    {
         if (ar1[0][0] == 'X' && ar1[1][0] == 'X' && ar1[2][0] == 'X')
        {
            return 1;
        }
        else if (ar1[0][1] == 'X' && ar1[1][1] == 'X' && ar1[2][1] == 'X')
        {
            return 1;
        }
        else if (ar1[0][2] == 'X' && ar1[1][2] == 'X' && ar1[2][2] == 'X')
        {
            return 1;
        }
        else if(ar1[0][0] == 'O' && ar1[1][0] == 'O' && ar1[2][0] == 'O')
        {
            return 2;
        }
        else if (ar1[0][1] == 'O' && ar1[1][1] == 'O' && ar1[2][1] == 'O')
        {
            return 2;
        }
        else if (ar1[0][2] == 'O' && ar1[1][2] == 'O' && ar1[2][2] == 'O')
        {
            return 2;
        }
        else
        {
            return 3;
        }


    }
    public static int checkLeftDiagonal(char[][] ar3)
    {
        if (ar3[0][0] == 'X' && ar3[1][1] == 'X' && ar3[2][2] == 'X')
        {
            return 1;
        }
        else if (ar3[0][0] == 'O' && ar3[1][1] == 'O' && ar3[2][2] == 'O')
        {
            return 2;
        }
        else
        {
            return 3;
        }

    }
    public static int checkRightDiagonal(char[][] ar3)
    {
         if (ar3[0][2] == 'X' && ar3[1][1] == 'X' && ar3[2][0] == 'X')
        {
            return 1;
        }
        else if (ar3[0][2] == 'O' && ar3[1][1] == 'O' && ar3[2][0] == 'O')
        {
            return 2;
        }
        else
        {
            return 3;
        }


    }
    
}
