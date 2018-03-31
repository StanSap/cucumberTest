Feature: Assert all buttons

  Scenario Outline: Successful find all buttons from Homepage
    Given browser "<browser>"
    And website loaded this address: "https://progressbg.net"

    Examples:
      | browser |
      | chrome  |
      | firefox |