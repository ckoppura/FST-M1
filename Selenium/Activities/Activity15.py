from selenium import webdriver
from selenium.webdriver.common.by import By



with webdriver.Firefox() as driver:

    driver.get("https://v1.training-support.net/selenium/dynamic-attributes")
    print("title is : ", driver.title)
    username = driver.find_element(By.XPATH,"//div[text()='Sign in!']/following::input[1]")
    username.send_keys("admin")
    driver.find_element(By.XPATH,"//div[text()='Sign in!']/following::input[2]").send_keys("password")
    driver.find_element(By.XPATH,"//button[@type='submit' and (text()='Log in')]").click()

    welcomeTxt = driver.find_element(By.ID,"action-confirmation")
    print("The Welcome Text is : " ,welcomeTxt.text)

    driver.quit()