from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import Select


with webdriver.Firefox() as driver:

    driver.get("https://v1.training-support.net/selenium/selects")
    print("title is : ", driver.title)
    
    select = driver.find_element(By.ID, "single-select")

    dropdown = Select(select)

    dropdown.select_by_visible_text("Option 2")

    print("Selected option: ", dropdown.first_selected_option.text)

    dropdown.select_by_index(3)
    print("Selected option: ", dropdown.first_selected_option.text)

  
    dropdown.select_by_value("4")
    print("Selected option: ", dropdown.first_selected_option.text)

 
    select_options = dropdown.options
    for option in select_options:
        print("Option: ", option.text)

    driver.quit()