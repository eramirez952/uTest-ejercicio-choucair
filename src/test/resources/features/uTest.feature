#Autor: Elkin Ramirez
@stories
Feature: uTest
  As an external, I want to register on the uTest page
  @scenario1
  Scenario: Register on the page
    Given than Juan wants to be part of the community of testers
    When he enters his personal data in the form
      | strFrstName   | strLastName | strEmail                  | strMonth  | strDay  | strYear | strCity | strZip  | strCountry  | strOS   | strVersion  | strLanguage | strBrand  | strModel  | strPassword     |
      | Elkin         | Ramirez     | uncorreo179@undominio.com | January   | 1       | 1990    | Tunja   | 150001  | Colombia    | Windows | 10          | Spanish     | Xiaomi    | Redmi 2   | 6nWP@8vZ5zzmYx6 |
    Then he registers on the page
      | strBanner                                 |
      | Welcome to the world's largest community  |