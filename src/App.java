public class App {
    public static void main(String[] args) throws Exception {
        User user = new User();
        String newLine = System.getProperty("line.separator");

        user.setName("Tester");
        user.setEmail("tester@test.com");
        user.setPhone("5561999999999");
        user.setEducation("DF", "Nice University", "Programming", "1st period - 2019");

        System.out.println(
                "Name: " + user.getName() + newLine +
                        "Email: " + user.getEmail() + newLine +
                        "Phone: " + user.getPhone());

        System.out.println(
                "\033[0;1m" + "Education: " + newLine + "\033[0;0m" +
                        "Institution State: " + user.getEducation().getInstitutionState() + newLine +
                        "Institution Name: " + user.getEducation().getInstitutionName() + newLine +
                        "Course Name: " + user.getEducation().getCourseName() + newLine +
                        "Admission Period: " + user.getEducation().getAdmissionPeriod());
    }
}
