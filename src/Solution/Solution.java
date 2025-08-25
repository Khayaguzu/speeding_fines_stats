/*
 * Project Name: SpeedingFinesStats
 * License template: nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Class template: nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java
 */
package Solution;

/**
 * Solution.java
 * This program displays speeding fines statistics for different cities and months.
 * Author: Khaya
 */
public class Solution
{

    /**
     * Main method - entry point of the program.
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("*******************************************************");
        System.out.println("SPEEDING FINES STATISTICS");
        System.out.println("*******************************************************");

        // Declaration of months and cities
        String[] months = { "JAN", "FEB", "MAR" };
        String[] cities = { "JHB", "DBN", "CTN", "PE" };

        // Two-dimensional array containing the fines per city and month
        int[][] fines = {
            { 128, 135, 139 },
            { 155, 129, 175 },
            { 129, 130, 185 },
            { 195, 155, 221 }
        };

        // Print the header row with months
        System.out.printf("%-6s %-8s %-8s %-8s%n", "", months[0], months[1], months[2]);

        // Loop through each city and print their fines
        for (int i = 0; i < cities.length; i++)
        {
            System.out.printf("%-6s", cities[i]); // Print city name

            for (int j = 0; j < fines[i].length; j++)
            {
                System.out.printf("%-8d", fines[i][j]); // Print fines
            }

            System.out.println(); // New line after each city
        }
    }
}
