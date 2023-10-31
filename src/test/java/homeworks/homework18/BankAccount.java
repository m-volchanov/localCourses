package homeworks.homework18;

public class BankAccount {
    public static void main(String[] args) {
        Individual individual = new Individual(1000);
        individual.deposit(500);
        individual.withdrawal(200);
        individual.displayAccountInfo();

        LegalEntity legalEntity = new LegalEntity(1000);
        legalEntity.deposit(500);
        legalEntity.withdrawal(200);
        legalEntity.displayAccountInfo();

        PrivatePersonEntrepreneur privatePersonEntrepreneur = new PrivatePersonEntrepreneur(1000);
        privatePersonEntrepreneur.deposit(500);
        privatePersonEntrepreneur.withdrawal(200);
        privatePersonEntrepreneur.displayAccountInfo();
    }
}
