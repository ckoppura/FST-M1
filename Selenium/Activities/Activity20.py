from selenium import webdriver
from selenium.webdriver.common.by import By


with webdriver.Firefox() as driver:

    driver.get("https://v1.training-support.net/selenium/javascript-alerts")
    print("title is : ", driver.title)

    driver.find_element(By.ID, "prompt").click()
    prompt_alert =driver.switch_to.alert

    print("the alert text is : " ,prompt_alert.text)

    prompt_alert.send_keys("Awsome!!")
    print("user entred the text in prompt alert")
    prompt_alert.accept()

    driver.quit()