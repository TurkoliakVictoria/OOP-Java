import java.io.*;

public class AutoFill extends Main implements Main.Command {
    public void execute(){
        File myFile = new File("C:\\Users\\DareBlig\\IdeaProjects\\Labs\\Lab_12\\Information.txt");
        String name_txt = "Auto";
        String gender_txt = "Male";
        String reg_txt = "123";
        String date_txt = "01.01.01";
        System.out.println("Name - " + name_txt);
        System.out.println("Gender -  " + gender_txt);
        System.out.println("Registration number - " + reg_txt);
        System.out.println("Registration date - " + date_txt);
        System.out.println("**************************************");
        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
            writer.println("Name - " + name_txt);
            writer.println("Gender -  " + gender_txt);
            writer.println("Registration number - " + reg_txt);
            writer.println("Registration date - " + date_txt);
            writer.println("**************************************");
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("File autofilled!");
    }
}
