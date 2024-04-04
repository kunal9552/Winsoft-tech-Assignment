import java.util.*;

public class Que2 
{
    
    public static int findMaximumSumPath(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        int i = 0, j = 0;
        int sumX = 0, sumY = 0, maxSum = 0;
        List<Integer> path = new ArrayList<>();

        while (i < m && j < n) 
        {
            if (X[i] < Y[j]) 
            {
                sumX += X[i];
                path.add(X[i++]);
            } 
            else if (X[i] > Y[j]) 
            {
                sumY += Y[j];
                path.add(Y[j++]);
            } 
            else 
            { 
                maxSum += Math.max(sumX, sumY) + X[i];
                sumX = 0;
                sumY = 0;
                path.add(X[i++]);
                j++;
            }
        }

        while (i < m) {
            sumX += X[i];
            path.add(X[i++]);
        }

        while (j < n) {
            sumY += Y[j];
            path.add(Y[j++]);
        }

        System.out.print("Maximum sum path is: ");
        for (int k = 0; k < path.size() ; k++) 
        {
            System.out.print(path.get(k) + " -> ");
        }
        System.out.print("\n");

        maxSum += Math.max(sumX, sumY);
        return maxSum;

    }

    public static void main(String[] args) 
    {
        int[] X = { 3, 6, 7, 8, 10, 12, 15, 18, 100 };
        int[] Y = { 1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50 };

        int maxsum = findMaximumSumPath(X, Y);
        System.out.println("The maximum sum is: " + maxsum);
    }
}
