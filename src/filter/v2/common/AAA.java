package filter.v2.common;

import java.util.ArrayList;
import java.util.Collections;

import filter.v2.utils.IO;

/**
 * Chua toan bo utility cua software.
 * 
 */
public class AAA {

	private static String SETTING_PATH = "./setting/filter.v2.kk";

	public static String IMPORT_PATH = "";
	public static String PRIMITIVE_PATH = "";
	public static String HTML_PATH = "";

	public static int sToI(String s) {
		return Integer.parseInt(s);
	}

	public static String iToS(Integer i) {
		return String.valueOf(i);
	}

	public static String reverse(String s) {
		return s.substring(1, 2).concat(s.substring(0, 1));
	}

	/**
	 * Convert int become two words.
	 */
	public static String toWords(int i) {
		if (i < 10)
			return "0" + iToS(i);
		else
			return iToS(i);
	}

	public static void applyPath(String smonth, String syear) {
		final ArrayList<String> arrr = IO.read(SETTING_PATH);
		final String dataPath = arrr.get(0);

		IMPORT_PATH = dataPath + syear + "/" + smonth + "/Import/";
		PRIMITIVE_PATH = dataPath + syear + "/" + smonth + "/Primitive/";
		HTML_PATH = dataPath + "html\\";
	}

	public static int getSum(String s) {
		int i = sToI(s);
		int i1 = i / 10000;
		int i2 = (i - i1 * 10000) / 1000;
		int i3 = (i - i1 * 10000 - i2 * 1000) / 100;
		int i4 = (i - i1 * 10000 - i2 * 1000 - i3 * 100) / 10;
		int i5 = i - i1 * 10000 - i2 * 1000 - i3 * 100 - i4 * 10;

		return i1 + i2 + i3 + i4 + i5;
	}

	public static String returnExactlyDate(int day, String month, String year) {
		String exactDate = AAA.toWords(day);

		// 2009: 26/1
		if (month.equals("01") && year.equals("2010") && day >= 26) {
			day += 4;
			if (day > 30) {
				return "";
			}
			return AAA.toWords(day);
		}
		// 2010: 14/2
		else if (month.equals("02") && year.equals("2010") && day >= 14) {
			day += 4;
			if (day > 28) {
				return "";
			}
			return AAA.toWords(day);
		}
		// 2011: 3/2
		else if (month.equals("02") && year.equals("2011") && day >= 3) {
			day += 4;
			if (day > 28) {
				return "";
			}
			return AAA.toWords(day);
		}
		// 2012: 23/1
		else if (month.equals("01") && year.equals("2012") && day >= 23) {
			day += 4;
			if (day > 30) {
				return "";
			}
			return AAA.toWords(day);
		}
		// 2013: 9/2
		else if (month.equals("02") && year.equals("2013") && day >= 9) {
			day += 4;
			if (day > 28) {
				return "";
			}
			return AAA.toWords(day);
		}
		// 2014: 29/1 -> 03/02
		else if (month.equals("02") && year.equals("2014") && day >= 1) {
			day += 2;
			if (day > 28) {
				return "";
			}
			return AAA.toWords(day);
		}

		// fix all february
		if (month.equals("02")) {
			if (Integer.valueOf(year) % 4 == 0) {
				if (day > 29) {
					return "";
				} else
					return AAA.toWords(day);
			} else if (day > 28) {
				return "";
			}
			return AAA.toWords(day);
		}

		return exactDate;
	}

	private static String getStringKetqua(int day, String smonth, String syear) {
		int index = day - 1;
		applyPath(smonth, syear);
		String ketqua = optimizeS(IO.read(
				AAA.IMPORT_PATH + "DBG1_" + smonth + "_" + syear).get(index));
		ketqua += optimizeS(IO.read(
				AAA.IMPORT_PATH + "G2_" + smonth + "_" + syear).get(index));
		ketqua += optimizeS(IO.read(
				AAA.IMPORT_PATH + "G3_" + smonth + "_" + syear).get(2 * index));
		ketqua += optimizeS(IO.read(
				AAA.IMPORT_PATH + "G3_" + smonth + "_" + syear).get(
				2 * index + 1));
		ketqua += optimizeS(IO.read(
				AAA.IMPORT_PATH + "G4_" + smonth + "_" + syear).get(2 * index));
		ketqua += optimizeS(IO.read(
				AAA.IMPORT_PATH + "G4_" + smonth + "_" + syear).get(
				2 * index + 1));
		ketqua += optimizeS(IO.read(
				AAA.IMPORT_PATH + "G5_" + smonth + "_" + syear).get(2 * index));
		ketqua += optimizeS(IO.read(
				AAA.IMPORT_PATH + "G5_" + smonth + "_" + syear).get(
				2 * index + 1));
		ketqua += optimizeS(IO.read(
				AAA.IMPORT_PATH + "G6_" + smonth + "_" + syear).get(index));
		ketqua += optimizeS(IO.read(
				AAA.IMPORT_PATH + "G7_" + smonth + "_" + syear).get(index));

		return ketqua;
	}

	public static ArrayList<String> getListKetqua(int day, String smonth,
			String syear) {
		final ArrayList<String> ketqualist = sToArr(getStringKetqua(day,
				smonth, syear));

		return ketqualist;
	}

	private static ArrayList<String> sToArr(String s) {
		ArrayList<String> ketqualist = new ArrayList<String>();
		if (s.length() > 0) {
			for (int i = 0; i < s.length(); i++) {
				ketqualist.add(s.substring(i, i + 1));
			}
		}

		return ketqualist;
	}

	/**
	 * remove space, tab and new-line
	 */
	public static String optimizeS(String s) {
		s = s.replace(" ", "");
		s = s.replace("\t", "");
		s = s.replace("\n", "");

		return s;
	}

	public static ArrayList<String> sortArr(ArrayList<String> arrtemp) {
		ArrayList<String> arr = new ArrayList<String>();
		Collections.sort(arrtemp);
		for (int k = 0; k < arrtemp.size() - 1; k++) {
			if (!((String) arrtemp.get(k)).equals(arrtemp.get(k + 1))) {
				arr.add((String) arrtemp.get(k));
			}
		}
		arr.add((String) arrtemp.get(arrtemp.size() - 1));
		return arr;
	}
}
