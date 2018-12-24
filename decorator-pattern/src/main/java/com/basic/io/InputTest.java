package com.basic.io;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * locate com.basic.io
 * Created by MasterTj on 2018/12/24.
 */
public class InputTest {
    public static void main(String[] args) throws IOException {
        InputStream inputStream=new LowerCaseInputStream(new BufferedInputStream(System.in));
        int read=0;
        while ((read=inputStream.read())!=-1){
            System.out.print((char)read);
        }
        inputStream.close();
    }
}
