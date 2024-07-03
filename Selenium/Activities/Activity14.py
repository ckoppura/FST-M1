from selenium import webdriver
from selenium.webdriver.common.by import By



with webdriver.Firefox() as driver:

    driver.get("https://v1.training-support.net/selenium/tables")
    print("title is : ", driver.title)

    rows = driver.find_elements(By.XPATH, "//table[contains(@class, 'sortable ')]/tbody/tr")
    cols = driver.find_elements(By.XPATH, "//table[contains(@class, 'sortable')]/tbody/tr[1]/td")

    print("No Of Rows is  : ", len(rows))
    print("No Of Columns is  : ", len(cols))

    cellValue = driver.find_element(By.XPATH, "//table[@id='sortableTable']/tbody/tr[2]/td[2]")
    print("2Nd Row 2Nd column is : ", cellValue.text)

    header =driver.find_element(By.XPATH,"//table[@id='sortableTable']/thead/tr/th[1]")
    print("User performed click on first herder ", header.click())

    cellValueAfterSort = driver.find_element(By.XPATH, "//table[@id='sortableTable']/tbody/tr[2]/td[2]")
    print("2Nd Row 2Nd column after sort is : ", cellValueAfterSort.text)

    print("Footer values is :")
    footerVlaues = driver.find_elements(By.XPATH,"//table[@id='sortableTable']/tfoot/tr/th")

    for cell in footerVlaues:
        print(cell.text)
    
    driver.quit()