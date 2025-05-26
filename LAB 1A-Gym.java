
import java.util.Scanner;

class GymMember {
    private String name;
    private int age;
    private String membershipStatus;
    private int membershipDuration;
    private static final double FEE_PER_MONTH = 500.0;

    public GymMember(String name, int age, String membershipStatus, int membershipDuration) {
        this.name = name;
        this.age = age;
        this.membershipStatus = membershipStatus;
        this.membershipDuration = membershipDuration;
    }

    public double calculateMembershipFee() {
        return membershipDuration * FEE_PER_MONTH;
    }

    public void displayMemberInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Membership Status: " + membershipStatus);
        System.out.println("Membership Duration: " + membershipDuration + " months");
        System.out.println("Total Membership Fee: ₹" + calculateMembershipFee());
    }
}

public class Gym {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter member's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter member's age: ");
        int age = scanner.nextInt();

        System.out.print("Enter membership status (Active/Inactive): ");
        scanner.nextLine(); 
        String membershipStatus = scanner.nextLine();

        System.out.print("Enter membership duration (in months): ");
        int membershipDuration = scanner.nextInt();

        GymMember member = new GymMember(name, age, membershipStatus, membershipDuration);

        System.out.println("\nMember Information:");
        member.displayMemberInfo();

        scanner.close();
    }
}
