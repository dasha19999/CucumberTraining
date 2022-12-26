package pages;

public class DashboardPage extends CommonMethods{

    @FindBy(id="menu_pim_viewPimModule")
    public WebElement pimOption;

    @FindBy(id="menu_pim_viewEmployeeList")
    public WebElement empListOption;

    @FindBy(id="menu_pim_addEmployee")
    public WebElement addEmployeeOption;

    @FindBy(id="welcome")
    public WebElement welcomeMessage;

    @FindBy(xpath="//div[@class='menu']/ul/li")
    public List<WebElement> dashboardTabs;

    public DashboardPage() {PageFactory.initElements(driver, this);}
}
