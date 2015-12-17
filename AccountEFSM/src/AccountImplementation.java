import java.util.Scanner;

public class AccountImplementation {

	
	private Account acct = new Account();
	private Scanner amount = null;
	private Scanner option = null;
	private Scanner pin = null;
	private Scanner accountNo = null;
	private Scanner deposit = null;
	private Scanner withdraw = null;
	private Scanner lockPin = null;
	private Scanner unLockPin = null;
	private Scanner loginId = null;
	private Scanner pinId = null;
	private int x = 50;

	private static AccountImplementation instance = null;

	protected AccountImplementation() {
		// Exists only to defeat instantiation.
	}

	public static AccountImplementation getInstance() {
		if (instance == null) {
			instance = new AccountImplementation();
		}
		return instance;
	}

	public static void main(String[] args) {
		AccountImplementation acctImplementation = AccountImplementation
				.getInstance();
		acctImplementation.doTester();

		// doTester
	}

	public void doTester() {
		System.out.println("                                     Driver For The Account\n ");
		System.out.println("\n");
		System.out.println("                                               0. Open");
		System.out.println("                                               1. Deposit");
		System.out.println("                                               2. Withdraw");
		System.out.println("                                               3. Balance");
		System.out.println("                                               4. Lock");
		System.out.println("                                               5. Unlock");
		System.out.println("                                               6. Login");
		System.out.println("                                               7. Pin");
		System.out.println("                                               8. Logout");
		System.out.println(" \n");
		System.out.println("                                      Testing-related methods");
		System.out.println("                                     a.  Show Balance");
		System.out.println("                                     b.  Show State");
		System.out.println("                                     c.  Show Account");
		System.out.println("                                     d.  Show No Of Attempts");
		System.out.println("                                     e.  Show All Variables");
		System.out.println(" \n");
		System.out.println("                                     q.  Quit Account Class Driver  ");

		while (x > 0) {
			option = new Scanner(System.in);

			char input = option.nextLine().charAt(0);

			switch (input) {

			case '0': {

				System.out.println(" Account Class\n");
				System.out.println(" Open Method\n");
				amount = new Scanner(System.in);
				System.out.println("Enter Initial Balance:\n ");
				int sAmount = amount.nextInt();
				pin = new Scanner(System.in);
				System.out.println("Enter Pin Number:\n");
				int sPin = pin.nextInt();
				accountNo = new Scanner(System.in);
				System.out.println("Enter Account #:\n ");
				int sAccountNo = accountNo.nextInt();
				int result = acct.open(sAmount, sPin, sAccountNo);
				System.out.println("The Value returned By This Method Is: "
						+ result);
				
				break;

			}

			case '1': {

				System.out.println(" Account Class\n");
				System.out.println(" Deposit Method\n");
				deposit = new Scanner(System.in);
				System.out.println("Enter Amount to Deposit:\n ");
				int sAmounttoDeposit = deposit.nextInt();
				int depositResult = acct.deposit(sAmounttoDeposit);
				System.out.println("The Value returned By This Method Is: "
						+ depositResult);
				
				break;

			}

			case '2': {

				System.out.println(" Account Class\n");
				System.out.println(" Withdraw Method\n");
				withdraw = new Scanner(System.in);
				System.out.println("Enter Amount to Withdraw:\n ");
				int sAmounttoWithdraw = withdraw.nextInt();
				int withdrawResult = acct.withdraw(sAmounttoWithdraw);
				System.out.println("The Value returned By This Method Is: "
						+ withdrawResult);
				
				break;

			}

			case '3': {

				System.out.println(" Account Class\n");
				System.out.println(" Balance Method\n");
				int balanceResult = acct.balance();
				System.out.println("The Value returned By This Method Is: "
						+ balanceResult);
				
				break;

			}

			case '4': {

				System.out.println(" Account Class\n");
				System.out.println(" Lock Method\n");
				lockPin = new Scanner(System.in);
				System.out.println("Enter Your Pin to Lock Account:\n ");
				int slockPin = lockPin.nextInt();
				int lockResult = acct.lock(slockPin);
				System.out.println("The Value returned By This Method Is: "
						+ lockResult);
				
				break;

			}

			case '5': {

				System.out.println(" Account Class\n");
				System.out.println(" Unlock Method\n");
				unLockPin = new Scanner(System.in);
				System.out.println("Enter Your Pin to UnLock Account:\n ");
				int sunLockPin = unLockPin.nextInt();
				int unlockResult = acct.unlock(sunLockPin);
				System.out.println("The Value returned By This Method Is: "
						+ unlockResult);
				
				break;

			}

			case '6': {

				System.out.println(" Account Class\n");
				System.out.println(" Login Method\n");
				loginId = new Scanner(System.in);
				System.out.println("Enter Your Account Number:\n ");
				int sloginId = loginId.nextInt();
				int loginResult = acct.login(sloginId);
				System.out.println("The Value returned By This Method Is: "
						+ loginResult);
				
				break;

			}

			case '7': {

				System.out.println(" Account Class\n");
				System.out.println(" Pin Method\n");
				pinId = new Scanner(System.in);
				System.out.println("Enter Your Pin  Number:\n ");
				int sPinId = pinId.nextInt();
				int pinResult = acct.pin(sPinId);
				System.out.println("The Value returned By This Method Is: "
						+ pinResult);
				
				break;

			}

			case '8': {

				System.out.println(" Account Class\n");
				System.out.println(" Logout Method\n");
				int logoutResult = acct.logout();
				System.out.println("The Value returned By This Method Is: "
						+ logoutResult);
				
				break;
			}
			case 'a': {

				System.out.println(" Account Class\n");
				System.out.println(" show_balance testing_related Method\n");
				int showBalanceResult = acct.show_balance();
				System.out.println(" The Value Returned By This Method Is "
						+ showBalanceResult);
				break;

			}
			case 'b': {

				System.out.println(" Account Class\n");
				System.out.println(" show_state testing_related Method\n");
				String state = acct.show_state();
				System.out.println(state);
				break;

			}

			case 'c': {

				System.out.println(" Account Class\n");
				System.out.println(" show_account testing_related Method\n");
				int accountNo = acct.show_account();
				System.out.println("The Value Returned By This Method Is "
						+ accountNo);
				break;

			}

			case 'd': {

				System.out.println(" Account Class\n");
				System.out
						.println(" show_noOfAttempts testing_related Method\n");
				int attempts = acct.show_noOfAttempts();
				System.out.println("The Value Returned By This Method Is "
						+ attempts);
				break;

			}
			
			
			case 'e': {

				System.out.println(" Account Class\n");
				System.out.println(" show_all_variables testing_related Method\n");
				acct.showAllVariables();
				break;

			}

			case 'q': {

				System.exit(0);
				break;

			}

			}

		}

	}

	

}
