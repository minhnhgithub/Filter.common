package filter.v2.common;

import java.util.ArrayList;

import filter.v2.utils.IO;

/**
 * Lay con danh
 * 
 */
public class Target {

	public String getTarget(String giai, int day, String month, String year,
			boolean ifFully) {
		if (giai.equals("DB")) {
			return db(day, month, year, ifFully);
		} else if (giai.equals("G1")) {
			return g1(day, month, year, ifFully);
		} else if (giai.equals("G21")) {
			return g21(day, month, year, ifFully);
		} else if (giai.equals("G22")) {
			return g22(day, month, year, ifFully);
		} else if (giai.equals("G31")) {
			return g31(day, month, year, ifFully);
		} else if (giai.equals("G32")) {
			return g32(day, month, year, ifFully);
		} else if (giai.equals("G33")) {
			return g33(day, month, year, ifFully);
		} else if (giai.equals("G34")) {
			return g34(day, month, year, ifFully);
		} else if (giai.equals("G35")) {
			return g35(day, month, year, ifFully);
		} else if (giai.equals("G36")) {
			return g36(day, month, year, ifFully);
		} else if (giai.equals("G41")) {
			return g41(day, month, year, ifFully);
		} else if (giai.equals("G42")) {
			return g42(day, month, year, ifFully);
		} else if (giai.equals("G43")) {
			return g43(day, month, year, ifFully);
		} else if (giai.equals("G44")) {
			return g44(day, month, year, ifFully);
		} else if (giai.equals("G51")) {
			return g51(day, month, year, ifFully);
		} else if (giai.equals("G52")) {
			return g52(day, month, year, ifFully);
		} else if (giai.equals("G53")) {
			return g53(day, month, year, ifFully);
		} else if (giai.equals("G54")) {
			return g54(day, month, year, ifFully);
		} else if (giai.equals("G55")) {
			return g55(day, month, year, ifFully);
		} else if (giai.equals("G56")) {
			return g56(day, month, year, ifFully);
		} else if (giai.equals("G61")) {
			return g61(day, month, year, ifFully);
		} else if (giai.equals("G62")) {
			return g62(day, month, year, ifFully);
		} else if (giai.equals("G63")) {
			return g63(day, month, year, ifFully);
		} else if (giai.equals("G71")) {
			return g71(day, month, year, ifFully);
		} else if (giai.equals("G72")) {
			return g72(day, month, year, ifFully);
		} else if (giai.equals("G73")) {
			return g73(day, month, year, ifFully);
		} else if (giai.equals("G74")) {
			return g74(day, month, year, ifFully);
		} else
			return "null";
	}

	public String db(int day, String month, String year, boolean isFully) {
		int index = day - 1;
		AAA.applyPath(month, year);
		String sss = IO.read(AAA.IMPORT_PATH + "DBG1_" + month + "_" + year)
				.get(index).substring(0, 5);
		if (!isFully)
			return sss.substring(3, 5);

		return sss;
	}

	public String g1(int day, String month, String year, boolean isFully) {
		int index = day - 1;
		AAA.applyPath(month, year);
		String sss = IO.read(AAA.IMPORT_PATH + "DBG1_" + month + "_" + year)
				.get(index).substring(5, 10);
		if (!isFully)
			return sss.substring(3, 5);

		return sss;
	}

	public String g21(int day, String month, String year, boolean isFully) {
		int index = day - 1;
		AAA.applyPath(month, year);
		String sss = IO.read(AAA.IMPORT_PATH + "G2_" + month + "_" + year)
				.get(index).substring(0, 5);
		if (!isFully)
			return sss.substring(3, 5);

		return sss;
	}

	public String g22(int day, String month, String year, boolean isFully) {
		int index = day - 1;
		AAA.applyPath(month, year);
		String sss = IO.read(AAA.IMPORT_PATH + "G2_" + month + "_" + year)
				.get(index).substring(7, 12);
		if (!isFully)
			return sss.substring(3, 5);

		return sss;
	}

	public String g31(int day, String month, String year, boolean isFully) {
		int index = day - 1;
		AAA.applyPath(month, year);
		ArrayList<String> list1 = IO.read(AAA.IMPORT_PATH + "G3_" + month + "_"
				+ year);
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < list1.size(); i += 2) {
			list.add(list1.get(i));
		}
		String sss = list.get(index).substring(0, 5);
		if (!isFully)
			return sss.substring(3, 5);

		return sss;
	}

	public String g32(int day, String month, String year, boolean isFully) {
		int index = day - 1;
		AAA.applyPath(month, year);
		ArrayList<String> list1 = IO.read(AAA.IMPORT_PATH + "G3_" + month + "_"
				+ year);
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < list1.size(); i += 2) {
			list.add(list1.get(i));
		}
		String sss = list.get(index).substring(7, 12);
		if (!isFully)
			return sss.substring(3, 5);

		return sss;
	}

	public String g33(int day, String month, String year, boolean isFully) {
		int index = day - 1;
		AAA.applyPath(month, year);
		ArrayList<String> list1 = IO.read(AAA.IMPORT_PATH + "G3_" + month + "_"
				+ year);
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < list1.size(); i += 2) {
			list.add(list1.get(i));
		}
		String sss = list.get(index).substring(14, 19);
		if (!isFully)
			return sss.substring(3, 5);

		return sss;
	}

	public String g34(int day, String month, String year, boolean isFully) {
		int index = day - 1;
		AAA.applyPath(month, year);
		ArrayList<String> list1 = IO.read(AAA.IMPORT_PATH + "G3_" + month + "_"
				+ year);
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 1; i < list1.size(); i += 2) {
			list.add(list1.get(i));
		}
		String sss = list.get(index).substring(0, 5);
		if (!isFully)
			return sss.substring(3, 5);

		return sss;
	}

	public String g35(int day, String month, String year, boolean isFully) {
		int index = day - 1;
		AAA.applyPath(month, year);
		ArrayList<String> list1 = IO.read(AAA.IMPORT_PATH + "G3_" + month + "_"
				+ year);
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 1; i < list1.size(); i += 2) {
			list.add(list1.get(i));
		}
		String sss = list.get(index).substring(7, 12);
		if (!isFully)
			return sss.substring(3, 5);

		return sss;
	}

	public String g36(int day, String month, String year, boolean isFully) {
		int index = day - 1;
		AAA.applyPath(month, year);
		ArrayList<String> list1 = IO.read(AAA.IMPORT_PATH + "G3_" + month + "_"
				+ year);
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 1; i < list1.size(); i += 2) {
			list.add(list1.get(i));
		}
		String sss = list.get(index).substring(14, 19);
		if (!isFully)
			return sss.substring(3, 5);

		return sss;
	}

	public String g41(int day, String month, String year, boolean isFully) {
		int index = day - 1;
		AAA.applyPath(month, year);
		ArrayList<String> list1 = IO.read(AAA.IMPORT_PATH + "G4_" + month + "_"
				+ year);
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < list1.size(); i += 2) {
			list.add(list1.get(i));
		}
		String sss = list.get(index).substring(0, 4);
		if (!isFully)
			return sss.substring(2, 4);

		return sss;
	}

	public String g42(int day, String month, String year, boolean isFully) {
		int index = day - 1;
		AAA.applyPath(month, year);
		ArrayList<String> list1 = IO.read(AAA.IMPORT_PATH + "G4_" + month + "_"
				+ year);
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < list1.size(); i += 2) {
			list.add(list1.get(i));
		}
		String sss = list.get(index).substring(6, 10);
		if (!isFully)
			return sss.substring(2, 4);

		return sss;
	}

	public String g43(int day, String month, String year, boolean isFully) {
		int index = day - 1;
		AAA.applyPath(month, year);
		ArrayList<String> list1 = IO.read(AAA.IMPORT_PATH + "G4_" + month + "_"
				+ year);
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 1; i < list1.size(); i += 2) {
			list.add(list1.get(i));
		}
		String sss = list.get(index).substring(0, 4);
		if (!isFully)
			return sss.substring(2, 4);

		return sss;
	}

	public String g44(int day, String month, String year, boolean isFully) {
		int index = day - 1;
		AAA.applyPath(month, year);
		ArrayList<String> list1 = IO.read(AAA.IMPORT_PATH + "G4_" + month + "_"
				+ year);
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 1; i < list1.size(); i += 2) {
			list.add(list1.get(i));
		}
		String sss = list.get(index).substring(6, 10);
		if (!isFully)
			return sss.substring(2, 4);

		return sss;
	}

	public String g51(int day, String month, String year, boolean isFully) {
		int index = day - 1;
		AAA.applyPath(month, year);
		ArrayList<String> list1 = IO.read(AAA.IMPORT_PATH + "G5_" + month + "_"
				+ year);
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < list1.size(); i += 2) {
			list.add(list1.get(i));
		}
		String sss = list.get(index).substring(0, 4);
		if (!isFully)
			return sss.substring(2, 4);

		return sss;
	}

	public String g52(int day, String month, String year, boolean isFully) {
		int index = day - 1;
		AAA.applyPath(month, year);
		ArrayList<String> list1 = IO.read(AAA.IMPORT_PATH + "G5_" + month + "_"
				+ year);
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < list1.size(); i += 2) {
			list.add(list1.get(i));
		}
		String sss = list.get(index).substring(6, 10);
		if (!isFully)
			return sss.substring(2, 4);

		return sss;
	}

	public String g53(int day, String month, String year, boolean isFully) {
		int index = day - 1;
		AAA.applyPath(month, year);
		ArrayList<String> list1 = IO.read(AAA.IMPORT_PATH + "G5_" + month + "_"
				+ year);
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < list1.size(); i += 2) {
			list.add(list1.get(i));
		}
		String sss = list.get(index).substring(12, 16);
		if (!isFully)
			return sss.substring(2, 4);

		return sss;
	}

	public String g54(int day, String month, String year, boolean isFully) {
		int index = day - 1;
		AAA.applyPath(month, year);
		ArrayList<String> list1 = IO.read(AAA.IMPORT_PATH + "G5_" + month + "_"
				+ year);
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 1; i < list1.size(); i += 2) {
			list.add(list1.get(i));
		}
		String sss = list.get(index).substring(0, 4);
		if (!isFully)
			return sss.substring(2, 4);

		return sss;
	}

	public String g55(int day, String month, String year, boolean isFully) {
		int index = day - 1;
		AAA.applyPath(month, year);
		ArrayList<String> list1 = IO.read(AAA.IMPORT_PATH + "G5_" + month + "_"
				+ year);
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 1; i < list1.size(); i += 2) {
			list.add(list1.get(i));
		}
		String sss = list.get(index).substring(6, 10);
		if (!isFully)
			return sss.substring(2, 4);

		return sss;
	}

	public String g56(int day, String month, String year, boolean isFully) {
		int index = day - 1;
		AAA.applyPath(month, year);
		ArrayList<String> list1 = IO.read(AAA.IMPORT_PATH + "G5_" + month + "_"
				+ year);
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 1; i < list1.size(); i += 2) {
			list.add(list1.get(i));
		}
		String sss = list.get(index).substring(12, 16);
		if (!isFully)
			return sss.substring(2, 4);

		return sss;
	}

	public String g61(int day, String month, String year, boolean isFully) {
		int index = day - 1;
		AAA.applyPath(month, year);
		String sss = IO.read(AAA.IMPORT_PATH + "G6_" + month + "_" + year)
				.get(index).substring(0, 3);
		if (!isFully)
			return sss.substring(1, 3);

		return sss;
	}

	public String g62(int day, String month, String year, boolean isFully) {
		int index = day - 1;
		AAA.applyPath(month, year);
		String sss = IO.read(AAA.IMPORT_PATH + "G6_" + month + "_" + year)
				.get(index).substring(5, 8);
		if (!isFully)
			return sss.substring(1, 3);

		return sss;
	}

	public String g63(int day, String month, String year, boolean isFully) {
		int index = day - 1;
		AAA.applyPath(month, year);
		String sss = IO.read(AAA.IMPORT_PATH + "G6_" + month + "_" + year)
				.get(index).substring(10, 13);
		if (!isFully)
			return sss.substring(1, 3);

		return sss;
	}

	public String g71(int day, String month, String year, boolean isFully) {
		int index = day - 1;
		AAA.applyPath(month, year);
		String sss = IO.read(AAA.IMPORT_PATH + "G7_" + month + "_" + year)
				.get(index).substring(0, 2);

		return sss;
	}

	public String g72(int day, String month, String year, boolean isFully) {
		int index = day - 1;
		AAA.applyPath(month, year);
		String sss = IO.read(AAA.IMPORT_PATH + "G7_" + month + "_" + year)
				.get(index).substring(4, 6);

		return sss;
	}

	public String g73(int day, String month, String year, boolean isFully) {
		int index = day - 1;
		AAA.applyPath(month, year);
		String sss = IO.read(AAA.IMPORT_PATH + "G7_" + month + "_" + year)
				.get(index).substring(8, 10);

		return sss;
	}

	public String g74(int day, String month, String year, boolean isFully) {
		int index = day - 1;
		AAA.applyPath(month, year);
		String sss = IO.read(AAA.IMPORT_PATH + "G7_" + month + "_" + year)
				.get(index).substring(12, 14);

		return sss;
	}

	public String getTarget(String giai, int day, String month, String year) {

		return getTarget(giai, day, month, year, false);
	}
}
