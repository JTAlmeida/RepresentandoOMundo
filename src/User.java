public class User {
    private String name;
    private String email;
    private String phone;
    private Education education = new Education();

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Education getEducation() {
        return this.education;
    }

    public void setEducation(String institutionState, String institutionName, String courseName,
            String admissionPeriod) {
        this.education.setInstitutionState(institutionState);
        this.education.setInstitutionName(institutionName);
        this.education.setCourseName(courseName);
        this.education.setAdmissionPeriod(admissionPeriod);
    }

}
