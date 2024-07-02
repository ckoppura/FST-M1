from selenium import webdriver
from selenium.webdriver.common.by import By
with webdriver.Firefox()  as ffDriver :
    ffDriver.get("https://v1.training-support.net/")
    print("title is : ",ffDriver.title)
    aboutUs = ffDriver.find_element(By.ID,"about-link")
    aboutUs.click
    print("title of about us " ,ffDriver.title)
    ffDriver.quit