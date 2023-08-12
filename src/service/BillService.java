package service;

import entities.Bill;
import entities.Customer;

import java.util.Arrays;
import java.util.Scanner;

public class BillService {
    public Bill createBill(Scanner scanner) {
        System.out.println("Mời nhập số hộ muốn nhập thông tin");
        int n = Integer.parseInt(scanner.nextLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Mời nhập tên");
            String name = scanner.nextLine();
            System.out.println("Mời nhập số nhà");
            int address = Integer.parseInt(scanner.nextLine());
            System.out.println("Mời nhập chỉ số cũ");
            double oldStatic = Double.parseDouble(scanner.nextLine());
            System.out.println("Mời nhập chỉ số mới");
            double newStatic = Double.parseDouble(scanner.nextLine());
            double total = (newStatic - oldStatic) * 750;
            Bill bill = new Bill(name, address, oldStatic, newStatic, total);
            arr[i] = bill.toString();
        }
        System.out.println(Arrays.toString(arr));
        return null;
    }
}
