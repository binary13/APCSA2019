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

        int count = 1, pos = 0;

        while (numPeople > 1)
        {
            while (pos < alive.length)
            {
                if (alive[pos])
                {
                    if (count == killNum)
                    {
                        alive[pos] = false;
                        System.out.println("Killed person #" + (pos+1));
                        count = 1;
                        numPeople--;
                    }
                    else
                    {
                        count++;
                    }
                }
                pos++;
            }
            pos = 0;
        }

        while(!alive[pos]) pos++;
        System.out.println("Last person alive: " + (pos+1));
    }
}
