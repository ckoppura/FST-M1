from selenium import webdriver
from selenium.webdriver.common.by import By
with webdriver.Firefox()  as ffDriver :
    ffDriver.get("https://v1.training-support.net/selenium/login-form")
    print("title of web pageis : ",ffDriver.title)
    username = ffDriver.find_element(By.XPATH, "//input[@id='username']")
    password = ffDriver.find_element(By.XPATH, "//input[@id='password']")
    username.send_keys("admin")
    password.send_keys("password")
    ffDriver.find_element(By.XPATH,"//button[text()='Log in']").click()

    txt = ffDriver.find_element(By.XPATH,"//div[@id='action-confirmation']");
    print(txt.text)
    ffDriver.quit()