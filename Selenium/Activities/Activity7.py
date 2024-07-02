from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains

with webdriver.Firefox() as ff:

    ff.get("https://v1.training-support.net/selenium/drag-drop")
    print("title is : ", ff.title)

    act = ActionChains(ff)
    ball = ff.find_element(By.XPATH, "//div/img[@id='draggable']")
    zone1 = ff.find_element(By.XPATH, "//div[@id='droppable']")
    zone2 = ff.find_element(By.XPATH, "//div[@id='dropzone2']")

    act.click_and_hold(ball).move_to_element(zone1).pause(3).release().perform()

    if zone1.text.find("Dropped!"):
        print("Ball dropped in zone 1")
    

    act.drag_and_drop(ball,zone2).pause(3).perform()

    if zone2.text.find("Dropped!"):
        print("Ball dropped in zone 2")