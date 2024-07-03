from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.ui import WebDriverWait

with webdriver.Firefox() as driver:

    driver.get("https://v1.training-support.net/selenium/tab-opener")
    print("title is : ", driver.title)

    print("The current window is : " , driver.current_window_handle)

    driver.find_element(By.ID,"launcher").click()
    wait = WebDriverWait(driver, 10)

    wait.until(EC.number_of_windows_to_be(2))

    print("All window handles: ", driver.window_handles)
    driver.switch_to.window(driver.window_handles[1])
   
    wait.until(EC.visibility_of_element_located((By.ID,"actionButton")))

    print("Current window handle: ", driver.current_window_handle)
    print("Current window title : ",driver.title)

    driver.find_element(By.ID,"actionButton").click()

    wait.until(EC.number_of_windows_to_be(3))
    driver.switch_to.window(driver.window_handles[2])
    print("All window handles: ", driver.window_handles)
    print("Current window handle: ", driver.current_window_handle)

    
    wait.until(EC.visibility_of_element_located((By.XPATH,"//div[@class='sub header']")))
    third_window_txt = driver.find_element(By.XPATH,"//div[@class='sub header']")
    print("Current window title : ",driver.title)
    print(third_window_txt.text)
   