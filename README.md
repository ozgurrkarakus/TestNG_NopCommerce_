# Testing Documentation for demo.nopCommerce

## Introduction

This project is dedicated to conducting thorough testing of the demo.nopcommerce website, accessible at [https://demo.nopcommerce.com](https://demo.nopcommerce.com). Our goal is to ensure a seamless and error-free user experience by identifying and documenting bugs, errors, and areas for improvement across various user actions and processes within the site.

## Test Environment

**URL:** [https://demo.nopcommerce.com](https://demo.nopcommerce.com)

## User Stories and Test Cases

### US_501 Register User
- **Objective:** Verify that new users can successfully register.
- **Test Cases:**
  - Register with valid credentials.
  - Attempt registration with an already used email.


### US_502 Login
- **Objective:** Verify login functionality with valid credentials.
- **Test Cases:**
  - Login with correct email and password.
  - Login with case-sensitive email check.


### US_503 Positive and Negative Login Combinations


- **Objective:** Test the login functionality with various combinations of email and password.
- **Test Cases:**
-Login with valid email and password combination.
-Login with valid email and invalid password combination.
-Login with invalid email and valid password combination.
-Login with invalid email and invalid password combination.
-Verify warning message for invalid email format.
-Verify warning message for incorrect password.
-Verify successful login with valid email and password combination.

### US_504 Tab Menu Control

 
- **Objective:**  Verify the functionality of the tab menu control and ensure that submenus are accessible and functional.
- **Test Cases:**
- Verify that clicking on each tab opens the corresponding submenu.
- Ensure that all submenu items are visible and clickable.
- Test navigation between different submenus.
- Verify that the tab menu remains visible and accessible on all pages.
- Check for responsiveness of the tab menu on different devices and screen sizes.
- Test the behavior of the tab menu when multiple tabs are open simultaneously.
- Ensure that the tab menu collapses or adapts appropriately on smaller screens to maintain usability.


### US_505 Control of Products in the TAB Menu


- **Objective:** Verify the accuracy of the platform's product list by comparing it with search results.
- **Test Steps:**
  1. Collect all products listed under each tab in the platform's tab menu and compile them into a comprehensive list.
  2. Utilize the platform's search feature to perform a product search.
  3. Select a random product from the search results.
  4. Verify whether the selected product is present in the compiled list of products obtained from the tab menu.
- **Test Data:**
  - List of products obtained from the tab menu.
  - Random product selected from search results.
- **Expected Results:**
  - The selected product from the search results should be present in the compiled list of products obtained from the tab menu.
- **Notes:**
  - Ensure to test with various search queries and products to cover a wide range of scenarios.
  - Verify the accuracy of the product list periodically to ensure consistency and reliability of the platform's data.

 ### US_506 Gift Ordering Process

- **Objective:** Successfully complete the process of ordering a gift on the website.
- **Test Steps:**
  1. Log in to the website with valid credentials.
  2. Browse the website to select a gift item.
  3. Add the selected gift item to the cart.
  4. Proceed to the checkout process.
  5. Enter the recipient's shipping address.
  6. Choose a payment method and enter payment details.
  7. Review the order summary and ensure all details are correct.
  8. Place the order.
  9. Verify that the order confirmation page is displayed.
  10. Check email for order confirmation.
- **Test Data:**
  - Valid login credentials.
  - Gift item selected for purchase.
  - Recipient's shipping address.
  - Valid payment method and details.
- **Expected Results:**
  - The gift item should be successfully added to the cart.
  - The checkout process should proceed smoothly without errors.
  - The order confirmation page should be displayed after placing the order.
  - An order confirmation email should be received.
- **Notes:**
  - Test with different gift items to ensure the ordering process works for various products.
  - Verify that the payment processing is secure and reliable.
  - Monitor for any errors or unexpected behavior during the ordering process.
 
   ### US_507  Computer Order Process

  - **Objective:** Successfully complete the process of ordering a customizable computer on the website.
- **Test Steps:**
  1. Log in to the website with valid credentials.
  2. Navigate to the customizable computer section.
  3. Select the base model or components for customization.
  4. Customize the computer according to specific requirements (e.g., processor, RAM, storage, graphics card, etc.).
  5. Add the customized computer to the cart.
  6. Proceed to the checkout process.
  7. Enter shipping and billing information.
  8. Choose a payment method and enter payment details.
  9. Review the order summary and ensure all customization details are correct.
  10. Place the order.
  11. Verify that the order confirmation page is displayed.
  12. Check email for order confirmation.
- **Test Data:**
  - Valid login credentials.
  - Customization preferences for the computer (e.g., processor, RAM, storage capacity, etc.).
  - Shipping and billing information.
  - Valid payment method and details.
- **Expected Results:**
  - The customized computer should be successfully added to the cart with the selected components.
  - The checkout process should proceed smoothly without errors.
  - The order confirmation page should be displayed after placing the order, confirming all customization details.
  - An order confirmation email should be received.
- **Notes:**
  - Test with different combinations of customization options to ensure flexibility and accuracy.
  - Verify that the website accurately reflects the selected components and their respective prices.
  - Monitor for any errors or unexpected behavior during the ordering process.



   ### US_508 Parameterized Search Process

  - **Objective:** Perform a parameterized search on the website to find a specific product and verify its correct listing.
- **Test Steps:**
  1. Access the search feature on the website.
  2. Enter specific parameters or keywords related to the desired product.
  3. Initiate the search.
  4. Review the search results to locate the desired product.
  5. Verify that the product listed matches the search criteria.
- **Test Data:**
  - Parameters or keywords related to the desired product.
- **Expected Results:**
  - The search results should include the desired product.
  - The listed product should match the specified parameters or keywords.
- **Notes:**
  - Test with various search parameters and keywords to cover different scenarios.
  - Verify the accuracy and relevance of the search results.
  - Monitor for any errors or unexpected behavior during the search process.

## Contributors

This project is a collaborative effort, with valuable contributions from:

- :octocat: [Ali Cömert](https://www.github.com/alicomert)
- :octocat: [Emre Yavuz](https://www.github.com/emreyavvz)
- :octocat: [Gencer Genç](https://www.github.com/GencerGnc)
- :octocat: [Medine Özdil](https://www.github.com/mdnozdl)
- :octocat: [Özgür Karakuş](https://www.github.com/ozgurrkarakus)
- :octocat: [İlker Kılıç](https://github.com/Ilker-Kilic)


## Scenario Guidelines

For each user story, the testing team will follow these steps:

1. **Preparation:** Set up the testing environment and ensure all tools are ready.
2. **Execution:** Follow the steps outlined in the test cases, noting any discrepancies or issues.
3. **Documentation:** Log all findings with screenshots and detailed descriptions.
4. **Review:** The team will review all documented findings to identify patterns or systemic issues.
5. **Feedback:** Submit a report to the development team for review and action.

We aim to cover all critical paths a user might take, including both expected and unexpected behaviors, to ensure the platform is robust and user-friendly.
