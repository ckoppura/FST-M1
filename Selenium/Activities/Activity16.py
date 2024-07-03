from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.ui import WebDriverWait


with webdriver.Firefox() as driver:

    driver.get("https://v1.training-support.net/selenium/dynamic-attributes")
    print("title is : ", driver.title)

    username = driver.find_element(By.XPATH, "//input[contains(@class, '-username')]")
    password = driver.find_element(By.XPATH, "//input[contains(@class, '-password')]")
    confirm_password = driver.find_element(By.XPATH, "//label[contains(text(), 'Confirm Password')]//following::input")

    email = driver.find_element(By.XPATH, "//input[contains(@class, 'email-')]")

    username.send_keys("MyUsername")
    password.send_keys("MyPassword2020!")
    confirm_password.send_keys("MyPassword2020!")
    email.send_keys("dummy@gmail.com")
    
    driver.find_element(By.XPATH, "//button[text()='Sign Up']").click()

    wait = WebDriverWait(driver, 10)
    wait.until(EC.visibility_of_element_located((By.ID, "action-confirmation")))
   
    message = driver.find_element(By.ID, "action-confirmation").text
    print("Success message : ", message)

    driver.quit()