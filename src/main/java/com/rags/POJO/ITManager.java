package com.rags.POJO;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class ITManager {
	

	public static int getProfitMargin() {
		return profitMargin;
	}
	public static void setProfitMargin(int profitMargin) {
		ITManager.profitMargin = profitMargin;
	}
	public static String getDesingation() {
		return desingation;
	}
	public static void setDesingation(String desingation) {
		ITManager.desingation = desingation;
	}
	public static List<String> getAccounts() {
		return accounts;
	}
	public static void setAccounts(List<String> accounts) {
		ITManager.accounts = accounts;
	}
	private static int profitMargin;
	private static String desingation;
	private static List<String> accounts;

}
