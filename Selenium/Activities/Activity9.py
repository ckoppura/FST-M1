from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

with webdriver.Firefox() as driver:
    driver.get("https://v1.training-support.net/selenium/ajax")
    print(driver.title)

    driver.find_element(By.CSS_SELECTOR, "button.violet").click()

    wait = WebDriverWait(driver, 10)

    wait.until(EC.text_to_be_present_in_element((By.TAG_NAME, "h1"), "HELLO!"))

    text = driver.find_element(By.XPATH, "//h1")

    print("Text is : ", text.text)

    wait.until(EC.text_to_be_present_in_element((By.TAG_NAME, "h3"), "I'm late!"))

    lateTxt = driver.find_element(By.TAG_NAME, "h3")
    print("late text is : ", lateTxt.text)
    driver.quit()
