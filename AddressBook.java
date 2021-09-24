//Name- Oliver
//Student Number - 101155667
import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo>buddyInfo;

    public AddressBook() {

        this.buddyInfo = new ArrayList<BuddyInfo>();

    }

    public void addBuddy(BuddyInfo BI) {
        for(int i = 0; i < buddyInfo.size(); i++)   {
            if(BI.equals(buddyInfo.get(i))) {
                return;
            }
        }

        buddyInfo.add(BI);
    }

    public void removeBuddy(BuddyInfo BI) {
        for(int i = 0; i < buddyInfo.size(); i++)  {
            if(BI.equals(buddyInfo.get(i))) {
                buddyInfo.remove(BI);
                return;
            }
        }
    }

    public static void main(String[] args) {
        BuddyInfo bud= new BuddyInfo("Oliver Lu","ottawa",123456789);
        AddressBook ad = new AddressBook();
        ad.addBuddy(bud);
        ad.removeBuddy(bud);
    }

}