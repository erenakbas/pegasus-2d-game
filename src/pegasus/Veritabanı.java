package pegasus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Veritabaný {
	private PrintWriter yazici;
	
	private String isim;
	

	public String[] dosya_oku() throws IOException{
		FileReader read = new FileReader(new File("E:/PegasusVt.txt"));
		String line;
		String[] return_values = new String[3];
		
		BufferedReader buffer = new BufferedReader(read);
		int i = 0;
		while((line = buffer.readLine()) != null){
			return_values[i] = line; 
			i++;
		}
		
		return_values = return_values[0].split(":");
		
		return return_values;
		
	}
	public void dosyaAc(){
		
		try{
			
			yazici=new PrintWriter("E:/PegasusVt.txt");
		}
		
		catch(FileNotFoundException istisna){
			
			System.err.println("dosya oluþturulamadý");
			System.exit(1);
		}
		
	}
	
	public void kayýtEkle(){
		
		
		isim = JOptionPane.showInputDialog(Main.pencere, "Ýsminizi Giriniz:");
		
		yazici.println(isim+":"+(Karakter.puan+Karakter.ekstra_puan));
		
		
	}
	
	public void dosyaKapa(){
		if(yazici!=null){
		yazici.close();
		}
	}

}
