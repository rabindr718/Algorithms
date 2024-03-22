package basic;

import java.util.Scanner;

public class FCFS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of processes: ");
        int numProcesses = scanner.nextInt();

        int arrivalTime[] = new int[numProcesses];
        int burstTime[] = new int[numProcesses];
        int completionTime[] = new int[numProcesses];

        System.out.println("Enter arrival time and burst time for each process:");

        // Input arrival time and burst time for each process
        for (int i = 0; i < numProcesses; i++) {
            System.out.print("Arrival time for process " + (i + 1) + ": ");
            arrivalTime[i] = scanner.nextInt();
            System.out.print("Burst time for process " + (i + 1) + ": ");
            burstTime[i] = scanner.nextInt();
        }

        // Calculate completion time for each process
        int currentTime = 0;
        for (int i = 0; i < numProcesses; i++) {
            if (currentTime < arrivalTime[i]) {
                currentTime = arrivalTime[i];
            }
            completionTime[i] = currentTime + burstTime[i];
            currentTime = completionTime[i];
        }

        // Calculate average waiting time
        int totalWaitingTime = 0;
        for (int i = 0; i < numProcesses; i++) {
            int waitingTime = completionTime[i] - arrivalTime[i] - burstTime[i];
            totalWaitingTime += waitingTime;
        }
        double averageWaitingTime = (double) totalWaitingTime / numProcesses;

        // Display results
        System.out.println("Process\tArrival Time\tBurst Time\tCompletion Time\tWaiting Time");
        for (int i = 0; i < numProcesses; i++) {
            System.out.println((i + 1) + "\t\t" + arrivalTime[i] + "\t\t\t" + burstTime[i] + "\t\t\t" +
                    completionTime[i] + "\t\t\t" + (completionTime[i] - arrivalTime[i] - burstTime[i]));
        }
        System.out.println("\nAverage Waiting Time: " + averageWaitingTime);

        scanner.close();
    }
}
