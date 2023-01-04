package globeOnline_OMTOkta;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import org.testng.annotations.Test;
import utility.*;
import globeOnline_CommonMethods.SetDriver;
import globeOnline_CommonMethods.util;

public class OMT_DriverScriptMNP extends SetDriver {
	public static util util = new util();
	private static OMT_ActionKeywords_MNP ActionKeywords = new OMT_ActionKeywords_MNP();
	private static LinkedHashMap<String, Integer> Map1 = new LinkedHashMap<>();

	public static Method method[];
	public static String sActionKeyword;
	public static String sActionKeywordAgent;
	public static String AssignToAgent;
	public static int count = 1;

	public OMT_DriverScriptMNP() {
		ActionKeywords = new OMT_ActionKeywords_MNP();

		method = ActionKeywords.getClass().getMethods();
	}

	@Test
	public static void main() throws Exception {
		// String SCname=util.ReadFromExcel(ScenarioName, "Sheet1", 29);
		// int AS=5;
		
		Generic.TestScriptStart("Name");
		Generic.WriteTestCase("validating ", "user able to access should be able to  validate order details in magento ", "ExpectedResult","ActualResult");

		String SCname = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);
		String FlowID = SCname;
		ArrayList a = util.readExcelData(1, FlowID, "FlowDetails");
		String b = a.toString();
		String c = b.replace("[", " ");
		String d = c.replace("]", " ");

		if (d.trim().contains(FlowID)) {
			for (int icol = 2; icol <= 200; icol = icol + 1) {

				sActionKeyword = util.ReadFromExcel(FlowID, "FlowDetails", icol);
				sActionKeywordAgent = util.ReadFromExcel(FlowID, "FlowDetails", icol + 1);
				System.out.println("User Logged in with Agent: " + sActionKeywordAgent + "");
				AssignToAgent = util.ReadFromExcel(FlowID, "FlowDetails", icol + 1);
				execute_Actions(AssignToAgent);
				
			}
			
		}

	}

	public static void execute_Actions(String AssignToAgent) throws Exception {

		for (int i = 0; i < method.length; i++) {

			if (method[i].getName().contains(sActionKeyword)) {

				method[i].invoke(ActionKeywords, AssignToAgent);
				Constant.dataMap1.set(Map1);
				Constant.dataMap1.get().put("OMT_OrderState", count);
				util.writeToExcelExistingRowFromMap1("Sheet1", Constant.dataMap1.get(), Constant.ScenarioName, 1);
				count = count + 1;
				break;
			}

		}
		Generic.TestScriptEnds();
		Control.GeneratePDFReport();
	}
}
