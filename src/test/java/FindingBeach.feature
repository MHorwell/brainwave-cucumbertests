Feature: Finding a beach
As a surfer
I want to find a beach
So that I can see the surf report of the beach I want and reviews

   Scenario Outline: Finding a beach by name
	Given that I am on the site
	When I enter the string "<string>" into the search bar
	And I press the search button
	Then I will find a beach containing "<string>"
	
	Scenario Outline: Searching by an invalid string
	Given that I am on the site
	When I enter the string "<invalidString>" into the search bar
	And I press the search button
	Then the list of beaches will be empty
   
Examples:
	|	string	|	invalidString	|
	|	"p"	|	"x"	|
	|	"gwithian"	|	"z"	|
	|	"Porthleven"	|	"12"	|
	|	"GYL"	|	"&"	|
	|	"praa san"	|	"%"	|
	