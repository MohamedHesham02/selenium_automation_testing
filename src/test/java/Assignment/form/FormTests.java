package Assignment.form;

import Assignment.FormPage_Assign;
import Assignment.FormSubmitted_Assign;
import Assignment.base.BaseTestAssign;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class FormTests extends BaseTestAssign {

    @Test
    public void SubmitTest(){
        FormPage_Assign submission = formPage;
        submission.setFirstName();
        submission.setLastName();
        submission.setJobTitle();
        submission.LevelOfEducation();
        submission.Gender();
        submission.Experience();
        submission.DatePick();
        FormSubmitted_Assign ThanksPage = submission.submitButton();
        assertTrue(ThanksPage.SubmissionMessage().contains("The form was successfully submitted!"), "The actual output is not the expected");

    }
}
