// Demonstrate FileOutputStream.
// This program uses the traditional approach to closing a file.
/*
import java.io.FileOutputStream;
import java.io.IOException;

class FileOutputStreamDemo {
    public static void main(String args[]) {
        FileOutputStream f1 = null;
        
        String source = "";
        
        for(long j = 10000000; j < 20000000; j+=10000){
        for(long i = 0; i < 10000; i++){
            source += i+j +"\n";
        }
        
            

        byte buf[] = source.getBytes();

        


        try {

            f1 = new FileOutputStream("file2.txt");

            f1.write(buf);

        } catch(IOException e) {
            System.out.println("An I/O Error Occurred");

        }
    }
        // finally {
            try {
                if(f1 != null) f1.close();
            } catch(IOException e) {
                System.out.println("Error Closing file2.txt");
            }
        // }
        System.out.println("Done!");
    
    }
}
*/