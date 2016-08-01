/**

Project's info:

This is a staple exercise of a project I would like to implement someday in Sainsbury’s. The idea is to implement several sensors on the shop floor’s shelfs that could communicate with sensors in the warehouse in order to maximize replenishment efficiency. 
This sensors would count how many items each shelf contains, and if the shelf is empty a signal would be sent to the warehouse - respectively, the correspondent product (same SKU number) has a dedicated racking in the warehouse containing the stocked product.
When the signal is received, a led is triggered (turning red) bellow where the prod is stocked in the racking. 
When a colleague approaches the racking, he will notice straight away (by observing the led output) which items need to be replenished in the shop floor. After he replenishes the shelf, the cycle starts again. 
When the sensor detects that the racking is empty in the warehouse, a new order is placed automatically.
The objective of this project is to reduce time wasted in figuring out which items should go to the shop floor or reducing the redundancy of taking full rollers to the shop floor when several items are already displayed. 
Turning this system into a more automatic one, would prove to be a key strategy to support Sainsbury’s strong values and create more accuracy in the System’s inventory. 
After the system is implemented: 
•	Colleagues will have more time for costumers, focusing in providing a fantastic costumer service instead of being concerned about replenishing shelfs.
•	Possibly less staff needs to be hired, because time efficiency is maximized.
•	Syncing the sensors with the inventory system would create total precision in stocked material, reducing the margin of error caused by human action. 

To run this project, you will need: 
•	Google Chrome; 

Instructions:
•	Run “inventorySystem.html” contained in this folder
•	Open the console to get outputs; 
•	Reply to prompt questions when required;

 
 * @author Ricardo Jacinto
 * @version 2016
 * 
 **/


//VARIABLES

// Prod Sku number 
var productSku = 1234567; 

// Shelf capacity and quantity of a specific product contained in the shelf (shop floor)
var ShelfCapStore = 10;
var prodStockStore = ShelfCapStore;

// Shelf capacity and quantity of a specific product contained in the shelf(Warehouse)
var shelfCapWare = 30;
var prodStockWare = shelfCapWare;

// Current status of the shelfs 
var emptyShelfWare = false;
var emptyShelfStore = false;



//GET FUNCTIONS 

function getSku()
{
	return productSku; 
}

function getShelfCapStore()
{
	return ShelfCapStore;
}

function getShelfCapWare()
{
	return shelfCapWare;
}

function getProdStockStore()
{
	return prodStockStore;
}

function getProdStockWare()
{
	return prodStockWare;
}

// SET FUNCTIONS

// Asks a costumer how many items he would like to take. After he takes his desired amount, the remaining items amount are displayed.

function costumerSelectingItem()
{
	var costumerAmount = prompt("How many items would you like to remove from the shelf?");

	prodStockStore -= Number(costumerAmount);

	console.log("There is " + prodStockStore + " items in the shelf");
	
	
}

// When the shelf capacity reaches 0 a signal is sent to the warehouse. 

 function emptyTransmitSignal()
{
	console.log("The shelf is empty. A signal is going to be sent to the Warehouse.")
	
	emptyShelfStore = true;

	
}

/* When the signal is transmitted, a red led is triggered underneath where the product is kept in the warehouse.
 A amount equal to the shelf size in the shop floor is transfered from the warehouse to the shop floor. */

function receiveSignalWare()
{
	console.log("The signal was received in the werehouse. Red Led current status: " + emptyShelfStore);
	
	prodStockWare -= ShelfCapStore;
	prodStockStore = ShelfCapStore;

	console.log("The employee noticed the red signal in the werehouse and filled the shelf in the shop floor.");

}

/* When you don't have anymore stock in the warehouse, a automatic order is placed. Ideally the cycle would continue after the delivery was received; however for the sake of this example
 the cycle stops after the delivery is made and the last items taken from the shelf in the shop floor. */

function placeOrder()
{
	console.log("There's no more stock for the required item. Therefore a order of the product with sku: "+ productSku +" as been placed. It will arive in the next working day.");
	emptyShelfWare = true;	
}


//CODE


while(!emptyShelfWare)
{
	if(prodStockWare === 0)
	{
		placeOrder();
	}
	

	if(prodStockStore > 0)
	{
		costumerSelectingItem();
	}

	else if (prodStockStore === 0)
	{
		emptyTransmitSignal();
		receiveSignalWare();
	}
	else
	{

		//Since the costumer can't take more items that the ones already available in the shelf, this piece of code was introduced for control and logic porpuses. 

		console.log("The value requested by the costumer has to be smaller than the shelf capacity");
		prodStockStore = ShelfCapStore 	;

	}
}

