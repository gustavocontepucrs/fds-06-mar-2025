public class App {
    public static void main (String[] args) throws Exception {
        System.out.println("Hello World!\n\n Some useful information about the system:\n");

        String osName = System.getProperty("os.name");
        System.out.println("Current OS: " + osName);

        String currentJavaVersion = System.getProperty("java.version");
        System.out.println("Current Java Version: " + currentJavaVersion);
    }
}