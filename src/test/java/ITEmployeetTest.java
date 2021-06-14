import java.util.Arrays;

import com.rags.POJO.ITEmployee;
import com.rags.POJO.ITManager;

public class ITEmployeetTest {

	public static void main(String[] args) {
		
		ITEmployee itemployee=new ITEmployee();
		itemployee.setDesignation("ITA");
		itemployee.setSkills(Arrays.asList("js","react"));
		itemployee.setYoe(5);
		
		
		
		ITManager itmanager=new ITManager();
		itmanager.setAccounts(Arrays.asList("wallmart","target"));
		itmanager.setDesingation("Senior Manager");
		itmanager.setProfitMargin(66);
		
		System.out.println(itemployee.getSkills());
		System.out.println(itmanager.getAccounts());
		
		
		
		
		
		

	}

}
