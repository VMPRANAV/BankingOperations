**BankingOperations**

**INTRO:**

Hello Folks! This is my solution for the banking problem statement provided during Coder’s Crusade event at Mechnotron 24 held at CIT,Coimbatore.


**DEMO:**

Here is the demo output of the above code.

OUTPUT 1:

![Output1](https://github.com/VMPRANAV/BankingOperations/assets/137675023/d74b7b36-9629-4948-bf07-205b9f54abd8)

OUTPUT 2:

![output2](https://github.com/VMPRANAV/BankingOperations/assets/137675023/bf676fb1-18de-4ff9-828e-6a4011302f7b)






**PROBLEM STATEMENT:**

 You are tasked with creating a class hierarchy for banking services. The main class is Customer, and it interacts with three other classes: MobileBanking, RegularBanking, and InternetBanking. The relationship between these classes is illustrated in the figure provided.

A Customer is offered various banking services based on their needs and preferences:

Regular Banking: Services include Cash Deposit and Cash Withdrawal. Upon successful completion of these operations, relevant attributes like accountBalance and transactionCount are updated.
Mobile and Internet Banking: These services offer the capability to transfer amounts between accounts. However, additional charges are applied for mobile alerts and email alerts based on the number of transactions (transactionCount). If the transactionCount exceeds a certain threshold (permittedCount), the charges for mobile alerts are doubled.
The computation for charges involves multiplying the transactionCount with chargePerSms for mobile alerts and chargePerEmail for email alerts.

The solution needs to involve implementing the necessary classes (MobileBanking, RegularBanking, InternetBanking) within a package named Banking. These classes should be appropriately structured, and constructors should be used as needed. Finally, the Customer class should import the Banking package to access the banking functionalities.





