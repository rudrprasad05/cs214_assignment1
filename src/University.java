public class University {
    private Integer rank;
    private String name;
    private String location;
    private String numberOfStudents;
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
    public University(Integer rank, String name, String location, String numberOfStudents, Double ratioOfStudentToStaff, String internationalStudent, String maleToFemaleRatio, String overAllScore, String teachingScore, Double researchScore, Double citationScore, Double industryIncomeScore, Double internationalOutlookScore) {
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

    public void setNumberOfStudents(String numberOfStudents) {
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
}
