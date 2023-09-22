package class22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WeDriverTester {
    public static void main(String[] args) throws InterruptedException {
        WebDriver [] browser={new ChromeDriver(),new EdgeDriver()};
        for(WebDriver w:browser) {
            w.manage().window().maximize();
            w.navigate().to("http://apple.com");
            Thread.sleep(2000);
            System.out.println(w.getTitle());
            Thread.sleep(2000);
            w.close();
        }
    }
}
