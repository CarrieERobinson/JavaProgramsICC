/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotterygame;
import java.util.*;

public class LotteryGame{
    
    public static Scanner userIn = new Scanner(System.in);
    public static Random myRand = new Random();
    
    public static void main(String[] args) 
    {
        int a, b, c; //ints to store 3 numbers individually
        int uA,uB,uC; //int to store 3 user nums
        int userNum; //store user num
        //generates number from 0 - 899 then adds 100
        int lottoNum = myRand.nextInt(900) + 100;
        //Uncomment next line to see number before guessing
//        System.out.println (lottoNum);
        
        
        //ArrayLists for lotto and user nums to be stored
        ArrayList<Integer> lottoNums = new ArrayList(3);
        ArrayList <Integer> userNums = new ArrayList(3);
        
        //get user num and  check for bad input
        do{
            System.out.print("Enter a 3 digit lotto number: ");
            while(!userIn.hasNextInt())
            {
                System.out.print("Enter a 3 digit lotto number: ");
                userIn.next();
            }
            userNum = userIn.nextInt();
        }while(userNum < 100 || userNum > 999); //check for invalid input
        
        //Seperate lotto nums
        c = lottoNum % 10;
        b = lottoNum/10 % 10;
        a = lottoNum/100 % 10;
        //Seperate user nums
        uC = userNum % 10;
        uB = userNum/10 % 10;
        uA = userNum/100 % 10;
        
        //adding nums to arraylists
        lottoNums.add(a);
        lottoNums.add(b);
        lottoNums.add(c);
        userNums.add(uA);
        userNums.add(uB);
        userNums.add(uC);
        //adding nums to arraylists
        
        System.out.println("The lotto number was:  " + lottoNum);
        System.out.println(checkNums(lottoNums, userNums));
    }

    public static <E extends Collections> String  checkNums(ArrayList lotto, ArrayList userNums)
    {
        if(lotto.containsAll(userNums))
            return "Congratulations! You won the lottery! $10,000!";
        else if((lotto.contains(userNums.get(0)) && lotto.contains(userNums.get(1)))
                || (lotto.contains(userNums.get(0)) && lotto.contains(userNums.get(2)))
                || (lotto.contains(userNums.get(1)) && lotto.contains(userNums.get(2))))
            return "You got 2 numbers correct! That's $2,000!";
        else if (lotto.contains(userNums.get(0)) || lotto.contains(userNums.get(1))
                || lotto.contains(userNums.get(2)))
            return "You got 1 number correct! $1,000!";
        else 
            return "Sorry, you lost!";
    }
    
}