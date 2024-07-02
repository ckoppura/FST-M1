from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://v1.training-support.net/selenium/target-practice")
    print("title of web pageis : ", driver.title)

    thirdHeading = driver.find_element(By.XPATH, "//h3[@id='third-header']")
    print("Third heading is : ", thirdHeading.text)

    fifthHeading = driver.find_element(By.XPATH, "//h5")
    print("Fifth heading colour is : ", fifthHeading.value_of_css_property("color"))

    violet = driver.find_element(By.CLASS_NAME, "violet")
    print("Violet button class is : ", violet.get_attribute("class"))

    grey = driver.find_element(By.CLASS_NAME, "grey")
    print("Text in grey button is: ", grey.text)

    driver.quit()
