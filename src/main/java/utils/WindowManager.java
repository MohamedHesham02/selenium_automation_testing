package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigator;

    public WindowManager(WebDriver driver){
        this.driver = driver;
        navigator = driver.navigate();
    }
    public void GoBack(){
        navigator.back();
    }
    public void Refresh(){
        navigator.refresh();
    }
    public void GoForward(){
        navigator.forward();
    }
    public void GoTo(String url){
        navigator.to(url);
    }
    public void SwitchToTab(String tabTitle){
        var windows = driver.getWindowHandles();
        System.out.println("Number of Tabs is: "+windows.size());
        System.out.println("Window Handles:");
        windows.forEach(System.out::println);
        for(String window : windows){
            System.out.println("Switching to window: ");
            driver.switchTo().window(window);
            System.out.println("Current Window Title: "+ driver.getTitle());

            if(tabTitle == driver.getTitle()){
                break;
            }
        }

    }
}
