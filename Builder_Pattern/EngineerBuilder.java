import java.util.ArrayList;
import java.util.List;


public class EngineerBuilder extends Builder {

    @Override
    public Builder setSubjects() {
        List<String> enggSubjectsList = new ArrayList<>();
        enggSubjectsList.add("Data Structures");
        enggSubjectsList.add("Algorithms");
        enggSubjectsList.add("Operating Systems");
        enggSubjectsList.add("Database Systems");
        enggSubjectsList.add("Computer Networks");

        this.subjects = enggSubjectsList;
        return this;
    }

}