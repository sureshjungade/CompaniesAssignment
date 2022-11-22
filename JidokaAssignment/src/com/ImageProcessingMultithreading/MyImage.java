package com.ImageProcessingMultithreading;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;

public class MyImage implements Runnable{
	
	String imageName;
	public MyImage(String imageName) {
		this.imageName = imageName;
	}
	
	@Override
	public void run() {
		int width = 963;
	  	  
        int height = 640;
        
    	BufferedImage image = null;
    	
    	File input_File = new File("C:\\Users\\DELL\\Downloads/"+imageName+".png");
    	
    	try {
			image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
			
			image = ImageIO.read(input_File);
			
			System.out.println(image);
			System.out.println("Reading complete.");
			
		} catch (IOException e) {

			e.printStackTrace();
		}
    	catch (Exception e) {

			e.printStackTrace();
		}
    	

		// WRITE IMAGE
        try {
            // Output file path
            File output_file = new File("C:\\Users\\DELL\\Downloads/image55.png");
  
            // Writing to file taking type and path as
            ImageIO.write(image, "png", output_file);
  
            System.out.println("Writing complete.");
        }
        catch (IOException e) {
            System.out.println("Error: " + e);
        }
    	 
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Here we are processing two images");
		System.out.println("Please enter a first image Name which you want to read");
		MyImage myImageThread = new MyImage(sc.next());
		
		System.out.println("Please enter a second image Name which you want to read");
		MyImage myImageThreadTwo = new MyImage(sc.next());
		
		Thread thread1 = new Thread(myImageThread);
		Thread thread2 = new Thread(myImageThreadTwo);
		thread1.start();
		
		//thread1.join();
		//when we want to do processing sequentially, we would use join
		thread2.start();
		
	}

}
