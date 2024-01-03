package com.examen.activitylifecyclesample;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;

import static java.util.regex.Pattern.matches;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
//ActivityTestRule is depericated
    // Preferred JUnit 4 mechanism of specifying the activity to be launched before each test
    @Rule
    public ActivityScenarioRule activityActivityScenarioRule = new ActivityScenarioRule<>(MainActivityTest.class);

    // Looks for an EditText with id = "R.id.etInput"
    // Types the text "Hello" into the EditText
    // Verifies the EditText has text "Hello"
    @Test
    public void validateEditText(){
        onView(withId(R.id.etText)).perform(typeText("Hello")).check(matches(withText("Hello")));
    }


}