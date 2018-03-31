Feature: API response

  Scenario Outline: Get response
    Given base url is "http://api.luftdaten.info/v1/sensor/"
    And endpoint is "sensor"
    When i make a call
    Then I get response

    Examples:
    |sensor|
    |6191|
    |6192|
