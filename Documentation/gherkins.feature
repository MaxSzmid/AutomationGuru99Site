//Case 1
<Feature>: Successful Login
<Scenario>: Login
<Background>: The user is registered

<Given> The user is on login page
<When> The user enters a valid UserID
<and> The user enters a valid Password
<and> The user makes click on the button "Login"
<Then> The user login to the site

//Case 2
<Feature>: Successful redirect to  New customer
<Scenario>: Sidebar
<Background>: The user is logged-in

<Given> The user is on any page inside guru99 Website
<When> The user makes click on the button "New Customer" 
<Then> The user is redirected to the page "Add new customer"

//Case 3
<Feature>: Successful redirect to  New account 
<Scenario>: Sidebar
<Background>: The user is logged-in

<Given> The user is on any page inside guru99 Website
<When> The user makes click on the button "New Customer" 
<Then> The user is redirected to the page "Add new customer"

//Case 4
<Feature>: Add new customer
<Scenario>: New customer
<Background>: The user is logged-in and is in the page "Add new Account"

<Given> The user completes all the fields with valid data.
<When> The user makes click on the button "submit"
<Then> The new coustomer is registered

//Case 5
<Feature>: Create new account
<Scenario>: New account
<background>: The user are logged-in and is on the page "New Account"

<Given> The user completes all the fields with valid data.
<When> The user makes click on the button "submit"
<Then> The new account is created.