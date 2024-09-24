public class Main {
    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int evenNumbers = 0;
        int oddNumbers = 0;

        // While loop that runs until our starting number is larger than our last number
        while(number <= finishNumber) {
            number++;

//          If statement that checks if a number is odd, if it is; start a new iteration of the loop
            if(!isEvenNumber(number)){
                oddNumbers++;
                continue;
            }
            System.out.println(number + " is an even number!");
            evenNumbers++;
            // Once 5 even numbers have occurred, break out of the statement
            if (evenNumbers == 5){
                break;
            }
        }

        System.out.println("There has been a total of " + evenNumbers + " even numbers");
        System.out.println("There has been a total of " + oddNumbers + " odd numbers");

    }

    public static boolean isEvenNumber(int number){

        return (number % 2 == 0);

    }


}
