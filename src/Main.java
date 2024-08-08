import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        ArrayList<University> universityArrayList = new ArrayList<>();

        ReadFile(universityArrayList);

        for(University u: universityArrayList){
            System.out.println(u.toString());
        }
    }

    public static void ReadFile(ArrayList<University> universityArrayList){
        String filePath = "src/World University Rankings 2023-Cleaned.csv";  // Replace with the path to your file

        try (Scanner scanner = new Scanner(new File(filePath))) {
            if (scanner.hasNextLine()) {
                scanner.nextLine(); // Skip the first line
            }
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
//                String[] parts = line.split(",", -1);
                String[] parts = parseLine(line);

                Integer rank = Integer.parseInt(parts[0]);
                String name = parts[1];
                String location = parts[2];
                String numberOfStudents = parts[3].replace("\"", "");;
                Double ratioOfStudentToStaff = parseDouble(parts[4]);
                String internationalStudent = parts[5];
                String maleToFemaleRatio = parts[6];
                String overAllScore = parts[7];
                String teachingScore = parts[8];
                Double researchScore = parseDouble(parts[9]);
                Double citationScore = parseDouble(parts[10]);
                Double industryIncomeScore = parseDouble(parts[11]);
                Double internationalOutlookScore = parseDouble(parts[12]);

                University university = new University(rank, name, location, numberOfStudents, ratioOfStudentToStaff, internationalStudent, maleToFemaleRatio, overAllScore, teachingScore, researchScore, citationScore, industryIncomeScore, internationalOutlookScore);
                universityArrayList.add(university);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static String[] parseLine(String line) {
        // This pattern will match fields within quotes or fields separated by commas
        Pattern pattern = Pattern.compile(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        return pattern.split(line);
    }

    private static Double parseDouble(String str) {
        if (str.isEmpty()) {
            return null;
        }
        try{
            return Double.parseDouble(str);
        }
        catch (NumberFormatException e){
            System.out.println(e);

        }
        return (double) 0;
    }
}
