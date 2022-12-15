package globeOnline_CommonMethods;
import org.openqa.selenium.By;

import com.pages.Acqui.BasePage;

public class MagentoPage extends BasePage {
	
	By AdvancedBtn = By.xpath("//button[@id='details-button' and contains(text(),'Advanced')]");
	By proceedtocommerceuat = By.xpath("//a[@id='proceed-link' and contains(text(),'Proceed to commerceuat.globetel.com (unsafe)')]");
	By Username = By.xpath("//input[@id='username']");
	By Password = By.xpath("//input[@id='login']");
	By SignInBtn = By.xpath("//span[contains(text(), 'Sign in')]");
	By SalesBtn = By.xpath("//li[@id='menu-magento-sales-sales']");
	By OrdersBtn = By.xpath("//a[contains(@href,'https://commerceuat.globetel.com/globestore/sales/order/')]");
	By SearchBoxField = By.xpath("(//input[@id='fulltext' and @placeholder='Search by keyword'])[1]");
	By ViewBtn = By.xpath("//a[contains(@href,'https://commerceuat.globetel.com/globestore/sales/order/view/')]");
	By OrderID = By.xpath("//div[@class='data-grid-cell-content' and contains(text(), 'UAT')]");
	By OrderPurchaseDate = By.xpath("//div[@class='data-grid-cell-content' and contains(text(), '2022')]");
	By OrderBilltoDate = By.xpath("(//div[@class='data-grid-cell-content'])[4]");
	By OrderGrandTotalBase = By.xpath("(//div[@class='data-grid-cell-content'])[6]");
	By OrderGrandTotalPurchased = By.xpath("(//div[@class='data-grid-cell-content'])[7]");
	By OrderStatus = By.xpath("(//div[@class='data-grid-cell-content'])[8]");
	By OrderMobileNumber = By.xpath("(//div[@class='data-grid-cell-content'])[11]");
	By OrderMSANumber = By.xpath("(//div[@class='data-grid-cell-content'])[13]");
	By OrderBrgy = By.xpath("(//div[@class='data-grid-cell-content'])[15]");
	By OrderType = By.xpath("(//div[@class='data-grid-cell-content'])[16]");
	
	By OrdeTransac_OrderId = By.xpath("//h1[contains(text(), '#UAT-')]");

	
	
}
