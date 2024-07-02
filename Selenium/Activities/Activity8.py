from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

with webdriver.Firefox() as ff:

    ff.get("https://v1.training-support.net/selenium/dynamic-controls")
    print("title is : ", ff.title)

    toggleButton = ff.find_element(By.ID,"toggleCheckbox")
    checkbox =ff.find_element(By.XPATH,"//div/input[@type='checkbox']")

    toggleButton.click()
    print("checkbox hidden")
    wait = WebDriverWait(ff, 10)
    wait.until(EC.invisibility_of_element(checkbox))
    toggleButton.click()
    print("checkbox visible")
    checkbox.click()
    print("Checkbox selected")
    ff.quit()
