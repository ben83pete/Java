package banking.exceptions;

public class DepositWithdrawTransferException extends Exception {

	public DepositWithdrawTransferException() {
	
	}

	public DepositWithdrawTransferException(String message) {
		super(message);
	
	}

	public DepositWithdrawTransferException(Throwable cause) {
		super(cause);
	
	}

	public DepositWithdrawTransferException(String message, Throwable cause) {
		super(message, cause);
	
	}

	public DepositWithdrawTransferException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	
	}

}
