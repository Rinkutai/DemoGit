package com.qa.test;

import org.testng.annotations.Test;

//import com.qa.Library.TestBase;
import com.qa.Pages.HomePage;

public class LoginTest {

	@Test

	public void searchTab() {

		HomePage a = new HomePage();

		a.searchBox();

	}
}
