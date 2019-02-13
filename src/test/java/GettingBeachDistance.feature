Feature: Getting beach distance
As an emit
I want to find the distance of nearby beaches
So that I can decide which beach I want to go to

	Scenario Outline: Inputting latitude and longtitude to find distance
	 Given that I am on the site
	 When I enter "<latitude>" and "<longtitude>"
	 And I press the search button
	 Then I will get the distance of beaches displayed
	 
Examples:
	|	latitude	|	longtitude	|
	|	50.