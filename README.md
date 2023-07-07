# ATM-Machine-Project-With-java-

 <!DOCTYPE html>
<html>
<head>
    
</head>
<body>
    <h1>ATM Machine</h1>
    <p>This is a simple ATM machine program implemented in Java. It allows users to perform basic banking operations such as checking the account balance, withdrawing money, depositing money, and generating a new PIN.</p>
    <h2>Usage</h2>
    <ol>
        <li>Run the program.</li>
        <li>Create your PIN by following the prompts. You will be asked to enter a PIN and then re-enter it for confirmation.</li>
        <li>If the PIN is successfully created, you will see a message confirming the generation.</li>
        <li>Next, you will be prompted to enter your PIN.</li>
        <li>Enter your PIN correctly to access the main menu.</li>
        <li>In the main menu, you can choose from the following options:
            <ul>
                <li><strong>1. CHECK YOUR A/C BALANCE:</strong> View your account balance.</li>
                <li><strong>2. WITHDRAW MONEY:</strong> Withdraw money from your account.</li>
                <li><strong>3. DEPOSIT MONEY:</strong> Deposit money into your account.</li>
                <li><strong>4. PIN GENERATION:</strong> Generate a new PIN.</li>
                <li><strong>5. EXIT:</strong> Exit the program.</li>
            </ul>
        </li>
        <li>Select the desired option by entering the corresponding number.</li>
        <li>Follow the prompts to complete the selected operation.</li>
        <li>After completing an operation, you will be returned to the main menu.</li>
        <li>To exit the program, select option 5 in the main menu.</li>
    </ol>
    <h2>Code Explanation</h2>
    <p>The program is written in Java and consists of two classes: <code>ATM_Machine</code> and <code>ATM</code>.</p>
    <h3>ATM_Machine Class</h3>
    <p>The <code>ATM_Machine</code> class contains the main method that initializes an instance of the <code>ATM</code> class and calls the <code>createPin()</code> method to start the ATM operation.</p>
    <h3>ATM Class</h3>
    <p>The <code>ATM</code> class represents the ATM and contains various methods for PIN creation, PIN verification, menu display, balance checking, money withdrawal, and money deposit.</p>
    <ul>
        <li><code>createPin()</code>: Prompts the user to create a PIN by entering it twice. If the entered PINs match, it confirms the successful generation and calls the <code>checkPin()</code> method.</li>
        <li><code>checkPin()</code>: Asks the user to enter their PIN and verifies it. If the PIN is correct, it calls the <code>menu()</code> method; otherwise, it prompts for a valid PIN and then calls the <code>menu()</code> method.</li>
        <li><code>menu()</code>: Displays the menu options and prompts the user to enter a choice. Based on the selected choice, it calls the corresponding method (<code>checkBalance()</code>, <code>withdrawMoney()</code>, <code>depositMoney()</code>, <code>createPin()</code>) or exits the program if the choice is 5.</li>
        <li><code>checkBalance()</code>: Prints the current account balance and calls the <code>menu()</code> method.</li>
        <li><code>withdrawMoney()</code>: Asks the user to enter the amount to withdraw. If the amount is greater than the balance, it displays an insufficient balance message; otherwise, it deducts the amount from the balance, confirms the successful withdrawal, and calls the <code>menu()</code> method.</li>
        <li><code>depositMoney()</code>: Asks the user to enter the amount to deposit. It adds the amount to the balance, confirms the successful deposit, and calls the <code>menu()</code> method.</li>
    </ul>
    <p>The program utilizes the <code>Scanner</code> class to read user input and performs basic validation to ensure correct input.</p>
    <h2>Customization</h2>
    <ul>
        <li>You can modify the initial account balance by changing the value of the <code>balance</code> variable in the <code>ATM</code> class.</li>
        <li>Feel free to enhance the program by adding more features or error handling based on your requirements.</li>
    </ul>
    <p>Please note that this is a basic implementation for educational purposes and may not include all the security measures and edge cases required in a real-world ATM system.</p>
</body>
</html>
