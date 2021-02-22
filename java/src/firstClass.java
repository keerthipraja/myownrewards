import jdk.internal.util.xml.impl.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class firstClass {

    public static void main(String[] args) throws IOException {
        System.out.println("hi");
        System.out.println("White theme");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
       /* BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
      String name=  br.readLine();*/
        System.out.println("print your name"+ name);
    }
}
