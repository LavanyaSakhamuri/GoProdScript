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

public class OMT_DriverScriptAcqui extends SetDriver {
	public static util util = new util();
	private static OMT_ActionKeywords_Acqui ActionKeywords = new OMT_ActionKeywords_Acqui();
	private static LinkedHashMap<String, Integer> Map1 = new LinkedHashMap<>();

	public static Method method[];
	public static String sActionKeyword;
	public static String sActionKeywordAgent;
	public static String AssignToAgent;
	public static int count = 1;
	public static String OrderStateValue;
	public static int OrderStateNumber;
	public static int OS = 0;
	public static int OrderStateValueReturn = 0;

	public OMT_DriverScriptAcqui() {
		
		ActionKeywords = new OMT_ActionKeywords_Acqui();
		method = ActionKeywords.getClass().getMethods();
	}

	@Test
	public static void main() throws Exception {
		Generic.TestScriptStart("OMT");
		Generic.WriteTestCase("Validating and Processing OMT Order", "User should be able to validate and process OMT order", "ExpectedResult","ActualResult");
		
		String SCname = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);

		String FlowID = SCname;
		ArrayList a = util.readExcelData(1, FlowID, "FlowDetails");
		String b = a.toString();
		String c = b.replace("[", " ");
		String d = c.replace("]", " ");

		OrderStateValue = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.OrderState);

		// for continuation flow..in excel sheet change the order state other than 0//
		if (!(OrderStateValue.equals("0")) && d.trim().contains(FlowID)) {
			int OrderStateNumber = Integer.parseInt(OrderStateValue);

			
			for (int icol = OrderStateNumber + OrderStateNumber + 2; icol <= 200; icol = icol + 2) {
				sActionKeyword = util.ReadFromExcel(FlowID, "FlowDetails", icol);
				sActionKeywordAgent = util.ReadFromExcel(FlowID, "FlowDetails", icol + 1);
				System.out.println("current Keyword is: " + sActionKeyword + " and assigned Agent is : "
						+ sActionKeywordAgent + "");

				if (sActionKeyword.equalsIgnoreCase("Halt_Execution")) {
					OrderStateValue = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.OrderState);
					int OrderState = Integer.parseInt(OrderStateValue);
					Constant.dataMap1.set(Map1);
					Constant.dataMap1.get().put("OMT_OrderState", OrderState + 1);

					util.writeToExcelExistingRowFromMap1("Sheet1", Constant.dataMap1.get(), Constant.ScenarioName, 1);

					break;
				}

				int OrderStateNumberReturn = execute_Actions1(sActionKeywordAgent);
				OS = OrderStateNumberReturn;
				System.out.println(OrderStateNumberReturn);

			}
		}

		// for starting execution order state should be 0
		else if (d.trim().contains(FlowID)) {
			for (int icol = 2; icol <= 200; icol = icol + 2) {

				sActionKeyword = util.ReadFromExcel(FlowID, "FlowDetails", icol);
				sActionKeywordAgent = util.ReadFromExcel(FlowID, "FlowDetails", icol + 1);
				System.out.println("current Keyword is: " + sActionKeyword + " and assigned Agent is : "
						+ sActionKeywordAgent + "");
				// AssignToAgent = util.ReadFromExcel(FlowID,
				// "FlowDetails_Renewal_Renewal", icol + 1);
				if (sActionKeyword.equalsIgnoreCase("Halt_Execution")) {
					Constant.dataMap1.set(Map1);
					Constant.dataMap1.get().put("OMT_OrderState", OrderStateNumber + 1);

					util.writeToExcelExistingRowFromMap1("Sheet1", Constant.dataMap1.get(), Constant.ScenarioName, 1);
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

	public static int execute_Actions1(String sActionKeywordAgent) throws Exception {

		for (int i = 0; i < method.length; i++) {

			if (method[i].getName().equals(sActionKeyword)) {

				method[i].invoke(ActionKeywords, sActionKeywordAgent);

				OrderStateValue = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.OrderState);
				int OrderStateNumber1 = Integer.parseInt(OrderStateValue);

				Constant.dataMap1.set(Map1);
				Constant.dataMap1.get().put("OMT_OrderState", OrderStateNumber1 + 1);

				util.writeToExcelExistingRowFromMap1("Sheet1", Constant.dataMap1.get(), Constant.ScenarioName, 1);

				OrderStateValue = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.OrderState);
System.out.println(OrderStateValue);
				break;
			}

		}
		int OrderStateNumberReturn = Integer.parseInt(OrderStateValue);

		return OrderStateNumberReturn;

	}

}
