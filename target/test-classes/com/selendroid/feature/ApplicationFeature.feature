@Functional
Feature: Verify Sample 4 Testcases

  @Smoke
  Scenario: TC01 - Verify CheckBox
    Given Open the Test App
    When The CheckBox is tapped
    Then CheckBox should be in unselected state
    
  @Smoke
  Scenario Outline: TC02 - Verify TextView
    Given Open the Test App
    When The TextView is tapped
    Then Text should be displayed as "<txtMsg>"
    Examples: 
      | txtMsg   |
      | Text is sometimes displayed |
    
  @Smoke
  Scenario Outline: TC03 - Verify CheckBox
    Given Open the Test App
    When The ToastButton is tapped
    Then ToastMsg Should be displayed as "<expectedToastMsg>"
    Examples: 
      | expectedToastMsg   |
      | Hello selendroid toast! |
    
  @Smoke
  Scenario Outline: TC04 - Verify CheckBox
    Given Open the Test App
    When The PopupButton is tapped
    Then Popup Msg Should be displayed as "<popUpMsg>"
   Examples: 
      | popUpMsg   |
      | It's a PopupWindow |
    
  @Smoke
  Scenario Outline: TC05 - Register a new Selendroid User
    Given Open the Test App
    When New User icon is tapped
    And Insert New user details as "<name>", "<userName>", "<email>", "<pwd>" and tap on submit button
    Then User details should be populated correctly on verify screen as "<name>", "<userName>", "<email>", "<pwd>"
    When Tap on Confirm button
    Then Homepage should be displayed
Examples: 
      | name   | userName    | email            | pwd      |
      | Sanjay | SanjaySingh | sanjay@gmail.com | sanjay10 |