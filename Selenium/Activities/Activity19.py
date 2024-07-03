from selenium import webdriver
from selenium.webdriver.common.by import By


with webdriver.Firefox() as driver:

    driver.get("https://v1.training-support.net/selenium/javascript-alerts")
    print("title is : ", driver.title)

    driver.find_element(By.ID, "confirm").click()
    alert =driver.switch_to.alert

    print("the alert text is : " ,alert.text)
    alert.accept()

    driver.find_element(By.ID, "confirm").click()
    driver.switch_to.alert.dismiss()

    driver.quit()

