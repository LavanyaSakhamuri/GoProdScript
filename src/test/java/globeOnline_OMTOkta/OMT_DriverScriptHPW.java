package globeOnline_OMTOkta;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import org.testng.annotations.Test;

import globeOnline_CommonMethods.SetDriver;
import globeOnline_CommonMethods.util;
import utility.Constant;
import utility.Control;
import utility.Generic;

public class OMT_DriverScriptHPW extends SetDriver {
	public static util util = new util();
	private static OMT_ActionKeywordsHPW ActionKeywords = new OMT_ActionKeywordsHPW();
	private static LinkedHashMap<String, Integer> Map1 = new LinkedHashMap<>();

	public static Method method[];
	public static String sActionKeyword;
	public static String sActionKeywordAgent;
	public static String AssignToAgent;
	public static int count = 1;
	public static String OrderStateValue;
	public static int OrderStateNumber;

	public OMT_DriverScriptHPW() {
		ActionKeywords = new OMT_ActionKeywordsHPW();

		method = ActionKeywords.getClass().getMethods();
	}

	@Test
	public static void main() throws Exception {
		// String SCname=util.ReadFromExcel(ScenarioName, "Sheet1", 29);
		// int AS=5;
		Generic.TestScriptStart("OMT");
		Generic.WriteTestCase("Validating and Processing OMT Order", "User should be able to validate and process OMT order", "ExpectedResult","ActualResult");
		
		String SCname = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);
		String FlowID = SCname;
		ArrayList a = util.readExcelData(1, FlowID, "FlowDetails");
		String b = a.toString();
		String c = b.replace("[", " ");
		String d = c.replace("]", " ");

		// for continuation flow
				if (!(OrderStateValue.equals("0")) && d.trim().contains(FlowID)) {
					int OrderStateNumber = Integer.parseInt(OrderStateValue);
					for (int icol = OrderStateNumber + 4; icol <= 200; icol = icol + 2) {
						sActionKeyword = util.ReadFromExcel(FlowID, "FlowDetails_Renewal", icol);
						sActionKeywordAgent = util.ReadFromExcel(FlowID, "FlowDetails_Renewal", icol + 1);
						System.out.println("current Keyword is: " + sActionKeyword + " and assigned Agent is : "
								+ sActionKeywordAgent + "");
						// AssignToAgent = util.ReadFromExcel(FlowID,
						// "FlowDetails_Renewal_Renewal", icol + 1);

						if (sActionKeyword.equalsIgnoreCase("Halt_execution")) {
							break;
						}
						execute_Actions1(sActionKeywordAgent);

					}
				}

				// for starting execution order state should be 0
				else if (d.trim().contains(FlowID)) {
					for (int icol = 2; icol <= 200; icol = icol + 2) {

						sActionKeyword = util.ReadFromExcel(FlowID, "FlowDetails_Renewal", icol);
						sActionKeywordAgent = util.ReadFromExcel(FlowID, "FlowDetails_Renewal", icol + 1);
						System.out.println("current Keyword is: " + sActionKeyword + " and assigned Agent is : "
								+ sActionKeywordAgent + "");
						// AssignToAgent = util.ReadFromExcel(FlowID,
						// "FlowDetails_Renewal_Renewal", icol + 1);
						if (sActionKeyword.equalsIgnoreCase("Halt_execution")) {
							break;
						}
						execute_Actions(sActionKeywordAgent);

					}
				}


	}

	public static void execute_Actions(String sActionKeywordAgent) throws Exception {

		for (int i = 0; i < method.length; i++) {

			if (method[i].getName().equals(sActionKeyword)) {

				method[i].invoke(ActionKeywords, sActionKeywordAgent);

				Constant.dataMap1.set(Map1);
				Constant.dataMap1.get().put("OMT_OrderState", count);

				util.writeToExcelExistingRowFromMap1("Sheet1", Constant.dataMap1.get(), Constant.ScenarioName, 1);

				OrderStateValue = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.OrderState);
				int OrderStateNumber = Integer.parseInt(OrderStateValue);

				count = OrderStateNumber + 1;
				break;
			}

		
	}
		Generic.TestScriptEnds();
        Control.GeneratePDFReport();
	}
	
	public static void execute_Actions1(String sActionKeywordAgent) throws Exception {

		for (int i = 0; i < method.length; i++) {

			if (method[i].getName().equals(sActionKeyword)) {

				method[i].invoke(ActionKeywords, sActionKeywordAgent);

				OrderStateValue = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.OrderState);
				int OrderStateNumber = Integer.parseInt(OrderStateValue);

				Constant.dataMap1.set(Map1);
				Constant.dataMap1.get().put("OMT_OrderState", OrderStateNumber + 1);

				util.writeToExcelExistingRowFromMap1("Sheet1", Constant.dataMap1.get(), Constant.ScenarioName, 1);

				// count = OrderStateNumber + 1;
				break;
			}

		}
	}

	
	
	
}
