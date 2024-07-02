from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.keys import Keys

with webdriver.Firefox() as driver:
    driver.get("https://v1.training-support.net/selenium/input-events")
    print("The Title is :", driver.title)

    action = ActionChains(driver)

    action.send_keys("C").perform()

    action.key_down(Keys.CONTROL).send_keys("a").send_keys("c").key_up(
        Keys.CONTROL
    ).send_keys("a").send_keys("c").pause(3).perform()

    action.send_keys("d").perform()

    action.key_down(Keys.CONTROL).send_keys("a").send_keys("c").key_up(
        Keys.CONTROL
    ).send_keys("a").send_keys("c").pause(3).perform()

    driver.quit()
