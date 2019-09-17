$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/task.feature");
formatter.feature({
  "name": "Register and Add to Cart",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@task"
    }
  ]
});
formatter.scenario({
  "name": "User Register to page and Confirm added product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@task"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Register.user_is_on_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User register with an email",
  "keyword": "When "
});
formatter.match({
  "location": "Register.user_register_with_an_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User fill all required field and clicks to register",
  "keyword": "And "
});
formatter.match({
  "location": "Register.user_fill_all_required_field_and_clicks_to_register()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is registered",
  "keyword": "Then "
});
formatter.match({
  "location": "Register.user_is_registered()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User logs in to account with user credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductDetails.user_logs_in_to_account_with_user_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Search for the \"Summer Dress\"",
  "keyword": "When "
});
formatter.match({
  "location": "ProductDetails.user_Search_for_the(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User choose the product",
  "keyword": "And "
});
formatter.match({
  "location": "ProductDetails.user_choose_the_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User confirm the product details",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductDetails.user_confirm_the_product_details()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});