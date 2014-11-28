package main;

public enum Language {
	
	BONJOUR("");
	private String str;
	
	Language(String str) {
		this.str = str;
	}
	
	void setStr(String str) {
		this.str = str;
	}
	
	@Override
	public String toString() {
		return str;
	}
	
	public static void setLanguage(String lang) {
		String[] whatLanguage;
		
		switch (lang) {
			case "FR": whatLanguage = fr; break;
			case "EN": whatLanguage = en; break;
			default: whatLanguage = en; break;
		}
		
		int i = 0;
		for (Language l : Language.values()) {
			l.setStr(whatLanguage[i]);
			i++;
		}
	}
	
	private final static String[] fr = {"Bonjour !"};
	private final static String[] en = {"Hello !"};
	
	
}
