import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // create ArrayList and LinkedList
        ArrayList<University> universityArrayList = new ArrayList<>();
        LinkedList<University> universityLinkedList = new LinkedList<>();

        // Read from file and populate both lists
        ReadFile(universityArrayList);
        ReadFile(universityLinkedList);

        // apply sorting methods, using any comparator
        // comparators come from UniversityComparators class and allows user to sort by any field.
//        SortMethods.mergeSort(universityArrayList, University.getRankComparator());
        SortMethods.mergeSort(universityArrayList, University.getRankComparator().reversed());

        // print formatted output onto screen
        printToScreen(universityArrayList);

    }

    // use of polymorphism allows ReadFile to accept both ArrayList and LinkedList
    public static void ReadFile(List<University> universityList){
        // define file path
        String filePath = "src/World University Rankings 2023-Cleaned.csv";

        try (Scanner scanner = new Scanner(new File(filePath))) {
            // Skip the first line
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }
            // keep reading file until end of file is reached
            while (scanner.hasNextLine()) {
                // grab one line from file
                String line = scanner.nextLine();

                // use regex to separate the fields in each line.
                // can not just use .split(",") as some values contain commas.
                Pattern pattern = Pattern.compile(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                String[] parts = pattern.split(line);

                // define and assign all values that will be used in constructor
                // use helper methods like parseInt to ensure errors are caught
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

                // call University constructor and initialise the values
                University university = new University(rank, name, location, numberOfStudents, ratioOfStudentToStaff, internationalStudent, maleToFemaleRatio, overAllScore, teachingScore, researchScore, citationScore, industryIncomeScore, internationalOutlookScore);

                // add object to List (either array or linked)
                universityList.add(university);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void printToScreen(List<University> universities){
        universities.forEach(university -> System.out.printf(
                "%-5d %-60s %-20s %-8s %-5.2f %-4s %-10s %-6.2s %-6.2s %-6.2f %-6.2f %-6.2f %-6.2f%n",
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
