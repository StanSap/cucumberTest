Feature: Get info from Air station

  Scenario Outline: Get air pollution for P1 and P2
    Given base url: "http://api.luftdaten.info/v1/sensor/"
    And endpoint: "<sensor>"
    When I made a call
    Then I should receive data

    Examples:
      | sensor |
      | 10349  |
      | 10350  |