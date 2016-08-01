/**

Project's info:

This project consists of a regional database (object) that decides, based in the monthly amount spent in shopping (500£ or more) if a certain costumer qualifies for instant bonus rewards on the previous month.
A simple for each runs through the database(object), evaluating each individual situation. 
In either case scenarios, the costumer is notified if they get the extra nectar points or not. 

To run this project, you will need: 
•	Google Chrome; 

Instructions:
•	Run “nectarPointBonus.html” contained in this folder;
•	Open the console for outputs; 


 
 * @author Ricardo Jacinto
 * @version 2016
 * 
 **/



var nectarDatabase = 
{
	northernLondon : 
	[	
		{
			nectarId: 1234567,
			name: "John",
			amountSpent: 500,
			bonus: false

		},

		{
			nectarId: 2345678,
			name: "Loiuse",
			amountSpent: 600,
			bonus: false


		},

		{
			nectarId: 3456789,
			name: "Ian",
			amountSpent: 300,
			bonus: false



		},

		{
			nectarId: 3456789,
			name: "Ludvig",
			amountSpent: 250,
			bonus: false
		
		}


	]
}

nectarDatabase.northernLondon.forEach(function(costumer)
{

	if(costumer.amountSpent >= 500)
	{
		costumer.bonus = true;
	}

	var output = "Dear " + costumer.name + ", owner of the nectar with id: " + costumer.nectarId;

	if(costumer.bonus === true)
	{
		output += ", congratulations, you qualify for extra instant bonuses for the next month."
	}
	else
	{
 	    output += ", sorry, you don't qualify for extra instant bonuses for the next month."
	}


	console.log(output);


}
)
