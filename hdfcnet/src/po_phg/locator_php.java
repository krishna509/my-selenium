package po_phg;

import org.openqa.selenium.By;

public class locator_php
{
  public static By username_xpath=By.xpath("//input[@name='email']");
  public static By pass_xpath=By.xpath("//input[@name='password']");
  public static By login_xpath=By.xpath("//input[@type='submit']");
  public static By tour_xpath=By.xpath("//a[@href='#Tours']");
  public static By touradd_xpath=By.xpath("//a[@href='https://www.phptravels.net/admin/tours/add']");
  public static By tour_type=By.xpath("//div[@id='s2id_autogen11']/a/span");
  public static By tour_select=By.xpath("select[@name='tourtype']");
  
  
}
