from selenium import webdriver
from selenium.webdriver.common.by import By



with webdriver.Firefox() as driver:

    driver.get("https://v1.training-support.net/selenium/tables")
    print("title is : ", driver.title)

    rows = driver.find_elements(By.XPATH, "//table[contains(@class, 'striped')]/tbody/tr")
    cols = driver.find_elements(By.XPATH, "//table[contains(@class, 'striped')]/tbody/tr[1]/td")

    print("No Of Rows is  : ", len(rows))
    print("No Of Columns is  : ", len(cols))

    thridRow = driver.find_elements(By.XPATH, "//table[contains(@class, 'striped')]/tbody/tr[3]/td")

    print("Cell Values of Third Row is :")

    for cell in thridRow:
        print(cell.text)

    cellValue = driver.find_element(By.XPATH, "//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]")
    print("2Nd Row 2Nd column is : ", cellValue.text)

    driver.quit()
