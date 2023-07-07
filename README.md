# ATM-Machine-Project-With-java-

ATM Machine
This is a simple ATM machine program implemented in Java. It allows users to perform basic banking operations such as checking the account balance, withdrawing money, depositing money, and generating a new PIN.

Usage
Run the program.
Create your PIN by following the prompts. You will be asked to enter a PIN and then re-enter it for confirmation.
If the PIN is successfully created, you will see a message confirming the generation.
Next, you will be prompted to enter your PIN.
Enter your PIN correctly to access the main menu.
In the main menu, you can choose from the following options:
1. CHECK YOUR A/C BALANCE: View your account balance.
2. WITHDRAW MONEY: Withdraw money from your account.
3. DEPOSIT MONEY: Deposit money into your account.
4. PIN GENERATION: Generate a new PIN.
5. EXIT: Exit the program.
Select the desired option by entering the corresponding number.
Follow the prompts to complete the selected operation.
After completing an operation, you will be returned to the main menu.
To exit the program, select option 5 in the main menu.
Code Explanation
The program is written in Java and consists of two classes: ATM_Machine and ATM.

ATM_Machine Class
The ATM_Machine class contains the main method that initializes an instance of the ATM class and calls the createPin() method to start the ATM operation.

ATM Class
The ATM class represents the ATM and contains various methods for PIN creation, PIN verification, menu display, balance checking, money withdrawal, and money deposit.

Here's a breakdown of the methods in the ATM class:

createPin(): Prompts the user to create a PIN by entering it twice. If the entered PINs match, it confirms the successful generation and calls the checkPin() method.
checkPin(): Asks the user to enter their PIN and verifies it. If the PIN is correct, it calls the menu() method; otherwise, it prompts for a valid PIN and then calls the menu() method.
menu(): Displays the menu options and prompts the user to enter a choice. Based on the selected choice, it calls the corresponding method (checkBalance(), withdrawMoney(), depositMoney(), createPin()) or exits the program if the choice is 5.
checkBalance(): Prints the current account balance and calls the menu() method.
withdrawMoney(): Asks the user to enter the amount to withdraw. If the amount is greater than the balance, it displays an insufficient balance message; otherwise, it deducts the amount from the balance, confirms the successful withdrawal, and calls the menu() method.
depositMoney(): Asks the user to enter the amount to deposit. It adds the amount to the balance, confirms the successful deposit, and calls the menu() method.
The program utilizes the Scanner class to read user input and performs basic validation to ensure correct input.

Customization
You can modify the initial account balance by changing the value of the balance variable in the ATM class.
Feel free to enhance the program by adding more features or error handling based on your requirements.
Please note that this is a basic implementation for educational purposes and may not include all the security measures and edge cases required in a real-world ATM system
