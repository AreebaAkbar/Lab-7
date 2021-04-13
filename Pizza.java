
package lab.pkg7_h.a;

public class Pizza {
    private String pizzaSize;
    private int cheeseTopping;
    private int pepperoniTopping;
    private int hamTopping;

	public Pizza()
	{
		this.pizzaSize = "";
		this.cheeseTopping = 0;
		this.pepperoniTopping = 0;
		this.hamTopping = 0;
	}
	
	public Pizza(String pizzaSize, int cheese, int pepperoni, int ham)
	{
		this.pizzaSize = pizzaSize;
		this.cheeseTopping = cheese;
		this.pepperoniTopping = pepperoni;
		this.hamTopping = ham;
	}
	
	public String getPizzaSize()
	{
		return pizzaSize;
	}

	public void setPizzaSize(String pizzaSize)
	{
		this.pizzaSize = pizzaSize;
	}

	public int getNumCheeseToppings()
	{
		return cheeseTopping;
	}

	public void setNumCheeseToppings(int cheese)
	{
		this.cheeseTopping = cheese;
	}

	public int getNumPepperoniToppings()
	{
		return pepperoniTopping;
	}

	public void setNumPepperoniToppings(int pepperoni)
	{
		this.pepperoniTopping = pepperoni;
	}

	public int getNumHmaToppings()
	{
		return hamTopping;
	}

	public void setNumHmaToppings(int ham)
	{
		this.hamTopping = ham;
	}

	public double calcCost()
	{		
		if(pizzaSize.equalsIgnoreCase("small"))
		{
			return 10 + (cheeseTopping + pepperoniTopping + hamTopping) * 2;
		}
		else if(pizzaSize.equalsIgnoreCase("medium"))
		{
			return 12 + (cheeseTopping + pepperoniTopping + hamTopping) * 2;
		}
		else if(pizzaSize.equalsIgnoreCase("large"))
		{
			return 14 + (cheeseTopping + pepperoniTopping + hamTopping) * 2;
		}
		else
		{
			return 0.0;
		}
	}

	public String getDescription()
	{
		return "Pizza size: " + pizzaSize + "\n Cheese toppings: " 
				+ cheeseTopping + "\n Pepperoni toppings: "
				+ pepperoniTopping + "\n Ham toppings: " + hamTopping
				+ "\n Pizza cost: $" + calcCost() + "\n" + "---------------------------------";
	}
}