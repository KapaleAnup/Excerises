package devqa;

public class CurrentWorkingDirectory {

    public static void main(String[] args) {

       String wd = System.getProperty("user.dir");
        System.out.println("Current working directory " + wd);
    }
}
