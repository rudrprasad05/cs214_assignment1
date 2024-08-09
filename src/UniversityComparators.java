import java.util.Comparator;

public class UniversityComparators {
    public static Comparator<University> byRank() {
        return Comparator.comparing(University::getRank);
    }

    public static Comparator<University> byName() {
        return Comparator.comparing(University::getName);
    }

    public static Comparator<University> byLocation() {
        return Comparator.comparing(University::getLocation);
    }

    public static Comparator<University> byNumberOfStudentsAsc() {
        return Comparator.comparing(University::getNumberOfStudents);
    }

    public static Comparator<University> byNumberOfStudentsDsc() {
        return Comparator.comparing(University::getNumberOfStudents).reversed();
    }

    public static Comparator<University> byRatioOfStudentToStaff() {
        return Comparator.comparing(University::getRatioOfStudentToStaff);
    }

    public static Comparator<University> byInternationalStudent() {
        return Comparator.comparing(University::getInternationalStudent);
    }

    public static Comparator<University> byMaleToFemaleRatio() {
        return Comparator.comparing(University::getMaleToFemaleRatio);
    }

    public static Comparator<University> byOverAllScore() {
        return Comparator.comparing(University::getOverAllScore);
    }

    public static Comparator<University> byTeachingScore() {
        return Comparator.comparing(University::getTeachingScore);
    }

    public static Comparator<University> byResearchScore() {
        return Comparator.comparing(University::getResearchScore);
    }

    public static Comparator<University> byCitationScore() {
        return Comparator.comparing(University::getCitationScore);
    }

    public static Comparator<University> byIndustryIncomeScore() {
        return Comparator.comparing(University::getIndustryIncomeScore);
    }

    public static Comparator<University> byInternationalOutlookScore() {
        return Comparator.comparing(University::getInternationalOutlookScore);
    }


}
