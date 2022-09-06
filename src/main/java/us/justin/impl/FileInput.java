package us.justin.impl;

import us.justin.Sale;
import us.justin.iface.SalesInput;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;
import java.util.List;

public class FileInput implements SalesInput {
    @Override
    public List<Sale> getSales() {
        List<Sale> sales = new ArrayList<>();
        try {
            File myObj = new File("sales.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] elements = data.split(",");
                sales.add(new Sale(elements[0],elements[1],Double.parseDouble(elements[2]),Double.parseDouble(elements[3])));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return sales;
    }
}
