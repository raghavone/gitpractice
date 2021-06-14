package com.rags.POJO;



import java.util.List;


public class ITEmployee {

	
	private static int yoe;
	private static String designation;
	private static List<String> skills;
	
	public static int getYoe() {
		return yoe;
	}
	public static void setYoe(int yoe) {
		ITEmployee.yoe = yoe;
	}
	public static String getDesignation() {
		return designation;
	}
	public static void setDesignation(String designation) {
		ITEmployee.designation = designation;
	}
	public static List<String> getSkills() {
		return skills;
	}
	public static void setSkills(List<String> skills) {
		ITEmployee.skills = skills;
	}
	

}
