package ex13interFace;

interface IPersonalNumberStorage{
	 void addPersonalInfo(String juminNum, String name) ;
	 String searchPersonalInfo(String juminNum);
}

class PersonalInfoVO{
	private String name;
	private String juminNum;
	
	public PersonalInfoVO(String name, String juminNum) {
		this.name=name;
		this.juminNum=juminNum;
	}
	public String getName() {return name;}
	public String getJuminNum() {return juminNum;}
	public void setName(String name) {this.name = name;}
	public void setJuminNum(String juminNum) {this.juminNum=juminNum;}
}

class PersonalNumberStorageImpl implements IPersonalNumberStorage{
	PersonalInfoDTO[] personalArr;
	int numOfPerInfo;
	public PersonalNumberStorageImpl(int arrSize) {
		personalArr = new PersonalInfoDTO[arrSize];
		numOfPerInfo=0;
		
	}
	@Override
	public void addPersonalInfo(String juminNum, String name) {
		personalArr[numOfPerInfo] = new PersonalInfoDTO(name, juminNum);
		numOfPerInfo++;
		
	}
	@Override
	public String searchPersonalInfo(String juminNum) {
		for(int i=0; i<numOfPerInfo;i++) {
			if(juminNum.compareTo(personalArr[i].getJuminNum())==0) {
				return personalArr[i].getName();
			}
		}
		return null;
	}
			}

public class E02AbstractToInterface2 {

	public static void main(String[] args) {
		PersonalNumberStorageExt storage =	new PersonalNumberStorageExt(10);
		storage.addPersonalInfo("901234-2222222", "김태희");
		storage.addPersonalInfo("901234-1111111", "정지훈");
		System.out.println(storage.searchPersonalInfo("901234-2222222"));
		System.out.println(storage.searchPersonalInfo("901234-1111111"));
		System.out.println(storage.searchPersonalInfo("001024-1090333"));

	}

}
