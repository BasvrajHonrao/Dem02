Feature: Facebook register page test

  Scenario: Facebbok registration
    Given user is on register page,enter firstname
    When user enter valid ,lastname,emil,pass
    And user enter valid birth date,month,year and select gender
