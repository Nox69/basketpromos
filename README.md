# Basket Promotions

## Business description

In our online supermarket one of our goals is to provide customers with the best customer experience.
Our research shown that the customers are very willing to change their shopping cart content in order to receive a discount.

Therefore, we would like to introduce promotions which are dependent on the basket content.
Our goal is to create a library. Basic functionality of the library is to return a discount for a given basket taking
into account defined promotions.
The library will be used by another Team which is responsible for calculating the due amount for the whole shopping.
General requirements are the following:
- Only one promotion should be applied to a given basket,
- In case multiple promotions matched the basket we would like to apply the one with the highest discount


## Business requirements

To begin with, we would like to have the possibility to define two types of promotions:

1. Constant discount in case of having some minimum basket value
* Specifically: **10 EUR** discount in case the basket value is at least **100 EUR** (>=)
2. Constant discount in case of having some minimum number of items in the basket
* Specifically: **5 EUR** discount in case of having more than **40** items in the basket (>).

We've inherited the project from one of the Teams which changed the departments.
We do not know really the state of the project, and it is one of our goals to verify if it works as expected. 
If not, we would like to make the code production-ready taking into consideration aforementioned business requirements. 
