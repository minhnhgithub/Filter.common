package filter.v2.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

public class IO {

	/**
	 * Read from file
	 */
	public static ArrayList<String> read(String filename) {
		ArrayList<String> array = new ArrayList<String>();
		try {
			FileReader file = new FileReader(filename);
			BufferedReader in = new BufferedReader(file);
			String inLine;
			while ((inLine = in.readLine()) != null) {
				array.add(inLine);
			}
			in.close();
		} catch (IOException e) {
		}
		return array;
	}

	/**
	 * Write to file
	 */
	public static void write(ArrayList<String> array, String filename) {
		try {
			FileWriter file = new FileWriter(filename);
			BufferedWriter out = new BufferedWriter(file);
			for (int i = 0; i < array.size(); i++) {
				out.write(array.get(i).toString() + "\n");
			}
			out.close();
		} catch (Exception e) {
		}
	}

	/**
	 * Write String Builder to file
	 */
	public static void writeSb(StringBuilder sb, String filename) {
		try {
			@SuppressWarnings("resource")
			OutputStream out = new FileOutputStream(filename, true);
			out.write(sb.toString().getBytes());
		} catch (Exception e) {
		}
	}
}
