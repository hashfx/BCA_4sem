import java.util.Scanner;
import java.io.*;

public class Q19{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your address: ");
        String address = sc.nextLine();
        System.out.print("Enter your number: ");
        String number = sc.nextLine();
        System.out.print("Enter your id: ");
        int id = sc.nextInt();

        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("Q19.txt"));
            // bw.write("{\"name\":\""+name+"\",\"address\":\""+address+"\",\"number\":\""+number+"\",\"id\":\""+id+"\"}");
            bw.write("{\n");
            bw.write("\tName: " + name + ",\n");
            bw.write("\tAddress: " + address + ",\n");
            bw.write("\tNumber: " + number + ",\n");
            bw.write("\tID: " + id + ",\n");
            bw.write("},\n");
            bw.close();
        }catch(IOException e){
            System.out.println("Error: " + e);
        }
    }
}

// Output ->
// Enter your name: Bill Gates
// Enter your address: America
// Enter your number: 123456789
// Enter your id: 21  

// Q19.txt ->
// {
//         Name: Bill Gates,
//         Address: America,
//         Number: 123456789,
//         ID: 21,
// },