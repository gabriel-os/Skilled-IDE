package FUNC;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.io.FileUtils;

	public class TodosArquivos {

	    /**

	     * List all the files and folders from a directory

	     * @param directoryName to be listed

	     */

	    public void listFilesAndFolders(String directoryName){

	        File directory = new File(directoryName);

	        //get all the files from a directory

	        File[] fList = directory.listFiles();

	        for (File file : fList){

	            System.out.println(file.getName());

	        }

	    }

	    /**

	     * List all the files under a directory

	     * @param directoryName to be listed

	     */

	    public void listFiles(String directoryName){

	        File directory = new File(directoryName);

	        //get all the files from a directory

	        File[] fList = directory.listFiles();

	        for (File file : fList){

	            if (file.isFile()){

	                System.out.println(file.getName());

	            }

	        }

	    }

	    /**

	     * List all the folder under a directory

	     * @param directoryName to be listed

	     */

	    public void listFolders(String directoryName){

	        File directory = new File(directoryName);

	        //get all the files from a directory

	        File[] fList = directory.listFiles();

	        for (File file : fList){

	            if (file.isDirectory()){

	                System.out.println(file.getName());

	            }

	        }

	    }

	    /**

	     * List all files from a directory and its subdirectories

	     * @param directoryName to be listed

	     */

	    public void listFilesAndFilesSubDirectories(String directoryName){

	        File directory = new File(directoryName);

	        //get all the files from a directory

	        File[] fList = directory.listFiles();

	        for (File file : fList){

	            if (file.isFile()){

	                System.out.println(file.getAbsolutePath());

	            } else if (file.isDirectory()){

	                listFilesAndFilesSubDirectories(file.getAbsolutePath());

	            }

	        }

	    }

	    public static void main (String[] args){

	    	TodosArquivos listFilesUtil = new TodosArquivos();

	        final String directoryLinuxMac ="/Users/loiane/test";

	        //Windows directory example

	        final String directoryWindows ="C:/Users/Gabriel/Documents";

	        /*listFilesUtil.listFiles(directoryWindows);
	        listFilesUtil.listFolders(directoryWindows);*/
	        listFilesUtil.listFilesAndFilesSubDirectories(directoryWindows);

	    }

	}

