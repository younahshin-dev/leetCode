package Algorithms;


public interface BitcoinErrorMessage {
	public static final String E4707 = "Insufficient funds."; // 지갑의 잔액이 충분하지 않습니다.	
	public static final String E4711 = "Wallet {} already exists."; // 중복된 아이디가 존재 합니다.
	public static final String E4713 = "Requested wallet does not exist or is not loaded."; // 지갑이 존재 하지 않습니다.
	public static final String E4714 = "Invalid Bitcoin address."; // 주소 형식이 올바르지 않습니다.
	public static final String E4715 = "Transaction amount too small."; // 거래에 필요한 코인 수량이 적습니다.
//	public static final String E4716 = "Invalid or non-wallet transaction id"; // 지갑이 존재 하지 않습니다.
	public static final String E9004 = "The wallet passphrase entered was incorrect."; // 유효하지 않은 개인키입니다.
	public static final String E4716 = "Wallet file verification failed: Error loading wallet 1. Duplicate -wallet filename specified."; // 추가된 지갑입니다.
	public static final String E4717 = "Wallet {} not found."; // 존재하지 않는 지갑입니다.
	public static final String E4718 = "Connect to {} failed: Connection refused: connect"; // 비트코인 노드 서버 상태가 원활하지 않습니다.
	

	
}
