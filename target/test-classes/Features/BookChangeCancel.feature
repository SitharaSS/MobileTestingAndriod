@BCC
Feature: Verifying OMR Branch Cancel Booking Automation

  @cb1
  Scenario Outline: Verifying cancel hotel booking using the generated order id
    Given User login "<userName>","<password>" in Mob App
    Then User should verify success message after login "Welcome Sithara"
    When User search hotels "<stateName>","<cityName>","<roomType>","<checkInDate>","<checkOutDate>","<noOfRooms>","<adultPerRoom>" and "<noOfChildren>"
    Then User should verify success message after search hotel "Select Hotel"
    When User should select first hotel name and save hotel name,price
    And User should accept hotel booking alert
    Then User should verify success message after select hotel "Book Hotel"
    When User add the guest details and enter "<selectSalutation>","<firstName>","<lastName>","<mobileNumber>" and "<email>"
    And User enter GST details "<enterRegistrationNo>","<enterCompanyName>" and "<enterCompanyAddress>"
    When User add special request and the enter the message "<specialRequest>"
    And User proceed with the payment options "<cardType>"
      | card       | cardNumber       | nameOnCard | month | year | cvv |
      | Visa       | 5555555555552222 | Sithara    | June  | 2026 | 234 |
      | editVisa   | 5555555555552223 | Sherin     | June  | 2027 | 235 |
      | Amex       | 5555555555552323 | Jana       | June  | 2025 | 937 |
      | Amex       | 5555555555559878 | John       | Aug   | 2025 | 311 |
      | MasterCard | 5555555555556789 | Sith       | May   | 2026 | 222 |
      | MasterCard | 5555555555556889 | Mani       | Dec   | 2025 | 787 |
      | Discover   | 5555555555553444 | Janani     | July  | 2026 | 987 |
      | Discover   | 5555555555552124 | Bharath    | Sept  | 2024 | 356 |
    Then User should verify booking success message after booking "Booking is Confirmed" and save the generated order id
    And User should verify whether the same  hotel is booked
    When User navigate to My Booking page
    Then User should verify after navigating to my booking page "Bookings"
    When User should verify generated order id
    Then User should verify same order id is present
    Then User should verify same hotel name is present
    And User should verify the price
    When User edit the particular booking detail and changing the checkin date "<newCheckInDate>"
    Then User should verify success message after changing the booking "Booking updated successfully"
    When User cancel the booking
    Then User should verify the success message after cancel the booking "Your Booking cancelled successfully"

    Examples: 
      | userName                 | password   | stateName | cityName | roomType | checkInDate | checkOutDate | noOfRooms | adultPerRoom | noOfChildren | selectSalutation | firstName | lastName | mobileNumber | email                    | enterRegistrationNo | enterCompanyName       | enterCompanyAddress | specialRequest     | cardType    | newCheckInDate |
      | sitharasherin6@gmail.com | Sithar123* | Kerala    | Kochi    | Standard | 14-07-2023  | 20-07-2023   | 2-Two     | 1-One        |            2 | Ms.              | Sithara   | Sherin   |   9192939495 | sitharasherin6@gmail.com |          9043592058 | Greens Tech OMR Branch | Thoraipakkam        | need valet parking | Credit Card | 15-07-2023     |
