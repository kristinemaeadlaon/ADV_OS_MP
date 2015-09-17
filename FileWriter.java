/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package os;

/*
 * @author Kristine Mae M. Adlaon
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class FileWriter {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int b[] = new int[input];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= input; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
        try {
            PrintWriter pr = new PrintWriter("C://Users//User//Desktop/filename.txt");
            pr.print(0);
            for (int i = 0; i < input; i++) {
                b[i] = list.get(i);
                pr.print(", "+b[i]);
            }
            pr.close();
        }catch(Exception e){
                  e.printStackTrace();
                  System.out.println("No such file exists.");
                    }

        }
}
