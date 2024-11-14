Feature: InteriorDesigners

Scenario: Validate user is able to navigate to the Square Panels page and see location

Given Browser should be launched and url should be navigated
#And user should be able to logged in
When user should be able to mouse hover on homeInterior link
And user should be able to click on Home Interior Design Services
And user should be able to navigated to  Home Interior Design Services page
And user should be able to mouse hover on homeInteriorslink
And user should be able to click on Interior Designers in New Delhi
And user should be able to navigate to the Interior Designers in New Delhi
And user should be able to click on Select locality 
And user should be able to select on the Select locality in the dropdown
And user should be able to navigate to Square Panels page
Then user should be able to see the maps and navigate to location
