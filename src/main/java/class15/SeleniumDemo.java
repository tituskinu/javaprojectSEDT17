package class15;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver c =new ChromeDriver();
        c.navigate().to("https:facebook.com");
        System.out.println(c.getTitle());
        Thread.sleep(300);
        c.navigate().to("https:amazon.com");
        c.navigate().refresh();
        Thread.sleep(300);
        c.navigate().back();
        Thread.sleep(300);
       // c.deleteNetworkConditions();
       /// c.close();
        //EdgeDriver e=new EdgeDriver();
    }
}
