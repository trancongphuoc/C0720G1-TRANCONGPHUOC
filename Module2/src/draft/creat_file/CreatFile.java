package draft.creat_file;

import java.io.File;
import java.io.IOException;

class CreateFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("src/draft/data/filename.csv");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
