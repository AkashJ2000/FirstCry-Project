Feature: Add To Cart 

@TC_101 @Add_To_Cart
Scenario: a user with sees an text message while logging in
Given a user is on the landing page of firstcry
When he type 'Computer Accessories' and select the first option from the auto-complete box
And he click 'Add to Cart' button
Then he must see the text messsage - 'Portronics POR-704 Portable Laptop Stand with Cooling Fan - Grey' is displayed
