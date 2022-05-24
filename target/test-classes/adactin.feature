Feature: Validating functionalities of Adactin Hotel Application

  Scenario: Validating the Login Functionality of Adactin Hotel Application
    Given User is on adactin hotel application in chrome browser
    When User enters the username as "pradeep1" and password as "NR64T3CdvU7@qsh" and clicks login
    Then User should validate the login page with "Hello pradeep1!"

  Scenario Outline: Validating Order Confirmation by inserting values in mandatory fields
    Given User is on adactin hotel application in chrome browser
    When User enters the username as "<username>" and password as "<password>" and clicks login
    And User enters location Number of rooms Checkin date "<arrdate>" Checkout date "<depdate>" adults per room and clicks search
    And User selects the hotel and clicks continue
    And User enters First name "<firstname>" Last name "<lastname>" Billing Address "<address>" creditcard number "<ccnum>" and selects credit card type Expiry date and enters cvv "<cvv>" and clicks BookNow
    Then User should validate the order confirmation

    Examples: 
      | username | password        | arrdate    | depdate    | firstname | lastname | address     | ccnum            | cvv |
      | pradeep1 | NR64T3CdvU7@qsh | 25/08/2022 | 26/08/2022 | Pradeep   | MK       | Omr,Chennai | 1234567890123456 | 123 |

  Scenario: Validating Adacting hotel application with incorrect checkin dates
    Given User is on adactin hotel application in chrome browser
    When User enter username as "pradeep1" and password as "NR64T3CdvU7@qsh" and clicks login
    And User enters location Number of rooms with incorrect Checkin date "21/05/2022" Checkout date "20/02/2022" adults per room and clicks search
    Then User selects the hotel and clicks continue and validates the error message

  Scenario Outline: Validating cancellation of order id in Adactin Hotel Application
    Given User is on adactin hotel application in chrome browser
    When User enters the username as "<username>" and password as "<password>" and clicks login
    And User enters location Number of rooms Checkin date "<arrdate>" Checkout date "<depdate>" adults per room and clicks search
    And User selects the hotel and clicks continue
    And User enters First name "<firstname>" Last name "<lastname>" Billing Address "<address>" creditcard number "<ccnum>" and selects credit card type Expiry date and enters cvv "<cvv>" and clicks BookNow
    Then User gets order id clicks my itinerary and Validates canecellation by cancelling the order id

    Examples: 
      | username | password        | arrdate    | depdate    | firstname | lastname | address     | ccnum            | cvv |
      | pradeep1 | NR64T3CdvU7@qsh | 25/08/2022 | 26/08/2022 | Pradeep   | MK       | Omr,Chennai | 1234567890123456 | 123 |

  Scenario: Validating the cancellation of oroder id from booked itinerary in Adactin Hotel Application
    Given User is on adactin hotel application in chrome browser
    When User enter username as "pradeep1" and password as "NR64T3CdvU7@qsh" and clicks login
    And User clicks booked itenary and selects the booking and clicks cancel
    Then User validates the cancellation of the booked order
