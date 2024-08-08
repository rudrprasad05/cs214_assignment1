import java.util.Comparator;

public class University implements Comparable {
    private Integer rank;
    private String name;
    private String location;
    private Integer numberOfStudents;
    private Double ratioOfStudentToStaff;
    private String internationalStudent;
    private String maleToFemaleRatio;
    private String overAllScore;
    private String teachingScore;
    private Double researchScore;
    private Double citationScore;
    private Double industryIncomeScore;
    private Double internationalOutlookScore;

    public University(){};
    public University(Integer rank, String name, String location, Integer numberOfStudents, Double ratioOfStudentToStaff, String internationalStudent, String maleToFemaleRatio, String overAllScore, String teachingScore, Double researchScore, Double citationScore, Double industryIncomeScore, Double internationalOutlookScore) {
        this.rank = rank;
        this.name = name;
        this.location = location;
        this.numberOfStudents = numberOfStudents;
        this.ratioOfStudentToStaff = ratioOfStudentToStaff;
        this.internationalStudent = internationalStudent;
        this.maleToFemaleRatio = maleToFemaleRatio;
        this.overAllScore = overAllScore;
        this.teachingScore = teachingScore;
        this.researchScore = researchScore;
        this.citationScore = citationScore;
        this.industryIncomeScore = industryIncomeScore;
        this.internationalOutlookScore = internationalOutlookScore;
    }

    @Override
    public String toString(){
        return rank + " " + name+ " " + location+ " " + numberOfStudents+ " " + ratioOfStudentToStaff+ " " + internationalStudent+ " " + maleToFemaleRatio + " "+ overAllScore + " "+ teachingScore + " "+ researchScore + " "+ citationScore+ " " + industryIncomeScore + " "+ internationalOutlookScore;
    }
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setNumberOfStudents(Integer numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void setRatioOfStudentToStaff(Double ratioOfStudentToStaff) {
        this.ratioOfStudentToStaff = ratioOfStudentToStaff;
    }

    public void setInternationalStudent(String internationalStudent) {
        this.internationalStudent = internationalStudent;
    }

    public void setMaleToFemaleRatio(String maleToFemaleRatio) {
        this.maleToFemaleRatio = maleToFemaleRatio;
    }

    public void setOverAllScore(String overAllScore) {
        this.overAllScore = overAllScore;
    }

    public void setTeachingScore(String teachingScore) {
        this.teachingScore = teachingScore;
    }

    public void setResearchScore(Double researchScore) {
        this.researchScore = researchScore;
    }

    public void setCitationScore(Double citationScore) {
        this.citationScore = citationScore;
    }

    public void setIndustryIncomeScore(Double industryIncomeScore) {
        this.industryIncomeScore = industryIncomeScore;
    }

    public void setInternationalOutlookScore(Double internationalOutlookScore) {
        this.internationalOutlookScore = internationalOutlookScore;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public Integer getRank() {
        return rank;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public Integer getNumberOfStudents() {
        return numberOfStudents;
    }

    public Double getRatioOfStudentToStaff() {
        return ratioOfStudentToStaff;
    }

    public String getInternationalStudent() {
        return internationalStudent;
    }

    public String getMaleToFemaleRatio() {
        return maleToFemaleRatio;
    }

    public String getOverAllScore() {
        return overAllScore;
    }

    public String getTeachingScore() {
        return teachingScore;
    }

    public Double getResearchScore() {
        return researchScore;
    }

    public Double getCitationScore() {
        return citationScore;
    }

    public Double getIndustryIncomeScore() {
        return industryIncomeScore;
    }

    public Double getInternationalOutlookScore() {
        return internationalOutlookScore;
    }

}
