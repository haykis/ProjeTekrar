Feature: US01
  Scenario: Stap1 yap
    Given Get Medunna
    And Get login
    And Enter new SSN
    And Check SSN is correct
    And Enter wrong SSN
    And Check SSN is wrong
