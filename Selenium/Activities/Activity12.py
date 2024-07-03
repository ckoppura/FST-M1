from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC


with webdriver.Firefox() as ff:

    ff.get("https://v1.training-support.net/selenium/dynamic-controls")
    print("title is : ", ff.title)
    wait = WebDriverWait(ff, 10)
    inputBox = ff.find_element(By.ID, "input-text")
    inputButton = ff.find_element(By.CSS_SELECTOR, "#toggleInput")

    print("Input text box is enabled : ", inputBox.is_enabled())

    inputButton.click()
    print("Input text box is enabled : ", inputBox.is_enabled())
    ff.quit()
