/*
 In questo esercizio bisogna leggere il file stream_reader.txt. Il contenuto deve essere trasformato in maiuscolo
 e scritto su un nuovo file. Il file di lettura e scrittura vanno passati da terminale.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader brd = new BufferedReader(new FileReader(args[0]));
				BufferedWriter bwt = new BufferedWriter(new FileWriter(args[1]))) {
			String line;
			while((line = brd.readLine()) != null) {
				bwt.write(line.toUpperCase());
				bwt.newLine();
			}
		} catch(IOException e) {
			System.out.println("Errore nella lettura del file " + e);
		}
	}
}
