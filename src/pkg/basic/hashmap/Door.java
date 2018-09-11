package pkg.basic.hashmap;

import java.util.HashMap;

public class Door {
	HashMap<String, AccessCode> doorCodes = new HashMap<String, AccessCode>();
	
	public HashMap<String, AccessCode> getDoorCodes() {
		return doorCodes;
	}
	
	void addDoorKey(String str1, AccessCode code) {
		doorCodes.put(str1, code);
	}
	
	void useCode(String str2) {
		if(doorCodes.containsKey(str2)) {
			AccessCode accessCode = doorCodes.get(str2);
			int num = accessCode.getNumberOfTimesUsed();
			accessCode.setNumberOfTimesUsed(num + 1);

			if(accessCode.getNumberOfTimesUsed() <= 2) {
				System.out.println("AccessCode invalid");
			} else {
				accessCode.setValid(false);
				System.out.println("AccessCode no longer valid");
			}
		} else {
			System.out.println("AccessCode invalid");
		}
	}
}
