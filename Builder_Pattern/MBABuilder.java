import java.util.ArrayList;
import java.util.List;


public class MBABuilder extends Builder {

    @Override
    public Builder setSubjects() {
        List<String> MBASubjectsList = new ArrayList<>();
        MBASubjectsList.add("Marketing Management");
        MBASubjectsList.add("Financial Accounting");
        MBASubjectsList.add("Organizational Behavior");
        MBASubjectsList.add("Business Strategy");   

        this.subjects = MBASubjectsList;
        return this;
    }

}