/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhtuan5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Bai5 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> danhSach = new ArrayList<>();
        
        System.out.println("Nhập số lượng phần tử của danh sách:");
        int n = scanner.nextInt();
        
        // Nhập các phần tử vào danh sách
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i + 1);
            int phanTu = scanner.nextInt();
            danhSach.add(phanTu);
        }
        
        // In các phần tử của danh sách
        System.out.println("Các phần tử trong danh sách là:");
        for (int phanTu : danhSach) {
            System.out.print(phanTu + " ");
        }
    }
}
