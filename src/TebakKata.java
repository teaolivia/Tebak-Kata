import java.io.BufferedWriter;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class TebakKata {
	private String kata;
	private List<String> lines = new LinkedList<String>();
	
	// KONSTRUKTOR
	public TebakKata(String kata){
		reader = new FileReader("answer.txt");
		rand = randKata();
		try{

		} catch (IOException e){
			e.printStackTrace();
		}
	}

	// membaca file 
	public void readFile() throws IOException {
		String line = in.readLine(); // membaca ine dalam suatu waktu
		while(line != null){
			lines.add(line); // menambahkan line ke pada list
			line = in.readLine(); // baca line berikutnya
		}
	}

	// mengecek kata yang dimasukkan benar atau salah
	// dengan menggunakan algoritma Boyer-Moore
	public boolean isBenar(String kata){
		boolean benar = false;
		for(int i = 0; i < kata.length(); i++{
			int n = Integer.parseInt(kata.substring(i, i+1));
			if (benar){
				System.out.println("BENAR!");
			} else {
				System.out.println("SALAH! Silahkan coba lagi");
			}
		}
	}

	// getter kata
	public String getKata(){
		return kata;
	}

	// mengacak kata secara random
	public String randKata(){
		return kata;
	}

	// main
	public static void main(String[] args){
		// kalau benar

		// kalau salah
	}

}