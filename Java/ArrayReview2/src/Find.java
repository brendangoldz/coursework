import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import static java.nio.file.FileVisitResult.*;
import javax.swing.filechooser.FileSystemView;

 public class Find {
	// your directory
	 public static void main(String[] args){
	 File f = new File("/Users/brendangoldsmith/Music/iTunes/iTunes Media/");
	 File[] matchingFiles = f.listFiles(new FilenameFilter() {
	     public boolean accept(File dir, String name) {
	          return name.endsWith("m4p");
	        	  
	     }});
	 }
}
 