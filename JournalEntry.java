public class JournalEntry {

    String account;
    double debit;
    double credit;

    public JournalEntry(String account, double debit, double credit) {
        this.account = account;
        this.debit = debit;
        this.credit = credit;
    }

    public void displayEntry() {
        System.out.println("Account: " + account);
        System.out.println("Debit: " + debit);
        System.out.println("Credit: " + credit);
    }

    
     
    public static void main(String[] args) {

        JournalEntry cash = new JournalEntry("Cash", 1000, 0);
        JournalEntry capital = new JournalEntry("Owner's Capital", 0, 1000);

        cash.displayEntry();
        capital.displayEntry();

    }

}