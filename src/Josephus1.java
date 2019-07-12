import java.util.Scanner;

public class Josephus1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Number of people: ");
        int numPeople = scanner.nextInt();
        System.out.println("Kill every: ");
        int killNum = scanner.nextInt();

        boolean[] alive = new boolean[numPeople];
        for (int i = 0; i < alive.length; i++)
        {
            alive[i] = true;
        }

        int count = 1, index = 0;

        while (numPeople > 1)
        {
            while (index < alive.length)
            {
                if (alive[index] && numPeople > 1)
                {
                    if (count == killNum)
                    {
                        alive[index] = false;
                        System.out.println("Killed person #" + (index+1));
                        count = 1;
                        numPeople--;
                    }
                    else
                    {
                        count++;
                    }
                }
                index++;
            }
            index = 0;
        }

        while(!alive[index]) index++;
        System.out.println("Last person alive: #" + (index+1));
    }
}
