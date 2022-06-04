import java.io.*;
import java.util.Scanner;
public class Q20{
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your ID: ");
            int id = sc.nextLine();

            BufferedReader br = new BufferedReader(new FileReader("Q19.txt"));
            String line = br.readLine();
            while(line != null){
                if(line.contains("ID")){
                    System.out.println("{\n");
                    System.out.println(line);
                    line = br.readLine();
                    System.out.println(line);
                    line = br.readLine();
                    System.out.println(line);
                    line = br.readLine();
                    System.out.println(line);
                    System.out.println("}\n");
                }
                line = br.readLine();
            }
            br.close();
        }catch(IOException e){
            System.out.println("Error2: " + e);
        }
    }
}

// Output ->
// Enter your id: Bill
// {

//         Name: Bill Gates,
//         Address: America,
//         Number: 123456789,
//         ID: 21,
// }