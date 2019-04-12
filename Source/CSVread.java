package cse425;
import java.io.*;
import java.util.*;

public class CSVread {


    public static void main(String[] args) {
        final long startTime = System.nanoTime();
        Scanner myScanner = new Scanner(System.in);
        String csvFile = "air_quality_Nov2017.csv";
        String sline = "";
        String cvsSplitBy = ",";
        String search = ""; //search is empty right now
        System.out.println("Enter your search:");
        search = myScanner.nextLine();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(csvFile))) {
            // Skip header line
            sline = bufferedReader.readLine();;
            while ((sline = bufferedReader.readLine()) != null) {

                // use comma as separator
                String[] data = sline.split(cvsSplitBy);

                if (search.equals(data[0])) {

                    System.out.println("Station [Station= " + data[0] + " , Air Quality=" + data[1] + " , Longitude=" + data[2] + " , Latitude=" + data[3] + " , 03 Hour=" + data[4] + " , 03 Quality=" + data[5] + "]");
                }
                else if (search.equals(data[1])) {
                    System.out.println("Station [Station= " + data[0] + " , Air Quality=" + data[1] + " , Longitude=" + data[2] + " , Latitude=" + data[3] + " , 03 Hour=" + data[4] + " , 03 Quality=" + data[5] + "]");

                }
                else if (search.equals(data[2])) {
                    System.out.println("Station [Station= " + data[0] + " , Air Quality=" + data[1] + " , Longitude=" + data[2] + " , Latitude=" + data[3] + " , 03 Hour=" + data[4] + " , 03 Quality=" + data[5] + "]");

                }
                else if (search.equals(data[3])) {
                    System.out.println("Station [Station= " + data[0] + " , Air Quality=" + data[1] + " , Longitude=" + data[2] + " , Latitude=" + data[3] + " , 03 Hour=" + data[4] + " , 03 Quality=" + data[5] + "]");

                }
                else if (search.equals(data[4])) {
                    System.out.println("Station [Station= " + data[0] + " , Air Quality=" + data[1] + " , Longitude=" + data[2] + " , Latitude=" + data[3] + " , 03 Hour=" + data[4] + " , 03 Quality=" + data[5] + "]");

                }
                else{
                    continue;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        final long duration = System.nanoTime()- startTime;
        System.out.println("\n Run Time: " + duration );

    }


}
