from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains

with webdriver.Firefox() as driver:
    driver.get("https://v1.training-support.net/selenium/input-events")
    print("the title is :", driver.title)

    actions = ActionChains(driver)
    actions.click().pause(3).perform()

    text1 = driver.find_element(By.CLASS_NAME, "active")
    print(text1.text)

    actions.double_click().pause(2).perform()

    text2 = driver.find_element(By.XPATH, "//div[@class='active']")
    print(text2.text)

    actions.click().pause(2).perform()

    text3 = driver.find_element(By.XPATH, "//div[@class='active']")
    print(text3.text)

    driver.quit()
