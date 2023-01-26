@signin
Feature: Validating Login page

   @TS_signin_01
   Scenario: Verifying Register link
    Given The user is on signin page
    When The user clicks on register link on signin page
    Then The user redirected to Registration page from signin page