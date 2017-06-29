package cn.zxy.decorator;

import java.io.*;

/**
 * @author Silence 000996
 * @data 17/6/19
 */
public class LowerCaseMonitor {
    public static void main(String[] args) throws IOException {
        InputStream in = new LowerCaseInputStream(new FileInputStream("/Users/a000996/Documents/1.txt"));
        int result;
        while((result = in.read()) > -1){
            System.out.print((char)result);
        }


    }
}
