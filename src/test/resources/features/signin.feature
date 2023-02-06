@signin
Feature: Validating Login page

   @TS_signin_01
   Scenario: Verifying Register link
    Given The user is on signin page
    When The user clicks on register link on signin page
    Then The user redirected to Registration page from signin page
    
  
 @TS_signin_02
  Scenario: user in the signin link
    Given The user is on signin page with valid username "Admin" and password "admin123"
    When The user click login button
    Then The user redirected to homepage