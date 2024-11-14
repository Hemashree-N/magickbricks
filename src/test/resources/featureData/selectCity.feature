Feature: Select City

Scenario Outline: Validate user can change the select city in verified properties and navigate to that particular page

Given Browser should be launched and url should be navigated
#And user should be able to logged in
When user should be able to mouse hover on homeInterior link
And user should be able to click on 1BHK Interior Design  and navigated
And user should be able to click on select city
And user should be able to select on the <Select city> in the dropdown

Examples:
        | Select city |
        | 1 |
        | 2 |
        | 3 |
        
