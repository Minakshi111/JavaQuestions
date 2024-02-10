Feature: feature to test google search

  Scenario Outline: Validate google search is working
    # write down the steps using annotations
    Given browser is open
    And Google search page is opened
    When user enters <text>
    And hits enter
    Then user navigates to search results
    
     Examples:
| text |
| maven |
| This is test query |

   
   