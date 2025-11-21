public class StudentDirector {
    private Builder builder;

    public StudentDirector(Builder builder) {
        this.builder = builder;
    }
    
    public Student createStudent() {
        // Customize student creation based on the builder type
        if(builder instanceof MBABuilder) {
            return builder
                .setName("Alice Johnson")
                .setAge(28)
                .setMajor("Business Administration")
                .setSubjects()
                .build();
        } else if(builder instanceof EngineerBuilder) {
            return builder
                .setName("Bob Smith")
                .setAge(22)
                .setMajor("Computer Engineering")
                .setGpa(3.6)
                .setSubjects()
                .build();
        }

        return null;
    }

}