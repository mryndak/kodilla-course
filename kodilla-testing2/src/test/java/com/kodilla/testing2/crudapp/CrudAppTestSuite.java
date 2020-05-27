package com.kodilla.testing2.crudapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CrudAppTestSuite {
  private static final String BASE_URL = "https://interceptor2048.github.io/";
  private WebDriver driver;
  private Random generator;

  @BeforeEach
  public void initTests() {
    driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
    driver.get(BASE_URL);
    generator = new Random();
  }

  @AfterEach
  public void cleanUpAfterTest() {
    driver.close();
  }

  private boolean checkTaskExistsInTrello(String taskName) {
    boolean result = false;

    return result;
  }

  @Test
  public void shouldCreateTrelloCard() throws InterruptedException {
    String taskName = createCrudAppTestTask();
    sendTestTaskToTrello(taskName);
    assertTrue(checkTaskExistsInTrello(taskName));
  }

  private void sendTestTaskToTrello(String taskName) {

  }

  private String createCrudAppTestTask() {
    return null;
  }
}
