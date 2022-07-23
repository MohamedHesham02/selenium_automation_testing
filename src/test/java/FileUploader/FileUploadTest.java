package FileUploader;

import Pages.FileUploadPage;
import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class FileUploadTest extends BaseTests {

    @Test
    public void Testware(){
        FileUploadPage uploadPageOpened = homepage.UploadFile();
        String path = "/home/mohamed/rosgraph.png";
        uploadPageOpened.UploadFileSubmission(path);
        Assert.assertTrue(uploadPageOpened.UploadFileSubmissionSuccess().endsWith("File Uploaded!"), "The alert is not the expected");
        Assert.assertTrue(uploadPageOpened.UploadFileSubmittedFile().contains("rosgraph.png"),"The uploaded file name is not the expected");
    }
}
