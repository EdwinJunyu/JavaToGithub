package 临时软件包.apClassroom;

public class CommunityCenter {

private String name;
private int openTime;
private int closeTime;
private int employee;

public CommunityCenter(String centerName, int centerOpenTime, int centerCloseTime, int centerEmployee){
        name = centerName;
        openTime = centerOpenTime;
        closeTime = centerCloseTime;
        employee = centerEmployee;
        }

public CommunityCenter(){
        this.name = "No Name";
        this.openTime = 10;
        this.closeTime = 21;
        this.employee = 200;
}

public String getName(){
        return name;
        }
public int getOpenTime(){
        return openTime;
        }
public int getCloseTime(){
        return closeTime;
        }
public int getEmployee(){
        return employee;
        }
public String toString(){
        return "This is Edwin's community's " + name + ".";
        }
public void setName(String newName){
        name = newName;
        }
public void setOpenTime(int newOpenTime){
        openTime = newOpenTime;
        }
public void setCloseTime(int newCloseTime){
        closeTime = newCloseTime;
        }
public void setEmployee(int newEmployee){
        employee = newEmployee;
        }


public static void main(String[] args)
        {
        CommunityCenter EdwinCenter = new CommunityCenter("Edwin", 8, 24, 20);
        CommunityCenter NoName = new CommunityCenter("Edwin", 8, 24, 20);
        String Name = EdwinCenter.getName();
        int OpenTime = EdwinCenter.getOpenTime();
        int CloseTime = EdwinCenter.getCloseTime();
        int Employee = EdwinCenter.getEmployee();
        String CenterName = EdwinCenter.toString();

        EdwinCenter.setName("EDWIN");
        EdwinCenter.setOpenTime(9);
        EdwinCenter.setCloseTime(0);
        EdwinCenter.setEmployee(30);

        System.out.println(Name);
        System.out.println(OpenTime);
        System.out.println(CloseTime);
        System.out.println(Employee);
        System.out.println(CenterName);
        }
}