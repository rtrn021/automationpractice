@task
Feature: Register and Add to Cart
    Scenario: User Register to page and Confirm added product
    Given User is on homepage
    When User register with an email
    And User fill all required field and clicks to register
    Then User is registered
    Then User logs in to account with user credentials
    When User Search for the "Summer Dress"
    And User choose the product
    Then User confirm the product details