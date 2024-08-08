import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        ArrayList<University> universityArrayList = new ArrayList<>();

        ReadFile(universityArrayList);
        SortMethods.insertionSort(universityArrayList, UniversityComparators.byNumberOfStudentsDsc());
        printToScreen(universityArrayList);


    }

    public static void ReadFile(ArrayList<University> universityArrayList){
        String filePath = "src/World University Rankings 2023-Cleaned.csv";

        try (Scanner scanner = new Scanner(new File(filePath))) {
            if (scanner.hasNextLine()) {
                scanner.nextLine(); // Skip the first line
            }
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Pattern pattern = Pattern.compile(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                String[] parts = pattern.split(line);

                Integer rank = Integer.parseInt(parts[0]);
                String name = parts[1].replace("\"", "");
                String location = parts[2].replace("\"", "");
                Integer numberOfStudents = parseInt(parts[3].replace("\"", "").replace(",", ""));
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

    private static void printToScreen(List<University> universities){
        universities.forEach(university -> System.out.printf(
                "%-5d %-60s %-20s %-8s %-4f %-4s %-10s %-6.2s %-6.2s %-6.2f %-6.2f %-6.2f %-6.2f%n",
                university.getRank(),
                university.getName(),
                university.getLocation(),
                university.getNumberOfStudents(),
                university.getRatioOfStudentToStaff(),
                university.getInternationalStudent(),
                university.getMaleToFemaleRatio(),
                university.getOverAllScore(),
                university.getTeachingScore(),
                university.getResearchScore(),
                university.getCitationScore(),
                university.getIndustryIncomeScore(),
                university.getInternationalOutlookScore()
        ));
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
        return 0.0;
    }

    private static Integer parseInt(String str) {
        if (str.isEmpty()) {
            return null;
        }
        try{
            return Integer.parseInt(str);
        }
        catch (NumberFormatException e){
            System.out.println(e);

        }
        return 0;
    }
}
