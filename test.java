package com.caltech.project.assignment1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("---------------------------------\n\t***LockedMe***\n---------------------------------");
		System.out.println("Enter the path/directory");
		Scanner sc = new Scanner(System.in);
		String path = sc.nextLine()+"\\";
		while(true) {
			System.out.println("---------------------------------\nChoose from below Menu\n");
			System.out.println("1. Show files in Ascending Order");
			System.out.println("2. Business level operations");
			System.out.println("3. Exit\n---------------------------------");
			int opt = sc.nextInt();
			switch(opt) {
			case 1:
				File file=new File(path);
				//display operation
				File filename[]=file.listFiles();
				//for-each
				System.out.println("the list of files in asscending order in the "+ path +" is ");
				for(File ff:filename) {
					System.out.println(ff.getName());
				}
				break;
				
			case 2:
				while(true) {
					System.out.println("---------------------------------\nChoose the operation to be performed\n");
					System.out.println("1. Add a file");
					System.out.println("2. Delete a file");
					System.out.println("3. Search a file");
					System.out.println("4. Exit from this Sub Menu\n---------------------------------");
					int opt1 = sc.nextInt();
					if(opt1==4) {
						break;
					}
					else {
						switch(opt1) {
						case 1:
							File file2=new File(path);
							System.out.println("\nEnter the file name to be added");
							String fileName = path + sc.next();
							File file3=new File(fileName);
							boolean res = file3.createNewFile();
							if(res==true) {
								System.out.println("file created");
							}
							else {
								System.out.println("file not created");
							}	
						break;
							
						case 2:
							File file4=new File(path);
							System.out.println("\nEnter the file name to be deleted");
							String fileName1 = path + sc.next();
							File file5=new File(fileName1);
							file5.delete();
							System.out.println("file deleted");
						break;
						
						case 3:
							System.out.println("enter the file to search");
							sc.nextLine();
							String filenamesearch=sc.nextLine();
							File file6=new File(path);
							//display operation
							File filearr[]=file6.listFiles();
							//for-each
							int flag=0;
							for(File ff:filearr) {
								if(ff.getName().equals(filenamesearch)) {
									flag=1;
									break;
								}
								else {
									flag=0;
								}
							}
							
							if(flag==1) {
								System.out.println("file is found");
							}
							else {
								System.out.println("file is not found");
							}	
							break;
							
						default:
		                    System.out.println("Please make a valid selection");
		                    break;
						}
				}
					}
				break;
					
			case 3:
				System.out.println("\n***Successfully exited out of LockedMe***");
				System.exit(0);
					
			default:
                System.out.println("Please make a valid selection");
                break;
				}
				}

			}
		}


