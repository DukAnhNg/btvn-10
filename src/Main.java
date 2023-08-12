import entities.Bill;
import entities.Customer;
import service.BillService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BillService service = new BillService();
        Bill bill = service.createBill(scanner);
        System.out.println(bill);
        }
    }

