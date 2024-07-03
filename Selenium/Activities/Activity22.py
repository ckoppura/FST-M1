from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.common.action_chains import ActionChains

with webdriver.Firefox() as driver:

    driver.get("https://v1.training-support.net/selenium/popups")
    print("title is : ", driver.title)

    btn = driver.find_element(By.CLASS_NAME, "orange")

    act = ActionChains(driver)

    act.move_to_element(btn)

    tool_tip_txt = btn.get_attribute("data-tooltip")
    print("Tool tip txt is :", tool_tip_txt)
    btn.click()

    wait = WebDriverWait(driver, 10)

    wait.until(EC.visibility_of_element_located((By.ID, "username")))
    driver.find_element(By.ID, "username").send_keys("admin")
    driver.find_element(By.ID, "password").send_keys("password")
    driver.find_element(By.XPATH, "//button[text()='Log in']").click()

    message = driver.find_element(By.ID, "action-confirmation")
    print("Confirmation message: ", message.text)
