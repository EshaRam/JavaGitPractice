package IO;
//DatainputStream: Use this class to input 2 integer numbers and multiply them.

import java.io.*;

public class DataInputEx {

    public static void main(String[] args) throws IOException {
        File fi = new File("/Users/easwarimuthu/Desktop/File practice/file.txt");


        FileOutputStream fo = new FileOutputStream(fi);
        DataOutputStream dos = new DataOutputStream(fo);


    }
}
