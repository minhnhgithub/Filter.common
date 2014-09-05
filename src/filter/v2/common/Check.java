package filter.v2.common;

import java.util.ArrayList;

import filter.v2.utils.IO;

public class Check {
	/**
	 * @param range
	 *            Khoang ngay muon check
	 * @param day
	 *            Ngay lay target
	 * @param s
	 *            target
	 * @return co ve trong khoang ngay muon check hay khong.
	 */
	public static boolean rangeDay(int range, int day, String s) {
		ArrayList<String> arr = null;
		day = day - 1;
		boolean flag = false;

		for (int i = 1; (i <= range) && (!flag); i++) {
			try {
				arr = new ArrayList<String>();
				arr = AAA.sortArr(IO.read(AAA.PRIMITIVE_PATH + "v"
						+ AAA.toWords(day + i)));
				if (arr.size() != 0) {
					for (String ss : arr)
						if (ss.equals(s))
							flag = true;
				}
			} catch (Exception localException) {
			}
		}

		return flag;
	}

	/**
	 * @param range
	 *            Khoang ngay muon check
	 * @param day
	 *            Ngay lay target
	 * @param s
	 *            target
	 * @param addOptDate
	 *            . Default = 0. decide the day win start check. Example : get
	 *            00 of 10/7. if optDate = 1 > win check 00 from 10+2=12/7
	 * @return tra ve ngay ve target trong khoang ngay muon check.<br>
	 *         -1: ko ve... 100: chua co data.
	 */
	public static int rangeDay_returnDay(int range, int day, String s,
			int addOptDate) {
		ArrayList<String> arr = null;
		boolean flag = false;

		int res = -1;

		for (int i = 1; (i <= range + addOptDate) && (!flag); i++) {
			try {
				arr = new ArrayList<String>();
				arr = AAA.sortArr(IO.read(AAA.PRIMITIVE_PATH + "v"
						+ AAA.toWords(day + i + addOptDate)));
				if (arr.size() != 0) {
					for (String ss : arr)
						if (ss.equals(s)) {
							flag = true;
							res = i + addOptDate;
						}
				}
			} catch (Exception e) {
				res = 100;
			}
		}

		return res;
	}

	/**
	 * @param range
	 *            Khoang ngay muon check
	 * @param day
	 *            Ngay lay target
	 * @param s
	 *            target
	 * @return <pre>
	 * tra ve ngay ve target trong khoang ngay muon check.
	 * -1: ko ve
	 * 100 exception
	 * </pre>
	 */
	public static int rangeDay_returnDay(int range, int day, String s) {

		return rangeDay_returnDay(range, day, s, 0);
	}

	public static int chamDe_returnDay(int day, String cham) {
		boolean flag = false;

		int result = -1;

		for (int i = day + 1; (i <= 41) && (!flag); i++) {
			try {
				String de = IO.read(AAA.PRIMITIVE_PATH + "v" + AAA.toWords(i))
						.get(0);
				String s1 = de.substring(0, 1);
				String s2 = de.substring(1, 2);
				if (s1.equals(cham) || s2.equals(cham)) {
					flag = true;
					result = i - day;
				}
			} catch (Exception e) {
				flag = true;
				result = 100;
			}
		}

		return result;
	}
}
